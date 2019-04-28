package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 进货管理-快速入库(pos_receive_fast)
 *
 * @author bianj
 * @version 1.0.0 2018-03-16
 */
@Table(name = "pos_receive_fast")
public class Pos_receive_fast implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = -5771165490305677719L;

    /**  */
    @Id(column = "fid")
    private Integer fid;

    /**
     * 商家shop_settle.fid
     */
    @Property
    private Integer shop_id;

    /**
     * 采购组织branch_info.fid
     */
    @Property
    private Integer branch_id;

    /**
     * 进货单号
     */
    @Property
    private String receive_num;

    /**
     * 开单日期
     */
    @Property
    private Date sys_date;

    /**
     * 单据类型:1验收入库2退货出库
     */
    @Property
    private Integer type_id;

    /**
     * 商品item_info.fid
     */
    @Property
    private Integer item_id;

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
     * 库存单位
     */
    @Property
    private String stock_unit;

    /**
     * 合同进价
     */
    @Property
    private BigDecimal stock_price;

    /**
     * 验收量
     */
    @Property
    private BigDecimal receive_qty;

    /**
     * 成本金额
     */
    @Property
    private BigDecimal cost_amount;

    /**
     * 进货图片
     */
    @Property
    private String image_url;

    /**
     * 供应商id
     */
    @Property
    private Integer supplier_id;

    /**
     * 供应商名称
     */
    @Property
    private String supplier_name;

    /**
     * 联系电话
     */
    @Property
    private String telno;

    /**
     * 进货地址
     */
    @Property
    private String address;

    /**
     * 追溯码
     */
    @Property
    private String trace_num;

    /**
     * 检疫单号
     */
    @Property
    private String quarantine_num;

    /**
     * 批次号
     */
    @Property
    private Long batch_id;

    /**
     * 有效期
     */
    @Property
    private Date period_date;

    /**
     * 是否已经上传
     */
    @Property
    private Integer is_upload = 0;

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
     * 获取采购组织branch_info.fid
     *
     * @return 采购组织branch_info
     */
    public Integer getBranch_id() {
        return this.branch_id;
    }

    /**
     * 设置采购组织branch_info.fid
     *
     * @param branch_id 采购组织branch_info.fid
     */
    public void setBranch_id(Integer branch_id) {
        this.branch_id = branch_id;
    }

    /**
     * 获取进货单号
     *
     * @return 进货单号
     */
    public String getReceive_num() {
        return this.receive_num;
    }

    /**
     * 设置进货单号
     *
     * @param receive_num 进货单号
     */
    public void setReceive_num(String receive_num) {
        this.receive_num = receive_num;
    }

    /**
     * 获取开单日期
     *
     * @return 开单日期
     */
    public Date getSys_date() {
        return this.sys_date;
    }

    /**
     * 设置开单日期
     *
     * @param sys_date 开单日期
     */
    public void setSys_date(Date sys_date) {
        this.sys_date = sys_date;
    }

    /**
     * 获取单据类型:1验收入库2退货出库
     *
     * @return 单据类型
     */
    public Integer getType_id() {
        return this.type_id;
    }

    /**
     * 设置单据类型:1验收入库2退货出库
     *
     * @param type_id 单据类型:1验收入库2退货出库
     */
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    /**
     * 获取商品item_info.fid
     *
     * @return 商品item_info
     */
    public Integer getItem_id() {
        return this.item_id;
    }

    /**
     * 设置商品item_info.fid
     *
     * @param item_id 商品item_info.fid
     */
    public void setItem_id(Integer item_id) {
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
     * 获取合同进价
     *
     * @return 合同进价
     */
    public BigDecimal getStock_price() {
        return this.stock_price;
    }

    /**
     * 设置合同进价
     *
     * @param stock_price 合同进价
     */
    public void setStock_price(BigDecimal stock_price) {
        this.stock_price = stock_price;
    }

    /**
     * 获取验收量
     *
     * @return 验收量
     */
    public BigDecimal getReceive_qty() {
        return this.receive_qty;
    }

    /**
     * 设置验收量
     *
     * @param receive_qty 验收量
     */
    public void setReceive_qty(BigDecimal receive_qty) {
        this.receive_qty = receive_qty;
    }

    /**
     * 获取成本金额
     *
     * @return 成本金额
     */
    public BigDecimal getCost_amount() {
        return this.cost_amount;
    }

    /**
     * 设置成本金额
     *
     * @param cost_amount 成本金额
     */
    public void setCost_amount(BigDecimal cost_amount) {
        this.cost_amount = cost_amount;
    }

    /**
     * 获取进货图片
     *
     * @return 进货图片
     */
    public String getImage_url() {
        return this.image_url;
    }

    /**
     * 设置进货图片
     *
     * @param image_url 进货图片
     */
    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    /**
     * 获取供应商id
     *
     * @return 供应商id
     */
    public Integer getSupplier_id() {
        return this.supplier_id;
    }

    /**
     * 设置供应商id
     *
     * @param supplier_id 供应商id
     */
    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    /**
     * 获取供应商名称
     *
     * @return 供应商名称
     */
    public String getSupplier_name() {
        return this.supplier_name;
    }

    /**
     * 设置供应商名称
     *
     * @param supplier_name 供应商名称
     */
    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    /**
     * 获取联系电话
     *
     * @return 联系电话
     */
    public String getTelno() {
        return this.telno;
    }

    /**
     * 设置联系电话
     *
     * @param telno 联系电话
     */
    public void setTelno(String telno) {
        this.telno = telno;
    }

    /**
     * 获取进货地址
     *
     * @return 进货地址
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * 设置进货地址
     *
     * @param address 进货地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取追溯码
     *
     * @return 追溯码
     */
    public String getTrace_num() {
        return this.trace_num;
    }

    /**
     * 设置追溯码
     *
     * @param trace_num 追溯码
     */
    public void setTrace_num(String trace_num) {
        this.trace_num = trace_num;
    }

    /**
     * 获取检疫单号
     *
     * @return 检疫单号
     */
    public String getQuarantine_num() {
        return this.quarantine_num;
    }

    /**
     * 设置检疫单号
     *
     * @param quarantine_num 检疫单号
     */
    public void setQuarantine_num(String quarantine_num) {
        this.quarantine_num = quarantine_num;
    }

    /**
     * 获取批次号
     *
     * @return 批次号
     */
    public Long getBatch_id() {
        return this.batch_id;
    }

    /**
     * 设置批次号
     *
     * @param batch_id 批次号
     */
    public void setBatch_id(Long batch_id) {
        this.batch_id = batch_id;
    }

    /**
     * 获取有效期
     *
     * @return 有效期
     */
    public Date getPeriod_date() {
        return this.period_date;
    }

    /**
     * 设置有效期
     *
     * @param period_date 有效期
     */
    public void setPeriod_date(Date period_date) {
        this.period_date = period_date;
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