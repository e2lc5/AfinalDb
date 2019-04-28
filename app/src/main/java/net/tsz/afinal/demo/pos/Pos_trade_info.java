package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * POS交易(pos_trade_info)
 * CREATE TABLE `pos_trade_info` (
 * `fid` bigint(20) NOT NULL AUTO_INCREMENT,
 * `shop_id` int(11) DEFAULT '0' COMMENT 'shop_info.fid',
 * `branch_id` int(11) DEFAULT '0' COMMENT '门店branch_info.fid',
 * `pos_no` int(11) DEFAULT NULL COMMENT 'pos机号',
 * `pos_trade_id` varchar(50) NOT NULL COMMENT '交易单号',
 * `sys_date` date DEFAULT NULL COMMENT '交易日期',
 * `trade_type` tinyint(3) DEFAULT '1' COMMENT '交易类型1正常交易2负项退货3交易取消',
 * `cashier_id` int(11) DEFAULT '0' COMMENT '收银员shop_user.shop_user_id',
 * `cashier_code` varchar(20) DEFAULT NULL COMMENT '收银员',
 * `create_time` datetime DEFAULT NULL COMMENT '订单创建时间',
 * `end_time` datetime DEFAULT NULL COMMENT '完成时间',
 * `discount_money` decimal(12,2) DEFAULT '0.00' COMMENT '单品折扣金额=sum((sale_price-unit_price)*buy_number)',
 * `goods_money` decimal(12,2) DEFAULT '0.00' COMMENT '商品金额=sum(unit_price*buy_number)',
 * `pay_cash` decimal(12,2) DEFAULT '0.00' COMMENT '现金支付金额',
 * `pay_alipay` decimal(12,2) DEFAULT '0.00' COMMENT '阿里支付金额',
 * `pay_weixin` decimal(12,2) DEFAULT '0.00' COMMENT '微信支付金额',
 * `pay_credit` decimal(12,2) DEFAULT '0.00' COMMENT '信用卡支付金额',
 * `pay_card` decimal(12,2) DEFAULT '0.00' COMMENT '储值支付金额',
 * `pay_point` decimal(12,2) DEFAULT '0.00' COMMENT '积分支付',
 * `accept_money` decimal(12,2) DEFAULT '0.00' COMMENT '收款金额',
 * `change_money` decimal(12,2) DEFAULT '0.00' COMMENT '找零',
 * `buyer_onpay_id` varchar(40) DEFAULT '0' COMMENT '买家的微信/支付宝id号',
 * `seller_onpay_id` varchar(40) DEFAULT '0' COMMENT '卖家的微信/支付宝id号',
 * `trade_onpay_num` varchar(100) DEFAULT NULL COMMENT '微信/支付宝交易流水号',
 * `pay_time` datetime DEFAULT NULL COMMENT '支付时间',
 * `trade_num` varchar(30) DEFAULT NULL COMMENT '自定义交易编号',
 * `member_id` int(11) unsigned DEFAULT '0' COMMENT '会员id',
 * `member_code` varchar(30) DEFAULT NULL COMMENT '会员账号',
 * `mobile_code` varchar(48) DEFAULT NULL COMMENT '会员手机',
 * `customer_id` int(11) unsigned DEFAULT '0' COMMENT '客户id:customer_info.fid',
 * `card_tsn` varchar(48) DEFAULT NULL COMMENT '储值卡交易计数器',
 * `card_code` varchar(48) DEFAULT NULL COMMENT '储值卡号',
 * `is_upload` tinyint(1) DEFAULT '0' COMMENT '是否已经上传',
 * `ver` bigint(20) DEFAULT '0' COMMENT '时间戳',
 * `credit_resultcode` varchar(48) DEFAULT NULL COMMENT '银联结果代码',
 * `credit_resultdescribe` varchar(48) DEFAULT NULL COMMENT '银联结果描述',
 * `credit_amount` decimal(12,2) DEFAULT '0.00' COMMENT '银联支付金额',
 * `credit_transdate` varchar(10) DEFAULT NULL COMMENT '银联交易日期',
 * `credit_transtime` varchar(8) DEFAULT NULL COMMENT '银联交易时间',
 * `credit_posref` varchar(8) DEFAULT NULL COMMENT '银联交易单号(服务端)',
 * PRIMARY KEY (`fid`),
 * KEY `idx_pos_trade_info_1` (`shop_id`,`branch_id`,`pos_no`,`pos_trade_id`,`sys_date`,`create_time`,`trade_type`,
 * `cashier_id`,`trade_num`,`is_upload`,`ver`),
 * KEY `idx_pos_trade_info_2` (`shop_id`,`branch_id`,`pos_no`,`pos_trade_id`,`sys_date`,`member_id`,`member_code`,
 * `mobile_code`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=3100 DEFAULT CHARSET=utf8 COMMENT='POS交易'
 *
 * @author bianj
 * @version 1.0.0 2018-03-08
 */
@Table(name = "pos_trade_info")
public class Pos_trade_info implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = 5173964655690041832L;

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
     * 交易单号
     */
    @Property
    private String pos_trade_id;

    /**
     * 交易日期
     */
    @Property
    private Date sys_date;

    /**
     * 交易类型1正常交易2负项退货3交易取消
     */
    @Property
    private Integer trade_type;

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
     * 订单创建时间
     */
    @Property
    private Date create_time;

    /**
     * 完成时间
     */
    @Property
    private Date end_time;

    /**
     * 单品折扣金额=sum((sale_price-unit_price)*buy_number)
     */
    @Property
    private BigDecimal discount_money;

    /**
     * 商品金额=sum(unit_price*buy_number)
     */
    @Property
    private BigDecimal goods_money;

    /**
     * 现金支付金额
     */
    @Property
    private BigDecimal pay_cash;

    /**
     * 阿里支付金额
     */
    @Property
    private BigDecimal pay_alipay;

    /**
     * 微信支付金额
     */
    @Property
    private BigDecimal pay_weixin;

    /**
     * 信用卡支付金额
     */
    @Property
    private BigDecimal pay_credit;

    /**
     * 储值卡余额支付金额
     */
    @Property
    private BigDecimal pay_card;

    /**
     * 储值卡积分支付金额
     */
    @Property
    private BigDecimal pay_point;

    /**
     * 储值卡积分支付金额
     */
    @Property
    private String card_tsn;

    /**
     * 储值卡积分支付金额
     */
    @Property
    private String card_code;

    /**
     * 收款金额
     */
    @Property
    private BigDecimal accept_money;

    /**
     * 找零
     */
    @Property
    private BigDecimal change_money;

    /**
     * 买家的微信/支付宝id号
     */
    @Property
    private String buyer_onpay_id;

    /**
     * 卖家的微信/支付宝id号
     */
    @Property
    private String seller_onpay_id;

    /**
     * 微信/支付宝交易流水号
     */
    @Property
    private String trade_onpay_num;

    /**
     * 支付时间
     */
    @Property
    private Date pay_time;

    /**
     * 自定义交易编号
     */
    @Property
    private String trade_num;

    /**
     * 会员id
     */
    @Property
    private String member_id;

    /**
     * 会员账号
     */
    @Property
    private String member_code;

    /**
     * 会员手机
     */
    @Property
    private String mobile_code;

    /**
     * 客户id:customer_info.fid
     */
    @Property
    private String customer_id;

    /**
     * 是否已经上传
     */
    @Property
    private int is_upload = 0;

    /* ADD 2018-12-05 */
    @Property
    private Integer status_id;

    /**
     * 时间戳
     */
    @Property
    private Long ver;

    /**
     * 在线支付支付序列
     */
    @Property
    private Integer pay_seq = 0;

    private List<Pos_trade_item> trade_items;

    // 红太阳分支,微信,支付宝,银联结果记录
    /**
     * 结果代码
     */
    @Property
    private String credit_resultCode;
    /**
     * 结果描述
     */
    @Property
    private String credit_resultDescribe;
    /**
     * 交易金额
     */
    @Property
    private String credit_amount;
    /**
     * 交易日期
     */
    @Property
    private String credit_transDate;
    /**
     * 交易时间
     */
    @Property
    private String credit_transTime;
    /**
     * 交易单号(服务端)
     */
    @Property
    private String credit_posRef;

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
     * 获取交易单号
     *
     * @return 交易单号
     */
    public String getPos_trade_id() {
        return this.pos_trade_id;
    }

    /**
     * 设置交易单号
     *
     * @param pos_trade_id 交易单号
     */
    public void setPos_trade_id(String pos_trade_id) {
        this.pos_trade_id = pos_trade_id;
    }

    /**
     * 获取交易日期
     *
     * @return 交易日期
     */
    public Date getSys_date() {
        return this.sys_date;
    }

    /**
     * 设置交易日期
     *
     * @param sys_date 交易日期
     */
    public void setSys_date(Date sys_date) {
        this.sys_date = sys_date;
    }

    /**
     * 获取交易类型1正常交易2负项退货3交易取消
     *
     * @return 交易类型1正常交易2负项退货3交易取消
     */
    public Integer getTrade_type() {
        return this.trade_type;
    }

    /**
     * 设置交易类型1正常交易2负项退货3交易取消
     *
     * @param trade_type 交易类型1正常交易2负项退货3交易取消
     */
    public void setTrade_type(Integer trade_type) {
        this.trade_type = trade_type;
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
     * 获取完成时间
     *
     * @return 完成时间
     */
    public Date getEnd_time() {
        return this.end_time;
    }

    /**
     * 设置完成时间
     *
     * @param end_time 完成时间
     */
    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    /**
     * 获取单品折扣金额=sum((sale_price-unit_price)*buy_number)
     *
     * @return 单品折扣金额=sum((sale_price-unit_price)*buy_number)
     */
    public BigDecimal getDiscount_money() {
        return this.discount_money;
    }

    /**
     * 设置单品折扣金额=sum((sale_price-unit_price)*buy_number)
     *
     * @param discount_money 单品折扣金额=sum((sale_price-unit_price)*buy_number)
     */
    public void setDiscount_money(BigDecimal discount_money) {
        this.discount_money = discount_money;
    }

    /**
     * 获取商品金额=sum(unit_price*buy_number)
     *
     * @return 商品金额=sum(unit_price*buy_number)
     */
    public BigDecimal getGoods_money() {
        return this.goods_money;
    }

    /**
     * 设置商品金额=sum(unit_price*buy_number)
     *
     * @param goods_money 商品金额=sum(unit_price*buy_number)
     */
    public void setGoods_money(BigDecimal goods_money) {
        this.goods_money = goods_money;
    }

    /**
     * 获取现金支付金额
     *
     * @return 现金支付金额
     */
    public BigDecimal getPay_cash() {
        return this.pay_cash;
    }

    /**
     * 设置现金支付金额
     *
     * @param pay_cash 现金支付金额
     */
    public void setPay_cash(BigDecimal pay_cash) {
        this.pay_cash = pay_cash;
    }

    /**
     * 获取阿里支付金额
     *
     * @return 阿里支付金额
     */
    public BigDecimal getPay_alipay() {
        return this.pay_alipay;
    }

    /**
     * 设置阿里支付金额
     *
     * @param pay_alipay 阿里支付金额
     */
    public void setPay_alipay(BigDecimal pay_alipay) {
        this.pay_alipay = pay_alipay;
    }

    /**
     * 获取微信支付金额
     *
     * @return 微信支付金额
     */
    public BigDecimal getPay_weixin() {
        return this.pay_weixin;
    }

    /**
     * 设置微信支付金额
     *
     * @param pay_weixin 微信支付金额
     */
    public void setPay_weixin(BigDecimal pay_weixin) {
        this.pay_weixin = pay_weixin;
    }

    /**
     * 获取信用卡支付金额
     *
     * @return 信用卡支付金额
     */
    public BigDecimal getPay_credit() {
        return this.pay_credit;
    }

    /**
     * 设置信用卡支付金额
     *
     * @param pay_credit 信用卡支付金额
     */
    public void setPay_credit(BigDecimal pay_credit) {
        this.pay_credit = pay_credit;
    }

    /**
     * 获取收款金额
     *
     * @return 收款金额
     */
    public BigDecimal getAccept_money() {
        return this.accept_money;
    }

    /**
     * 设置收款金额
     *
     * @param accept_money 收款金额
     */
    public void setAccept_money(BigDecimal accept_money) {
        this.accept_money = accept_money;
    }

    /**
     * 获取找零
     *
     * @return 找零
     */
    public BigDecimal getChange_money() {
        return this.change_money;
    }

    /**
     * 设置找零
     *
     * @param change_money 找零
     */
    public void setChange_money(BigDecimal change_money) {
        this.change_money = change_money;
    }

    /**
     * 获取买家的微信/支付宝id号
     *
     * @return 买家的微信/支付宝id号
     */
    public String getBuyer_onpay_id() {
        return this.buyer_onpay_id;
    }

    /**
     * 设置买家的微信/支付宝id号
     *
     * @param buyer_onpay_id 买家的微信/支付宝id号
     */
    public void setBuyer_onpay_id(String buyer_onpay_id) {
        this.buyer_onpay_id = buyer_onpay_id;
    }

    /**
     * 获取卖家的微信/支付宝id号
     *
     * @return 卖家的微信/支付宝id号
     */
    public String getSeller_onpay_id() {
        return this.seller_onpay_id;
    }

    /**
     * 设置卖家的微信/支付宝id号
     *
     * @param seller_onpay_id 卖家的微信/支付宝id号
     */
    public void setSeller_onpay_id(String seller_onpay_id) {
        this.seller_onpay_id = seller_onpay_id;
    }

    /**
     * 获取微信/支付宝交易流水号
     *
     * @return 微信/支付宝交易流水号
     */
    public String getTrade_onpay_num() {
        return this.trade_onpay_num;
    }

    /**
     * 设置微信/支付宝交易流水号
     *
     * @param trade_onpay_num 微信/支付宝交易流水号
     */
    public void setTrade_onpay_num(String trade_onpay_num) {
        this.trade_onpay_num = trade_onpay_num;
    }

    /**
     * 获取支付时间
     *
     * @return 支付时间
     */
    public Date getPay_time() {
        return this.pay_time;
    }

    /**
     * 设置支付时间
     *
     * @param pay_time 支付时间
     */
    public void setPay_time(Date pay_time) {
        this.pay_time = pay_time;
        if (pay_time != null)
            setStatus_id(3);
    }

    /**
     * 获取自定义交易编号
     *
     * @return 自定义交易编号
     */
    public String getTrade_num() {
        return this.trade_num;
    }

    /**
     * 设置自定义交易编号
     *
     * @param trade_num 自定义交易编号
     */
    public void setTrade_num(String trade_num) {
        this.trade_num = trade_num;
    }

    /**
     * 获取会员id
     *
     * @return 会员id
     */
    public String getMember_id() {
        return this.member_id;
    }

    /**
     * 设置会员id
     *
     * @param member_id 会员id
     */
    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    /**
     * 获取会员账号
     *
     * @return 会员账号
     */
    public String getMember_code() {
        return this.member_code;
    }

    /**
     * 设置会员账号
     *
     * @param member_code 会员账号
     */
    public void setMember_code(String member_code) {
        this.member_code = member_code;
    }

    /**
     * 获取会员手机
     *
     * @return 会员手机
     */
    public String getMobile_code() {
        return this.mobile_code;
    }

    /**
     * 设置会员手机
     *
     * @param mobile_code 会员手机
     */
    public void setMobile_code(String mobile_code) {
        this.mobile_code = mobile_code;
    }

    /**
     * 获取是否已经上传
     *
     * @return 是否已经上传
     */
    public int getIs_upload() {
        return this.is_upload;
    }

    /**
     * 设置是否已经上传
     *
     * @param is_upload 是否已经上传
     */
    public void setIs_upload(int is_upload) {
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

    public BigDecimal getPay_card() {
        return pay_card;
    }

    public void setPay_card(BigDecimal pay_card) {
        this.pay_card = pay_card;
    }

    public BigDecimal getPay_point() {
        return pay_point;
    }

    public void setPay_point(BigDecimal pay_point) {
        this.pay_point = pay_point;
    }

    public String getCard_tsn() {
        return card_tsn;
    }

    public void setCard_tsn(String card_tsn) {
        this.card_tsn = card_tsn;
    }

    public String getCard_code() {
        return card_code;
    }

    public void setCard_code(String card_code) {
        this.card_code = card_code;
    }

    public String getCredit_resultCode() {
        return credit_resultCode;
    }

    public void setCredit_resultCode(String credit_resultCode) {
        this.credit_resultCode = credit_resultCode;
    }

    public String getCredit_resultDescribe() {
        return credit_resultDescribe;
    }

    public void setCredit_resultDescribe(String credit_resultDescribe) {
        this.credit_resultDescribe = credit_resultDescribe;
    }

    public String getCredit_amount() {
        return credit_amount;
    }

    public void setCredit_amount(String credit_amount) {
        this.credit_amount = credit_amount;
    }

    public String getCredit_transDate() {
        return credit_transDate;
    }

    public void setCredit_transDate(String credit_transDate) {
        this.credit_transDate = credit_transDate;
    }

    public String getCredit_transTime() {
        return credit_transTime;
    }

    public void setCredit_transTime(String credit_transTime) {
        this.credit_transTime = credit_transTime;
    }

    public String getCredit_posRef() {
        return credit_posRef;
    }

    public void setCredit_posRef(String credit_posRef) {
        this.credit_posRef = credit_posRef;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public List<Pos_trade_item> getTrade_items() {
        return trade_items;
    }

    public void setTrade_items(List<Pos_trade_item> trade_items) {
        this.trade_items = trade_items;
    }


    public Integer getPay_seq() {
        return pay_seq;
    }

    public void setPay_seq(Integer pay_seq) {
        this.pay_seq = pay_seq;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    /**
     * 获取待支付余额
     *
     * @return 仍需支付的金额
     */
    public BigDecimal getBalance() {
        return this.getGoods_money();// 支付总金额-整单折扣后金额
    }

    public Pos_trade_item getLastItem() {
        if (trade_items == null || trade_items.size() == 0) {
            return null;
        }
        return trade_items.get(trade_items.size() - 1);
    }
}