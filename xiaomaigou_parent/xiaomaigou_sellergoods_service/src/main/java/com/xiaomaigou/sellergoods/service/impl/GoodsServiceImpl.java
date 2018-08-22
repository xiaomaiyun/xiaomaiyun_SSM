package com.xiaomaigou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xiaomaigou.mapper.*;
import com.xiaomaigou.pojo.*;
import com.xiaomaigou.pojogroup.Goods;
import com.xiaomaigou.sellergoods.service.GoodsService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 服务实现层
 *
 * @author root
 */

//必须使用com.alibaba.dubbo.config.annotation.Service，因为需要对外发布
@Service
public class GoodsServiceImpl implements GoodsService {

    //注意：此处为本地调用
    @Autowired
    private TbGoodsMapper goodsMapper;
    @Autowired
    private TbGoodsDescMapper goodsDescMapper;
    @Autowired
    private TbItemMapper itemMapper;
    @Autowired
    private TbItemCatMapper itemCatMapper;
    @Autowired
    private TbBrandMapper brandMapper;
    @Autowired
    private TbSellerMapper sellerMapper;

    /**
     * 查询全部
     */
    @Override
    public List<TbGoods> findAll() {
        return goodsMapper.selectByExample(null);
    }

    /**
     * 按分页查询
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<TbGoods> page = (Page<TbGoods>) goodsMapper.selectByExample(null);
        return new PageResult(page.getTotal(), page.getResult());
    }

    /**
     * 增加
     */
    @Override
    public void add(Goods goods) {
        //新增加的商品状态为未审核(0)状态
        goods.getGoods().setAuditStatus("0");
        //插入商品基本信息
        goodsMapper.insert(goods.getGoods());

        //将商品基本表的id给商品扩展表
        goods.getGoodsDesc().setGoodsId(goods.getGoods().getId());
        //插入商品扩展表
        goodsDescMapper.insert(goods.getGoodsDesc());

        if ("1".equals(goods.getGoods().getIsEnableSpec())) {
            //传进来的goods.getItemList()中，暂时只有前端页面上的内容，而数据库tb_item表示SKU表，即存储单位，包括了每条商品的所有信息，所以，我们需要遍历每条商品，把缺的值补充上（如品牌、商家等）
            //tb_item表示看上去有冗余数据，但是，这是在后面的搜索作准备
            for (TbItem item : goods.getItemList()) {
                //构建标题  SPU名称+ 规格选项值
                String title = goods.getGoods().getGoodsName();//SPU名称
                Map<String, Object> map = JSON.parseObject(item.getSpec());//该SKU的所有规则，转换成map
                for (String key : map.keySet()) {
                    //规格选项，用空格" "隔开
                    title += " " + map.get(key);
                }
                item.setTitle(title);
                //设置商品数据
                setItemValues(item, goods);

                itemMapper.insert(item);

            }
        } else {//没有启用规格

            TbItem item = new TbItem();
            item.setTitle(goods.getGoods().getGoodsName());//标题
            item.setPrice(goods.getGoods().getPrice());//价格
            item.setNum(99999);//库存数量
            item.setStatus("1");//状态
            item.setIsDefault("1");//默认
            item.setSpec("{}");//规格

            setItemValues(item, goods);

            itemMapper.insert(item);
        }
    }

    private void setItemValues(TbItem item, Goods goods) {

        item.setCreateTime(new Date());//创建日期
        item.setUpdateTime(new Date());//更新日期

        item.setGoodsId(goods.getGoods().getId());//商品ID（也是商品SPU编号）
        item.setSellerId(goods.getGoods().getSellerId());//商家ID

        //商品分类
        item.setCategoryid(goods.getGoods().getCategory3Id());//三级分类ID
        TbItemCat itemCat = itemCatMapper.selectByPrimaryKey(goods.getGoods().getCategory3Id());//根据三级分类id获取分类名称
        item.setCategory(itemCat.getName());//三级分类名称

        //品牌名称
        TbBrand brand = brandMapper.selectByPrimaryKey(goods.getGoods().getBrandId());//根据品牌id获取品牌名称
        item.setBrand(brand.getName());

        //店铺名称
        TbSeller seller = sellerMapper.selectByPrimaryKey(goods.getGoods().getSellerId());//根据商家id获取店铺名称
        //注意：是店铺名称
        item.setSeller(seller.getNickName());

        //图片地址（取spu的第一个图片）
        List<Map> imageList = JSON.parseArray(goods.getGoodsDesc().getItemImages(), Map.class);
        if (imageList.size() > 0) {
            item.setImage((String) imageList.get(0).get("url"));
        }

    }

    /**
     * 修改
     */
    @Override
    public void update(TbGoods goods) {
        goodsMapper.updateByPrimaryKey(goods);
    }

    /**
     * 根据ID获取实体
     *
     * @param id
     * @return
     */
    @Override
    public TbGoods findOne(Long id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量删除
     */
    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            goodsMapper.deleteByPrimaryKey(id);
        }
    }


    @Override
    public PageResult findPage(TbGoods goods, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TbGoodsExample example = new TbGoodsExample();
        TbGoodsExample.Criteria criteria = example.createCriteria();

        if (goods != null) {
            if (goods.getSellerId() != null && goods.getSellerId().length() > 0) {
                criteria.andSellerIdLike("%" + goods.getSellerId() + "%");
            }
            if (goods.getGoodsName() != null && goods.getGoodsName().length() > 0) {
                criteria.andGoodsNameLike("%" + goods.getGoodsName() + "%");
            }
            if (goods.getAuditStatus() != null && goods.getAuditStatus().length() > 0) {
                criteria.andAuditStatusLike("%" + goods.getAuditStatus() + "%");
            }
            if (goods.getIsMarketable() != null && goods.getIsMarketable().length() > 0) {
                criteria.andIsMarketableLike("%" + goods.getIsMarketable() + "%");
            }
            if (goods.getCaption() != null && goods.getCaption().length() > 0) {
                criteria.andCaptionLike("%" + goods.getCaption() + "%");
            }
            if (goods.getSmallPic() != null && goods.getSmallPic().length() > 0) {
                criteria.andSmallPicLike("%" + goods.getSmallPic() + "%");
            }
            if (goods.getIsEnableSpec() != null && goods.getIsEnableSpec().length() > 0) {
                criteria.andIsEnableSpecLike("%" + goods.getIsEnableSpec() + "%");
            }
            if (goods.getIsDelete() != null && goods.getIsDelete().length() > 0) {
                criteria.andIsDeleteLike("%" + goods.getIsDelete() + "%");
            }

        }

        Page<TbGoods> page = (Page<TbGoods>) goodsMapper.selectByExample(example);
        return new PageResult(page.getTotal(), page.getResult());
    }

}
