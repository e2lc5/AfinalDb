package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.util.Date;

/**
 * 客户信息(pos_customer_info)
 *
 * @author bianj
 * @version 1.0.0 2018-06-21
 */
@Table(name = "pos_customer_info")
public class Pos_customer_info implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = -2048338796714321555L;

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
     * pos机号
     */
    @Property
    private Integer pos_no;

    /**
     * 客户id:customer_info.fid
     */
    @Property
    private String customer_id;

    /**
     * 客户编号
     */
    @Property
    private String customer_code;

    /**
     * 客户名称
     */
    @Property
    private String customer_name;

    /**
     * 助记码
     */
    @Property
    private String short_name;

    /**
     * 父级pos_customer_info.fid
     */
    @Property
    private Integer father_id;

    /**
     * 层级
     */
    @Property
    private Integer level_id;

    /**
     * 联系手机
     */
    @Property
    private String mobile;

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
     * 联系人
     */
    @Property
    private String link_man;

    /**
     * 状态0未启用1已启用2已停止
     */
    @Property
    private Integer status_id;

    /**
     * 备注说明
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
     * 获取客户id:customer_info.fid
     *
     * @return 客户id
     */
    public String getCustomer_id() {
        return this.customer_id;
    }

    /**
     * 设置客户id:customer_info.fid
     *
     * @param customer_id 客户id:customer_info.fid
     */
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * 获取客户编号
     *
     * @return 客户编号
     */
    public String getCustomer_code() {
        return this.customer_code;
    }

    /**
     * 设置客户编号
     *
     * @param customer_code 客户编号
     */
    public void setCustomer_code(String customer_code) {
        this.customer_code = customer_code;
    }

    /**
     * 获取客户名称
     *
     * @return 客户名称
     */
    public String getCustomer_name() {
        return this.customer_name;
    }

    /**
     * 设置客户名称
     *
     * @param customer_name 客户名称
     */
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
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
     * 获取父级pos_customer_info.fid
     *
     * @return 父级pos_customer_info
     */
    public Integer getFather_id() {
        return this.father_id;
    }

    /**
     * 设置父级pos_customer_info.fid
     *
     * @param father_id 父级pos_customer_info.fid
     */
    public void setFather_id(Integer father_id) {
        this.father_id = father_id;
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
     * 获取联系手机
     *
     * @return 联系手机
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * 设置联系手机
     *
     * @param mobile 联系手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
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
     * 获取联系人
     *
     * @return 联系人
     */
    public String getLink_man() {
        return this.link_man;
    }

    /**
     * 设置联系人
     *
     * @param link_man 联系人
     */
    public void setLink_man(String link_man) {
        this.link_man = link_man;
    }

    /**
     * 获取状态0未启用1已启用2已停止
     *
     * @return 状态0未启用1已启用2已停止
     */
    public Integer getStatus_id() {
        return this.status_id;
    }

    /**
     * 设置状态0未启用1已启用2已停止
     *
     * @param status_id 状态0未启用1已启用2已停止
     */
    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    /**
     * 获取备注说明
     *
     * @return 备注说明
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * 设置备注说明
     *
     * @param memo 备注说明
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
}