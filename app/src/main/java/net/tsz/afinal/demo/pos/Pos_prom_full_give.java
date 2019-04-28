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

import java.math.BigDecimal;
import java.util.Date;

/**
 * 满赠活动(POS_PROM_FULL_GIVE)
 *
 * @author bianj
 * @version 1.0.0 2018-12-20
 */
@Table(name = "poos_prom_full_give")
public class Pos_prom_full_give {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = 1850907074738388290L;

    /**
     * fid
     */
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
     * 原单据fid
     */
    @Property
    private Long ffid;

    /**
     * 原单据bill_id
     */
    @Property
    private Long bill_id;

    /**
     * 促销标题
     */
    @Property
    private String prom_title;

    /**
     * 促销范围1全店2分类3品牌4单品
     */
    @Property
    private Integer range_id;

    /**
     * 范围描述
     */
    @Property
    private String range_memo;

    /**
     * 促销金额
     */
    @Property
    private BigDecimal prom_amount;

    /**
     * 赠品item_sku.fid
     */
    @Property
    private Integer give_sku_id;

    /**
     * 赠品优惠方式1优惠2折扣3定额4加价购
     */
    @Property
    private Integer give_discount_type;

    /**
     * 赠品优惠金额
     */
    @Property
    private BigDecimal give_discount_amount;

    /**
     * 赠品数量
     */
    @Property
    private BigDecimal give_qty;

    /**
     * 开始日期
     */
    @Property
    private Date begin_date;

    /**
     * 结束日期
     */
    @Property
    private Date end_date;

    /**
     * 开始时间
     */
    @Property
    private String begin_time;

    /**
     * 结束时间
     */
    @Property
    private String end_time;

    /**
     * 周循环
     */
    @Property
    private String week_days;

    /**
     * 状态:1录入2审核3作废4终止
     */
    @Property
    private Integer status;

    /**
     * 1适用会员
     */
    @Property
    private Integer is_member;

    /**
     * 1适用礼券支付
     */
    @Property
    private Integer is_coupon;

    /**
     * 档期prom_calendar.fid
     */
    @Property
    private Integer calendar_id;

    /**
     * 排他促销范围1分类2单品3标签
     */
    @Property
    private Integer ex_range_id;

    /**
     * 排他范围描述
     */
    @Property
    private String ex_range_memo;

    /**
     * 用户备注
     */
    @Property
    private String memo1;

    /**
     * 程序备注
     */
    @Property
    private String memo2;

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
     * 更新时间
     */
    @Property
    private String update_user;

    /**
     * 时间戳
     */
    @Property
    private Long ver;

    /**
     * 赠品群item_sku.fid
     */
    @Property
    private String give_sku_ids;

    /**
     * 获取fid
     *
     * @return fid
     */
    public Long getFid() {
        return this.fid;
    }

    /**
     * 设置fid
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
     * @param shop_id shop_info
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
     * 获取原单据fid
     *
     * @return 原单据fid
     */
    public Long getFfid() {
        return this.ffid;
    }

    /**
     * 设置原单据fid
     *
     * @param ffid 原单据fid
     */
    public void setFfid(Long ffid) {
        this.ffid = ffid;
    }

    /**
     * 获取原单据bill_id
     *
     * @return 原单据bill_id
     */
    public Long getBill_id() {
        return this.bill_id;
    }

    /**
     * 设置原单据bill_id
     *
     * @param bill_id 原单据bill_id
     */
    public void setBill_id(Long bill_id) {
        this.bill_id = bill_id;
    }

    /**
     * 获取促销标题
     *
     * @return 促销标题
     */
    public String getProm_title() {
        return this.prom_title;
    }

    /**
     * 设置促销标题
     *
     * @param prom_title 促销标题
     */
    public void setProm_title(String prom_title) {
        this.prom_title = prom_title;
    }

    /**
     * 获取促销范围1全店2分类3品牌4单品
     *
     * @return 促销范围1全店2分类3品牌4单品
     */
    public Integer getRange_id() {
        return this.range_id;
    }

    /**
     * 设置促销范围1全店2分类3品牌4单品
     *
     * @param range_id 促销范围1全店2分类3品牌4单品
     */
    public void setRange_id(Integer range_id) {
        this.range_id = range_id;
    }

    /**
     * 获取范围描述
     *
     * @return 范围描述
     */
    public String getRange_memo() {
        return this.range_memo;
    }

    /**
     * 设置范围描述
     *
     * @param range_memo 范围描述
     */
    public void setRange_memo(String range_memo) {
        this.range_memo = range_memo;
    }

    /**
     * 获取促销金额
     *
     * @return 促销金额
     */
    public BigDecimal getProm_amount() {
        return this.prom_amount;
    }

    /**
     * 设置促销金额
     *
     * @param prom_amount 促销金额
     */
    public void setProm_amount(BigDecimal prom_amount) {
        this.prom_amount = prom_amount;
    }

    /**
     * 获取赠品item_sku.fid
     *
     * @return 赠品item_sku
     */
    public Integer getGive_sku_id() {
        return this.give_sku_id;
    }

    /**
     * 设置赠品item_sku.fid
     *
     * @param give_sku_id 赠品item_sku
     */
    public void setGive_sku_id(Integer give_sku_id) {
        this.give_sku_id = give_sku_id;
    }

    /**
     * 获取赠品优惠方式1优惠2折扣3定额4加价购
     *
     * @return 赠品优惠方式1优惠2折扣3定额4加价购
     */
    public Integer getGive_discount_type() {
        return this.give_discount_type;
    }

