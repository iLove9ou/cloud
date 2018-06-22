package com.cloud.service;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_audit")
public class APPAudit {
    @Id
    private Long id;

    /**
     * 应用id
     */
    @Column(name = "app_id")
    private Long appId;

    /**
     * 申请人的id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 申请类型:0:申请应用,1:应用扩容,2:修改配置
     */
    private Byte type;

    /**
     * 预留参数1
     */
    private String param1;

    /**
     * 预留参数2
     */
    private String param2;

    /**
     * 预留参数3
     */
    private String param3;

    /**
     * 申请描述
     */
    private String info;

    /**
     * 0:等待审批; 1:审批通过; -1:驳回
     */
    private Byte status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 驳回理由
     */
    @Column(name = "refuse_reason")
    private String refuseReason;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取应用id
     *
     * @return app_id - 应用id
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * 设置应用id
     *
     * @param appId 应用id
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * 获取申请人的id
     *
     * @return user_id - 申请人的id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置申请人的id
     *
     * @param userId 申请人的id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取申请类型:0:申请应用,1:应用扩容,2:修改配置
     *
     * @return type - 申请类型:0:申请应用,1:应用扩容,2:修改配置
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置申请类型:0:申请应用,1:应用扩容,2:修改配置
     *
     * @param type 申请类型:0:申请应用,1:应用扩容,2:修改配置
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取预留参数1
     *
     * @return param1 - 预留参数1
     */
    public String getParam1() {
        return param1;
    }

    /**
     * 设置预留参数1
     *
     * @param param1 预留参数1
     */
    public void setParam1(String param1) {
        this.param1 = param1;
    }

    /**
     * 获取预留参数2
     *
     * @return param2 - 预留参数2
     */
    public String getParam2() {
        return param2;
    }

    /**
     * 设置预留参数2
     *
     * @param param2 预留参数2
     */
    public void setParam2(String param2) {
        this.param2 = param2;
    }

    /**
     * 获取预留参数3
     *
     * @return param3 - 预留参数3
     */
    public String getParam3() {
        return param3;
    }

    /**
     * 设置预留参数3
     *
     * @param param3 预留参数3
     */
    public void setParam3(String param3) {
        this.param3 = param3;
    }

    /**
     * 获取申请描述
     *
     * @return info - 申请描述
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置申请描述
     *
     * @param info 申请描述
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * 获取0:等待审批; 1:审批通过; -1:驳回
     *
     * @return status - 0:等待审批; 1:审批通过; -1:驳回
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0:等待审批; 1:审批通过; -1:驳回
     *
     * @param status 0:等待审批; 1:审批通过; -1:驳回
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return modify_time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取驳回理由
     *
     * @return refuse_reason - 驳回理由
     */
    public String getRefuseReason() {
        return refuseReason;
    }

    /**
     * 设置驳回理由
     *
     * @param refuseReason 驳回理由
     */
    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
    }
}