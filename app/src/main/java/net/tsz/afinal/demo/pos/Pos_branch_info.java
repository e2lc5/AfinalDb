package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.math.BigDecimal;
import java.util.Date;

/**
 * POS摊位信息(pos_branch_info)
 *
 * @author bianj
 * @version 1.0.0 2018-03-08
 */
@Table(name = "pos_branch_info")
public class Pos_branch_info implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = 2432469501801616440L;

    /**  */
    @Id(column = "fid")
    private Long fid;

    /**
     * 店铺shop_settle.fid
     */
    @Property
    private Integer shop_id;

    /**
     * 门店branch_info.fid
     */
    @Property
    private Integer branch_id;
    /**
     * 摊主图片
     */
    @Property
    private String manager_image_url;

    /**
     * pos机号
     */
    @Property
    private Integer pos_no;

    /**
     * 组织编号
     */
    @Property
    private String branch_code;

    /**
     * 组织名称
     */
    @Property
    private String branch_name;

    /**
     * 助记码
     */
    @Property
    private String short_name;

    /**
     * 机构类型dict_type_id=405
     */
    @Property
    private Integer branch_type;

    /**
     * 机构分类branch_kind.fid
     */
    @Property
    private Integer kind_type_id;

    /**
     * 层级
     */
    @Property
    private Integer level_id;

    /**
     * 店铺pos_branch_info.fid
     */
    @Property
    private Integer father_id;

    /**
     * 组织路径
     */
    @Property
    private String branch_path;

    /**
     * 联系电话
     */
    @Property
    private String telno;

    /**
     * 省id
     */
    @Property
    private Integer state_id;

    /**
     * 市id
     */
    @Property
    private Integer city_id;

    /**
     * 区县id
     */
    @Property
    private Integer town_id;

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
     * 详细地址
     */
    @Property
    private String address;

    /**
     * 邮编
     */
    @Property
    private String zipcode;

    /**
     * 主管shop_user.fid
     */
    @Property
    private Integer manager_user_id;

    /**
     * 主管姓名
     */
    @Property
    private String manager_user_name;

    /**
     * 经营范围shop_category_info.fid
     */
    @Property
    private String shop_category_ids;

    /**
     * 摊位星级
     */
    @Property
    private BigDecimal star_count;

    /**
     * 银联支付码
     */
    @Property
    private String qcode_yinlian;

    /**
     * 支付宝二维码
     */
    @Property
    private String qcode_alipay;

    /**
     * 微信二维码
     */
    @Property
    private String qcode_weixin;

    /**
     * 营业执照号
     */
    @Property
    private String business_code;

    /**
     * 营业执照复印件
     */
    @Property
    private String business_url;

    /**
     * 身份证号
     */
    @Property
    private String identity_code;

    /**
     * 身份证复印件
     */
    @Property
    private String identity_url;

    /**
     * 状态0:未启用1:已启用2:已停止
     */
    @Property
    private Integer status_id;

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
     * 支付方式1商家码2动态码3扫码付
     */
    @Property
    private Integer pay_type;
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
     * 终端号
     */
    @Property
    private String pos_print_head;

    /**
     * 终端号
     */
    @Property
    private String pos_print_foot1;

    /**
     * 终端号
     */
    @Property
    private String pos_print_foot2;

    /**
     * 终端号
     */
    @Property
    private String pos_print_foot3;


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
     * 获取店铺shop_settle.fid
     *
     * @return 店铺shop_settle
     */
    public Integer getShop_id() {
        return this.shop_id;
    }

    /**
     * 设置店铺shop_settle.fid
     *
     * @param shop_id 店铺shop_settle.fid
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
     * 获取组织编号
     *
     * @return 组织编号
     */
    public String getBranch_code() {
        return this.branch_code;
    }

    /**
     * 设置组织编号
     *
     * @param branch_code 组织编号
     */
    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }

    /**
     * 获取组织名称
     *
     * @return 组织名称
     */
    public String getBranch_name() {
        return this.branch_name;
    }

    /**
     * 设置组织名称
     *
     * @param branch_name 组织名称
     */
    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    /**
     * 获取助记码
     *
     * @return 助记码
     */
    public String getShort_name() {
        return this.short_name;
    }

    /**
     * 设置助记码
     *
     * @param short_name 助记码
     */
    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    /**
     * 获取机构类型dict_type_id=405
     *
     * @return 机构类型dict_type_id=405
     */
    public Integer getBranch_type() {
        return this.branch_type;
    }

    /**
     * 设置机构类型dict_type_id=405
     *
     * @param branch_type 机构类型dict_type_id=405
     */
    public void setBranch_type(Integer branch_type) {
        this.branch_type = branch_type;
    }

    /**
     * 获取机构分类branch_kind.fid
     *
     * @return 机构分类branch_kind
     */
    public Integer getKind_type_id() {
        return this.kind_type_id;
    }

    /**
     * 设置机构分类branch_kind.fid
     *
     * @param kind_type_id 机构分类branch_kind.fid
     */
    public void setKind_type_id(Integer kind_type_id) {
        this.kind_type_id = kind_type_id;
    }

    /**
     * 获取层级
     *
     * @return 层级
     */
    public Integer getLevel_id() {
        return this.level_id;
    }

    /**
     * 设置层级
     *
     * @param level_id 层级
     */
    public void setLevel_id(Integer level_id) {
        this.level_id = level_id;
    }

    /**
     * 获取店铺pos_branch_info.fid
     *
     * @return 店铺pos_branch_info
     */
    public Integer getFather_id() {
        return this.father_id;
    }

    /**
     * 设置店铺pos_branch_info.fid
     *
     * @param father_id 店铺pos_branch_info.fid
     */
    public void setFather_id(Integer father_id) {
        this.father_id = father_id;
    }

    /**
     * 获取组织路径
     *
     * @return 组织路径
     */
    public String getBranch_path() {
        return this.branch_path;
    }

    /**
     * 设置组织路径
     *
     * @param branch_path 组织路径
     */
    public void setBranch_path(String branch_path) {
        this.branch_path = branch_path;
    }

    /**
     * 获取联系电话
     *
     * @return 联系电话
     */
    public String getTelno() {
        return this.telno;
    }

    /**
     * 设置联系电话
     *
     * @param telno 联系电话
     */
    public void setTelno(String telno) {
        this.telno = telno;
    }

    /**
     * 获取省id
     *
     * @return 省id
     */
    public Integer getState_id() {
        return this.state_id;
    }

    /**
     * 设置省id
     *
     * @param state_id 省id
     */
    public void setState_id(Integer state_id) {
        this.state_id = state_id;
    }

    /**
     * 获取市id
     *
     * @return 市id
     */
    public Integer getCity_id() {
        return this.city_id;
    }

    /**
     * 设置市id
     *
     * @param city_id 市id
     */
    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    /**
     * 获取区县id
     *
     * @return 区县id
     */
    public Integer getTown_id() {
        return this.town_id;
    }

    /**
     * 设置区县id
     *
     * @param town_id 区县id
     */
    public void setTown_id(Integer town_id) {
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
     * 获取主管shop_user.fid
     *
     * @return 主管shop_user
     */
    public Integer getManager_user_id() {
        return this.manager_user_id;
    }

    /**
     * 设置主管shop_user.fid
     *
     * @param manager_user_id 主管shop_user.fid
     */
    public void setManager_user_id(Integer manager_user_id) {
        this.manager_user_id = manager_user_id;
    }

    /**
     * 获取主管姓名
     *
     * @return 主管姓名
     */
    public String getManager_user_name() {
        return this.manager_user_name;
    }

    /**
     * 设置主管姓名
     *
     * @param manager_user_name 主管姓名
     */
    public void setManager_user_name(String manager_user_name) {
        this.manager_user_name = manager_user_name;
    }

    /**
     * 获取经营范围shop_category_info.fid
     *
     * @return 经营范围shop_category_info
     */
    public String getShop_category_ids() {
        return this.shop_category_ids;
    }

    /**
     * 设置经营范围shop_category_info.fid
     *
     * @param shop_category_ids 经营范围shop_category_info.fid
     */
    public void setShop_category_ids(String shop_category_ids) {
        this.shop_category_ids = shop_category_ids;
    }

    /**
     * 获取摊位星级
     *
     * @return 摊位星级
     */
    public BigDecimal getStar_count() {
        return this.star_count;
    }

    /**
     * 设置摊位星级
     *
     * @param star_count 摊位星级
     */
    public void setStar_count(BigDecimal star_count) {
        this.star_count = star_count;
    }

    /**
     * 获取银联支付码
     *
     * @return 银联支付码
     */
    public String getQcode_yinlian() {
        return this.qcode_yinlian;
    }

    /**
     * 设置银联支付码
     *
     * @param qcode_yinlian 银联支付码
     */
    public void setQcode_yinlian(String qcode_yinlian) {
        this.qcode_yinlian = qcode_yinlian;
    }

    /**
     * 获取支付宝二维码
     *
     * @return 支付宝二维码
     */
    public String getQcode_alipay() {
        return this.qcode_alipay;
    }

    /**
     * 设置支付宝二维码
     *
     * @param qcode_alipay 支付宝二维码
     */
    public void setQcode_alipay(String qcode_alipay) {
        this.qcode_alipay = qcode_alipay;
    }

    /**
     * 获取微信二维码
     *
     * @return 微信二维码
     */
    public String getQcode_weixin() {
        return this.qcode_weixin;
    }

    /**
     * 设置微信二维码
     *
     * @param qcode_weixin 微信二维码
     */
    public void setQcode_weixin(String qcode_weixin) {
        this.qcode_weixin = qcode_weixin;
    }

    /**
     * 获取营业执照号
     *
     * @return 营业执照号
     */
    public String getBusiness_code() {
        return this.business_code;
    }

    /**
     * 设置营业执照号
     *
     * @param business_code 营业执照号
     */
    public void setBusiness_code(String business_code) {
        this.business_code = business_code;
    }

    /**
     * 获取营业执照复印件
     *
     * @return 营业执照复印件
     */
    public String getBusiness_url() {
        return this.business_url;
    }

    /**
     * 设置营业执照复印件
     *
     * @param business_url 营业执照复印件
     */
    public void setBusiness_url(String business_url) {
        this.business_url = business_url;
    }

    /**
     * 获取身份证号
     *
     * @return 身份证号
     */
    public String getIdentity_code() {
        return this.identity_code;
    }

    /**
     * 设置身份证号
     *
     * @param identity_code 身份证号
     */
    public void setIdentity_code(String identity_code) {
        this.identity_code = identity_code;
    }

    /**
     * 获取身份证复印件
     *
     * @return 身份证复印件
     */
    public String getIdentity_url() {
        return this.identity_url;
    }

    /**
     * 设置身份证复印件
     *
     * @param identity_url 身份证复印件
     */
    public void setIdentity_url(String identity_url) {
        this.identity_url = identity_url;
    }

    /**
     * 获取状态0:未启用1:已启用2:已停止
     *
     * @return 状态0
     */
    public Integer getStatus_id() {
        return this.status_id;
    }

    /**
     * 设置状态0:未启用1:已启用2:已停止
     *
     * @param status_id 状态0:未启用1:已启用2:已停止
     */
    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
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

    public String getManager_image_url() {
        return manager_image_url;
    }

    public void setManager_image_url(String manager_image_url) {
        this.manager_image_url = manager_image_url;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getApi_pri_key() {
        return api_pri_key;
    }

    public void setApi_pri_key(String api_pri_key) {
        this.api_pri_key = api_pri_key;
    }

    public String getApi_pub_key() {
        return api_pub_key;
    }

    public void setApi_pub_key(String api_pub_key) {
        this.api_pub_key = api_pub_key;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getInterface_url() {
        return interface_url;
    }

    public void setInterface_url(String interface_url) {
        this.interface_url = interface_url;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getMerchant_code() {
        return merchant_code;
    }

    public void setMerchant_code(String merchant_code) {
        this.merchant_code = merchant_code;
    }

    public String getMerchant_key() {
        return merchant_key;
    }

    public void setMerchant_key(String merchant_key) {
        this.merchant_key = merchant_key;
    }

    public String getDevice_code() {
        return device_code;
    }

    public void setDevice_code(String device_code) {
        this.device_code = device_code;
    }

    public String getTerminal_code() {
        return terminal_code;
    }

    public void setTerminal_code(String terminal_code) {
        this.terminal_code = terminal_code;
    }

    public String getPos_print_head() {
        return pos_print_head;
    }

    public void setPos_print_head(String pos_print_head) {
        this.pos_print_head = pos_print_head;
    }

    public String getPos_print_foot1() {
        return pos_print_foot1;
    }

    public void setPos_print_foot1(String pos_print_foot1) {
        this.pos_print_foot1 = pos_print_foot1;
    }

    public String getPos_print_foot2() {
        return pos_print_foot2;
    }

    public void setPos_print_foot2(String pos_print_foot2) {
        this.pos_print_foot2 = pos_print_foot2;
    }

    public String getPos_print_foot3() {
        return pos_print_foot3;
    }

    public void setPos_print_foot3(String pos_print_foot3) {
        this.pos_print_foot3 = pos_print_foot3;
    }
}