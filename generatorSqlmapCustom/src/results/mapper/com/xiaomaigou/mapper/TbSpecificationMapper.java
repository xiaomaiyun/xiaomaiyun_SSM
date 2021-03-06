package com.xiaomaigou.mapper;

import com.xiaomaigou.pojo.TbSpecification;
import com.xiaomaigou.pojo.TbSpecificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSpecificationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    long countByExample(TbSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int deleteByExample(TbSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int insert(TbSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int insertSelective(TbSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    List<TbSpecification> selectByExample(TbSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    TbSpecification selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbSpecification record, @Param("example") TbSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int updateByExample(@Param("record") TbSpecification record, @Param("example") TbSpecificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int updateByPrimaryKeySelective(TbSpecification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_specification
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    int updateByPrimaryKey(TbSpecification record);
}