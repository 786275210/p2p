package com.qf.manager.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("Nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("Nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("Nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("Nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("Nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("Nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("Nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("Nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("Nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("Nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("Nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("Nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("Nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("Nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltIsNull() {
            addCriterion("PasswordSalt is null");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltIsNotNull() {
            addCriterion("PasswordSalt is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltEqualTo(String value) {
            addCriterion("PasswordSalt =", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltNotEqualTo(String value) {
            addCriterion("PasswordSalt <>", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltGreaterThan(String value) {
            addCriterion("PasswordSalt >", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltGreaterThanOrEqualTo(String value) {
            addCriterion("PasswordSalt >=", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltLessThan(String value) {
            addCriterion("PasswordSalt <", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltLessThanOrEqualTo(String value) {
            addCriterion("PasswordSalt <=", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltLike(String value) {
            addCriterion("PasswordSalt like", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltNotLike(String value) {
            addCriterion("PasswordSalt not like", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltIn(List<String> values) {
            addCriterion("PasswordSalt in", values, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltNotIn(List<String> values) {
            addCriterion("PasswordSalt not in", values, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltBetween(String value1, String value2) {
            addCriterion("PasswordSalt between", value1, value2, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltNotBetween(String value1, String value2) {
            addCriterion("PasswordSalt not between", value1, value2, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltIsNull() {
            addCriterion("PayPassowrdSalt is null");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltIsNotNull() {
            addCriterion("PayPassowrdSalt is not null");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltEqualTo(String value) {
            addCriterion("PayPassowrdSalt =", value, "paypassowrdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltNotEqualTo(String value) {
            addCriterion("PayPassowrdSalt <>", value, "paypassowrdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltGreaterThan(String value) {
            addCriterion("PayPassowrdSalt >", value, "paypassowrdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltGreaterThanOrEqualTo(String value) {
            addCriterion("PayPassowrdSalt >=", value, "paypassowrdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltLessThan(String value) {
            addCriterion("PayPassowrdSalt <", value, "paypassowrdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltLessThanOrEqualTo(String value) {
            addCriterion("PayPassowrdSalt <=", value, "paypassowrdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltLike(String value) {
            addCriterion("PayPassowrdSalt like", value, "paypassowrdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltNotLike(String value) {
            addCriterion("PayPassowrdSalt not like", value, "paypassowrdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltIn(List<String> values) {
            addCriterion("PayPassowrdSalt in", values, "paypassowrdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltNotIn(List<String> values) {
            addCriterion("PayPassowrdSalt not in", values, "paypassowrdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltBetween(String value1, String value2) {
            addCriterion("PayPassowrdSalt between", value1, value2, "paypassowrdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdsaltNotBetween(String value1, String value2) {
            addCriterion("PayPassowrdSalt not between", value1, value2, "paypassowrdsalt");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdIsNull() {
            addCriterion("PayPassowrd is null");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdIsNotNull() {
            addCriterion("PayPassowrd is not null");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdEqualTo(String value) {
            addCriterion("PayPassowrd =", value, "paypassowrd");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdNotEqualTo(String value) {
            addCriterion("PayPassowrd <>", value, "paypassowrd");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdGreaterThan(String value) {
            addCriterion("PayPassowrd >", value, "paypassowrd");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdGreaterThanOrEqualTo(String value) {
            addCriterion("PayPassowrd >=", value, "paypassowrd");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdLessThan(String value) {
            addCriterion("PayPassowrd <", value, "paypassowrd");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdLessThanOrEqualTo(String value) {
            addCriterion("PayPassowrd <=", value, "paypassowrd");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdLike(String value) {
            addCriterion("PayPassowrd like", value, "paypassowrd");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdNotLike(String value) {
            addCriterion("PayPassowrd not like", value, "paypassowrd");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdIn(List<String> values) {
            addCriterion("PayPassowrd in", values, "paypassowrd");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdNotIn(List<String> values) {
            addCriterion("PayPassowrd not in", values, "paypassowrd");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdBetween(String value1, String value2) {
            addCriterion("PayPassowrd between", value1, value2, "paypassowrd");
            return (Criteria) this;
        }

        public Criteria andPaypassowrdNotBetween(String value1, String value2) {
            addCriterion("PayPassowrd not between", value1, value2, "paypassowrd");
            return (Criteria) this;
        }

        public Criteria andUsertypeidIsNull() {
            addCriterion("UserTypeId is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeidIsNotNull() {
            addCriterion("UserTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeidEqualTo(Long value) {
            addCriterion("UserTypeId =", value, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidNotEqualTo(Long value) {
            addCriterion("UserTypeId <>", value, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidGreaterThan(Long value) {
            addCriterion("UserTypeId >", value, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidGreaterThanOrEqualTo(Long value) {
            addCriterion("UserTypeId >=", value, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidLessThan(Long value) {
            addCriterion("UserTypeId <", value, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidLessThanOrEqualTo(Long value) {
            addCriterion("UserTypeId <=", value, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidIn(List<Long> values) {
            addCriterion("UserTypeId in", values, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidNotIn(List<Long> values) {
            addCriterion("UserTypeId not in", values, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidBetween(Long value1, Long value2) {
            addCriterion("UserTypeId between", value1, value2, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUsertypeidNotBetween(Long value1, Long value2) {
            addCriterion("UserTypeId not between", value1, value2, "usertypeid");
            return (Criteria) this;
        }

        public Criteria andUpgroupidIsNull() {
            addCriterion("UpGroupId is null");
            return (Criteria) this;
        }

        public Criteria andUpgroupidIsNotNull() {
            addCriterion("UpGroupId is not null");
            return (Criteria) this;
        }

        public Criteria andUpgroupidEqualTo(Long value) {
            addCriterion("UpGroupId =", value, "upgroupid");
            return (Criteria) this;
        }

        public Criteria andUpgroupidNotEqualTo(Long value) {
            addCriterion("UpGroupId <>", value, "upgroupid");
            return (Criteria) this;
        }

        public Criteria andUpgroupidGreaterThan(Long value) {
            addCriterion("UpGroupId >", value, "upgroupid");
            return (Criteria) this;
        }

        public Criteria andUpgroupidGreaterThanOrEqualTo(Long value) {
            addCriterion("UpGroupId >=", value, "upgroupid");
            return (Criteria) this;
        }

        public Criteria andUpgroupidLessThan(Long value) {
            addCriterion("UpGroupId <", value, "upgroupid");
            return (Criteria) this;
        }

        public Criteria andUpgroupidLessThanOrEqualTo(Long value) {
            addCriterion("UpGroupId <=", value, "upgroupid");
            return (Criteria) this;
        }

        public Criteria andUpgroupidIn(List<Long> values) {
            addCriterion("UpGroupId in", values, "upgroupid");
            return (Criteria) this;
        }

        public Criteria andUpgroupidNotIn(List<Long> values) {
            addCriterion("UpGroupId not in", values, "upgroupid");
            return (Criteria) this;
        }

        public Criteria andUpgroupidBetween(Long value1, Long value2) {
            addCriterion("UpGroupId between", value1, value2, "upgroupid");
            return (Criteria) this;
        }

        public Criteria andUpgroupidNotBetween(Long value1, Long value2) {
            addCriterion("UpGroupId not between", value1, value2, "upgroupid");
            return (Criteria) this;
        }

        public Criteria andUpgroupexpiresIsNull() {
            addCriterion("UpGroupExpires is null");
            return (Criteria) this;
        }

        public Criteria andUpgroupexpiresIsNotNull() {
            addCriterion("UpGroupExpires is not null");
            return (Criteria) this;
        }

        public Criteria andUpgroupexpiresEqualTo(Date value) {
            addCriterion("UpGroupExpires =", value, "upgroupexpires");
            return (Criteria) this;
        }

        public Criteria andUpgroupexpiresNotEqualTo(Date value) {
            addCriterion("UpGroupExpires <>", value, "upgroupexpires");
            return (Criteria) this;
        }

        public Criteria andUpgroupexpiresGreaterThan(Date value) {
            addCriterion("UpGroupExpires >", value, "upgroupexpires");
            return (Criteria) this;
        }

        public Criteria andUpgroupexpiresGreaterThanOrEqualTo(Date value) {
            addCriterion("UpGroupExpires >=", value, "upgroupexpires");
            return (Criteria) this;
        }

        public Criteria andUpgroupexpiresLessThan(Date value) {
            addCriterion("UpGroupExpires <", value, "upgroupexpires");
            return (Criteria) this;
        }

        public Criteria andUpgroupexpiresLessThanOrEqualTo(Date value) {
            addCriterion("UpGroupExpires <=", value, "upgroupexpires");
            return (Criteria) this;
        }

        public Criteria andUpgroupexpiresIn(List<Date> values) {
            addCriterion("UpGroupExpires in", values, "upgroupexpires");
            return (Criteria) this;
        }

        public Criteria andUpgroupexpiresNotIn(List<Date> values) {
            addCriterion("UpGroupExpires not in", values, "upgroupexpires");
            return (Criteria) this;
        }

        public Criteria andUpgroupexpiresBetween(Date value1, Date value2) {
            addCriterion("UpGroupExpires between", value1, value2, "upgroupexpires");
            return (Criteria) this;
        }

        public Criteria andUpgroupexpiresNotBetween(Date value1, Date value2) {
            addCriterion("UpGroupExpires not between", value1, value2, "upgroupexpires");
            return (Criteria) this;
        }

        public Criteria andFaceIsNull() {
            addCriterion("Face is null");
            return (Criteria) this;
        }

        public Criteria andFaceIsNotNull() {
            addCriterion("Face is not null");
            return (Criteria) this;
        }

        public Criteria andFaceEqualTo(String value) {
            addCriterion("Face =", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotEqualTo(String value) {
            addCriterion("Face <>", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceGreaterThan(String value) {
            addCriterion("Face >", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceGreaterThanOrEqualTo(String value) {
            addCriterion("Face >=", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLessThan(String value) {
            addCriterion("Face <", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLessThanOrEqualTo(String value) {
            addCriterion("Face <=", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceLike(String value) {
            addCriterion("Face like", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotLike(String value) {
            addCriterion("Face not like", value, "face");
            return (Criteria) this;
        }

        public Criteria andFaceIn(List<String> values) {
            addCriterion("Face in", values, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotIn(List<String> values) {
            addCriterion("Face not in", values, "face");
            return (Criteria) this;
        }

        public Criteria andFaceBetween(String value1, String value2) {
            addCriterion("Face between", value1, value2, "face");
            return (Criteria) this;
        }

        public Criteria andFaceNotBetween(String value1, String value2) {
            addCriterion("Face not between", value1, value2, "face");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhonevalidIsNull() {
            addCriterion("PhoneValid is null");
            return (Criteria) this;
        }

        public Criteria andPhonevalidIsNotNull() {
            addCriterion("PhoneValid is not null");
            return (Criteria) this;
        }

        public Criteria andPhonevalidEqualTo(Integer value) {
            addCriterion("PhoneValid =", value, "phonevalid");
            return (Criteria) this;
        }

        public Criteria andPhonevalidNotEqualTo(Integer value) {
            addCriterion("PhoneValid <>", value, "phonevalid");
            return (Criteria) this;
        }

        public Criteria andPhonevalidGreaterThan(Integer value) {
            addCriterion("PhoneValid >", value, "phonevalid");
            return (Criteria) this;
        }

        public Criteria andPhonevalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhoneValid >=", value, "phonevalid");
            return (Criteria) this;
        }

        public Criteria andPhonevalidLessThan(Integer value) {
            addCriterion("PhoneValid <", value, "phonevalid");
            return (Criteria) this;
        }

        public Criteria andPhonevalidLessThanOrEqualTo(Integer value) {
            addCriterion("PhoneValid <=", value, "phonevalid");
            return (Criteria) this;
        }

        public Criteria andPhonevalidIn(List<Integer> values) {
            addCriterion("PhoneValid in", values, "phonevalid");
            return (Criteria) this;
        }

        public Criteria andPhonevalidNotIn(List<Integer> values) {
            addCriterion("PhoneValid not in", values, "phonevalid");
            return (Criteria) this;
        }

        public Criteria andPhonevalidBetween(Integer value1, Integer value2) {
            addCriterion("PhoneValid between", value1, value2, "phonevalid");
            return (Criteria) this;
        }

        public Criteria andPhonevalidNotBetween(Integer value1, Integer value2) {
            addCriterion("PhoneValid not between", value1, value2, "phonevalid");
            return (Criteria) this;
        }

        public Criteria andEmailvalidIsNull() {
            addCriterion("EmailValid is null");
            return (Criteria) this;
        }

        public Criteria andEmailvalidIsNotNull() {
            addCriterion("EmailValid is not null");
            return (Criteria) this;
        }

        public Criteria andEmailvalidEqualTo(Integer value) {
            addCriterion("EmailValid =", value, "emailvalid");
            return (Criteria) this;
        }

        public Criteria andEmailvalidNotEqualTo(Integer value) {
            addCriterion("EmailValid <>", value, "emailvalid");
            return (Criteria) this;
        }

        public Criteria andEmailvalidGreaterThan(Integer value) {
            addCriterion("EmailValid >", value, "emailvalid");
            return (Criteria) this;
        }

        public Criteria andEmailvalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EmailValid >=", value, "emailvalid");
            return (Criteria) this;
        }

        public Criteria andEmailvalidLessThan(Integer value) {
            addCriterion("EmailValid <", value, "emailvalid");
            return (Criteria) this;
        }

        public Criteria andEmailvalidLessThanOrEqualTo(Integer value) {
            addCriterion("EmailValid <=", value, "emailvalid");
            return (Criteria) this;
        }

        public Criteria andEmailvalidIn(List<Integer> values) {
            addCriterion("EmailValid in", values, "emailvalid");
            return (Criteria) this;
        }

        public Criteria andEmailvalidNotIn(List<Integer> values) {
            addCriterion("EmailValid not in", values, "emailvalid");
            return (Criteria) this;
        }

        public Criteria andEmailvalidBetween(Integer value1, Integer value2) {
            addCriterion("EmailValid between", value1, value2, "emailvalid");
            return (Criteria) this;
        }

        public Criteria andEmailvalidNotBetween(Integer value1, Integer value2) {
            addCriterion("EmailValid not between", value1, value2, "emailvalid");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNull() {
            addCriterion("CreateAt is null");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNotNull() {
            addCriterion("CreateAt is not null");
            return (Criteria) this;
        }

        public Criteria andCreateatEqualTo(Date value) {
            addCriterion("CreateAt =", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotEqualTo(Date value) {
            addCriterion("CreateAt <>", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThan(Date value) {
            addCriterion("CreateAt >", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateAt >=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThan(Date value) {
            addCriterion("CreateAt <", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThanOrEqualTo(Date value) {
            addCriterion("CreateAt <=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatIn(List<Date> values) {
            addCriterion("CreateAt in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotIn(List<Date> values) {
            addCriterion("CreateAt not in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatBetween(Date value1, Date value2) {
            addCriterion("CreateAt between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotBetween(Date value1, Date value2) {
            addCriterion("CreateAt not between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andLastloginatIsNull() {
            addCriterion("LastLoginAt is null");
            return (Criteria) this;
        }

        public Criteria andLastloginatIsNotNull() {
            addCriterion("LastLoginAt is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginatEqualTo(Date value) {
            addCriterion("LastLoginAt =", value, "lastloginat");
            return (Criteria) this;
        }

        public Criteria andLastloginatNotEqualTo(Date value) {
            addCriterion("LastLoginAt <>", value, "lastloginat");
            return (Criteria) this;
        }

        public Criteria andLastloginatGreaterThan(Date value) {
            addCriterion("LastLoginAt >", value, "lastloginat");
            return (Criteria) this;
        }

        public Criteria andLastloginatGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLoginAt >=", value, "lastloginat");
            return (Criteria) this;
        }

        public Criteria andLastloginatLessThan(Date value) {
            addCriterion("LastLoginAt <", value, "lastloginat");
            return (Criteria) this;
        }

        public Criteria andLastloginatLessThanOrEqualTo(Date value) {
            addCriterion("LastLoginAt <=", value, "lastloginat");
            return (Criteria) this;
        }

        public Criteria andLastloginatIn(List<Date> values) {
            addCriterion("LastLoginAt in", values, "lastloginat");
            return (Criteria) this;
        }

        public Criteria andLastloginatNotIn(List<Date> values) {
            addCriterion("LastLoginAt not in", values, "lastloginat");
            return (Criteria) this;
        }

        public Criteria andLastloginatBetween(Date value1, Date value2) {
            addCriterion("LastLoginAt between", value1, value2, "lastloginat");
            return (Criteria) this;
        }

        public Criteria andLastloginatNotBetween(Date value1, Date value2) {
            addCriterion("LastLoginAt not between", value1, value2, "lastloginat");
            return (Criteria) this;
        }

        public Criteria andPreloginatIsNull() {
            addCriterion("PreLoginAt is null");
            return (Criteria) this;
        }

        public Criteria andPreloginatIsNotNull() {
            addCriterion("PreLoginAt is not null");
            return (Criteria) this;
        }

        public Criteria andPreloginatEqualTo(Date value) {
            addCriterion("PreLoginAt =", value, "preloginat");
            return (Criteria) this;
        }

        public Criteria andPreloginatNotEqualTo(Date value) {
            addCriterion("PreLoginAt <>", value, "preloginat");
            return (Criteria) this;
        }

        public Criteria andPreloginatGreaterThan(Date value) {
            addCriterion("PreLoginAt >", value, "preloginat");
            return (Criteria) this;
        }

        public Criteria andPreloginatGreaterThanOrEqualTo(Date value) {
            addCriterion("PreLoginAt >=", value, "preloginat");
            return (Criteria) this;
        }

        public Criteria andPreloginatLessThan(Date value) {
            addCriterion("PreLoginAt <", value, "preloginat");
            return (Criteria) this;
        }

        public Criteria andPreloginatLessThanOrEqualTo(Date value) {
            addCriterion("PreLoginAt <=", value, "preloginat");
            return (Criteria) this;
        }

        public Criteria andPreloginatIn(List<Date> values) {
            addCriterion("PreLoginAt in", values, "preloginat");
            return (Criteria) this;
        }

        public Criteria andPreloginatNotIn(List<Date> values) {
            addCriterion("PreLoginAt not in", values, "preloginat");
            return (Criteria) this;
        }

        public Criteria andPreloginatBetween(Date value1, Date value2) {
            addCriterion("PreLoginAt between", value1, value2, "preloginat");
            return (Criteria) this;
        }

        public Criteria andPreloginatNotBetween(Date value1, Date value2) {
            addCriterion("PreLoginAt not between", value1, value2, "preloginat");
            return (Criteria) this;
        }

        public Criteria andRegipIsNull() {
            addCriterion("RegIP is null");
            return (Criteria) this;
        }

        public Criteria andRegipIsNotNull() {
            addCriterion("RegIP is not null");
            return (Criteria) this;
        }

        public Criteria andRegipEqualTo(String value) {
            addCriterion("RegIP =", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotEqualTo(String value) {
            addCriterion("RegIP <>", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipGreaterThan(String value) {
            addCriterion("RegIP >", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipGreaterThanOrEqualTo(String value) {
            addCriterion("RegIP >=", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipLessThan(String value) {
            addCriterion("RegIP <", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipLessThanOrEqualTo(String value) {
            addCriterion("RegIP <=", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipLike(String value) {
            addCriterion("RegIP like", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotLike(String value) {
            addCriterion("RegIP not like", value, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipIn(List<String> values) {
            addCriterion("RegIP in", values, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotIn(List<String> values) {
            addCriterion("RegIP not in", values, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipBetween(String value1, String value2) {
            addCriterion("RegIP between", value1, value2, "regip");
            return (Criteria) this;
        }

        public Criteria andRegipNotBetween(String value1, String value2) {
            addCriterion("RegIP not between", value1, value2, "regip");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNull() {
            addCriterion("LastLoginIP is null");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNotNull() {
            addCriterion("LastLoginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginipEqualTo(String value) {
            addCriterion("LastLoginIP =", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotEqualTo(String value) {
            addCriterion("LastLoginIP <>", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThan(String value) {
            addCriterion("LastLoginIP >", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThanOrEqualTo(String value) {
            addCriterion("LastLoginIP >=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThan(String value) {
            addCriterion("LastLoginIP <", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThanOrEqualTo(String value) {
            addCriterion("LastLoginIP <=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLike(String value) {
            addCriterion("LastLoginIP like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotLike(String value) {
            addCriterion("LastLoginIP not like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipIn(List<String> values) {
            addCriterion("LastLoginIP in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotIn(List<String> values) {
            addCriterion("LastLoginIP not in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipBetween(String value1, String value2) {
            addCriterion("LastLoginIP between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotBetween(String value1, String value2) {
            addCriterion("LastLoginIP not between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipIsNull() {
            addCriterion("PreLoginIP is null");
            return (Criteria) this;
        }

        public Criteria andPreloginipIsNotNull() {
            addCriterion("PreLoginIP is not null");
            return (Criteria) this;
        }

        public Criteria andPreloginipEqualTo(String value) {
            addCriterion("PreLoginIP =", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipNotEqualTo(String value) {
            addCriterion("PreLoginIP <>", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipGreaterThan(String value) {
            addCriterion("PreLoginIP >", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipGreaterThanOrEqualTo(String value) {
            addCriterion("PreLoginIP >=", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipLessThan(String value) {
            addCriterion("PreLoginIP <", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipLessThanOrEqualTo(String value) {
            addCriterion("PreLoginIP <=", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipLike(String value) {
            addCriterion("PreLoginIP like", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipNotLike(String value) {
            addCriterion("PreLoginIP not like", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipIn(List<String> values) {
            addCriterion("PreLoginIP in", values, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipNotIn(List<String> values) {
            addCriterion("PreLoginIP not in", values, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipBetween(String value1, String value2) {
            addCriterion("PreLoginIP between", value1, value2, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipNotBetween(String value1, String value2) {
            addCriterion("PreLoginIP not between", value1, value2, "preloginip");
            return (Criteria) this;
        }

        public Criteria andLogincountIsNull() {
            addCriterion("LoginCount is null");
            return (Criteria) this;
        }

        public Criteria andLogincountIsNotNull() {
            addCriterion("LoginCount is not null");
            return (Criteria) this;
        }

        public Criteria andLogincountEqualTo(Integer value) {
            addCriterion("LoginCount =", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountNotEqualTo(Integer value) {
            addCriterion("LoginCount <>", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountGreaterThan(Integer value) {
            addCriterion("LoginCount >", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LoginCount >=", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountLessThan(Integer value) {
            addCriterion("LoginCount <", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountLessThanOrEqualTo(Integer value) {
            addCriterion("LoginCount <=", value, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountIn(List<Integer> values) {
            addCriterion("LoginCount in", values, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountNotIn(List<Integer> values) {
            addCriterion("LoginCount not in", values, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountBetween(Integer value1, Integer value2) {
            addCriterion("LoginCount between", value1, value2, "logincount");
            return (Criteria) this;
        }

        public Criteria andLogincountNotBetween(Integer value1, Integer value2) {
            addCriterion("LoginCount not between", value1, value2, "logincount");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("Score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("Score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Long value) {
            addCriterion("Score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Long value) {
            addCriterion("Score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Long value) {
            addCriterion("Score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Long value) {
            addCriterion("Score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Long value) {
            addCriterion("Score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Long value) {
            addCriterion("Score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Long> values) {
            addCriterion("Score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Long> values) {
            addCriterion("Score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Long value1, Long value2) {
            addCriterion("Score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Long value1, Long value2) {
            addCriterion("Score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("Credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("Credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Integer value) {
            addCriterion("Credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Integer value) {
            addCriterion("Credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Integer value) {
            addCriterion("Credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("Credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Integer value) {
            addCriterion("Credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Integer value) {
            addCriterion("Credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Integer> values) {
            addCriterion("Credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Integer> values) {
            addCriterion("Credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Integer value1, Integer value2) {
            addCriterion("Credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("Credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andIslockIsNull() {
            addCriterion("IsLock is null");
            return (Criteria) this;
        }

        public Criteria andIslockIsNotNull() {
            addCriterion("IsLock is not null");
            return (Criteria) this;
        }

        public Criteria andIslockEqualTo(Byte value) {
            addCriterion("IsLock =", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotEqualTo(Byte value) {
            addCriterion("IsLock <>", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockGreaterThan(Byte value) {
            addCriterion("IsLock >", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsLock >=", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLessThan(Byte value) {
            addCriterion("IsLock <", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLessThanOrEqualTo(Byte value) {
            addCriterion("IsLock <=", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockIn(List<Byte> values) {
            addCriterion("IsLock in", values, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotIn(List<Byte> values) {
            addCriterion("IsLock not in", values, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockBetween(Byte value1, Byte value2) {
            addCriterion("IsLock between", value1, value2, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotBetween(Byte value1, Byte value2) {
            addCriterion("IsLock not between", value1, value2, "islock");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountIsNull() {
            addCriterion("LoginErrorCount is null");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountIsNotNull() {
            addCriterion("LoginErrorCount is not null");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountEqualTo(Integer value) {
            addCriterion("LoginErrorCount =", value, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountNotEqualTo(Integer value) {
            addCriterion("LoginErrorCount <>", value, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountGreaterThan(Integer value) {
            addCriterion("LoginErrorCount >", value, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LoginErrorCount >=", value, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountLessThan(Integer value) {
            addCriterion("LoginErrorCount <", value, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountLessThanOrEqualTo(Integer value) {
            addCriterion("LoginErrorCount <=", value, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountIn(List<Integer> values) {
            addCriterion("LoginErrorCount in", values, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountNotIn(List<Integer> values) {
            addCriterion("LoginErrorCount not in", values, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountBetween(Integer value1, Integer value2) {
            addCriterion("LoginErrorCount between", value1, value2, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerrorcountNotBetween(Integer value1, Integer value2) {
            addCriterion("LoginErrorCount not between", value1, value2, "loginerrorcount");
            return (Criteria) this;
        }

        public Criteria andLoginerroratIsNull() {
            addCriterion("LoginErrorAt is null");
            return (Criteria) this;
        }

        public Criteria andLoginerroratIsNotNull() {
            addCriterion("LoginErrorAt is not null");
            return (Criteria) this;
        }

        public Criteria andLoginerroratEqualTo(Date value) {
            addCriterion("LoginErrorAt =", value, "loginerrorat");
            return (Criteria) this;
        }

        public Criteria andLoginerroratNotEqualTo(Date value) {
            addCriterion("LoginErrorAt <>", value, "loginerrorat");
            return (Criteria) this;
        }

        public Criteria andLoginerroratGreaterThan(Date value) {
            addCriterion("LoginErrorAt >", value, "loginerrorat");
            return (Criteria) this;
        }

        public Criteria andLoginerroratGreaterThanOrEqualTo(Date value) {
            addCriterion("LoginErrorAt >=", value, "loginerrorat");
            return (Criteria) this;
        }

        public Criteria andLoginerroratLessThan(Date value) {
            addCriterion("LoginErrorAt <", value, "loginerrorat");
            return (Criteria) this;
        }

        public Criteria andLoginerroratLessThanOrEqualTo(Date value) {
            addCriterion("LoginErrorAt <=", value, "loginerrorat");
            return (Criteria) this;
        }

        public Criteria andLoginerroratIn(List<Date> values) {
            addCriterion("LoginErrorAt in", values, "loginerrorat");
            return (Criteria) this;
        }

        public Criteria andLoginerroratNotIn(List<Date> values) {
            addCriterion("LoginErrorAt not in", values, "loginerrorat");
            return (Criteria) this;
        }

        public Criteria andLoginerroratBetween(Date value1, Date value2) {
            addCriterion("LoginErrorAt between", value1, value2, "loginerrorat");
            return (Criteria) this;
        }

        public Criteria andLoginerroratNotBetween(Date value1, Date value2) {
            addCriterion("LoginErrorAt not between", value1, value2, "loginerrorat");
            return (Criteria) this;
        }

        public Criteria andPayerrorcountIsNull() {
            addCriterion("PayErrorCount is null");
            return (Criteria) this;
        }

        public Criteria andPayerrorcountIsNotNull() {
            addCriterion("PayErrorCount is not null");
            return (Criteria) this;
        }

        public Criteria andPayerrorcountEqualTo(Integer value) {
            addCriterion("PayErrorCount =", value, "payerrorcount");
            return (Criteria) this;
        }

        public Criteria andPayerrorcountNotEqualTo(Integer value) {
            addCriterion("PayErrorCount <>", value, "payerrorcount");
            return (Criteria) this;
        }

        public Criteria andPayerrorcountGreaterThan(Integer value) {
            addCriterion("PayErrorCount >", value, "payerrorcount");
            return (Criteria) this;
        }

        public Criteria andPayerrorcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayErrorCount >=", value, "payerrorcount");
            return (Criteria) this;
        }

        public Criteria andPayerrorcountLessThan(Integer value) {
            addCriterion("PayErrorCount <", value, "payerrorcount");
            return (Criteria) this;
        }

        public Criteria andPayerrorcountLessThanOrEqualTo(Integer value) {
            addCriterion("PayErrorCount <=", value, "payerrorcount");
            return (Criteria) this;
        }

        public Criteria andPayerrorcountIn(List<Integer> values) {
            addCriterion("PayErrorCount in", values, "payerrorcount");
            return (Criteria) this;
        }

        public Criteria andPayerrorcountNotIn(List<Integer> values) {
            addCriterion("PayErrorCount not in", values, "payerrorcount");
            return (Criteria) this;
        }

        public Criteria andPayerrorcountBetween(Integer value1, Integer value2) {
            addCriterion("PayErrorCount between", value1, value2, "payerrorcount");
            return (Criteria) this;
        }

        public Criteria andPayerrorcountNotBetween(Integer value1, Integer value2) {
            addCriterion("PayErrorCount not between", value1, value2, "payerrorcount");
            return (Criteria) this;
        }

        public Criteria andPayerroratIsNull() {
            addCriterion("PayErrorAt is null");
            return (Criteria) this;
        }

        public Criteria andPayerroratIsNotNull() {
            addCriterion("PayErrorAt is not null");
            return (Criteria) this;
        }

        public Criteria andPayerroratEqualTo(Date value) {
            addCriterion("PayErrorAt =", value, "payerrorat");
            return (Criteria) this;
        }

        public Criteria andPayerroratNotEqualTo(Date value) {
            addCriterion("PayErrorAt <>", value, "payerrorat");
            return (Criteria) this;
        }

        public Criteria andPayerroratGreaterThan(Date value) {
            addCriterion("PayErrorAt >", value, "payerrorat");
            return (Criteria) this;
        }

        public Criteria andPayerroratGreaterThanOrEqualTo(Date value) {
            addCriterion("PayErrorAt >=", value, "payerrorat");
            return (Criteria) this;
        }

        public Criteria andPayerroratLessThan(Date value) {
            addCriterion("PayErrorAt <", value, "payerrorat");
            return (Criteria) this;
        }

        public Criteria andPayerroratLessThanOrEqualTo(Date value) {
            addCriterion("PayErrorAt <=", value, "payerrorat");
            return (Criteria) this;
        }

        public Criteria andPayerroratIn(List<Date> values) {
            addCriterion("PayErrorAt in", values, "payerrorat");
            return (Criteria) this;
        }

        public Criteria andPayerroratNotIn(List<Date> values) {
            addCriterion("PayErrorAt not in", values, "payerrorat");
            return (Criteria) this;
        }

        public Criteria andPayerroratBetween(Date value1, Date value2) {
            addCriterion("PayErrorAt between", value1, value2, "payerrorat");
            return (Criteria) this;
        }

        public Criteria andPayerroratNotBetween(Date value1, Date value2) {
            addCriterion("PayErrorAt not between", value1, value2, "payerrorat");
            return (Criteria) this;
        }

        public Criteria andRecommendbyIsNull() {
            addCriterion("RecommendBy is null");
            return (Criteria) this;
        }

        public Criteria andRecommendbyIsNotNull() {
            addCriterion("RecommendBy is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendbyEqualTo(Long value) {
            addCriterion("RecommendBy =", value, "recommendby");
            return (Criteria) this;
        }

        public Criteria andRecommendbyNotEqualTo(Long value) {
            addCriterion("RecommendBy <>", value, "recommendby");
            return (Criteria) this;
        }

        public Criteria andRecommendbyGreaterThan(Long value) {
            addCriterion("RecommendBy >", value, "recommendby");
            return (Criteria) this;
        }

        public Criteria andRecommendbyGreaterThanOrEqualTo(Long value) {
            addCriterion("RecommendBy >=", value, "recommendby");
            return (Criteria) this;
        }

        public Criteria andRecommendbyLessThan(Long value) {
            addCriterion("RecommendBy <", value, "recommendby");
            return (Criteria) this;
        }

        public Criteria andRecommendbyLessThanOrEqualTo(Long value) {
            addCriterion("RecommendBy <=", value, "recommendby");
            return (Criteria) this;
        }

        public Criteria andRecommendbyIn(List<Long> values) {
            addCriterion("RecommendBy in", values, "recommendby");
            return (Criteria) this;
        }

        public Criteria andRecommendbyNotIn(List<Long> values) {
            addCriterion("RecommendBy not in", values, "recommendby");
            return (Criteria) this;
        }

        public Criteria andRecommendbyBetween(Long value1, Long value2) {
            addCriterion("RecommendBy between", value1, value2, "recommendby");
            return (Criteria) this;
        }

        public Criteria andRecommendbyNotBetween(Long value1, Long value2) {
            addCriterion("RecommendBy not between", value1, value2, "recommendby");
            return (Criteria) this;
        }

        public Criteria andGradelevelIsNull() {
            addCriterion("GradeLevel is null");
            return (Criteria) this;
        }

        public Criteria andGradelevelIsNotNull() {
            addCriterion("GradeLevel is not null");
            return (Criteria) this;
        }

        public Criteria andGradelevelEqualTo(Integer value) {
            addCriterion("GradeLevel =", value, "gradelevel");
            return (Criteria) this;
        }

        public Criteria andGradelevelNotEqualTo(Integer value) {
            addCriterion("GradeLevel <>", value, "gradelevel");
            return (Criteria) this;
        }

        public Criteria andGradelevelGreaterThan(Integer value) {
            addCriterion("GradeLevel >", value, "gradelevel");
            return (Criteria) this;
        }

        public Criteria andGradelevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("GradeLevel >=", value, "gradelevel");
            return (Criteria) this;
        }

        public Criteria andGradelevelLessThan(Integer value) {
            addCriterion("GradeLevel <", value, "gradelevel");
            return (Criteria) this;
        }

        public Criteria andGradelevelLessThanOrEqualTo(Integer value) {
            addCriterion("GradeLevel <=", value, "gradelevel");
            return (Criteria) this;
        }

        public Criteria andGradelevelIn(List<Integer> values) {
            addCriterion("GradeLevel in", values, "gradelevel");
            return (Criteria) this;
        }

        public Criteria andGradelevelNotIn(List<Integer> values) {
            addCriterion("GradeLevel not in", values, "gradelevel");
            return (Criteria) this;
        }

        public Criteria andGradelevelBetween(Integer value1, Integer value2) {
            addCriterion("GradeLevel between", value1, value2, "gradelevel");
            return (Criteria) this;
        }

        public Criteria andGradelevelNotBetween(Integer value1, Integer value2) {
            addCriterion("GradeLevel not between", value1, value2, "gradelevel");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("ProvinceId is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("ProvinceId is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(Long value) {
            addCriterion("ProvinceId =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(Long value) {
            addCriterion("ProvinceId <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(Long value) {
            addCriterion("ProvinceId >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(Long value) {
            addCriterion("ProvinceId >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(Long value) {
            addCriterion("ProvinceId <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(Long value) {
            addCriterion("ProvinceId <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<Long> values) {
            addCriterion("ProvinceId in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<Long> values) {
            addCriterion("ProvinceId not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(Long value1, Long value2) {
            addCriterion("ProvinceId between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(Long value1, Long value2) {
            addCriterion("ProvinceId not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("CityId is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("CityId is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Long value) {
            addCriterion("CityId =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Long value) {
            addCriterion("CityId <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Long value) {
            addCriterion("CityId >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Long value) {
            addCriterion("CityId >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Long value) {
            addCriterion("CityId <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Long value) {
            addCriterion("CityId <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Long> values) {
            addCriterion("CityId in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Long> values) {
            addCriterion("CityId not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Long value1, Long value2) {
            addCriterion("CityId between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Long value1, Long value2) {
            addCriterion("CityId not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("AreaId is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("AreaId is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Long value) {
            addCriterion("AreaId =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Long value) {
            addCriterion("AreaId <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Long value) {
            addCriterion("AreaId >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Long value) {
            addCriterion("AreaId >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Long value) {
            addCriterion("AreaId <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Long value) {
            addCriterion("AreaId <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Long> values) {
            addCriterion("AreaId in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Long> values) {
            addCriterion("AreaId not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Long value1, Long value2) {
            addCriterion("AreaId between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Long value1, Long value2) {
            addCriterion("AreaId not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("Company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("Company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("Company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("Company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("Company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("Company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("Company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("Company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("Company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("Company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("Company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("Company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("Company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("Company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andSalenumberIsNull() {
            addCriterion("SaleNumber is null");
            return (Criteria) this;
        }

        public Criteria andSalenumberIsNotNull() {
            addCriterion("SaleNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSalenumberEqualTo(String value) {
            addCriterion("SaleNumber =", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberNotEqualTo(String value) {
            addCriterion("SaleNumber <>", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberGreaterThan(String value) {
            addCriterion("SaleNumber >", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberGreaterThanOrEqualTo(String value) {
            addCriterion("SaleNumber >=", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberLessThan(String value) {
            addCriterion("SaleNumber <", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberLessThanOrEqualTo(String value) {
            addCriterion("SaleNumber <=", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberLike(String value) {
            addCriterion("SaleNumber like", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberNotLike(String value) {
            addCriterion("SaleNumber not like", value, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberIn(List<String> values) {
            addCriterion("SaleNumber in", values, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberNotIn(List<String> values) {
            addCriterion("SaleNumber not in", values, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberBetween(String value1, String value2) {
            addCriterion("SaleNumber between", value1, value2, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalenumberNotBetween(String value1, String value2) {
            addCriterion("SaleNumber not between", value1, value2, "salenumber");
            return (Criteria) this;
        }

        public Criteria andSalephotoIsNull() {
            addCriterion("SalePhoto is null");
            return (Criteria) this;
        }

        public Criteria andSalephotoIsNotNull() {
            addCriterion("SalePhoto is not null");
            return (Criteria) this;
        }

        public Criteria andSalephotoEqualTo(String value) {
            addCriterion("SalePhoto =", value, "salephoto");
            return (Criteria) this;
        }

        public Criteria andSalephotoNotEqualTo(String value) {
            addCriterion("SalePhoto <>", value, "salephoto");
            return (Criteria) this;
        }

        public Criteria andSalephotoGreaterThan(String value) {
            addCriterion("SalePhoto >", value, "salephoto");
            return (Criteria) this;
        }

        public Criteria andSalephotoGreaterThanOrEqualTo(String value) {
            addCriterion("SalePhoto >=", value, "salephoto");
            return (Criteria) this;
        }

        public Criteria andSalephotoLessThan(String value) {
            addCriterion("SalePhoto <", value, "salephoto");
            return (Criteria) this;
        }

        public Criteria andSalephotoLessThanOrEqualTo(String value) {
            addCriterion("SalePhoto <=", value, "salephoto");
            return (Criteria) this;
        }

        public Criteria andSalephotoLike(String value) {
            addCriterion("SalePhoto like", value, "salephoto");
            return (Criteria) this;
        }

        public Criteria andSalephotoNotLike(String value) {
            addCriterion("SalePhoto not like", value, "salephoto");
            return (Criteria) this;
        }

        public Criteria andSalephotoIn(List<String> values) {
            addCriterion("SalePhoto in", values, "salephoto");
            return (Criteria) this;
        }

        public Criteria andSalephotoNotIn(List<String> values) {
            addCriterion("SalePhoto not in", values, "salephoto");
            return (Criteria) this;
        }

        public Criteria andSalephotoBetween(String value1, String value2) {
            addCriterion("SalePhoto between", value1, value2, "salephoto");
            return (Criteria) this;
        }

        public Criteria andSalephotoNotBetween(String value1, String value2) {
            addCriterion("SalePhoto not between", value1, value2, "salephoto");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("RealName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("RealName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("RealName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("RealName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("RealName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("RealName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("RealName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("RealName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("RealName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("RealName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("RealName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("RealName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("RealName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("RealName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnamevalidIsNull() {
            addCriterion("RealNameValid is null");
            return (Criteria) this;
        }

        public Criteria andRealnamevalidIsNotNull() {
            addCriterion("RealNameValid is not null");
            return (Criteria) this;
        }

        public Criteria andRealnamevalidEqualTo(Integer value) {
            addCriterion("RealNameValid =", value, "realnamevalid");
            return (Criteria) this;
        }

        public Criteria andRealnamevalidNotEqualTo(Integer value) {
            addCriterion("RealNameValid <>", value, "realnamevalid");
            return (Criteria) this;
        }

        public Criteria andRealnamevalidGreaterThan(Integer value) {
            addCriterion("RealNameValid >", value, "realnamevalid");
            return (Criteria) this;
        }

        public Criteria andRealnamevalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RealNameValid >=", value, "realnamevalid");
            return (Criteria) this;
        }

        public Criteria andRealnamevalidLessThan(Integer value) {
            addCriterion("RealNameValid <", value, "realnamevalid");
            return (Criteria) this;
        }

        public Criteria andRealnamevalidLessThanOrEqualTo(Integer value) {
            addCriterion("RealNameValid <=", value, "realnamevalid");
            return (Criteria) this;
        }

        public Criteria andRealnamevalidIn(List<Integer> values) {
            addCriterion("RealNameValid in", values, "realnamevalid");
            return (Criteria) this;
        }

        public Criteria andRealnamevalidNotIn(List<Integer> values) {
            addCriterion("RealNameValid not in", values, "realnamevalid");
            return (Criteria) this;
        }

        public Criteria andRealnamevalidBetween(Integer value1, Integer value2) {
            addCriterion("RealNameValid between", value1, value2, "realnamevalid");
            return (Criteria) this;
        }

        public Criteria andRealnamevalidNotBetween(Integer value1, Integer value2) {
            addCriterion("RealNameValid not between", value1, value2, "realnamevalid");
            return (Criteria) this;
        }

        public Criteria andOnsitevalidIsNull() {
            addCriterion("OnsiteValid is null");
            return (Criteria) this;
        }

        public Criteria andOnsitevalidIsNotNull() {
            addCriterion("OnsiteValid is not null");
            return (Criteria) this;
        }

        public Criteria andOnsitevalidEqualTo(Integer value) {
            addCriterion("OnsiteValid =", value, "onsitevalid");
            return (Criteria) this;
        }

        public Criteria andOnsitevalidNotEqualTo(Integer value) {
            addCriterion("OnsiteValid <>", value, "onsitevalid");
            return (Criteria) this;
        }

        public Criteria andOnsitevalidGreaterThan(Integer value) {
            addCriterion("OnsiteValid >", value, "onsitevalid");
            return (Criteria) this;
        }

        public Criteria andOnsitevalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OnsiteValid >=", value, "onsitevalid");
            return (Criteria) this;
        }

        public Criteria andOnsitevalidLessThan(Integer value) {
            addCriterion("OnsiteValid <", value, "onsitevalid");
            return (Criteria) this;
        }

        public Criteria andOnsitevalidLessThanOrEqualTo(Integer value) {
            addCriterion("OnsiteValid <=", value, "onsitevalid");
            return (Criteria) this;
        }

        public Criteria andOnsitevalidIn(List<Integer> values) {
            addCriterion("OnsiteValid in", values, "onsitevalid");
            return (Criteria) this;
        }

        public Criteria andOnsitevalidNotIn(List<Integer> values) {
            addCriterion("OnsiteValid not in", values, "onsitevalid");
            return (Criteria) this;
        }

        public Criteria andOnsitevalidBetween(Integer value1, Integer value2) {
            addCriterion("OnsiteValid between", value1, value2, "onsitevalid");
            return (Criteria) this;
        }

        public Criteria andOnsitevalidNotBetween(Integer value1, Integer value2) {
            addCriterion("OnsiteValid not between", value1, value2, "onsitevalid");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNull() {
            addCriterion("CardNumber is null");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNotNull() {
            addCriterion("CardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumberEqualTo(String value) {
            addCriterion("CardNumber =", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotEqualTo(String value) {
            addCriterion("CardNumber <>", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThan(String value) {
            addCriterion("CardNumber >", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CardNumber >=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThan(String value) {
            addCriterion("CardNumber <", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThanOrEqualTo(String value) {
            addCriterion("CardNumber <=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLike(String value) {
            addCriterion("CardNumber like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotLike(String value) {
            addCriterion("CardNumber not like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberIn(List<String> values) {
            addCriterion("CardNumber in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotIn(List<String> values) {
            addCriterion("CardNumber not in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberBetween(String value1, String value2) {
            addCriterion("CardNumber between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotBetween(String value1, String value2) {
            addCriterion("CardNumber not between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardphoto1IsNull() {
            addCriterion("CardPhoto1 is null");
            return (Criteria) this;
        }

        public Criteria andCardphoto1IsNotNull() {
            addCriterion("CardPhoto1 is not null");
            return (Criteria) this;
        }

        public Criteria andCardphoto1EqualTo(String value) {
            addCriterion("CardPhoto1 =", value, "cardphoto1");
            return (Criteria) this;
        }

        public Criteria andCardphoto1NotEqualTo(String value) {
            addCriterion("CardPhoto1 <>", value, "cardphoto1");
            return (Criteria) this;
        }

        public Criteria andCardphoto1GreaterThan(String value) {
            addCriterion("CardPhoto1 >", value, "cardphoto1");
            return (Criteria) this;
        }

        public Criteria andCardphoto1GreaterThanOrEqualTo(String value) {
            addCriterion("CardPhoto1 >=", value, "cardphoto1");
            return (Criteria) this;
        }

        public Criteria andCardphoto1LessThan(String value) {
            addCriterion("CardPhoto1 <", value, "cardphoto1");
            return (Criteria) this;
        }

        public Criteria andCardphoto1LessThanOrEqualTo(String value) {
            addCriterion("CardPhoto1 <=", value, "cardphoto1");
            return (Criteria) this;
        }

        public Criteria andCardphoto1Like(String value) {
            addCriterion("CardPhoto1 like", value, "cardphoto1");
            return (Criteria) this;
        }

        public Criteria andCardphoto1NotLike(String value) {
            addCriterion("CardPhoto1 not like", value, "cardphoto1");
            return (Criteria) this;
        }

        public Criteria andCardphoto1In(List<String> values) {
            addCriterion("CardPhoto1 in", values, "cardphoto1");
            return (Criteria) this;
        }

        public Criteria andCardphoto1NotIn(List<String> values) {
            addCriterion("CardPhoto1 not in", values, "cardphoto1");
            return (Criteria) this;
        }

        public Criteria andCardphoto1Between(String value1, String value2) {
            addCriterion("CardPhoto1 between", value1, value2, "cardphoto1");
            return (Criteria) this;
        }

        public Criteria andCardphoto1NotBetween(String value1, String value2) {
            addCriterion("CardPhoto1 not between", value1, value2, "cardphoto1");
            return (Criteria) this;
        }

        public Criteria andCardphoto2IsNull() {
            addCriterion("CardPhoto2 is null");
            return (Criteria) this;
        }

        public Criteria andCardphoto2IsNotNull() {
            addCriterion("CardPhoto2 is not null");
            return (Criteria) this;
        }

        public Criteria andCardphoto2EqualTo(String value) {
            addCriterion("CardPhoto2 =", value, "cardphoto2");
            return (Criteria) this;
        }

        public Criteria andCardphoto2NotEqualTo(String value) {
            addCriterion("CardPhoto2 <>", value, "cardphoto2");
            return (Criteria) this;
        }

        public Criteria andCardphoto2GreaterThan(String value) {
            addCriterion("CardPhoto2 >", value, "cardphoto2");
            return (Criteria) this;
        }

        public Criteria andCardphoto2GreaterThanOrEqualTo(String value) {
            addCriterion("CardPhoto2 >=", value, "cardphoto2");
            return (Criteria) this;
        }

        public Criteria andCardphoto2LessThan(String value) {
            addCriterion("CardPhoto2 <", value, "cardphoto2");
            return (Criteria) this;
        }

        public Criteria andCardphoto2LessThanOrEqualTo(String value) {
            addCriterion("CardPhoto2 <=", value, "cardphoto2");
            return (Criteria) this;
        }

        public Criteria andCardphoto2Like(String value) {
            addCriterion("CardPhoto2 like", value, "cardphoto2");
            return (Criteria) this;
        }

        public Criteria andCardphoto2NotLike(String value) {
            addCriterion("CardPhoto2 not like", value, "cardphoto2");
            return (Criteria) this;
        }

        public Criteria andCardphoto2In(List<String> values) {
            addCriterion("CardPhoto2 in", values, "cardphoto2");
            return (Criteria) this;
        }

        public Criteria andCardphoto2NotIn(List<String> values) {
            addCriterion("CardPhoto2 not in", values, "cardphoto2");
            return (Criteria) this;
        }

        public Criteria andCardphoto2Between(String value1, String value2) {
            addCriterion("CardPhoto2 between", value1, value2, "cardphoto2");
            return (Criteria) this;
        }

        public Criteria andCardphoto2NotBetween(String value1, String value2) {
            addCriterion("CardPhoto2 not between", value1, value2, "cardphoto2");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("Birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("Birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("Birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("Birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("Birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("Birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("Birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("Birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("Birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("Birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("Birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andUserinfowaitvalidIsNull() {
            addCriterion("UserInfoWaitValid is null");
            return (Criteria) this;
        }

        public Criteria andUserinfowaitvalidIsNotNull() {
            addCriterion("UserInfoWaitValid is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfowaitvalidEqualTo(Byte value) {
            addCriterion("UserInfoWaitValid =", value, "userinfowaitvalid");
            return (Criteria) this;
        }

        public Criteria andUserinfowaitvalidNotEqualTo(Byte value) {
            addCriterion("UserInfoWaitValid <>", value, "userinfowaitvalid");
            return (Criteria) this;
        }

        public Criteria andUserinfowaitvalidGreaterThan(Byte value) {
            addCriterion("UserInfoWaitValid >", value, "userinfowaitvalid");
            return (Criteria) this;
        }

        public Criteria andUserinfowaitvalidGreaterThanOrEqualTo(Byte value) {
            addCriterion("UserInfoWaitValid >=", value, "userinfowaitvalid");
            return (Criteria) this;
        }

        public Criteria andUserinfowaitvalidLessThan(Byte value) {
            addCriterion("UserInfoWaitValid <", value, "userinfowaitvalid");
            return (Criteria) this;
        }

        public Criteria andUserinfowaitvalidLessThanOrEqualTo(Byte value) {
            addCriterion("UserInfoWaitValid <=", value, "userinfowaitvalid");
            return (Criteria) this;
        }

        public Criteria andUserinfowaitvalidIn(List<Byte> values) {
            addCriterion("UserInfoWaitValid in", values, "userinfowaitvalid");
            return (Criteria) this;
        }

        public Criteria andUserinfowaitvalidNotIn(List<Byte> values) {
            addCriterion("UserInfoWaitValid not in", values, "userinfowaitvalid");
            return (Criteria) this;
        }

        public Criteria andUserinfowaitvalidBetween(Byte value1, Byte value2) {
            addCriterion("UserInfoWaitValid between", value1, value2, "userinfowaitvalid");
            return (Criteria) this;
        }

        public Criteria andUserinfowaitvalidNotBetween(Byte value1, Byte value2) {
            addCriterion("UserInfoWaitValid not between", value1, value2, "userinfowaitvalid");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidIsNull() {
            addCriterion("OtherHostingId is null");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidIsNotNull() {
            addCriterion("OtherHostingId is not null");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidEqualTo(String value) {
            addCriterion("OtherHostingId =", value, "otherhostingid");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidNotEqualTo(String value) {
            addCriterion("OtherHostingId <>", value, "otherhostingid");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidGreaterThan(String value) {
            addCriterion("OtherHostingId >", value, "otherhostingid");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidGreaterThanOrEqualTo(String value) {
            addCriterion("OtherHostingId >=", value, "otherhostingid");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidLessThan(String value) {
            addCriterion("OtherHostingId <", value, "otherhostingid");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidLessThanOrEqualTo(String value) {
            addCriterion("OtherHostingId <=", value, "otherhostingid");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidLike(String value) {
            addCriterion("OtherHostingId like", value, "otherhostingid");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidNotLike(String value) {
            addCriterion("OtherHostingId not like", value, "otherhostingid");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidIn(List<String> values) {
            addCriterion("OtherHostingId in", values, "otherhostingid");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidNotIn(List<String> values) {
            addCriterion("OtherHostingId not in", values, "otherhostingid");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidBetween(String value1, String value2) {
            addCriterion("OtherHostingId between", value1, value2, "otherhostingid");
            return (Criteria) this;
        }

        public Criteria andOtherhostingidNotBetween(String value1, String value2) {
            addCriterion("OtherHostingId not between", value1, value2, "otherhostingid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}