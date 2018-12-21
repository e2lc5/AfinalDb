package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.math.BigDecimal;
import java.util.Date;

/**
 * POS交易其他操作(pos_trade_other)
 *
 * @author bianj
 * @version 1.0.0 2018-01-02
 */
@Table(name = "pos_trade_other")
public class Pos_trade_other implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = -5664952999928892779L;

    /**  */
    @Id(column = "fid")
    private Long fid;

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
     * 班别ID
     */
    @Property
    private Long shift_id;

    /**
     * 交易单号
     */
    @Property
    private Long pos_trade_id;

    /**
     * 明细单号
     */
    @Property
    private Long pos_trade_iid;

    /**
     * 单号
     */
    @Property
    private Long pos_trade_oid;

    /**
     * 收银员shop_user.fid
     */
    @Property
    private Integer cashier_id;

    /**
     * 操作类型:1开班2交班3重印班别4重印交易5开抽屉6投库7借零8交易取消9挂单10挂单作废11查价12登录13注销14授权15锁屏16上班17下班18免单19整单折扣20单品折扣21开放价格22负向销售
     */
    @Property
    private Integer other_type_id;

    /**
     * 发生金额
     */
    @Property
    private BigDecimal amount;

    /**
     * 操作说明
     */
    @Property
    private String memo;

    /**
     * 订单创建时间
     */
    @Property
    private Date create_time;

    /**
     * pos_item_info.item_id
     */
    @Property
    private Long item_id;

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
     * 获取班别ID
     *
     * @return 班别ID
     */
    public Long getShift_id() {
        return this.shift_id;
    }

    /**
     * 设置班别ID
     *
     * @param shift_id 班别ID
     */
    public void setShift_id(Long shift_id) {
        this.shift_id = shift_id;
    }

    /**
     * 获取交易单号
     *
     * @return 交易单号
     */
    public Long getPos_trade_id() {
        return this.pos_trade_id;
    }

    /**
     * 设置交易单号
     *
     * @param pos_trade_id 交易单号
     */
    public void setPos_trade_id(Long pos_trade_id) {
        this.pos_trade_id = pos_trade_id;
    }

    /**
     * 获取明细单号
     *
     * @return 明细单号
     */
    public Long getPos_trade_iid() {
        return this.pos_trade_iid;
    }

    /**
     * 设置明细单号
     *
     * @param pos_trade_iid 明细单号
     */
    public void setPos_trade_iid(Long pos_trade_iid) {
        this.pos_trade_iid = pos_trade_iid;
    }

    /**
     * 获取单号
     *
     * @return 单号
     */
    public Long getPos_trade_oid() {
        return this.pos_trade_oid;
    }

    /**
     * 设置单号
     *
     * @param pos_trade_oid 单号
     */
    public void setPos_trade_oid(Long pos_trade_oid) {
        this.pos_trade_oid = pos_trade_oid;
    }

    /**
     * 获取收银员shop_user.fid
     *
     * @return 收银员shop_user
     */
    public Integer getCashier_id() {
        return this.cashier_id;
    }

    /**
     * 设置收银员shop_user.fid
     *
     * @param cashier_id 收银员shop_user.fid
     */
    public void setCashier_id(Integer cashier_id) {
        this.cashier_id = cashier_id;
    }

    /**
     * 获取操作类型:1开班2交班3重印班别4重印交易5开抽屉6投库7借零8交易取消9挂单10挂单作废11查价12登录13注销14授权15锁屏16上班17下班18免单19整单折扣20单品折扣21开放价格22负向销售
     *
     * @return 操作类型
     */
    public Integer getOther_type_id() {
        return this.other_type_id;
    }

    /**
     * 设置操作类型:1开班2交班3重印班别4重印交易5开抽屉6投库7借零8交易取消9挂单10挂单作废11查价12登录13注销14授权15锁屏16上班17下班18免单19整单折扣20单品折扣21开放价格22负向销售
     *
     * @param other_type_id 操作类型:1开班2交班3重印班别4重印交易5开抽屉6投库7借零8交易取消9挂单10挂单作废11查价12登录13注销14授权15锁屏16上班17下班18免单19
     *                      整单折扣20单品折扣21开放价格22负向销售
     */
    public void setOther_type_id(Integer other_type_id) {
        this.other_type_id = other_type_id;
    }

    /**
     * 获取发生金额
     *
     * @return 发生金额
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * 设置发生金额
     *
     * @param amount 发生金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取操作说明
     *
     * @return 操作说明
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * 设置操作说明
     *
     * @param memo 操作说明
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 获取订单创建时间
     *
     * @return 订单创建时间
     */
    public Date getCreate_time() {
        return this.create_time;
    }

    /**
     * 设置订单创建时间
     *
     * @param create_time 订单创建时间
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * 获取pos_item_info.item_id
     *
     * @return pos_item_info
     */
    public Long getItem_id() {
        return this.item_id;
    }

    /**
     * 设置pos_item_info.item_id
     *
     * @param item_id pos_item_info.item_id
     */
    public void setItem_id(Long item_id) {
        this.item_id = item_id;
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