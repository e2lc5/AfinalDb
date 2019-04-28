/*
 * Welcome to use the TableGo Tools.
 *
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 *
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.8
 */

package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.util.Date;

/**
 * 线上支付配置(POS_ONPAY_SET)
 *
 * @author bianj
 * @version 1.0.0 2018-10-31
 */
@Table(name = "pos_onpay_set")
public class Pos_onpay_set implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = -1819167938648269775L;

    /**
     * 自增
     */
    @Id(column = "fid")
    private Integer fid;

    /**
     * 店铺shop_info.fid
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
     * 接口类型dict_type_id=6003
     */
    @Property
    private Integer type_id;

    /**
     * 在线支付名称
     */
    @Property
    private String type_name;

    /**
     * 状态0无效1有效
     */
    @Property
    private Integer status_id;

    /**
     * 公众账号ID
     */
    @Property
    private String app_id;

    /**
     * 私钥
     */
    @Property
    private String api_pri_key;

    /**
     * 公钥
     */
    @Property
    private String api_pub_key;

    /**
     * 卖家用户ID
     */
    @Property
    private String seller_id;

    /**
     * 接口URL
     */
    @Property
    private String interface_url;

    /**
     * 通知地址 不能带参数(回调URL)
     */
    @Property
    private String notify_url;

    /**
     * 机构编号
     */
    @Property
    private String organize_code;

    /**
     * 商户编号
     */
    @Property
    private String merchant_code;

    /**
     * 商户秘钥
     */
    @Property
    private String merchant_key;

    /**
     * 设备号
     */
    @Property
    private String device_code;

    /**
     * 终端号
     */
    @Property
    private String terminal_code;

    /**
     * 开始时间
     */
    @Property
    private Date begin_time;

    /**
     * 结束时间
     */
    @Property
    private Date end_time;

    /**
     * 配置weixin_api_config.fid
     */
    @Property
    private Integer config_id;

    /**
     * 1本地配置
     */
    @Property
    private Integer is_local;

    /**
     * 备注
     */
    @Property
    private String memo;

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

    /* 建行字段 */
    /**
     * 商户代码
     */
    @Property
    private String cbb_merchant_id;

    /**
     * 柜台代码
     */
    @Property
    private String cbb_pos_id;

    /**
     * 分行代码
     */
    @Property
    private String cbb_branch_id;

    /**
     * 通信秘钥
     */
    @Property
    private String cbb_pub;

    /**
     * 建行接口查询密码
     */
    @Property
    private String cbb_pwd;


    /**
     * 获取自增
     *
     * @return 自增
     */
    public Integer getFid() {
        return this.fid;
    }

    /**
     * 设置自增
     *
     * @param fid 自增
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * 获取店铺shop_info.fid
     *
     * @return 店铺shop_info
     */
    public Integer getShop_id() {
        return this.shop_id;
    }

    /**
     * 设置店铺shop_info.fid
     *
     * @param shop_id 店铺shop_info
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
     * @param branch_id 门店branch_info
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
     * 获取接口类型dict_type_id=6003
     *
     * @return 接口类型dict_type_id=6003
     */
    public Integer getType_id() {
        return this.type_id;
    }

    /**
     * 设置接口类型dict_type_id=6003
     *
     * @param type_id 接口类型dict_type_id=6003
     */
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    /**
     * 获取在线支付名称
     *
     * @return 在线支付名称
     */
    public String getType_name() {
        return this.type_name;
    }

    /**
     * 设置在线支付名称
     *
     * @param type_name 在线支付名称
     */
    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    /**
     * 获取状态0无效1有效
     *
     * @return 状态0无效1有效
     */
    public Integer getStatus_id() {
        return this.status_id;
    }

    /**
     * 设置状态0无效1有效
     *
     * @param status_id 状态0无效1有效
     */
    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    /**
     * 获取公众账号ID
     *
     * @return 公众账号ID
     */
    public String getApp_id() {
        return this.app_id;
    }

    /**
     * 设置公众账号ID
     *
     * @param app_id 公众账号ID
     */
    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    /**
     * 获取私钥
     *
     * @return 私钥
     */
    public String getApi_pri_key() {
        return this.api_pri_key;
    }

    /**
     * 设置私钥
     *
     * @param api_pri_key 私钥
     */
    public void setApi_pri_key(String api_pri_key) {
        this.api_pri_key = api_pri_key;
    }

    /**
     * 获取公钥
     *
     * @return 公钥
     */
    public String getApi_pub_key() {
        return this.api_pub_key;
    }

    /**
     * 设置公钥
     *
     * @param api_pub_key 公钥
     */
    public void setApi_pub_key(String api_pub_key) {
        this.api_pub_key = api_pub_key;
    }

    /**
     * 获取卖家用户ID
     *
     * @return 卖家用户ID
     */
    public String getSeller_id() {
        return this.seller_id;
    }

    /**
     * 设置卖家用户ID
     *
     * @param seller_id 卖家用户ID
     */
    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    /**
     * 获取接口URL
     *
     * @return 接口URL
     */
    public String getInterface_url() {
        return this.interface_url;
    }

    /**
     * 设置接口URL
     *
     * @param interface_url 接口URL
     */
    public void setInterface_url(String interface_url) {
        this.interface_url = interface_url;
    }

    /**
     * 获取通知地址 不能带参数(回调URL)
     *
     * @return 通知地址 不能带参数(回调URL)
     */
    public String getNotify_url() {
        return this.notify_url;
    }

    /**
     * 设置通知地址 不能带参数(回调URL)
     *
     * @param notify_url 通知地址 不能带参数(回调URL)
     */
    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    /**
     * 获取机构编号
     *
     * @return 机构编号
     */
    public String getOrganize_code() {
        return this.organize_code;
    }

    /**
     * 设置机构编号
     *
     * @param organize_code 机构编号
     */
    public void setOrganize_code(String organize_code) {
        this.organize_code = organize_code;
    }

    /**
     * 获取商户编号
     *
     * @return 商户编号
     */
    public String getMerchant_code() {
        return this.merchant_code;
    }

    /**
     * 设置商户编号
     *
     * @param merchant_code 商户编号
     */
    public void setMerchant_code(String merchant_code) {
        this.merchant_code = merchant_code;
    }

    /**
     * 获取商户秘钥
     *
     * @return 商户秘钥
     */
    public String getMerchant_key() {
        return this.merchant_key;
    }

    /**
     * 设置商户秘钥
     *
     * @param merchant_key 商户秘钥
     */
    public void setMerchant_key(String merchant_key) {
        this.merchant_key = merchant_key;
    }

    /**
     * 获取设备号
     *
     * @return 设备号
     */
    public String getDevice_code() {
        return this.device_code;
    }

    /**
     * 设置设备号
     *
     * @param device_code 设备号
     */
    public void setDevice_code(String device_code) {
        this.device_code = device_code;
    }

    /**
     * 获取终端号
     *
     * @return 终端号
     */
    public String getTerminal_code() {
        return this.terminal_code;
    }

    /**
     * 设置终端号
     *
     * @param terminal_code 终端号
     */
    public void setTerminal_code(String terminal_code) {
        this.terminal_code = terminal_code;
    }

    /**
     * 获取开始时间
     *
     * @return 开始时间
     */
    public Date getBegin_time() {
        return this.begin_time;
    }

    /**
     * 设置开始时间
     *
     * @param begin_time 开始时间
     */
    public void setBegin_time(Date begin_time) {
        this.begin_time = begin_time;
    }

    /**
     * 获取结束时间
     *
     * @return 结束时间
     */
    public Date getEnd_time() {
        return this.end_time;
    }

    /**
     * 设置结束时间
     *
     * @param end_time 结束时间
     */
    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    /**
     * 获取配置weixin_api_config.fid
     *
     * @return 配置weixin_api_config
     */
    public Integer getConfig_id() {
        return this.config_id;
    }

    /**
     * 设置配置weixin_api_config.fid
     *
     * @param config_id 配置weixin_api_config
     */
    public void setConfig_id(Integer config_id) {
        this.config_id = config_id;
    }

    /**
     * 获取1本地配置
     *
     * @return 1本地配置
     */
    public Integer getIs_local() {
        return this.is_local;
    }

    /**
     * 设置1本地配置
     *
     * @param is_local 1本地配置
     */
    public void setIs_local(Integer is_local) {
        this.is_local = is_local;
    }

    /**
     * 获取备注
     *
     * @return 备注
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo;
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

    public String getCbb_merchant_id() {
        return cbb_merchant_id;
    }

    public void setCbb_merchant_id(String cbb_merchant_id) {
        this.cbb_merchant_id = cbb_merchant_id;
    }

    public String getCbb_pos_id() {
        return cbb_pos_id;
    }

    public void setCbb_pos_id(String cbb_pos_id) {
        this.cbb_pos_id = cbb_pos_id;
    }

    public String getCbb_branch_id() {
        return cbb_branch_id;
    }

    public void setCbb_branch_id(String cbb_branch_id) {
        this.cbb_branch_id = cbb_branch_id;
    }

    public String getCbb_pub() {
        return cbb_pub;
    }

    public void setCbb_pub(String cbb_pub) {
        this.cbb_pub = cbb_pub;
    }

    public String getCbb_pwd() {
        return cbb_pwd;
    }

    public void setCbb_pwd(String cbb_pwd) {
        this.cbb_pwd = cbb_pwd;
    }
}