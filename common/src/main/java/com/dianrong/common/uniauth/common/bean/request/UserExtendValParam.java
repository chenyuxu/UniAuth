package com.dianrong.common.uniauth.common.bean.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author wenlongchen
 * @since May 16, 2016
 */
@ApiModel("用户扩展属性值请求参数")
public class UserExtendValParam extends PageParam {

    private static final long serialVersionUID = 5991602165228109411L;

    @ApiModelProperty("主键id")
    private Long id;

    @ApiModelProperty("用户的主键id")
    private Long userId;

    @ApiModelProperty("扩展属性id")
    private Long extendId;

    @ApiModelProperty("扩展属性值")
    private String value;

    @ApiModelProperty("该属性值状态(0:启用,1:禁用)")
    private Byte status;

    @ApiModelProperty("对应扩展属性的code")
    private String extendCode;
    /**
     * phone number or email address
     */
    private String identity;
    /**
     * . 是否只查询被用户使用了的属性
     */
    @ApiModelProperty("查询条件:是否只返回用户关联了的属性(用于接口:searchbyuseridandcode)")
    private boolean queryOnlyUsed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getExtendId() {
        return extendId;
    }

    public void setExtendId(Long extendId) {
        this.extendId = extendId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getExtendCode() {
        return extendCode;
    }

    public void setExtendCode(String extendCode) {
        this.extendCode = extendCode;
    }

    public boolean isQueryOnlyUsed() {
        return queryOnlyUsed;
    }

    public void setQueryOnlyUsed(boolean queryOnlyUsed) {
        this.queryOnlyUsed = queryOnlyUsed;
    }

    /**
     * phone number or email address
     * 
     * @return the identity
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * @param identity phone number or email address
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "UserExtendValParam [id=" + id + ", userId=" + userId + ", extendId=" + extendId + ", value=" + value + ", status=" + status + ", extendCode=" + extendCode
                + ", identity=" + identity + ", queryOnlyUsed=" + queryOnlyUsed + "]";
    }

}

