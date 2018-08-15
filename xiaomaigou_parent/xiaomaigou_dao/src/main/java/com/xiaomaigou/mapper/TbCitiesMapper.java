package com.xiaomaigou.mapper;

import com.xiaomaigou.pojo.TbCities;
import com.xiaomaigou.pojo.TbCitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCitiesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbg.generated Wed Aug 15 20:26:13 CST 2018
     */
    long countByExample(TbCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbg.generated Wed Aug 15 20:26:13 CST 2018
     */
    int deleteByExample(TbCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbg.generated Wed Aug 15 20:26:13 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbg.generated Wed Aug 15 20:26:13 CST 2018
     */
    int insert(TbCities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbg.generated Wed Aug 15 20:26:13 CST 2018
     */
    int insertSelective(TbCities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbg.generated Wed Aug 15 20:26:13 CST 2018
     */
    List<TbCities> selectByExample(TbCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbg.generated Wed Aug 15 20:26:13 CST 2018
     */
    TbCities selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbg.generated Wed Aug 15 20:26:13 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbCities record, @Param("example") TbCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbg.generated Wed Aug 15 20:26:13 CST 2018
     */
    int updateByExample(@Param("record") TbCities record, @Param("example") TbCitiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbg.generated Wed Aug 15 20:26:13 CST 2018
     */
    int updateByPrimaryKeySelective(TbCities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cities
     *
     * @mbg.generated Wed Aug 15 20:26:13 CST 2018
     */
    int updateByPrimaryKey(TbCities record);
}