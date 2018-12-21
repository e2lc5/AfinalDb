package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.util.Date;

/**
 * POS参数(pos_para)
 *
 * @author bianj
 * @version 1.0.0 2018-03-09
 */
@Table(name = "pos_para")
public class Pos_para implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = -3029106599324160616L;

    /**  */
    @Id(column = "fid")
    private Integer fid;

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
     * 参数ID
     */
    @Property
    private Integer para_id;

    /**
     * 上级参数
     */
    @Property
    private Integer father_id;

    /**
     * 参数名称
     */
    @Property
    private String para_name;

    /**
     * 参数值
     */
    @Property
    private String para_value1;

    /**
     * 参数值
     */
    @Property
    private String para_value2;

    /**
     * 参数值
     */
    @Property
    private String para_value3;

    /**
     * 参数值
     */
    @Property
    private String para_value4;

    /**
     * 参数值5
     */
    @Property
    private String para_value5;

    /**
     * 参数范例
     */
    @Property
    private String para_demo;

    /**
     * 录入方式:1录入2单选3多选4日期5上传文件
     */
    @Property
    private Integer input_type;

    /**
     * 系统级
     */
    @Property
    private int is_sys;

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
     * 获取参数ID
     *
     * @return 参数ID
     */
    public Integer getPara_id() {
        return this.para_id;
    }

    /**
     * 设置参数ID
     *
     * @param para_id 参数ID
     */
    public void setPara_id(Integer para_id) {
        this.para_id = para_id;
    }

    /**
     * 获取上级参数
     *
     * @return 上级参数
     */
    public Integer getFather_id() {
        return this.father_id;
    }

    /**
     * 设置上级参数
     *
     * @param father_id 上级参数
     */
    public void setFather_id(Integer father_id) {
        this.father_id = father_id;
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
    public String getPara_value1() {
        return this.para_value1;
    }

    /**
     * 设置参数值
     *
     * @param para_value1 参数值
     */
    public void setPara_value1(String para_value1) {
        this.para_value1 = para_value1;
    }

    /**
     * 获取参数值
     *
     * @return 参数值
     */
    public String getPara_value2() {
        return this.para_value2;
    }

    /**
     * 设置参数值
     *
     * @param para_value2 参数值
     */
    public void setPara_value2(String para_value2) {
        this.para_value2 = para_value2;
    }

    /**
     * 获取参数值
     *
     * @return 参数值
     */
    public String getPara_value3() {
        return this.para_value3;
    }

    /**
     * 设置参数值
     *
     * @param para_value3 参数值
     */
    public void setPara_value3(String para_value3) {
        this.para_value3 = para_value3;
    }

    /**
     * 获取参数值
     *
     * @return 参数值
     */
    public String getPara_value4() {
        return this.para_value4;
    }

    /**
     * 设置参数值
     *
     * @param para_value4 参数值
     */
    public void setPara_value4(String para_value4) {
        this.para_value4 = para_value4;
    }

    /**
     * 获取参数值5
     *
     * @return 参数值5
     */
    public String getPara_value5() {
        return this.para_value5;
    }

    /**
     * 设置参数值5
     *
     * @param para_value5 参数值5
     */
    public void setPara_value5(String para_value5) {
        this.para_value5 = para_value5;
    }

    /**
     * 获取参数范例
     *
     * @return 参数范例
     */
    public String getPara_demo() {
        return this.para_demo;
    }

    /**
     * 设置参数范例
     *
     * @param para_demo 参数范例
     */
    public void setPara_demo(String para_demo) {
        this.para_demo = para_demo;
    }

    /**
     * 获取录入方式:1录入2单选3多选4日期5上传文件
     *
     * @return 录入方式
     */
    public Integer getInput_type() {
        return this.input_type;
    }

    /**
     * 设置录入方式:1录入2单选3多选4日期5上传文件
     *
     * @param input_type 录入方式:1录入2单选3多选4日期5上传文件
     */
    public void setInput_type(Integer input_type) {
        this.input_type = input_type;
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