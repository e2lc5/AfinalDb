package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.util.Date;

/**
 * POS秤参数(pos_setting)
 *
 * @author bianj
 * @version 1.0.0 2018-06-30
 */
@Table(name = "pos_setting")
public class Pos_setting implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = -987726662386009687L;

    /**  */
    @Id(column = "fid")
    private Integer fid;

    /**
     * 商家shop_settle.fid
     */
    @Property
    private Integer shop_id;

    /**
     * 摊位branch_info.fid
     */
    @Property
    private Integer branch_id;

    /**
     * pos机号
     */
    @Property
    private Integer pos_no;

    /**
     * 上级参数pos_setting.fid
     */
    @Property
    private Integer ffid;

    /**
     * 上级参数pos_setting.fid
     */
    @Property
    private Integer father_id;

    /**
     * 上级参数
     */
    @Property
    private Integer level_id;

    /**
     * 参数名称
     */
    @Property
    private String para_name;

    /**
     * 参数值
     */
    @Property
    private String para_value;

    /**
     * 参数范例
     */
    @Property
    private String all_value;

    /**
     * 系统级
     */
    @Property
    private int is_sys;

    /**
     * 有效
     */
    @Property
    private Integer is_display;

    /**
     * 参数,固定死的
     */
    @Property
    private Integer setting_id;

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
    public Integer getFid() {
        return this.fid;
    }

    /**
     * 设置
     *
     * @param fid
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * 获取商家shop_settle.fid
     *
     * @return 商家shop_settle
     */
    public Integer getShop_id() {
        return this.shop_id;
    }

    /**
     * 设置商家shop_settle.fid
     *
     * @param shop_id 商家shop_settle.fid
     */
    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    /**
     * 获取摊位branch_info.fid
     *
     * @return 摊位branch_info
     */
    public Integer getBranch_id() {
        return this.branch_id;
    }

    /**
     * 设置摊位branch_info.fid
     *
     * @param branch_id 摊位branch_info.fid
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
     * 获取上级参数pos_setting.fid
     *
     * @return 上级参数pos_setting
     */
    public Integer getFfid() {
        return this.ffid;
    }

    /**
     * 设置上级参数pos_setting.fid
     *
     * @param ffid 上级参数pos_setting.fid
     */
    public void setFfid(Integer ffid) {
        this.ffid = ffid;
    }

    /**
     * 获取上级参数pos_setting.fid
     *
     * @return 上级参数pos_setting
     */
    public Integer getFather_id() {
        return this.father_id;
    }

    /**
     * 设置上级参数pos_setting.fid
     *
     * @param father_id 上级参数pos_setting.fid
     */
    public void setFather_id(Integer father_id) {
        this.father_id = father_id;
    }

    /**
     * 获取上级参数
     *
     * @return 上级参数
     */
    public Integer getLevel_id() {
        return this.level_id;
    }

    /**
     * 设置上级参数
     *
     * @param level_id 上级参数
     */
    public void setLevel_id(Integer level_id) {
        this.level_id = level_id;
    }

    /**
     * 获取参数名称
     *
     * @return 参数名称
     */
    public String getPara_name() {
        return this.para_name;
    }

    /**
     * 设置参数名称
     *
     * @param para_name 参数名称
     */
    public void setPara_name(String para_name) {
        this.para_name = para_name;
    }

    /**
     * 获取参数值
     *
     * @return 参数值
     */
    public String getPara_value() {
        return this.para_value;
    }

    /**
     * 设置参数值
     *
     * @param para_value 参数值
     */
    public void setPara_value(String para_value) {
        this.para_value = para_value;
    }

    /**
     * 获取参数范例
     *
     * @return 参数范例
     */
    public String getAll_value() {
        return this.all_value;
    }

    /**
     * 设置参数范例
     *
     * @param all_value 参数范例
     */
    public void setAll_value(String all_value) {
        this.all_value = all_value;
    }

    /**
     * 获取系统级
     *
     * @return 系统级
     */
    public int getIs_sys() {
        return this.is_sys;
    }

    /**
     * 设置系统级
     *
     * @param is_sys 系统级
     */
    public void setIs_sys(int is_sys) {
        this.is_sys = is_sys;
    }

    /**
     * 获取有效
     *
     * @return 有效
     */
    public Integer getIs_display() {
        return this.is_display;
    }

    /**
     * 设置有效
     *
     * @param is_display 有效
     */
    public void setIs_display(Integer is_display) {
        this.is_display = is_display;
    }

    /**
     * 获取参数,固定死的
     *
     * @return 参数
     */
    public Integer getSetting_id() {
        return this.setting_id;
    }

    /**
     * 设置参数,固定死的
     *
     * @param setting_id 参数,固定死的
     */
    public void setSetting_id(Integer setting_id) {
        this.setting_id = setting_id;
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