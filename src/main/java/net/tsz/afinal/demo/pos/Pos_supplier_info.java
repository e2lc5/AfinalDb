package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.util.Date;

/**
 * 厂商信息(pos_supplier_info)
 *
 * @author bianj
 * @version 1.0.0 2018-03-16
 */
@Table(name = "pos_supplier_info")
public class Pos_supplier_info implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = 4785009686705300683L;

    /**  */
    @Id(column = "fid")
    private Long fid;

    /**
     * 店铺shop_settle.fid
     */
    @Property
    private Integer shop_id;

    /**
     * 采购组织branch_info.fid
     */
    @Property
    private Integer branch_id;

    /**
     * pos机号
     */
    @Property
    private Integer pos_no;

    /**
     * 供应商id
     */
    @Property
    private Integer supplier_id;

    /**
     * 供应商名称
     */
    @Property
    private String supplier_name;

    /**
     * 联系电话
     */
    @Property
    private String telno;

    /**
     * 详细地址
     */
    @Property
    private String address;

    /**
     * 联系人
     */
    @Property
    private String link_man;

    /**
     * 状态0:未启用1:已启用2已终止
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
     * 获取采购组织branch_info.fid
     *
     * @return 采购组织branch_info
     */
    public Integer getBranch_id() {
        return this.branch_id;
    }

    /**
     * 设置采购组织branch_info.fid
     *
     * @param branch_id 采购组织branch_info.fid
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
     * 获取供应商id
     *
     * @return 供应商id
     */
    public Integer getSupplier_id() {
        return this.supplier_id;
    }

    /**
     * 设置供应商id
     *
     * @param supplier_id 供应商id
     */
    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    /**
     * 获取供应商名称
     *
     * @return 供应商名称
     */
    public String getSupplier_name() {
        return this.supplier_name;
    }

    /**
     * 设置供应商名称
     *
     * @param supplier_name 供应商名称
     */
    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
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
     * 获取状态0:未启用1:已启用2已终止
     *
     * @return 状态0
     */
    public Integer getStatus_id() {
        return this.status_id;
    }

    /**
     * 设置状态0:未启用1:已启用2已终止
     *
     * @param status_id 状态0:未启用1:已启用2已终止
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