package com.xiaomaigou.mapper;

import com.xiaomaigou.pojo.TbFreightTemplate;
import com.xiaomaigou.pojo.TbFreightTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFreightTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_freight_template
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    long countByExample(TbFreightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_freight_template
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int deleteByExample(TbFreightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_freight_template
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_freight_template
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int insert(TbFreightTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_freight_template
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int insertSelective(TbFreightTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_freight_template
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    List<TbFreightTemplate> selectByExample(TbFreightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_freight_template
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    TbFreightTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_freight_template
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbFreightTemplate record, @Param("example") TbFreightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_freight_template
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int updateByExample(@Param("record") TbFreightTemplate record, @Param("example") TbFreightTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_freight_template
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int updateByPrimaryKeySelective(TbFreightTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_freight_template
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int updateByPrimaryKey(TbFreightTemplate record);
}