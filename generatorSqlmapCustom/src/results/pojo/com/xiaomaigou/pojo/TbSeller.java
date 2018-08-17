package com.xiaomaigou.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbSeller implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.seller_id
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String sellerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.nick_name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.password
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.email
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.mobile
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.telephone
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.status
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.address_detail
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String addressDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.linkman_name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String linkmanName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.linkman_qq
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String linkmanQq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.linkman_mobile
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String linkmanMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.linkman_email
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String linkmanEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.license_number
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String licenseNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.tax_number
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String taxNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.org_number
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String orgNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.address
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private Long address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.logo_pic
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String logoPic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.brief
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String brief;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.create_time
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.legal_person
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String legalPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.legal_person_card_id
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String legalPersonCardId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.bank_user
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String bankUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_seller.bank_name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private String bankName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_seller
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.seller_id
     *
     * @return the value of tb_seller.seller_id
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.seller_id
     *
     * @param sellerId the value for tb_seller.seller_id
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.name
     *
     * @return the value of tb_seller.name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.name
     *
     * @param name the value for tb_seller.name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.nick_name
     *
     * @return the value of tb_seller.nick_name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.nick_name
     *
     * @param nickName the value for tb_seller.nick_name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.password
     *
     * @return the value of tb_seller.password
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.password
     *
     * @param password the value for tb_seller.password
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.email
     *
     * @return the value of tb_seller.email
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.email
     *
     * @param email the value for tb_seller.email
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.mobile
     *
     * @return the value of tb_seller.mobile
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.mobile
     *
     * @param mobile the value for tb_seller.mobile
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.telephone
     *
     * @return the value of tb_seller.telephone
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.telephone
     *
     * @param telephone the value for tb_seller.telephone
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.status
     *
     * @return the value of tb_seller.status
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.status
     *
     * @param status the value for tb_seller.status
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.address_detail
     *
     * @return the value of tb_seller.address_detail
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.address_detail
     *
     * @param addressDetail the value for tb_seller.address_detail
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.linkman_name
     *
     * @return the value of tb_seller.linkman_name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getLinkmanName() {
        return linkmanName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.linkman_name
     *
     * @param linkmanName the value for tb_seller.linkman_name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName == null ? null : linkmanName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.linkman_qq
     *
     * @return the value of tb_seller.linkman_qq
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getLinkmanQq() {
        return linkmanQq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.linkman_qq
     *
     * @param linkmanQq the value for tb_seller.linkman_qq
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setLinkmanQq(String linkmanQq) {
        this.linkmanQq = linkmanQq == null ? null : linkmanQq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.linkman_mobile
     *
     * @return the value of tb_seller.linkman_mobile
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.linkman_mobile
     *
     * @param linkmanMobile the value for tb_seller.linkman_mobile
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setLinkmanMobile(String linkmanMobile) {
        this.linkmanMobile = linkmanMobile == null ? null : linkmanMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.linkman_email
     *
     * @return the value of tb_seller.linkman_email
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.linkman_email
     *
     * @param linkmanEmail the value for tb_seller.linkman_email
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setLinkmanEmail(String linkmanEmail) {
        this.linkmanEmail = linkmanEmail == null ? null : linkmanEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.license_number
     *
     * @return the value of tb_seller.license_number
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.license_number
     *
     * @param licenseNumber the value for tb_seller.license_number
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber == null ? null : licenseNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.tax_number
     *
     * @return the value of tb_seller.tax_number
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.tax_number
     *
     * @param taxNumber the value for tb_seller.tax_number
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber == null ? null : taxNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.org_number
     *
     * @return the value of tb_seller.org_number
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getOrgNumber() {
        return orgNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.org_number
     *
     * @param orgNumber the value for tb_seller.org_number
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber == null ? null : orgNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.address
     *
     * @return the value of tb_seller.address
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public Long getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.address
     *
     * @param address the value for tb_seller.address
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setAddress(Long address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.logo_pic
     *
     * @return the value of tb_seller.logo_pic
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getLogoPic() {
        return logoPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.logo_pic
     *
     * @param logoPic the value for tb_seller.logo_pic
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setLogoPic(String logoPic) {
        this.logoPic = logoPic == null ? null : logoPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.brief
     *
     * @return the value of tb_seller.brief
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getBrief() {
        return brief;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.brief
     *
     * @param brief the value for tb_seller.brief
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.create_time
     *
     * @return the value of tb_seller.create_time
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.create_time
     *
     * @param createTime the value for tb_seller.create_time
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.legal_person
     *
     * @return the value of tb_seller.legal_person
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getLegalPerson() {
        return legalPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.legal_person
     *
     * @param legalPerson the value for tb_seller.legal_person
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.legal_person_card_id
     *
     * @return the value of tb_seller.legal_person_card_id
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getLegalPersonCardId() {
        return legalPersonCardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.legal_person_card_id
     *
     * @param legalPersonCardId the value for tb_seller.legal_person_card_id
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setLegalPersonCardId(String legalPersonCardId) {
        this.legalPersonCardId = legalPersonCardId == null ? null : legalPersonCardId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.bank_user
     *
     * @return the value of tb_seller.bank_user
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getBankUser() {
        return bankUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.bank_user
     *
     * @param bankUser the value for tb_seller.bank_user
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setBankUser(String bankUser) {
        this.bankUser = bankUser == null ? null : bankUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_seller.bank_name
     *
     * @return the value of tb_seller.bank_name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_seller.bank_name
     *
     * @param bankName the value for tb_seller.bank_name
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_seller
     *
     * @mbg.generated Fri Aug 17 13:48:27 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sellerId=").append(sellerId);
        sb.append(", name=").append(name);
        sb.append(", nickName=").append(nickName);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", mobile=").append(mobile);
        sb.append(", telephone=").append(telephone);
        sb.append(", status=").append(status);
        sb.append(", addressDetail=").append(addressDetail);
        sb.append(", linkmanName=").append(linkmanName);
        sb.append(", linkmanQq=").append(linkmanQq);
        sb.append(", linkmanMobile=").append(linkmanMobile);
        sb.append(", linkmanEmail=").append(linkmanEmail);
        sb.append(", licenseNumber=").append(licenseNumber);
        sb.append(", taxNumber=").append(taxNumber);
        sb.append(", orgNumber=").append(orgNumber);
        sb.append(", address=").append(address);
        sb.append(", logoPic=").append(logoPic);
        sb.append(", brief=").append(brief);
        sb.append(", createTime=").append(createTime);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", legalPersonCardId=").append(legalPersonCardId);
        sb.append(", bankUser=").append(bankUser);
        sb.append(", bankName=").append(bankName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}