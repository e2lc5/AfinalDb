package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.util.Date;

/**
 * POS操作日志(pos_operate_log)
 *
 * @author bianj
 * @version 1.0.0 2018-01-02
 */
@Table(name = "pos_operate_log")
public class Pos_operate_log implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = -6520309414557460426L;

    /**  */
    @Id(column = "fid")
    private Long fid;

    /**
     * 日志唯一号
     */
    @Property
    private Long log_id;

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
     * 收银员shop_user.fid
     */
    @Property
    private Integer cashier_id;

    /**
     * 操作说明
     */
    @Property
    private String memo;

    /**
     * 订单创建时间
     */
    @Property
    private Date add_time;

    /**
     * 交易单号
     */
    @Property
    private Long pos_trade_id;

    /**
     * 交易明细号
     */
    @Property
    private Long pos_trade_iid;

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
     * 获取日志唯一号
     *
     * @return 日志唯一号
     */
    public Long getLog_id() {
        return this.log_id;
    }

    /**
     * 设置日志唯一号
     *
     * @param log_id 日志唯一号
     */
    public void setLog_id(Long log_id) {
        this.log_id = log_id;
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
    public Date getAdd_time() {
        return this.add_time;
    }

    /**
     * 设置订单创建时间
     *
     * @param add_time 订单创建时间
     */
    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
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
     * 获取交易明细号
     *
     * @return 交易明细号
     */
    public Long getPos_trade_iid() {
        return this.pos_trade_iid;
    }

    /**
     * 设置交易明细号
     *
     * @param pos_trade_iid 交易明细号
     */
    public void setPos_trade_iid(Long pos_trade_iid) {
        this.pos_trade_iid = pos_trade_iid;
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