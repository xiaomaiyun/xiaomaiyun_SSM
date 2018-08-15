package com.xiaomaigou.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbFreightTemplate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.id
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.seller_id
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String sellerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.is_default
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String isDefault;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.name
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.send_time_type
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private String sendTimeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.price
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private Long price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_freight_template.create_time
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_freight_template
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.id
     *
     * @return the value of tb_freight_template.id
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.id
     *
     * @param id the value for tb_freight_template.id
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.seller_id
     *
     * @return the value of tb_freight_template.seller_id
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.seller_id
     *
     * @param sellerId the value for tb_freight_template.seller_id
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.is_default
     *
     * @return the value of tb_freight_template.is_default
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.is_default
     *
     * @param isDefault the value for tb_freight_template.is_default
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.name
     *
     * @return the value of tb_freight_template.name
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.name
     *
     * @param name the value for tb_freight_template.name
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.send_time_type
     *
     * @return the value of tb_freight_template.send_time_type
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public String getSendTimeType() {
        return sendTimeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.send_time_type
     *
     * @param sendTimeType the value for tb_freight_template.send_time_type
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setSendTimeType(String sendTimeType) {
        this.sendTimeType = sendTimeType == null ? null : sendTimeType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.price
     *
     * @return the value of tb_freight_template.price
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.price
     *
     * @param price the value for tb_freight_template.price
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_freight_template.create_time
     *
     * @return the value of tb_freight_template.create_time
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_freight_template.create_time
     *
     * @param createTime the value for tb_freight_template.create_time
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_freight_template
     *
     * @mbg.generated Wed Aug 15 20:26:14 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", name=").append(name);
        sb.append(", sendTimeType=").append(sendTimeType);
        sb.append(", price=").append(price);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}