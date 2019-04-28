package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * POS预付卡消费明细-hty(pos_prepaycard_trans)
 *
 * @author bianj
 * @version 1.0.0 2018-06-30
 */
@Table(name = "pos_prepaycard_trans")
public class Pos_prepaycard_trans implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = 2305477778305051589L;

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
     * 记录类型,TD:正常交易,TB:黑卡交易
     */
    @Property
    private String record_id;

    /**
     * 记录流水号,文件中的流水号，每个文件都是从000001开始
     */
    @Property
    private String record_seq_no;

    /**
     * 交易流水号,机具交易流水号
     */
    @Property
    private String transaction_sequence_no;

    /**
     * 发卡机构代码,
     */
    @Property
    private String issuing_company;

    /**
     * 城市代码,南京:2100，从卡里读出来的
     */
    @Property
    private String city_code;

    /**
     * 卡号,
     */
    @Property
    private String alias_card_id;

    /**
     * 卡类型,0:CUP卡
     */
    @Property
    private String card_type;

    /**
     * 卡种,001:不记名卡，从卡里读出来的
     */
    @Property
    private String card_class;

    /**
     * 钱包类型,1:普通,2:专用钱包 3:计次票钱包,4:透支卡钱包
     */
    @Property
    private String purse_type;

    /**
     * 支付方式,默认0（填写0）
     */
    @Property
    private String payment_type;

    /**
     * 消费金额,Get On Off Amount Or Point
     */
    @Property
    private BigDecimal goap;

    /**
     * 消费前卡内余额,
     */
    @Property
    private BigDecimal passenger_card_balance;

    /**
     * POS机号,电子秤终端号，写在PSAM卡，从PSAM卡中读出（后端会校验）
     */
    @Property
    private String validator_id;

    /**
     * PSAM卡号,
     */
    @Property
    private String sam_id;

    /**
     * PSAM卡交易序列号,PSAM卡返回的
     */
    @Property
    private String psam_trans_sequence_no;

    /**
     * PSAM终端机编号,
     */
    @Property
    private String psam_terminal_no;

    /**
     * 交易认证码,卡返回的TAC码
     */
    @Property
    private String transaction_certify_code;

    /**
     * 保留域,可以填空
     */
    @Property
    private String reserve;

    /**
     * 交易日期
     */
    @Property
    private Date sys_date;

    /**
     * 是否已经上传
     */
    @Property
    private int is_upload = 0;

    /**
     * 时间戳
     */
    @Property
    private Long ver;

    /**
     * 状态:0未转档1已转档
     */
    @Property
    private Integer trans_status_id;

    /**  */
    @Property
    private BigInteger ts_ver;

    /**
     * 交易单号
     */
    @Property
    private String pos_trade_id;

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
     * 获取记录类型,TD:正常交易,TB:黑卡交易
     *
     * @return 记录类型
     */
    public String getRecord_id() {
        return this.record_id;
    }

    /**
     * 设置记录类型,TD:正常交易,TB:黑卡交易
     *
     * @param record_id 记录类型,TD:正常交易,TB:黑卡交易
     */
    public void setRecord_id(String record_id) {
        this.record_id = record_id;
    }

    /**
     * 获取记录流水号,文件中的流水号，每个文件都是从000001开始
     *
     * @return 记录流水号, 文件中的流水号
     */
    public String getRecord_seq_no() {
        return this.record_seq_no;
    }

    /**
     * 设置记录流水号,文件中的流水号，每个文件都是从000001开始
     *
     * @param record_seq_no 记录流水号,文件中的流水号，每个文件都是从000001开始
     */
    public void setRecord_seq_no(String record_seq_no) {
        this.record_seq_no = record_seq_no;
    }

    /**
     * 获取交易流水号,机具交易流水号
     *
     * @return 交易流水号
     */
    public String getTransaction_sequence_no() {
        return this.transaction_sequence_no;
    }

    /**
     * 设置交易流水号,机具交易流水号
     *
     * @param transaction_sequence_no 交易流水号,机具交易流水号
     */
    public void setTransaction_sequence_no(String transaction_sequence_no) {
        this.transaction_sequence_no = transaction_sequence_no;
    }

    /**
     * 获取发卡机构代码,
     *
     * @return 发卡机构代码
     */
    public String getIssuing_company() {
        return this.issuing_company;
    }

    /**
     * 设置发卡机构代码,
     *
     * @param issuing_company 发卡机构代码,
     */
    public void setIssuing_company(String issuing_company) {
        this.issuing_company = issuing_company;
    }

    /**
     * 获取城市代码,南京:2100，从卡里读出来的
     *
     * @return 城市代码, 南京:2100
     */
    public String getCity_code() {
        return this.city_code;
    }

    /**
     * 设置城市代码,南京:2100，从卡里读出来的
     *
     * @param city_code 城市代码,南京:2100，从卡里读出来的
     */
    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    /**
     * 获取卡号,
     *
     * @return 卡号
     */
    public String getAlias_card_id() {
        return this.alias_card_id;
    }

    /**
     * 设置卡号,
     *
     * @param alias_card_id 卡号,
     */
    public void setAlias_card_id(String alias_card_id) {
        this.alias_card_id = alias_card_id;
    }

    /**
     * 获取卡类型,0:CUP卡
     *
     * @return 卡类型
     */
    public String getCard_type() {
        return this.card_type;
    }

    /**
     * 设置卡类型,0:CUP卡
     *
     * @param card_type 卡类型,0:CUP卡
     */
    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    /**
     * 获取卡种,001:不记名卡，从卡里读出来的
     *
     * @return 卡种, 001:不记名卡
     */
    public String getCard_class() {
        return this.card_class;
    }

    /**
     * 设置卡种,001:不记名卡，从卡里读出来的
     *
     * @param card_class 卡种,001:不记名卡，从卡里读出来的
     */
    public void setCard_class(String card_class) {
        this.card_class = card_class;
    }

    /**
     * 获取钱包类型,1:普通,2:专用钱包 3:计次票钱包,4:透支卡钱包
     *
     * @return 钱包类型
     */
    public String getPurse_type() {
        return this.purse_type;
    }

    /**
     * 设置钱包类型,1:普通,2:专用钱包 3:计次票钱包,4:透支卡钱包
     *
     * @param purse_type 钱包类型,1:普通,2:专用钱包 3:计次票钱包,4:透支卡钱包
     */
    public void setPurse_type(String purse_type) {
        this.purse_type = purse_type;
    }

    /**
     * 获取支付方式,默认0（填写0）
     *
     * @return 支付方式
     */
    public String getPayment_type() {
        return this.payment_type;
    }

    /**
     * 设置支付方式,默认0（填写0）
     *
     * @param payment_type 支付方式,默认0（填写0）
     */
    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    /**
     * 获取消费金额,Get On Off Amount Or Point
     *
     * @return 消费金额
     */
    public BigDecimal getGoap() {
        return this.goap;
    }

    /**
     * 设置消费金额,Get On Off Amount Or Point
     *
     * @param goap 消费金额,Get On Off Amount Or Point
     */
    public void setGoap(BigDecimal goap) {
        this.goap = goap;
    }

    /**
     * 获取消费前卡内余额,
     *
     * @return 消费前卡内余额
     */
    public BigDecimal getPassenger_card_balance() {
        return this.passenger_card_balance;
    }

    /**
     * 设置消费前卡内余额,
     *
     * @param passenger_card_balance 消费前卡内余额,
     */
    public void setPassenger_card_balance(BigDecimal passenger_card_balance) {
        this.passenger_card_balance = passenger_card_balance;
    }

    /**
     * 获取POS机号,电子秤终端号，写在PSAM卡，从PSAM卡中读出（后端会校验）
     *
     * @return POS机号, 电子秤终端号
     */
    public String getValidator_id() {
        return this.validator_id;
    }

    /**
     * 设置POS机号,电子秤终端号，写在PSAM卡，从PSAM卡中读出（后端会校验）
     *
     * @param validator_id POS机号,电子秤终端号，写在PSAM卡，从PSAM卡中读出（后端会校验）
     */
    public void setValidator_id(String validator_id) {
        this.validator_id = validator_id;
    }

    /**
     * 获取PSAM卡号,
     *
     * @return PSAM卡号
     */
    public String getSam_id() {
        return this.sam_id;
    }

    /**
     * 设置PSAM卡号,
     *
     * @param sam_id PSAM卡号,
     */
    public void setSam_id(String sam_id) {
        this.sam_id = sam_id;
    }

    /**
     * 获取PSAM卡交易序列号,PSAM卡返回的
     *
     * @return PSAM卡交易序列号
     */
    public String getPsam_trans_sequence_no() {
        return this.psam_trans_sequence_no;
    }

    /**
     * 设置PSAM卡交易序列号,PSAM卡返回的
     *
     * @param psam_trans_sequence_no PSAM卡交易序列号,PSAM卡返回的
     */
    public void setPsam_trans_sequence_no(String psam_trans_sequence_no) {
        this.psam_trans_sequence_no = psam_trans_sequence_no;
    }

    /**
     * 获取PSAM终端机编号,
     *
     * @return PSAM终端机编号
     */
    public String getPsam_terminal_no() {
        return this.psam_terminal_no;
    }

    /**
     * 设置PSAM终端机编号,
     *
     * @param psam_terminal_no PSAM终端机编号,
     */
    public void setPsam_terminal_no(String psam_terminal_no) {
        this.psam_terminal_no = psam_terminal_no;
    }

    /**
     * 获取交易认证码,卡返回的TAC码
     *
     * @return 交易认证码
     */
    public String getTransaction_certify_code() {
        return this.transaction_certify_code;
    }

    /**
     * 设置交易认证码,卡返回的TAC码
     *
     * @param transaction_certify_code 交易认证码,卡返回的TAC码
     */
    public void setTransaction_certify_code(String transaction_certify_code) {
        this.transaction_certify_code = transaction_certify_code;
    }

    /**
     * 获取保留域,可以填空
     *
     * @return 保留域
     */
    public String getReserve() {
        return this.reserve;
    }

    /**
     * 设置保留域,可以填空
     *
     * @param reserve 保留域,可以填空
     */
    public void setReserve(String reserve) {
        this.reserve = reserve;
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

    /**
     * 获取状态:0未转档1已转档
     *
     * @return 状态
     */
    public Integer getTrans_status_id() {
        return this.trans_status_id;
    }

    /**
     * 设置状态:0未转档1已转档
     *
     * @param trans_status_id 状态:0未转档1已转档
     */
    public void setTrans_status_id(Integer trans_status_id) {
        this.trans_status_id = trans_status_id;
    }

    /**
     * 获取
     *
     * @return
     */
    public BigInteger getTs_ver() {
        return this.ts_ver;
    }

    /**
     * 设置
     *
     * @param ts_ver
     */
    public void setTs_ver(BigInteger ts_ver) {
        this.ts_ver = ts_ver;
    }


    public String getPos_trade_id() {
        return pos_trade_id;
    }

    public void setPos_trade_id(String pos_trade_id) {
        this.pos_trade_id = pos_trade_id;
    }
}