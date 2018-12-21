package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.util.Date;

/**
 * POS客显屏(pos_second_scrn)
 *
 * @author bianj
 * @version 1.0.0 2018-03-12
 */
@Table(name = "pos_second_scrn")
public class Pos_second_scrn implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = 3168449501904314545L;

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
     * 原单据bill_id
     */
    @Property
    private Long bill_id;

    /**
     * 标题
     */
    @Property
    private String title;

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
     * 类型:1商品图片2广告3商家信息4追溯码
     */
    @Property
    private Integer type_id;

    /**
     * 广告文件组
     */
    @Property
    private String file_names;

    /**
     * 滚动条设置1
     */
    @Property
    private String display_memo1;

    /**
     * 是否显示
     */
    @Property
    private Integer is_display1;

    /**
     * 滚动条设置2
     */
    @Property
    private String display_memo2;

    /**
     * 是否显示
     */
    @Property
    private Integer is_display2;

    /**
     * 滚动条设置3
     */
    @Property
    private String display_memo3;

    /**
     * 是否显示
     */
    @Property
    private Integer is_display3;

    /**
     * 滚动条设置4
     */
    @Property
    private String display_memo4;

    /**
     * 是否显示
     */
    @Property
    private Integer is_display4;

    /**
     * 滚动条设置5
     */
    @Property
    private String display_memo5;

    /**
     * 是否显示
     */
    @Property
    private Integer is_display5;

    /**
     * 滚动条设置6
     */
    @Property
    private String display_memo6;

    /**
     * 是否显示
     */
    @Property
    private Integer is_display6;

    /**
     * LOGO图片
     */
    @Property
    private String logo_url;

    /**
     * 状态:1录入2提交3审核4作废
     */
    @Property
    private Integer status_id;

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

    @Property
    private Integer is_download;

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
     * 获取标题
     *
     * @return 标题
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
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
     * 获取类型:1商品图片2广告3商家信息4追溯码
     *
     * @return 类型
     */
    public Integer getType_id() {
        return this.type_id;
    }

    /**
     * 设置类型:1商品图片2广告3商家信息4追溯码
     *
     * @param type_id 类型:1商品图片2广告3商家信息4追溯码
     */
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    /**
     * 获取广告文件组
     *
     * @return 广告文件组
     */
    public String getFile_names() {
        return this.file_names;
    }

    /**
     * 设置广告文件组
     *
     * @param file_names 广告文件组
     */
    public void setFile_names(String file_names) {
        this.file_names = file_names;
    }

    /**
     * 获取滚动条设置1
     *
     * @return 滚动条设置1
     */
    public String getDisplay_memo1() {
        return this.display_memo1;
    }

    /**
     * 设置滚动条设置1
     *
     * @param display_memo1 滚动条设置1
     */
    public void setDisplay_memo1(String display_memo1) {
        this.display_memo1 = display_memo1;
    }

    /**
     * 获取是否显示
     *
     * @return 是否显示
     */
    public Integer getIs_display1() {
        return this.is_display1;
    }

    /**
     * 设置是否显示
     *
     * @param is_display1 是否显示
     */
    public void setIs_display1(Integer is_display1) {
        this.is_display1 = is_display1;
    }

    /**
     * 获取滚动条设置2
     *
     * @return 滚动条设置2
     */
    public String getDisplay_memo2() {
        return this.display_memo2;
    }

    /**
     * 设置滚动条设置2
     *
     * @param display_memo2 滚动条设置2
     */
    public void setDisplay_memo2(String display_memo2) {
        this.display_memo2 = display_memo2;
    }

    /**
     * 获取是否显示
     *
     * @return 是否显示
     */
    public Integer getIs_display2() {
        return this.is_display2;
    }

    /**
     * 设置是否显示
     *
     * @param is_display2 是否显示
     */
    public void setIs_display2(Integer is_display2) {
        this.is_display2 = is_display2;
    }

    /**
     * 获取滚动条设置3
     *
     * @return 滚动条设置3
     */
    public String getDisplay_memo3() {
        return this.display_memo3;
    }

    /**
     * 设置滚动条设置3
     *
     * @param display_memo3 滚动条设置3
     */
    public void setDisplay_memo3(String display_memo3) {
        this.display_memo3 = display_memo3;
    }

    /**
     * 获取是否显示
     *
     * @return 是否显示
     */
    public Integer getIs_display3() {
        return this.is_display3;
    }

    /**
     * 设置是否显示
     *
     * @param is_display3 是否显示
     */
    public void setIs_display3(Integer is_display3) {
        this.is_display3 = is_display3;
    }

    /**
     * 获取滚动条设置4
     *
     * @return 滚动条设置4
     */
    public String getDisplay_memo4() {
        return this.display_memo4;
    }

    /**
     * 设置滚动条设置4
     *
     * @param display_memo4 滚动条设置4
     */
    public void setDisplay_memo4(String display_memo4) {
        this.display_memo4 = display_memo4;
    }

    /**
     * 获取是否显示
     *
     * @return 是否显示
     */
    public Integer getIs_display4() {
        return this.is_display4;
    }

    /**
     * 设置是否显示
     *
     * @param is_display4 是否显示
     */
    public void setIs_display4(Integer is_display4) {
        this.is_display4 = is_display4;
    }

    /**
     * 获取滚动条设置5
     *
     * @return 滚动条设置5
     */
    public String getDisplay_memo5() {
        return this.display_memo5;
    }

    /**
     * 设置滚动条设置5
     *
     * @param display_memo5 滚动条设置5
     */
    public void setDisplay_memo5(String display_memo5) {
        this.display_memo5 = display_memo5;
    }

    /**
     * 获取是否显示
     *
     * @return 是否显示
     */
    public Integer getIs_display5() {
        return this.is_display5;
    }

    /**
     * 设置是否显示
     *
     * @param is_display5 是否显示
     */
    public void setIs_display5(Integer is_display5) {
        this.is_display5 = is_display5;
    }

    /**
     * 获取滚动条设置6
     *
     * @return 滚动条设置6
     */
    public String getDisplay_memo6() {
        return this.display_memo6;
    }

    /**
     * 设置滚动条设置6
     *
     * @param display_memo6 滚动条设置6
     */
    public void setDisplay_memo6(String display_memo6) {
        this.display_memo6 = display_memo6;
    }

    /**
     * 获取是否显示
     *
     * @return 是否显示
     */
    public Integer getIs_display6() {
        return this.is_display6;
    }

    /**
     * 设置是否显示
     *
     * @param is_display6 是否显示
     */
    public void setIs_display6(Integer is_display6) {
        this.is_display6 = is_display6;
    }

    /**
     * 获取LOGO图片
     *
     * @return LOGO图片
     */
    public String getLogo_url() {
        return this.logo_url;
    }

    /**
     * 设置LOGO图片
     *
     * @param logo_url LOGO图片
     */
    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }

    /**
     * 获取状态:1录入2提交3审核4作废
     *
     * @return 状态
     */
    public Integer getStatus_id() {
        return this.status_id;
    }

    /**
     * 设置状态:1录入2提交3审核4作废
     *
     * @param status_id 状态:1录入2提交3审核4作废
     */
    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
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

    public Integer getIs_download() {
        return is_download;
    }

    public void setIs_download(Integer is_download) {
        this.is_download = is_download;
    }
}