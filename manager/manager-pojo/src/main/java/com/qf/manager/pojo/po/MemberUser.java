package com.qf.manager.pojo.po;

import java.util.Date;

public class MemberUser {
    private Long id;

    private String name;

    private String nickname;

    private String password;

    private String passwordsalt;

    private String paypassowrdsalt;

    private String paypassowrd;

    private Long usertypeid;

    private Long upgroupid;

    private Date upgroupexpires;

    private String face;

    private String email;

    private String phone;

    private Integer phonevalid;

    private Integer emailvalid;

    private Date createat;

    private Date lastloginat;

    private Date preloginat;

    private String regip;

    private String lastloginip;

    private String preloginip;

    private Integer logincount;

    private Long score;

    private Integer credit;

    private Byte islock;

    private Integer loginerrorcount;

    private Date loginerrorat;

    private Integer payerrorcount;

    private Date payerrorat;

    private Long recommendby;

    private Integer gradelevel;

    private Long provinceid;

    private Long cityid;

    private Long areaid;

    private String company;

    private String salenumber;

    private String salephoto;

    private String realname;

    private Integer realnamevalid;

    private Integer onsitevalid;

    private String cardnumber;

    private String cardphoto1;

    private String cardphoto2;

    private Byte sex;

    private Date birthday;

    private String address;

    private Byte userinfowaitvalid;

    private String otherhostingid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPasswordsalt() {
        return passwordsalt;
    }

    public void setPasswordsalt(String passwordsalt) {
        this.passwordsalt = passwordsalt == null ? null : passwordsalt.trim();
    }

    public String getPaypassowrdsalt() {
        return paypassowrdsalt;
    }

    public void setPaypassowrdsalt(String paypassowrdsalt) {
        this.paypassowrdsalt = paypassowrdsalt == null ? null : paypassowrdsalt.trim();
    }

    public String getPaypassowrd() {
        return paypassowrd;
    }

    public void setPaypassowrd(String paypassowrd) {
        this.paypassowrd = paypassowrd == null ? null : paypassowrd.trim();
    }

    public Long getUsertypeid() {
        return usertypeid;
    }

    public void setUsertypeid(Long usertypeid) {
        this.usertypeid = usertypeid;
    }

    public Long getUpgroupid() {
        return upgroupid;
    }

    public void setUpgroupid(Long upgroupid) {
        this.upgroupid = upgroupid;
    }

    public Date getUpgroupexpires() {
        return upgroupexpires;
    }

    public void setUpgroupexpires(Date upgroupexpires) {
        this.upgroupexpires = upgroupexpires;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face == null ? null : face.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getPhonevalid() {
        return phonevalid;
    }

    public void setPhonevalid(Integer phonevalid) {
        this.phonevalid = phonevalid;
    }

    public Integer getEmailvalid() {
        return emailvalid;
    }

    public void setEmailvalid(Integer emailvalid) {
        this.emailvalid = emailvalid;
    }

    public Date getCreateat() {
        return createat;
    }

    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    public Date getLastloginat() {
        return lastloginat;
    }

    public void setLastloginat(Date lastloginat) {
        this.lastloginat = lastloginat;
    }

    public Date getPreloginat() {
        return preloginat;
    }

    public void setPreloginat(Date preloginat) {
        this.preloginat = preloginat;
    }

    public String getRegip() {
        return regip;
    }

    public void setRegip(String regip) {
        this.regip = regip == null ? null : regip.trim();
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public String getPreloginip() {
        return preloginip;
    }

    public void setPreloginip(String preloginip) {
        this.preloginip = preloginip == null ? null : preloginip.trim();
    }

    public Integer getLogincount() {
        return logincount;
    }

    public void setLogincount(Integer logincount) {
        this.logincount = logincount;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Byte getIslock() {
        return islock;
    }

    public void setIslock(Byte islock) {
        this.islock = islock;
    }

    public Integer getLoginerrorcount() {
        return loginerrorcount;
    }

    public void setLoginerrorcount(Integer loginerrorcount) {
        this.loginerrorcount = loginerrorcount;
    }

    public Date getLoginerrorat() {
        return loginerrorat;
    }

    public void setLoginerrorat(Date loginerrorat) {
        this.loginerrorat = loginerrorat;
    }

    public Integer getPayerrorcount() {
        return payerrorcount;
    }

    public void setPayerrorcount(Integer payerrorcount) {
        this.payerrorcount = payerrorcount;
    }

    public Date getPayerrorat() {
        return payerrorat;
    }

    public void setPayerrorat(Date payerrorat) {
        this.payerrorat = payerrorat;
    }

    public Long getRecommendby() {
        return recommendby;
    }

    public void setRecommendby(Long recommendby) {
        this.recommendby = recommendby;
    }

    public Integer getGradelevel() {
        return gradelevel;
    }

    public void setGradelevel(Integer gradelevel) {
        this.gradelevel = gradelevel;
    }

    public Long getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Long provinceid) {
        this.provinceid = provinceid;
    }

    public Long getCityid() {
        return cityid;
    }

    public void setCityid(Long cityid) {
        this.cityid = cityid;
    }

    public Long getAreaid() {
        return areaid;
    }

    public void setAreaid(Long areaid) {
        this.areaid = areaid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getSalenumber() {
        return salenumber;
    }

    public void setSalenumber(String salenumber) {
        this.salenumber = salenumber == null ? null : salenumber.trim();
    }

    public String getSalephoto() {
        return salephoto;
    }

    public void setSalephoto(String salephoto) {
        this.salephoto = salephoto == null ? null : salephoto.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getRealnamevalid() {
        return realnamevalid;
    }

    public void setRealnamevalid(Integer realnamevalid) {
        this.realnamevalid = realnamevalid;
    }

    public Integer getOnsitevalid() {
        return onsitevalid;
    }

    public void setOnsitevalid(Integer onsitevalid) {
        this.onsitevalid = onsitevalid;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber == null ? null : cardnumber.trim();
    }

    public String getCardphoto1() {
        return cardphoto1;
    }

    public void setCardphoto1(String cardphoto1) {
        this.cardphoto1 = cardphoto1 == null ? null : cardphoto1.trim();
    }

    public String getCardphoto2() {
        return cardphoto2;
    }

    public void setCardphoto2(String cardphoto2) {
        this.cardphoto2 = cardphoto2 == null ? null : cardphoto2.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Byte getUserinfowaitvalid() {
        return userinfowaitvalid;
    }

    public void setUserinfowaitvalid(Byte userinfowaitvalid) {
        this.userinfowaitvalid = userinfowaitvalid;
    }

    public String getOtherhostingid() {
        return otherhostingid;
    }

    public void setOtherhostingid(String otherhostingid) {
        this.otherhostingid = otherhostingid == null ? null : otherhostingid.trim();
    }
}