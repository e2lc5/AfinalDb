package net.tsz.afinal.demo.pos;

import androidx.annotation.NonNull;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品信息(pos_item_info)
 *
 * @author bianj
 * @version 1.0.0 2018-03-08
 */
@Table(name = "pos_item_info")
public class Pos_item_info implements java.io.Serializable, Comparable, Cloneable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = 6701161855019472408L;

    /**  */
    @Id(column = "fid")
    private Integer fid;

    /**
     * 商家shop_info.fid
     */
    @Property
    private String shop_id;

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
     * item_info.fid
     */
    @Property
    private Long item_id;

    /**
     * 商品编号
     */
    @Property
    private String item_code;

    /**
     * 商品名称
     */
    @Property
    private String item_name;

    /**
     * 商品简称
     */
    @Property
    private String sim_name;

    /**
     * 助记码
     */
    @Property
    private String short_name;

    /**
     * 条码
     */
    @Property
    private String barcode;

    /**
     * 价格类型1标准价格2称重商品3计件价格
     */
    @Property
    private Integer price_type;

    /**
     * 商品分类id
     */
    @Property
    private String shop_category_id;

    /**
     * 商品分类名称
     */
    @Property
    private String shop_category_name;

    /**
     * 商品分类路径
     */
    @Property
    private String shop_category_path;

    /**
     * 参考价
     */
    @Property
    private BigDecimal market_price;

    /**
     * 销售价
     */
    @Property
    private BigDecimal sale_price;

    /**
     * 库存单位
     */
    @Property
    private String stock_unit;

    /**
     * 状态0未启用1启用2作废
     */
    @Property
    private String status_id;

    /**
     * 图片链接
     */
    @Property
    private String image_url;

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
    public String getShop_id() {
        return this.shop_id;
    }

    /**
     * 设置商家shop_info.fid
     *
     * @param shop_id 商家shop_info.fid
     */
    public void setShop_id(String shop_id) {
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
     * 获取item_info.fid
     *
     * @return item_info
     */
    public Long getItem_id() {
        return this.item_id;
    }

    /**
     * 设置item_info.fid
     *
     * @param item_id item_info.fid
     */
    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    /**
     * 获取商品编号
     *
     * @return 商品编号
     */
    public String getItem_code() {
        return this.item_code;
    }

    /**
     * 设置商品编号
     *
     * @param item_code 商品编号
     */
    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    /**
     * 获取商品名称
     *
     * @return 商品名称
     */
    public String getItem_name() {
        return this.item_name;
    }

    /**
     * 设置商品名称
     *
     * @param item_name 商品名称
     */
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    /**
     * 获取商品简称
     *
     * @return 商品简称
     */
    public String getSim_name() {
        return this.sim_name;
    }

    /**
     * 设置商品简称
     *
     * @param sim_name 商品简称
     */
    public void setSim_name(String sim_name) {
        this.sim_name = sim_name;
    }

    /**
     * 获取助记码
     *
     * @return 助记码
     */
    public String getShort_name() {
        return this.short_name;
    }

    /**
     * 设置助记码
     *
     * @param short_name 助记码
     */
    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    /**
     * 获取条码
     *
     * @return 条码
     */
    public String getBarcode() {
        return this.barcode;
    }

    /**
     * 设置条码
     *
     * @param barcode 条码
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * 获取价格类型1标准价格2称重商品3计件价格
     *
     * @return 价格类型1标准价格2称重商品3计件价格
     */
    public Integer getPrice_type() {
        return this.price_type;
    }

    /**
     * 设置价格类型1标准价格2开放价格3称重商品4计件商品5时价商品6开放金额
     *
     * @param price_type 价格类型1标准价格2开放价格3称重商品4计件商品5时价商品6开放金额
     */
    public void setPrice_type(Integer price_type) {
        this.price_type = price_type;
    }

    /**
     * 获取商品分类id
     *
     * @return 商品分类id
     */
    public String getShop_category_id() {
        return this.shop_category_id;
    }

    /**
     * 设置商品分类id
     *
     * @param shop_category_id 商品分类id
     */
    public void setShop_category_id(String shop_category_id) {
        this.shop_category_id = shop_category_id;
    }

    /**
     * 获取商品分类名称
     *
     * @return 商品分类名称
     */
    public String getShop_category_name() {
        return this.shop_category_name;
    }

    /**
     * 设置商品分类名称
     *
     * @param shop_category_name 商品分类名称
     */
    public void setShop_category_name(String shop_category_name) {
        this.shop_category_name = shop_category_name;
    }

    /**
     * 获取商品分类路径
     *
     * @return 商品分类路径
     */
    public String getShop_category_path() {
        return this.shop_category_path;
    }

    /**
     * 设置商品分类路径
     *
     * @param shop_category_path 商品分类路径
     */
    public void setShop_category_path(String shop_category_path) {
        this.shop_category_path = shop_category_path;
    }

    /**
     * 获取参考价
     *
     * @return 参考价
     */
    public BigDecimal getMarket_price() {
        return this.market_price;
    }

    /**
     * 设置参考价
     *
     * @param market_price 参考价
     */
    public void setMarket_price(BigDecimal market_price) {
        this.market_price = market_price;
    }

    /**
     * 获取销售价
     *
     * @return 销售价
     */
    public BigDecimal getSale_price() {
        return this.sale_price;
    }

    /**
     * 设置销售价
     *
     * @param sale_price 销售价
     */
    public void setSale_price(BigDecimal sale_price) {
        this.sale_price = sale_price;
    }

    /**
     * 获取库存单位
     *
     * @return 库存单位
     */
    public String getStock_unit() {
        return this.stock_unit;
    }

    /**
     * 设置库存单位
     *
     * @param stock_unit 库存单位
     */
    public void setStock_unit(String stock_unit) {
        this.stock_unit = stock_unit;
    }

    /**
     * 获取状态1新品引进2新品试销3正常品4停止订货5停止销售6作废商品
     *
     * @return 状态1新品引进2新品试销3正常品4停止订货5停止销售6作废商品
     */
    public String getStatus_id() {
        return this.status_id;
    }

    /**
     * 设置状态1新品引进2新品试销3正常品4停止订货5停止销售6作废商品
     *
     * @param status_id 状态1新品引进2新品试销3正常品4停止订货5停止销售6作废商品
     */
    public void setStatus_id(String status_id) {
        this.status_id = status_id;
    }

    /**
     * 获取图片链接
     *
     * @return 图片链接
     */
    public String getImage_url() {
        return this.image_url;
    }

    /**
     * 设置图片链接
     *
     * @param image_url 图片链接
     */
    public void setImage_url(String image_url) {
        this.image_url = image_url;
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

    @Override
    public int compareTo(@NonNull Object o) {
        if (o instanceof Pos_trade_item) {
            Pos_trade_item tmp = (Pos_trade_item) o;
            if (tmp.getItem_id() == this.getItem_id()) {
                return 0;
            }
        } else if (o instanceof Pos_item_info) {
            Pos_item_info tmp = (Pos_item_info) o;
            if (tmp.getItem_id() == this.getItem_id()) {
                return 0;
            }
        }
        return -1;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}