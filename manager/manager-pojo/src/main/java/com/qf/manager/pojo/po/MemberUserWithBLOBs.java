package com.qf.manager.pojo.po;

public class MemberUserWithBLOBs extends MemberUser {
    private String safequestionjson;

    private String signature;

    private String remindjson;

    private String remark;

    private String userinfojson;

    private String basevalidjson;

    public String getSafequestionjson() {
        return safequestionjson;
    }

    public void setSafequestionjson(String safequestionjson) {
        this.safequestionjson = safequestionjson == null ? null : safequestionjson.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getRemindjson() {
        return remindjson;
    }

    public void setRemindjson(String remindjson) {
        this.remindjson = remindjson == null ? null : remindjson.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUserinfojson() {
        return userinfojson;
    }

    public void setUserinfojson(String userinfojson) {
        this.userinfojson = userinfojson == null ? null : userinfojson.trim();
    }

    public String getBasevalidjson() {
        return basevalidjson;
    }

    public void setBasevalidjson(String basevalidjson) {
        this.basevalidjson = basevalidjson == null ? null : basevalidjson.trim();
    }
}