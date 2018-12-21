package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.util.Date;

/**
 * POS故障处理单(pos_fault_info)
 *
 * @author bianj
 * @version 1.0.0 2018-03-09
 */
@Table(name = "pos_fault_info")
public class Pos_fault_info implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = 4493625975518624429L;

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
     * 申报单号
     */
    @Property
    private String apply_num;

    /**
     * 处理时间
     */
    @Property
    private Date deal_time;

    /**
     * 处理人shop_user.fid
     */
    @Property
    private Integer deal_user_id;

    /**
     * 处理人
     */
    @Property
    private String deal_user_code;

    /**
     * 处理结果dict_type_id=3008
     */
    @Property
    private String result_ids;

    /**
     * 处理结果dict_type_id=3008
     */
    @Property
    private String result_names;

    /**
     * type_id
     */
    @Property
    private int type_id;

    /**
     * type_name
     */
    @Property
    private String type_name;

    /**
     * 处理说明
     */
    @Property
    private String result_memo;

    /**
     * 状态
     */
    @Property
    private Integer status_id;

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
     * 获取申报单号
     *
     * @return 申报单号
     */
    public String getApply_num() {
        return this.apply_num;
    }

    /**
     * 设置申报单号
     *
     * @param apply_num 申报单号
     */
    public void setApply_num(String apply_num) {
        this.apply_num = apply_num;
    }

    /**
     * 获取处理时间
     *
     * @return 处理时间
     */
    public Date getDeal_time() {
        return this.deal_time;
    }

    /**
     * 设置处理时间
     *
     * @param deal_time 处理时间
     */
    public void setDeal_time(Date deal_time) {
        this.deal_time = deal_time;
    }

    /**
     * 获取处理人shop_user.fid
     *
     * @return 处理人shop_user
     */
    public Integer getDeal_user_id() {
        return this.deal_user_id;
    }

    /**
     * 设置处理人shop_user.fid
     *
     * @param deal_user_id 处理人shop_user.fid
     */
    public void setDeal_user_id(Integer deal_user_id) {
        this.deal_user_id = deal_user_id;
    }

    /**
     * 获取处理人
     *
     * @return 处理人
     */
    public String getDeal_user_code() {
        return this.deal_user_code;
    }

    /**
     * 设置处理人
     *
     * @param deal_user_code 处理人
     */
    public void setDeal_user_code(String deal_user_code) {
        this.deal_user_code = deal_user_code;
    }

    /**
     * 获取处理结果dict_type_id=3008
     *
     * @return 处理结果dict_type_id=3008
     */
    public String getResult_ids() {
        return this.result_ids;
    }

    /**
     * 设置处理结果dict_type_id=3008
     *
     * @param result_ids 处理结果dict_type_id=3008
     */
    public void setResult_ids(String result_ids) {
        this.result_ids = result_ids;
    }

    /**
     * 获取处理结果dict_type_id=3008
     *
     * @return 处理结果dict_type_id=3008
     */
    public String getResult_names() {
        return this.result_names;
    }

    /**
     * 设置处理结果dict_type_id=3008
     *
     * @param result_names 处理结果dict_type_id=3008
     */
    public void setResult_names(String result_names) {
        this.result_names = result_names;
    }

    /**
     * 获取处理说明
     *
     * @return 处理说明
     */
    public String getResult_memo() {
        return this.result_memo;
    }

    /**
     * 设置处理说明
     *
     * @param result_memo 处理说明
     */
    public void setResult_memo(String result_memo) {
        this.result_memo = result_memo;
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

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }
}