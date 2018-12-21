package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.io.Serializable;
import java.util.Date;

/**
 * POS版本(pos_version)
 *
 * @author bianj
 * @version 1.0.0 2017-06-28
 */
@Table(name = "pos_version")
public class Pos_version implements Serializable {
    @Transient
    private static final long serialVersionUID = 6106177962478259007L;
    /**  */
    @Id(column = "fid")
    private Long fid;

    /**
     * 店铺shop_info.fid
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
     * 原单据bill_id
     */
    @Property
    private Long bill_id;

    /**
     * 版本名称
     */
    @Property
    private String version_name;

    /**
     * 开始时间
     */
    @Property
    private Date start_time;

    /**
     * 版本号
     */
    @Property
    private Integer version_id;

    /**
     * 服务器上目录
     */
    @Property
    private String file_url;

    /**
     * 版本更新包
     */
    @Property
    private String file_name;

    /**
     * 版本说明
     */
    @Property
    private String version_memo;

    /**
     * 适用机构
     */
    @Property
    private String branch_ids;

    /**
     * 适用POS
     */
    @Property
    private String pos_nos;

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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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
     * 获取店铺shop_info.fid
     *
     * @return 店铺shop_info
     */
    public Integer getShop_id() {
        return this.shop_id;
    }

    /**
     * 设置店铺shop_info.fid
     *
     * @param shop_id 店铺shop_info.fid
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
     * 获取版本名称
     *
     * @return 版本名称
     */
    public String getVersion_name() {
        return this.version_name;
    }

    /**
     * 设置版本名称
     *
     * @param version_name 版本名称
     */
    public void setVersion_name(String version_name) {
        this.version_name = version_name;
    }

    /**
     * 获取开始时间
     *
     * @return 开始时间
     */
    public Date getStart_time() {
        return this.start_time;
    }

    /**
     * 设置开始时间
     *
     * @param start_time 开始时间
     */
    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    /**
     * 获取版本号
     *
     * @return 版本号
     */
    public Integer getVersion_id() {
        return this.version_id;
    }

    /**
     * 设置版本号
     *
     * @param version_id 版本号
     */
    public void setVersion_id(Integer version_id) {
        this.version_id = version_id;
    }

    /**
     * 获取服务器上目录
     *
     * @return 服务器上目录
     */
    public String getFile_url() {
        return this.file_url;
    }

    /**
     * 设置服务器上目录
     *
     * @param file_url 服务器上目录
     */
    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }

    /**
     * 获取版本更新包
     *
     * @return 版本更新包
     */
    public String getFile_name() {
        return this.file_name;
    }

    /**
     * 设置版本更新包
     *
     * @param file_name 版本更新包
     */
    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    /**
     * 获取版本说明
     *
     * @return 版本说明
     */
    public String getVersion_memo() {
        return this.version_memo;
    }

    /**
     * 设置版本说明
     *
     * @param version_memo 版本说明
     */
    public void setVersion_memo(String version_memo) {
        this.version_memo = version_memo;
    }

    /**
     * 获取适用机构
     *
     * @return 适用机构
     */
    public String getBranch_ids() {
        return this.branch_ids;
    }

    /**
     * 设置适用机构
     *
     * @param branch_ids 适用机构
     */
    public void setBranch_ids(String branch_ids) {
        this.branch_ids = branch_ids;
    }

    /**
     * 获取适用POS
     *
     * @return 适用POS
     */
    public String getPos_nos() {
        return this.pos_nos;
    }

    /**
     * 设置适用POS
     *
     * @param pos_nos 适用POS
     */
    public void setPos_nos(String pos_nos) {
        this.pos_nos = pos_nos;
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
}