package com.xiaomaigou.pojo;

import java.io.Serializable;

public class TbTypeTemplate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_type_template.id
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_type_template.name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_type_template.spec_ids
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String specIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_type_template.brand_ids
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String brandIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_type_template.custom_attribute_items
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String customAttributeItems;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_type_template
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_type_template.id
     *
     * @return the value of tb_type_template.id
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_type_template.id
     *
     * @param id the value for tb_type_template.id
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_type_template.name
     *
     * @return the value of tb_type_template.name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_type_template.name
     *
     * @param name the value for tb_type_template.name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_type_template.spec_ids
     *
     * @return the value of tb_type_template.spec_ids
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getSpecIds() {
        return specIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_type_template.spec_ids
     *
     * @param specIds the value for tb_type_template.spec_ids
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setSpecIds(String specIds) {
        this.specIds = specIds == null ? null : specIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_type_template.brand_ids
     *
     * @return the value of tb_type_template.brand_ids
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getBrandIds() {
        return brandIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_type_template.brand_ids
     *
     * @param brandIds the value for tb_type_template.brand_ids
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setBrandIds(String brandIds) {
        this.brandIds = brandIds == null ? null : brandIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_type_template.custom_attribute_items
     *
     * @return the value of tb_type_template.custom_attribute_items
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getCustomAttributeItems() {
        return customAttributeItems;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_type_template.custom_attribute_items
     *
     * @param customAttributeItems the value for tb_type_template.custom_attribute_items
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setCustomAttributeItems(String customAttributeItems) {
        this.customAttributeItems = customAttributeItems == null ? null : customAttributeItems.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_type_template
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", specIds=").append(specIds);
        sb.append(", brandIds=").append(brandIds);
        sb.append(", customAttributeItems=").append(customAttributeItems);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}