package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.util.Date;

/**
 * POS故障申报单(pos_fault_apply)
 *
 * @author bianj
 * @version 1.0.0 2018-03-09
 */
@Table(name = "pos_fault_apply")
public class Pos_fault_apply implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = 5246614014295289046L;

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
     * 故障类型dict_type_id=3007
     */
    @Property
    private String type_ids;

    /**
     * 故障类型dict_type_id=3007
     */
    @Property
    private String type_names;

    /**
     * 申报时间
     */
    @Property
    private Date apply_time;

    /**
     * 申报人shop_user.fid
     */
    @Property
    private Integer apply_user_id;

    /**
     * 申报人
     */
    @Property
    private String apply_user_code;

    /**
     * 状态1已申请2处理中3已完成4已作废
     */
    @Property
    private Integer status_id;

    /**
     * 完成时间
     */
    @Property
    private Date end_time;

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
     * 获取故障类型dict_type_id=3007
     *
     * @return 故障类型dict_type_id=3007
     */
    public String getType_ids() {
        return this.type_ids;
    }

    /**
     * 设置故障类型dict_type_id=3007
     *
     * @param type_ids 故障类型dict_type_id=3007
     */
    public void setType_ids(String type_ids) {
        this.type_ids = type_ids;
    }

    /**
     * 获取故障类型dict_type_id=3007
     *
     * @return 故障类型dict_type_id=3007
     */
    public String getType_names() {
        return this.type_names;
    }

    /**
     * 设置故障类型dict_type_id=3007
     *
     * @param type_names 故障类型dict_type_id=3007
     */
    public void setType_names(String type_names) {
        this.type_names = type_names;
    }

    /**
     * 获取申报时间
     *
     * @return 申报时间
     */
    public Date getApply_time() {
        return this.apply_time;
    }

    /**
     * 设置申报时间
     *
     * @param apply_time 申报时间
     */
    public void setApply_time(Date apply_time) {
        this.apply_time = apply_time;
    }

    /**
     * 获取申报人shop_user.fid
     *
     * @return 申报人shop_user
     */
    public Integer getApply_user_id() {
        return this.apply_user_id;
    }

    /**
     * 设置申报人shop_user.fid
     *
     * @param apply_user_id 申报人shop_user.fid
     */
    public void setApply_user_id(Integer apply_user_id) {
        this.apply_user_id = apply_user_id;
    }

    /**
     * 获取申报人
     *
     * @return 申报人
     */
    public String getApply_user_code() {
        return this.apply_user_code;
    }

    /**
     * 设置申报人
     *
     * @param apply_user_code 申报人
     */
    public void setApply_user_code(String apply_user_code) {
        this.apply_user_code = apply_user_code;
    }

    /**
     * 获取状态1已申请2处理中3已完成4已作废
     *
     * @return 状态1已申请2处理中3已完成4已作废
     */
    public Integer getStatus_id() {
        return this.status_id;
    }

    /**
     * 设置状态1已申请2处理中3已完成4已作废
     *
     * @param status_id 状态1已申请2处理中3已完成4已作废
     */
    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
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