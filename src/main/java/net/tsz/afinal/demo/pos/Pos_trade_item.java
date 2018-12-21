package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.math.BigDecimal;
import java.util.Date;

/**
 * POS交易明细(pos_trade_item)
 *
 * @author bianj
 * @version 1.0.0 2018-03-09
 */
@Table(name = "pos_trade_item")
public class Pos_trade_item implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = -765602853359056014L;

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
     * 交易单号
     */
    @Property
    private String pos_trade_id;

    /**
     * 明细序号,每笔交易从1开始
     */
    @Property
    private Integer entry_id;

    /**
     * 明细类型1正常交易2负向交易3交易取消4明细作废
     */
    @Property
    private Integer dtl_id;

    /**
     * 新增时间
     */
    @Property
    private Date create_time;

    /**
     * 修改时间
     */
    @Property
    private Date modified_time;

    /**
     * 商品pos_item_info.fid
     */
    @Property
    private Long item_id;

    /**
     * 商品编号
     */
    @Property
    private String item_code;

    /**
     * 条码
     */
    @Property
    private String barcode;

    /**
     * 商品名称
     */
    @Property
    private String item_name;

    /**
     * 库存单位
     */
    @Property
    private String stock_unit;

    /**
     * 商品分类shop_category.fid
     */
    @Property
    private Integer shop_category_id;

    /**
     * 销售价
     */
    @Property
    private BigDecimal sale_price;

    /**
     * 成交价
     */
    @Property
    private BigDecimal unit_price;

    /**
     * 交易数量/重量
     */
    @Property
    private BigDecimal buy_number;

    /**
     * 去皮
     */
    @Property
    private BigDecimal net_weight;

    /**
     * 单品折扣金额=(sale_price-unit_price)*buy_number
     */
    @Property
    private BigDecimal discount_money;

    /**
     * 商品金额=unit_price*buy_number
     */
    @Property
    private BigDecimal goods_money;

    /**
     * 交易图片
     */
    @Property
    private String image_url;

    /**
     * 时间戳
     */
    @Property
    private Long ver;

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
     * 获取交易单号
     *
     * @return 交易单号
     */
    public String getPos_trade_id() {
        return this.pos_trade_id;
    }

    /**
     * 设置交易单号
     *
     * @param pos_trade_id 交易单号
     */
    public void setPos_trade_id(String pos_trade_id) {
        this.pos_trade_id = pos_trade_id;
    }

    /**
     * 获取明细序号,每笔交易从1开始
     *
     * @return 明细序号
     */
    public Integer getEntry_id() {
        return this.entry_id;
    }

    /**
     * 设置明细序号,每笔交易从1开始
     *
     * @param entry_id 明细序号,每笔交易从1开始
     */
    public void setEntry_id(Integer entry_id) {
        this.entry_id = entry_id;
    }

    /**
     * 获取明细类型1正常交易2负向交易3交易取消4明细作废
     *
     * @return 明细类型1正常交易2负向交易3交易取消4明细作废
     */
    public Integer getDtl_id() {
        return this.dtl_id;
    }

    /**
     * 设置明细类型1正常交易2负向交易3交易取消4明细作废
     *
     * @param dtl_id 明细类型1正常交易2负向交易3交易取消4明细作废
     */
    public void setDtl_id(Integer dtl_id) {
        this.dtl_id = dtl_id;
    }

    /**
     * 获取新增时间
     *
     * @return 新增时间
     */
    public Date getCreate_time() {
        return this.create_time;
    }

    /**
     * 设置新增时间
     *
     * @param create_time 新增时间
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    /**
     * 获取修改时间
     *
     * @return 修改时间
     */
    public Date getModified_time() {
        return this.modified_time;
    }

    /**
     * 设置修改时间
     *
     * @param modified_time 修改时间
     */
    public void setModified_time(Date modified_time) {
        this.modified_time = modified_time;
    }

    /**
     * 获取商品pos_item_info.fid
     *
     * @return 商品pos_item_info
     */
    public Long getItem_id() {
        return this.item_id;
    }

    /**
     * 设置商品pos_item_info.fid
     *
     * @param item_id 商品pos_item_info.fid
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
     * 获取商品分类shop_category.fid
     *
     * @return 商品分类shop_category
     */
    public Integer getShop_category_id() {
        return this.shop_category_id;
    }

    /**
     * 设置商品分类shop_category.fid
     *
     * @param shop_category_id 商品分类shop_category.fid
     */
    public void setShop_category_id(Integer shop_category_id) {
        this.shop_category_id = shop_category_id;
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
     * 获取成交价
     *
     * @return 成交价
     */
    public BigDecimal getUnit_price() {
        return this.unit_price;
    }

    /**
     * 设置成交价
     *
     * @param unit_price 成交价
     */
    public void setUnit_price(BigDecimal unit_price) {
        this.unit_price = unit_price;
    }

    /**
     * 获取交易数量/重量
     *
     * @return 交易数量/重量
     */
    public BigDecimal getBuy_number() {
        return this.buy_number;
    }

    /**
     * 设置交易数量/重量
     *
     * @param buy_number 交易数量/重量
     */
    public void setBuy_number(BigDecimal buy_number) {
        this.buy_number = buy_number;
    }

    /**
     * 获取去皮
     *
     * @return 去皮
     */
    public BigDecimal getNet_weight() {
        return this.net_weight;
    }

    /**
     * 设置去皮
     *
     * @param net_weight 去皮
     */
    public void setNet_weight(BigDecimal net_weight) {
        this.net_weight = net_weight;
    }

    /**
     * 获取单品折扣金额=(sale_price-unit_price)*buy_number
     *
     * @return 单品折扣金额=(sale_price-unit_price)*buy_number
     */
    public BigDecimal getDiscount_money() {
        return this.discount_money;
    }

    /**
     * 设置单品折扣金额=(sale_price-unit_price)*buy_number
     *
     * @param discount_money 单品折扣金额=(sale_price-unit_price)*buy_number
     */
    public void setDiscount_money(BigDecimal discount_money) {
        this.discount_money = discount_money;
    }

    /**
     * 获取商品金额=unit_price*buy_number
     *
     * @return 商品金额=unit_price*buy_number
     */
    public BigDecimal getGoods_money() {
        return this.goods_money;
    }

    /**
     * 设置商品金额=unit_price*buy_number
     *
     * @param goods_money 商品金额=unit_price*buy_number
     */
    public void setGoods_money(BigDecimal goods_money) {
        this.goods_money = goods_money;
    }

    /**
     * 获取交易图片
     *
     * @return 交易图片
     */
    public String getImage_url() {
        return this.image_url;
    }

    /**
     * 设置交易图片
     *
     * @param image_url 交易图片
     */
    public void setImage_url(String image_url) {
        this.image_url = image_url;
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

    public int getIs_upload() {
        return is_upload;
    }

    public void setIs_upload(int is_upload) {
        this.is_upload = is_upload;
    }
}