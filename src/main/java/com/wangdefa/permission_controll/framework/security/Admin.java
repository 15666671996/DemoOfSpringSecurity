package com.wangdefa.permission_controll.framework.security;

import java.util.Date;
import java.util.List;

public class Admin {
    private Long userId;
    private Long deptId;
    private String userName;
    private String nickName;
    private String email;
    private String phonenumber;
    private String sex;
    private String avatar;
    private String password;
    private String status;
    private String delFlag;
    private String loginIp;
    private Date loginDate;
    private List<Role> roles;
    private Long[] roleIds;
    private Long[] postIds;
    private Long roleId;
    private String isBlocked;
    private String isCompany;
    private String isVip;
    private String createBy;
    private Date createTime;
    private String updateBy;
    private Date updateTime;
    private String remark;

    public Admin() {
    }

    public Admin(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public String getUserName() {
        return userName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getSex() {
        return sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public Long[] getRoleIds() {
        return roleIds;
    }

    public Long[] getPostIds() {
        return postIds;
    }

    public Long getRoleId() {
        return roleId;
    }

    public String getIsBlocked() {
        return isBlocked;
    }

    public String getIsCompany() {
        return isCompany;
    }

    public String getIsVip() {
        return isVip;
    }

    public String getCreateBy() {
        return createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void setRoleIds(Long[] roleIds) {
        this.roleIds = roleIds;
    }

    public void setPostIds(Long[] postIds) {
        this.postIds = postIds;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setIsBlocked(String isBlocked) {
        this.isBlocked = isBlocked;
    }

    public void setIsCompany(String isCompany) {
        this.isCompany = isCompany;
    }

    public void setIsVip(String isVip) {
        this.isVip = isVip;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    //
    public boolean isAdmin() {
        return isAdmin(this.userId);
    }
    //
    public static boolean isAdmin(Long userId) {
        return userId != null && 1L == userId;
    }


    @Override
    public String toString() {
        return new StringBuilder().append(getUserId())
                .append(getDeptId())
                .append(getUserName())
                .append(getNickName())
                .append(getEmail())
                .append(getPhonenumber())
                .append(getSex())
                .append(getAvatar())
                .append(getPassword())
                .append(getStatus())
                .append(getDelFlag())
                .append(getLoginIp())
                .append(getLoginDate())
                .append(getCreateBy())
                .append(getCreateTime())
                .append(getUpdateBy())
                .append(getUpdateTime())
                .append(getRemark())
                .toString();
    }
}
