package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.math.BigDecimal;
import java.util.Date;

/**
 * POS交易支付明细表(pos_trade_pay)
 *
 * @author bianj
 * @version 1.0.0 2018-01-02
 */
@Table(name = "pos_trade_pay")
public class Pos_trade_pay implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = 7115762621587536537L;

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
    private Long pos_trade_pid;

    /**
     * 支付明细序号,每次交易从1开始
     */
    @Property
    private Integer entry_id;

    /**
     * 交易单号
     */
    @Property
    private Long pos_trade_id;

    /**
     * 支付方式pos_pay_info
     */
    @Property
    private Integer pay_id;

    /**
     * 支付方式
     */
    @Property
    private String pay_name;

    /**
     * 收款金额
     */
    @Property
    private BigDecimal accept_money;

    /**
     * 支付金额
     */
    @Property
    private BigDecimal pay_money;

    /**
     * 溢收金额
     */
    @Property
    private BigDecimal spill_money;

    /**
     * 支付状态1成功
     */
    @Property
    private Integer pay_status_id;

    /**
     * 支付开始时间
     */
    @Property
    private Date pay_add_time;

    /**
     * 支付完成时间
     */
    @Property
    private Date pay_end_time;

    /**
     * 卡号
     */
    @Property
    private Long card_code;

    /**
     * 卡余额
     */
    @Property
    private BigDecimal balance_money;

    /**
     * 对方交易账户
     */
    @Property
    private String tran_num;

    /**
     * 会员member_info.fid
     */
    @Property
    private Integer member_id;

    /**
     * 银行代码
     */
    @Property
    private String bank_code;

    /**
     * 银行名称
     */
    @Property
    private String bank_name;

    /**
     * 买家卡号
     */
    @Property
    private String buyer_bank_num;

    /**
     * 卖家银行账号
     */
    @Property
    private String seller_bank_num;

    /**
     * 银行交易流水号
     */
    @Property
    private String bank_trade_no;

    /**
     * 买家支付宝财付通账号
     */
    @Property
    private String buyer_platform_id;

    /**
     * 卖家支付宝财付通账号
     */
    @Property
    private String seller_platform_id;

    /**
     * 支付宝财付通交易流水号
     */
    @Property
    private String platform_trade_no;

    /**
     * 接口调用方法
     */
    @Property
    private String call_method_url;

    /**
     * 扫码
     */
    @Property
    private String scan_code;

    /**
     * 买家支付宝账号
     */
    @Property
    private String buyer_logon_id;

    /**
     * 卖家支付宝账号/公众号
     */
    @Property
    private String app_id;

    /**
     * 汇率
     */
    @Property
    private BigDecimal pay_rate;

    /**
     * 明细单号pos_trade_item.pos_trade_iid
     */
    @Property
    private String pos_trade_iids;

    /**
     * 时间戳
     */
    @Property
    private Long ver;

    private Pos_pay_info pay_info;

    @Property
    private int is_upload = 0;

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
    public Long getPos_trade_pid() {
        return this.pos_trade_pid;
    }

    /**
     * 设置交易单号
     *
     * @param pos_trade_pid 交易单号
     */
    public void setPos_trade_pid(Long pos_trade_pid) {
        this.pos_trade_pid = pos_trade_pid;
    }

    /**
     * 获取支付明细序号,每次交易从1开始
     *
     * @return 支付明细序号
     */
    public Integer getEntry_id() {
        return this.entry_id;
    }

    /**
     * 设置支付明细序号,每次交易从1开始
     *
     * @param entry_id 支付明细序号,每次交易从1开始
     */
    public void setEntry_id(Integer entry_id) {
        this.entry_id = entry_id;
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
     * 获取支付方式pos_pay_info
     *
     * @return 支付方式pos_pay_info
     */
    public Integer getPay_id() {
        return this.pay_id;
    }

    /**
     * 设置支付方式pos_pay_info
     *
     * @param pay_id 支付方式pos_pay_info
     */
    public void setPay_id(Integer pay_id) {
        this.pay_id = pay_id;
    }

    /**
     * 获取支付方式
     *
     * @return 支付方式
     */
    public String getPay_name() {
        return this.pay_name;
    }

    /**
     * 设置支付方式
     *
     * @param pay_name 支付方式
     */
    public void setPay_name(String pay_name) {
        this.pay_name = pay_name;
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
     * 获取支付金额
     *
     * @return 支付金额
     */
    public BigDecimal getPay_money() {
        return this.pay_money;
    }

    /**
     * 设置支付金额
     *
     * @param pay_money 支付金额
     */
    public void setPay_money(BigDecimal pay_money) {
        this.pay_money = pay_money;
    }

    /**
     * 获取溢收金额
     *
     * @return 溢收金额
     */
    public BigDecimal getSpill_money() {
        return this.spill_money;
    }

    /**
     * 设置溢收金额
     *
     * @param spill_money 溢收金额
     */
    public void setSpill_money(BigDecimal spill_money) {
        this.spill_money = spill_money;
    }

    /**
     * 获取支付状态1成功
     *
     * @return 支付状态1成功
     */
    public Integer getPay_status_id() {
        return this.pay_status_id;
    }

    /**
     * 设置支付状态1成功
     *
     * @param pay_status_id 支付状态1成功
     */
    public void setPay_status_id(Integer pay_status_id) {
        this.pay_status_id = pay_status_id;
    }

    /**
     * 获取支付开始时间
     *
     * @return 支付开始时间
     */
    public Date getPay_add_time() {
        return this.pay_add_time;
    }

    /**
     * 设置支付开始时间
     *
     * @param pay_add_time 支付开始时间
     */
    public void setPay_add_time(Date pay_add_time) {
        this.pay_add_time = pay_add_time;
    }

    /**
     * 获取支付完成时间
     *
     * @return 支付完成时间
     */
    public Date getPay_end_time() {
        return this.pay_end_time;
    }

    /**
     * 设置支付完成时间
     *
     * @param pay_end_time 支付完成时间
     */
    public void setPay_end_time(Date pay_end_time) {
        this.pay_end_time = pay_end_time;
    }

    /**
     * 获取卡号
     *
     * @return 卡号
     */
    public Long getCard_code() {
        return this.card_code;
    }

    /**
     * 设置卡号
     *
     * @param card_code 卡号
     */
    public void setCard_code(Long card_code) {
        this.card_code = card_code;
    }

    /**
     * 获取卡余额
     *
     * @return 卡余额
     */
    public BigDecimal getBalance_money() {
        return this.balance_money;
    }

    /**
     * 设置卡余额
     *
     * @param balance_money 卡余额
     */
    public void setBalance_money(BigDecimal balance_money) {
        this.balance_money = balance_money;
    }

    /**
     * 获取对方交易账户
     *
     * @return 对方交易账户
     */
    public String getTran_num() {
        return this.tran_num;
    }

    /**
     * 设置对方交易账户
     *
     * @param tran_num 对方交易账户
     */
    public void setTran_num(String tran_num) {
        this.tran_num = tran_num;
    }

    /**
     * 获取会员member_info.fid
     *
     * @return 会员member_info
     */
    public Integer getMember_id() {
        return this.member_id;
    }

    /**
     * 设置会员member_info.fid
     *
     * @param member_id 会员member_info.fid
     */
    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    /**
     * 获取银行代码
     *
     * @return 银行代码
     */
    public String getBank_code() {
        return this.bank_code;
    }

    /**
     * 设置银行代码
     *
     * @param bank_code 银行代码
     */
    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    /**
     * 获取银行名称
     *
     * @return 银行名称
     */
    public String getBank_name() {
        return this.bank_name;
    }

    /**
     * 设置银行名称
     *
     * @param bank_name 银行名称
     */
    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    /**
     * 获取买家卡号
     *
     * @return 买家卡号
     */
    public String getBuyer_bank_num() {
        return this.buyer_bank_num;
    }

    /**
     * 设置买家卡号
     *
     * @param buyer_bank_num 买家卡号
     */
    public void setBuyer_bank_num(String buyer_bank_num) {
        this.buyer_bank_num = buyer_bank_num;
    }

    /**
     * 获取卖家银行账号
     *
     * @return 卖家银行账号
     */
    public String getSeller_bank_num() {
        return this.seller_bank_num;
    }

    /**
     * 设置卖家银行账号
     *
     * @param seller_bank_num 卖家银行账号
     */
    public void setSeller_bank_num(String seller_bank_num) {
        this.seller_bank_num = seller_bank_num;
    }

    /**
     * 获取银行交易流水号
     *
     * @return 银行交易流水号
     */
    public String getBank_trade_no() {
        return this.bank_trade_no;
    }

    /**
     * 设置银行交易流水号
     *
     * @param bank_trade_no 银行交易流水号
     */
    public void setBank_trade_no(String bank_trade_no) {
        this.bank_trade_no = bank_trade_no;
    }

    /**
     * 获取买家支付宝财付通账号
     *
     * @return 买家支付宝财付通账号
     */
    public String getBuyer_platform_id() {
        return this.buyer_platform_id;
    }

    /**
     * 设置买家支付宝财付通账号
     *
     * @param buyer_platform_id 买家支付宝财付通账号
     */
    public void setBuyer_platform_id(String buyer_platform_id) {
        this.buyer_platform_id = buyer_platform_id;
    }

    /**
     * 获取卖家支付宝财付通账号
     *
     * @return 卖家支付宝财付通账号
     */
    public String getSeller_platform_id() {
        return this.seller_platform_id;
    }

    /**
     * 设置卖家支付宝财付通账号
     *
     * @param seller_platform_id 卖家支付宝财付通账号
     */
    public void setSeller_platform_id(String seller_platform_id) {
        this.seller_platform_id = seller_platform_id;
    }

    /**
     * 获取支付宝财付通交易流水号
     *
     * @return 支付宝财付通交易流水号
     */
    public String getPlatform_trade_no() {
        return this.platform_trade_no;
    }

    /**
     * 设置支付宝财付通交易流水号
     *
     * @param platform_trade_no 支付宝财付通交易流水号
     */
    public void setPlatform_trade_no(String platform_trade_no) {
        this.platform_trade_no = platform_trade_no;
    }

    /**
     * 获取接口调用方法
     *
     * @return 接口调用方法
     */
    public String getCall_method_url() {
        return this.call_method_url;
    }

    /**
     * 设置接口调用方法
     *
     * @param call_method_url 接口调用方法
     */
    public void setCall_method_url(String call_method_url) {
        this.call_method_url = call_method_url;
    }

    /**
     * 获取扫码
     *
     * @return 扫码
     */
    public String getScan_code() {
        return this.scan_code;
    }

    /**
     * 设置扫码
     *
     * @param scan_code 扫码
     */
    public void setScan_code(String scan_code) {
        this.scan_code = scan_code;
    }

    /**
     * 获取买家支付宝账号
     *
     * @return 买家支付宝账号
     */
    public String getBuyer_logon_id() {
        return this.buyer_logon_id;
    }

    /**
     * 设置买家支付宝账号
     *
     * @param buyer_logon_id 买家支付宝账号
     */
    public void setBuyer_logon_id(String buyer_logon_id) {
        this.buyer_logon_id = buyer_logon_id;
    }

    /**
     * 获取卖家支付宝账号/公众号
     *
     * @return 卖家支付宝账号/公众号
     */
    public String getApp_id() {
        return this.app_id;
    }

    /**
     * 设置卖家支付宝账号/公众号
     *
     * @param app_id 卖家支付宝账号/公众号
     */
    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    /**
     * 获取汇率
     *
     * @return 汇率
     */
    public BigDecimal getPay_rate() {
        return this.pay_rate;
    }

    /**
     * 设置汇率
     *
     * @param pay_rate 汇率
     */
    public void setPay_rate(BigDecimal pay_rate) {
        this.pay_rate = pay_rate;
    }

    /**
     * 获取明细单号pos_trade_item.pos_trade_iid
     *
     * @return 明细单号pos_trade_item
     */
    public String getPos_trade_iids() {
        return this.pos_trade_iids;
    }

    /**
     * 设置明细单号pos_trade_item.pos_trade_iid
     *
     * @param pos_trade_iids 明细单号pos_trade_item.pos_trade_iid
     */
    public void setPos_trade_iids(String pos_trade_iids) {
        this.pos_trade_iids = pos_trade_iids;
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

    public Pos_pay_info getPay_info() {
        return pay_info;
    }

    public void setPay_info(Pos_pay_info pay_info) {
        this.pay_info = pay_info;
    }

    public int getIs_upload() {
        return is_upload;
    }

    public void setIs_upload(int is_upload) {
        this.is_upload = is_upload;
    }
}