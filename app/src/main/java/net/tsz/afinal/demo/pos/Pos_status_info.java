package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.math.BigDecimal;
import java.util.Date;

/**
 * POS状态信息(pos_status_info)
 *
 * @author bianj
 * @version 1.0.0 2018-03-13
 */
@Table(name = "pos_status_info")
public class Pos_status_info implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = -1335045464279279630L;

    /**  */
    @Id(column = "fid")
    private Long fid;

    /**
     * shop_info.fid
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
     * 收银员shop_user.shop_user_id
     */
    @Property
    private Integer cashier_id;

    /**
     * 收银员
     */
    @Property
    private String cashier_code;

    /**
     * 登录IP
     */
    @Property
    private String login_ip;

    /**
     * 当班金额/当天金额
     */
    @Property
    private BigDecimal sale_amount;

    /**
     * 用户备注
     */
    @Property
    private String memo;

    /**
     * mac地址
     */
    @Property
    private String mac_code;

    /**
     * CPU序列号
     */
    @Property
    private String cpu_id;

    /**
     * 注册码
     */
    @Property
    private String register_code;

    /**
     * 版本号
     */
    @Property
    private String version_id;

    /**
     * 下载时间
     */
    @Property
    private Date last_down_time;

    /**
     * 记录时间
     */
    @Property
    private Date create_time;

    /**
     * 是否已经上传
     */
    @Property
    private Integer is_upload = 0;

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
    public Long getFid() {
        return this.fid;
    }

    /**
     * 设置
     *
     * @param fid
     */
    public void setFid(Long fid) {
        this.fid = fid;
    }

    /**
     * 获取shop_info.fid
     *
     * @return shop_info
     */
    public Integer getShop_id() {
        return this.shop_id;
    }

    /**
     * 设置shop_info.fid
     *
     * @param shop_id shop_info.fid
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
     * 获取收银员shop_user.shop_user_id
     *
     * @return 收银员shop_user
     */
    public Integer getCashier_id() {
        return this.cashier_id;
    }

    /**
     * 设置收银员shop_user.shop_user_id
     *
     * @param cashier_id 收银员shop_user.shop_user_id
     */
    public void setCashier_id(Integer cashier_id) {
        this.cashier_id = cashier_id;
    }

    /**
     * 获取收银员
     *
     * @return 收银员
     */
    public String getCashier_code() {
        return this.cashier_code;
    }

    /**
     * 设置收银员
     *
     * @param cashier_code 收银员
     */
    public void setCashier_code(String cashier_code) {
        this.cashier_code = cashier_code;
    }

    /**
     * 获取登录IP
     *
     * @return 登录IP
     */
    public String getLogin_ip() {
        return this.login_ip;
    }

    /**
     * 设置登录IP
     *
     * @param login_ip 登录IP
     */
    public void setLogin_ip(String login_ip) {
        this.login_ip = login_ip;
    }

    /**
     * 获取当班金额/当天金额
     *
     * @return 当班金额/当天金额
     */
    public BigDecimal getSale_amount() {
        return this.sale_amount;
    }

    /**
     * 设置当班金额/当天金额
     *
     * @param sale_amount 当班金额/当天金额
     */
    public void setSale_amount(BigDecimal sale_amount) {
        this.sale_amount = sale_amount;
    }

    /**
     * 获取用户备注
     *
     * @return 用户备注
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * 设置用户备注
     *
     * @param memo 用户备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取mac地址
     *
     * @return mac地址
     */
    public String getMac_code() {
        return this.mac_code;
    }

    /**
     * 设置mac地址
     *
     * @param mac_code mac地址
     */
    public void setMac_code(String mac_code) {
        this.mac_code = mac_code;
    }

    /**
     * 获取CPU序列号
     *
     * @return CPU序列号
     */
    public String getCpu_id() {
        return this.cpu_id;
    }

    /**
     * 设置CPU序列号
     *
     * @param cpu_id CPU序列号
     */
    public void setCpu_id(String cpu_id) {
        this.cpu_id = cpu_id;
    }

    /**
     * 获取注册码
     *
     * @return 注册码
     */
    public String getRegister_code() {
        return this.register_code;
    }

    /**
     * 设置注册码
     *
     * @param register_code 注册码
     */
    public void setRegister_code(String register_code) {
        this.register_code = register_code;
    }

    /**
     * 获取版本号
     *
     * @return 版本号
     */
    public String getVersion_id() {
        return this.version_id;
    }

    /**
     * 设置版本号
     *
     * @param version_id 版本号
     */
    public void setVersion_id(String version_id) {
        this.version_id = version_id;
    }

    /**
     * 获取下载时间
     *
     * @return 下载时间
     */
    public Date getLast_down_time() {
        return this.last_down_time;
    }

    /**
     * 设置下载时间
     *
     * @param last_down_time 下载时间
     */
    public void setLast_down_time(Date last_down_time) {
        this.last_down_time = last_down_time;
    }

    /**
     * 获取记录时间
     *
     * @return 记录时间
     */
    public Date getCreate_time() {
        return this.create_time;
    }

    /**
     * 设置记录时间
     *
     * @param create_time 记录时间
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * 获取是否已经上传
     *
     * @return 是否已经上传
     */
    public Integer getIs_upload() {
        return this.is_upload;
    }

    /**
     * 设置是否已经上传
     *
     * @param is_upload 是否已经上传
     */
    public void setIs_upload(Integer is_upload) {
        this.is_upload = is_upload;
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