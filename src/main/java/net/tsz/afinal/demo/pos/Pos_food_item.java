package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.util.Date;

/**
 * 菜品信息(pos_food_item)
 *
 * @author bianj
 * @version 1.0.0 2018-03-09
 */
@Table(name = "pos_food_item")
public class Pos_food_item implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = 1576391499790796955L;

    /**  */
    @Id(column = "fid")
    private Integer fid;

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
     * 商品ID:item_info.fid
     */
    @Property
    private Integer item_id;

    /**
     * 菜品分类id
     */
    @Property
    private Integer food_category_id;

    /**
     * 分类路径
     */
    @Property
    private String category_path;

    /**
     * 排序
     */
    @Property
    private Integer findex;

    /**
     * 可用
     */
    @Property
    private int is_used;

    /**
     * 字体名称
     */
    @Property
    private String font_name;

    /**
     * 字体颜色
     */
    @Property
    private String font_color;

    /**
     * 字体大小
     */
    @Property
    private Integer font_size;

    /**
     * 厨打服务器
     */
    @Property
    private String print_server;

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
     * 获取商品ID:item_info.fid
     *
     * @return 商品ID
     */
    public Integer getItem_id() {
        return this.item_id;
    }

    /**
     * 设置商品ID:item_info.fid
     *
     * @param item_id 商品ID:item_info.fid
     */
    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    /**
     * 获取菜品分类id
     *
     * @return 菜品分类id
     */
    public Integer getFood_category_id() {
        return this.food_category_id;
    }

    /**
     * 设置菜品分类id
     *
     * @param food_category_id 菜品分类id
     */
    public void setFood_category_id(Integer food_category_id) {
        this.food_category_id = food_category_id;
    }

    /**
     * 获取分类路径
     *
     * @return 分类路径
     */
    public String getCategory_path() {
        return this.category_path;
    }

    /**
     * 设置分类路径
     *
     * @param category_path 分类路径
     */
    public void setCategory_path(String category_path) {
        this.category_path = category_path;
    }

    /**
     * 获取排序
     *
     * @return 排序
     */
    public Integer getFindex() {
        return this.findex;
    }

    /**
     * 设置排序
     *
     * @param findex 排序
     */
    public void setFindex(Integer findex) {
        this.findex = findex;
    }

    /**
     * 获取可用
     *
     * @return 可用
     */
    public int getIs_used() {
        return this.is_used;
    }

    /**
     * 设置可用
     *
     * @param is_used 可用
     */
    public void setIs_used(int is_used) {
        this.is_used = is_used;
    }

    /**
     * 获取字体名称
     *
     * @return 字体名称
     */
    public String getFont_name() {
        return this.font_name;
    }

    /**
     * 设置字体名称
     *
     * @param font_name 字体名称
     */
    public void setFont_name(String font_name) {
        this.font_name = font_name;
    }

    /**
     * 获取字体颜色
     *
     * @return 字体颜色
     */
    public String getFont_color() {
        return this.font_color;
    }

    /**
     * 设置字体颜色
     *
     * @param font_color 字体颜色
     */
    public void setFont_color(String font_color) {
        this.font_color = font_color;
    }

    /**
     * 获取字体大小
     *
     * @return 字体大小
     */
    public Integer getFont_size() {
        return this.font_size;
    }

    /**
     * 设置字体大小
     *
     * @param font_size 字体大小
     */
    public void setFont_size(Integer font_size) {
        this.font_size = font_size;
    }

    /**
     * 获取厨打服务器
     *
     * @return 厨打服务器
     */
    public String getPrint_server() {
        return this.print_server;
    }

    /**
     * 设置厨打服务器
     *
     * @param print_server 厨打服务器
     */
    public void setPrint_server(String print_server) {
        this.print_server = print_server;
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