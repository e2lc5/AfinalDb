package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商家用户信息(pos_user)
 *
 * @author bianj
 * @version 1.0.0 2018-03-09
 */
@Table(name = "pos_user")
public class Pos_user implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = 520588515611522546L;

    /**  */
    @Id(column = "fid")
    private Integer fid;

    /**
     * 商家shop_info.fid
     */
    @Property
    private Integer shop_id;

    /**
     * 门店branch_info.fid
     */
    @Property
    private Integer branch_id;

    /**
     * pos机号
     */
    @Property
    private Integer pos_no;

    /**
     * 发布者shop_user.fid
     */
    @Property
    private Integer shop_user_id;

    /**
     * 昵称可以是QQmail
     */
    @Property
    private String user_code;

    /**
     * 真实姓名
     */
    @Property
    private String user_name;

    /**
     * 密码
     */
    @Property
    private String user_pwd;

    /**  */
    @Property
    private String cashier_rights;

    /**
     * 性别0男1女2保密
     */
    @Property
    private Integer sex;

    /**
     * 生日
     */
    @Property
    private Date birthday;

    /**
     * 手机
     */
    @Property
    private String mobile_code;

    /**
     * mail
     */
    @Property
    private String mail;

    /**
     * 微信
     */
    @Property
    private String weixin_code;

    /**
     * QQ
     */
    @Property
    private String qq_code;

    /**  */
    @Property
    private Date last_login_time;

    /**
     * 会员头像
     */
    @Property
    private String image_url;

    /**
     * 省id
     */
    @Property
    private String state_id;

    /**
     * 市id
     */
    @Property
    private String city_id;

    /**
     * 区县id
     */
    @Property
    private String town_id;

    /**
     * 省
     */
    @Property
    private String state;

    /**
     * 市
     */
    @Property
    private String city;

    /**
     * 区
     */
    @Property
    private String town;

    /**
     * 邮编
     */
    @Property
    private String zipcode;

    /**
     * 详细地址
     */
    @Property
    private String address;

    /**
     * 注册日期
     */
    @Property
    private Date register_date;

    /**
     * 离职日期
     */
    @Property
    private Date leave_date;

    /**
     * 0无效1有效
     */
    @Property
    private Integer status_id;

    /**
     * 员工编号
     */
    @Property
    private String employee_code;
    /**
     * 采购员
     */
    @Property
    private int is_cashier;

    /**
     * 平台用户
     */
    @Property
    private int is_platform;

    /**
     * POS销售折扣
     */
    @Property
    private BigDecimal pos_rate;

    /**
     * 营业员提成率
     */
    @Property
    private BigDecimal shop_man_rate;

    /**
     * 批发销售折扣
     */
    @Property
    private BigDecimal sale_rate;

    /**
     * 新增时间
     */
    @Property
    private Date add_time;

    /**
     * 新增用户
     */
    @Property
    private String add_user;

    /**
     * 更新时间
     */
    @Property
    private Date update_time;

    /**
     * 更新用户
     */
    @Property
    private String update_user;

    /**
     * 时间戳
     */
    @Property
    private Long ver;

    /**
     * 获取
     *
     * @return
     */
    public Integer getFid() {
        return this.fid;
    }

    /**
     * 设置
     *
     * @param fid
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * 获取商家shop_info.fid
     *
     * @return 商家shop_info
     */
    public Integer getShop_id() {
        return this.shop_id;
    }

    /**
     * 设置商家shop_info.fid
     *
     * @param shop_id 商家shop_info.fid
     */
    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    /**
     * 获取门店branch_info.fid
     *
     * @return 门店branch_info
     */
    public Integer getBranch_id() {
        return this.branch_id;
    }

    /**
     * 设置门店branch_info.fid
     *
     * @param branch_id 门店branch_info.fid
     */
    public void setBranch_id(Integer branch_id) {
        this.branch_id = branch_id;
    }

    /**
     * 获取pos机号
     *
     * @return pos机号
     */
    public Integer getPos_no() {
        return this.pos_no;
    }

    /**
     * 设置pos机号
     *
     * @param pos_no pos机号
     */
    public void setPos_no(Integer pos_no) {
        this.pos_no = pos_no;
    }

    /**
     * 获取发布者shop_user.fid
     *
     * @return 发布者shop_user
     */
    public Integer getShop_user_id() {
        return this.shop_user_id;
    }

    /**
     * 设置发布者shop_user.fid
     *
     * @param shop_user_id 发布者shop_user.fid
     */
    public void setShop_user_id(Integer shop_user_id) {
        this.shop_user_id = shop_user_id;
    }

    /**
     * 获取昵称可以是QQmail
     *
     * @return 昵称可以是QQmail
     */
    public String getUser_code() {
        return this.user_code;
    }

    /**
     * 设置昵称可以是QQmail
     *
     * @param user_code 昵称可以是QQmail
     */
    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    /**
     * 获取真实姓名
     *
     * @return 真实姓名
     */
    public String getUser_name() {
        return this.user_name;
    }

    /**
     * 设置真实姓名
     *
     * @param user_name 真实姓名
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * 获取密码
     *
     * @return 密码
     */
    public String getUser_pwd() {
        return this.user_pwd;
    }

    /**
     * 设置密码
     *
     * @param user_pwd 密码
     */
    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getCashier_rights() {
        return this.cashier_rights;
    }

    /**
     * 设置
     *
     * @param cashier_rights
     */
    public void setCashier_rights(String cashier_rights) {
        this.cashier_rights = cashier_rights;
    }

    /**
     * 获取性别0男1女2保密
     *
     * @return 性别0男1女2保密
     */
    public Integer getSex() {
        return this.sex;
    }

    /**
     * 设置性别0男1女2保密
     *
     * @param sex 性别0男1女2保密
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取生日
     *
     * @return 生日
     */
    public Date getBirthday() {
        return this.birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取手机
     *
     * @return 手机
     */
    public String getMobile_code() {
        return this.mobile_code;
    }

    /**
     * 设置手机
     *
     * @param mobile_code 手机
     */
    public void setMobile_code(String mobile_code) {
        this.mobile_code = mobile_code;
    }

    /**
     * 获取mail
     *
     * @return mail
     */
    public String getMail() {
        return this.mail;
    }

    /**
     * 设置mail
     *
     * @param mail mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 获取微信
     *
     * @return 微信
     */
    public String getWeixin_code() {
        return this.weixin_code;
    }

    /**
     * 设置微信
     *
     * @param weixin_code 微信
     */
    public void setWeixin_code(String weixin_code) {
        this.weixin_code = weixin_code;
    }

    /**
     * 获取QQ
     *
     * @return QQ
     */
    public String getQq_code() {
        return this.qq_code;
    }

    /**
     * 设置QQ
     *
     * @param qq_code QQ
     */
    public void setQq_code(String qq_code) {
        this.qq_code = qq_code;
    }

    /**
     * 获取
     *
     * @return
     */
    public Date getLast_login_time() {
        return this.last_login_time;
    }

    /**
     * 设置
     *
     * @param last_login_time
     */
    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    /**
     * 获取会员头像
     *
     * @return 会员头像
     */
    public String getImage_url() {
        return this.image_url;
    }

    /**
     * 设置会员头像
     *
     * @param image_url 会员头像
     */
    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    /**
     * 获取省id
     *
     * @return 省id
     */
    public String getState_id() {
        return this.state_id;
    }

    /**
     * 设置省id
     *
     * @param state_id 省id
     */
    public void setState_id(String state_id) {
        this.state_id = state_id;
    }

    /**
     * 获取市id
     *
     * @return 市id
     */
    public String getCity_id() {
        return this.city_id;
    }

    /**
     * 设置市id
     *
     * @param city_id 市id
     */
    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    /**
     * 获取区县id
     *
     * @return 区县id
     */
    public String getTown_id() {
        return this.town_id;
    }

    /**
     * 设置区县id
     *
     * @param town_id 区县id
     */
    public void setTown_id(String town_id) {
        this.town_id = town_id;
    }

    /**
     * 获取省
     *
     * @return 省
     */
    public String getState() {
        return this.state;
    }

    /**
     * 设置省
     *
     * @param state 省
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取市
     *
     * @return 市
     */
    public String getCity() {
        return this.city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取区
     *
     * @return 区
     */
    public String getTown() {
        return this.town;
    }

    /**
     * 设置区
     *
     * @param town 区
     */
    public void setTown(String town) {
        this.town = town;
    }

    /**
     * 获取邮编
     *
     * @return 邮编
     */
    public String getZipcode() {
        return this.zipcode;
    }

    /**
     * 设置邮编
     *
     * @param zipcode 邮编
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * 获取详细地址
     *
     * @return 详细地址
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * 设置详细地址
     *
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取注册日期
     *
     * @return 注册日期
     */
    public Date getRegister_date() {
        return this.register_date;
    }

    /**
     * 设置注册日期
     *
     * @param register_date 注册日期
     */
    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }

    /**
     * 获取离职日期
     *
     * @return 离职日期
     */
    public Date getLeave_date() {
        return this.leave_date;
    }

    /**
     * 设置离职日期
     *
     * @param leave_date 离职日期
     */
    public void setLeave_date(Date leave_date) {
        this.leave_date = leave_date;
    }

    /**
     * 获取0无效1有效
     *
     * @return 0无效1有效
     */
    public Integer getStatus_id() {
        return this.status_id;
    }

    /**
     * 设置0无效1有效
     *
     * @param status_id 0无效1有效
     */
    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    /**
     * 获取员工编号
     *
     * @return 员工编号
     */
    public String getEmployee_code() {
        return this.employee_code;
    }

    /**
     * 设置员工编号
     *
     * @param employee_code 员工编号
     */
    public void setEmployee_code(String employee_code) {
        this.employee_code = employee_code;
    }

    /**
     * 获取采购员
     *
     * @return 采购员
     */
    public int getIs_cashier() {
        return this.is_cashier;
    }

    /**
     * 设置采购员
     *
     * @param is_cashier 采购员
     */
    public void setIs_cashier(int is_cashier) {
        this.is_cashier = is_cashier;
    }

    /**
     * 获取平台用户
     *
     * @return 平台用户
     */
    public int getIs_platform() {
        return this.is_platform;
    }

    /**
     * 设置平台用户
     *
     * @param is_platform 平台用户
     */
    public void setIs_platform(int is_platform) {
        this.is_platform = is_platform;
    }

    /**
     * 获取POS销售折扣
     *
     * @return POS销售折扣
     */
    public BigDecimal getPos_rate() {
        return this.pos_rate;
    }

    /**
     * 设置POS销售折扣
     *
     * @param pos_rate POS销售折扣
     */
    public void setPos_rate(BigDecimal pos_rate) {
        this.pos_rate = pos_rate;
    }

    /**
     * 获取营业员提成率
     *
     * @return 营业员提成率
     */
    public BigDecimal getShop_man_rate() {
        return this.shop_man_rate;
    }

    /**
     * 设置营业员提成率
     *
     * @param shop_man_rate 营业员提成率
     */
    public void setShop_man_rate(BigDecimal shop_man_rate) {
        this.shop_man_rate = shop_man_rate;
    }

    /**
     * 获取批发销售折扣
     *
     * @return 批发销售折扣
     */
    public BigDecimal getSale_rate() {
        return this.sale_rate;
    }

    /**
     * 设置批发销售折扣
     *
     * @param sale_rate 批发销售折扣
     */
    public void setSale_rate(BigDecimal sale_rate) {
        this.sale_rate = sale_rate;
    }

    /**
     * 获取新增时间
     *
     * @return 新增时间
     */
    public Date getAdd_time() {
        return this.add_time;
    }

    /**
     * 设置新增时间
     *
     * @param add_time 新增时间
     */
    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    /**
     * 获取新增用户
     *
     * @return 新增用户
     */
    public String getAdd_user() {
        return this.add_user;
    }

    /**
     * 设置新增用户
     *
     * @param add_user 新增用户
     */
    public void setAdd_user(String add_user) {
        this.add_user = add_user;
    }

    /**
     * 获取更新时间
     *
     * @return 更新时间
     */
    public Date getUpdate_time() {
        return this.update_time;
    }

    /**
     * 设置更新时间
     *
     * @param update_time 更新时间
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * 获取更新用户
     *
     * @return 更新用户
     */
    public String getUpdate_user() {
        return this.update_user;
    }

    /**
     * 设置更新用户
     *
     * @param update_user 更新用户
     */
    public void setUpdate_user(String update_user) {
        this.update_user = update_user;
    }

    /**
     * 获取时间戳
     *
     * @return 时间戳
     */
    public Long getVer() {
        return this.ver;
    }

    /**
     * 设置时间戳
     *
     * @param ver 时间戳
     */
    public void setVer(Long ver) {
        this.ver = ver;
    }
}