    /**
     * 设置赠品优惠方式1优惠2折扣3定额4加价购
     *
     * @param give_discount_type 赠品优惠方式1优惠2折扣3定额4加价购
     */
    public void setGive_discount_type(Integer give_discount_type) {
        this.give_discount_type = give_discount_type;
    }

    /**
     * 获取赠品优惠金额
     *
     * @return 赠品优惠金额
     */
    public BigDecimal getGive_discount_amount() {
        return this.give_discount_amount;
    }

    /**
     * 设置赠品优惠金额
     *
     * @param give_discount_amount 赠品优惠金额
     */
    public void setGive_discount_amount(BigDecimal give_discount_amount) {
        this.give_discount_amount = give_discount_amount;
    }

    /**
     * 获取赠品数量
     *
     * @return 赠品数量
     */
    public BigDecimal getGive_qty() {
        return this.give_qty;
    }

    /**
     * 设置赠品数量
     *
     * @param give_qty 赠品数量
     */
    public void setGive_qty(BigDecimal give_qty) {
        this.give_qty = give_qty;
    }

    /**
     * 获取开始日期
     *
     * @return 开始日期
     */
    public Date getBegin_date() {
        return this.begin_date;
    }

    /**
     * 设置开始日期
     *
     * @param begin_date 开始日期
     */
    public void setBegin_date(Date begin_date) {
        this.begin_date = begin_date;
    }

    /**
     * 获取结束日期
     *
     * @return 结束日期
     */
    public Date getEnd_date() {
        return this.end_date;
    }

    /**
     * 设置结束日期
     *
     * @param end_date 结束日期
     */
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    /**
     * 获取开始时间
     *
     * @return 开始时间
     */
    public String getBegin_time() {
        return this.begin_time;
    }

    /**
     * 设置开始时间
     *
     * @param begin_time 开始时间
     */
    public void setBegin_time(String begin_time) {
        this.begin_time = begin_time;
    }

    /**
     * 获取结束时间
     *
     * @return 结束时间
     */
    public String getEnd_time() {
        return this.end_time;
    }

    /**
     * 设置结束时间
     *
     * @param end_time 结束时间
     */
    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    /**
     * 获取周循环
     *
     * @return 周循环
     */
    public String getWeek_days() {
        return this.week_days;
    }

    /**
     * 设置周循环
     *
     * @param week_days 周循环
     */
    public void setWeek_days(String week_days) {
        this.week_days = week_days;
    }

    /**
     * 获取状态:1录入2审核3作废4终止
     *
     * @return 状态
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * 设置状态:1录入2审核3作废4终止
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取1适用会员
     *
     * @return 1适用会员
     */
    public Integer getIs_member() {
        return this.is_member;
    }

    /**
     * 设置1适用会员
     *
     * @param is_member 1适用会员
     */
    public void setIs_member(Integer is_member) {
        this.is_member = is_member;
    }

    /**
     * 获取1适用礼券支付
     *
     * @return 1适用礼券支付
     */
    public Integer getIs_coupon() {
        return this.is_coupon;
    }

    /**
     * 设置1适用礼券支付
     *
     * @param is_coupon 1适用礼券支付
     */
    public void setIs_coupon(Integer is_coupon) {
        this.is_coupon = is_coupon;
    }

    /**
     * 获取档期prom_calendar.fid
     *
     * @return 档期prom_calendar
     */
    public Integer getCalendar_id() {
        return this.calendar_id;
    }

    /**
     * 设置档期prom_calendar.fid
     *
     * @param calendar_id 档期prom_calendar
     */
    public void setCalendar_id(Integer calendar_id) {
        this.calendar_id = calendar_id;
    }

    /**
     * 获取排他促销范围1分类2单品3标签
     *
     * @return 排他促销范围1分类2单品3标签
     */
    public Integer getEx_range_id() {
        return this.ex_range_id;
    }

    /**
     * 设置排他促销范围1分类2单品3标签
     *
     * @param ex_range_id 排他促销范围1分类2单品3标签
     */
    public void setEx_range_id(Integer ex_range_id) {
        this.ex_range_id = ex_range_id;
    }

    /**
     * 获取排他范围描述
     *
     * @return 排他范围描述
     */
    public String getEx_range_memo() {
        return this.ex_range_memo;
    }

    /**
     * 设置排他范围描述
     *
     * @param ex_range_memo 排他范围描述
     */
    public void setEx_range_memo(String ex_range_memo) {
        this.ex_range_memo = ex_range_memo;
    }

    /**
     * 获取用户备注
     *
     * @return 用户备注
     */
    public String getMemo1() {
        return this.memo1;
    }

    /**
     * 设置用户备注
     *
     * @param memo1 用户备注
     */
    public void setMemo1(String memo1) {
        this.memo1 = memo1;
    }

    /**
     * 获取程序备注
     *
     * @return 程序备注
     */
    public String getMemo2() {
        return this.memo2;
    }

    /**
     * 设置程序备注
     *
     * @param memo2 程序备注
     */
    public void setMemo2(String memo2) {
        this.memo2 = memo2;
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
     * 获取更新时间
     *
     * @return 更新时间
     */
    public String getUpdate_user() {
        return this.update_user;
    }

    /**
     * 设置更新时间
     *
     * @param update_user 更新时间
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

    /**
     * 获取赠品群item_sku.fid
     *
     * @return 赠品群item_sku
     */
    public String getGive_sku_ids() {
        return this.give_sku_ids;
    }

    /**
     * 设置赠品群item_sku.fid
     *
     * @param give_sku_ids 赠品群item_sku
     */
    public void setGive_sku_ids(String give_sku_ids) {
        this.give_sku_ids = give_sku_ids;
    }
}