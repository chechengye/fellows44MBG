package com.weichuang.pojo;

import java.io.Serializable;

public class OmsOrder implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.id
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.ono
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    private String ono;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.create_time
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    private String createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order.user_id
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oms_order
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.id
     *
     * @return the value of oms_order.id
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.id
     *
     * @param id the value for oms_order.id
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.ono
     *
     * @return the value of oms_order.ono
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    public String getOno() {
        return ono;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.ono
     *
     * @param ono the value for oms_order.ono
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    public void setOno(String ono) {
        this.ono = ono;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.create_time
     *
     * @return the value of oms_order.create_time
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.create_time
     *
     * @param createTime the value for oms_order.create_time
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order.user_id
     *
     * @return the value of oms_order.user_id
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order.user_id
     *
     * @param userId the value for oms_order.user_id
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order
     *
     * @mbg.generated Sun Jan 17 14:29:17 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ono=").append(ono);
        sb.append(", createTime=").append(createTime);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}