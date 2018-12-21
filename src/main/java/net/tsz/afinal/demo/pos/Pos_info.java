package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.math.BigDecimal;
import java.util.Date;

/**
 * POS信息(pos_info)
 *
 * @author bianj
 * @version 1.0.0 2018-03-08
 */
@Table(name = "pos_info")
public class Pos_info implements java.io.Serializable {
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = 1971429229322934369L;

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
     * POS名称
     */
    @Property
    private String pos_name;

    /**
     * 商品部门shop_dept.fid
     */
    @Property
    private Integer dept_id;

    /**
     * 登录用户
     */
    @Property
    private String login_user;

    /**
     * 登录时间
     */
    @Property
    private Date login_time;

    /**
     * 登录IP
     */
    @Property
    private String login_ip;

    /**
     * POS状态0未连接1连机2交易3空闲
     */
    @Property
    private Integer pos_status;

    /**
     * 当前交易金额
     */
    @Property
    private BigDecimal sale_amount;

    /**
     * 用户备注
     */
    @Property
    private String memo1;

    /**
     * 是否需要下载数据
     */
    @Property
    private Integer is_down_data;

    /**
     * 下载时间
     */
    @Property
    private Date down_time;

    /**
     * 下载版本号
     */
    @Property
    private Long down_ver;

    /**
     * 上传时间
     */
    @Property
    private Date up_time;

    /**
     * 上传版本号
     */
    @Property
    private Long up_ver;

    /**
     * mac地址
     */
    @Property
    private String mac_code;

    /**
     * CPU序列号
     */
    @Property
    private String cpu_id;

    /**
     * 注册码
     */
    @Property
    private String register_code;

    /**
     * 版本号
     */
    @Property
    private String version_id;

    /**
     * 生效
     */
    @Property
    private Integer status_id;

    /**
     * 到期日
     */
    @Property
    private Date stop_date;

    /**
     * 屏幕类型1单品2双屏
     */
    @Property
    private Integer scrn_type;

    /**
     * 屏幕尺寸10151721
     */
    @Property
    private Integer scrn_size;

    /**
     * OS类型1windows2linux3安卓
     */
    @Property
    private Integer os_type;

    /**
     * 1POS机2电子秤
     */
    @Property
    private Integer pos_type;

    /**
     * 可用支付pay_info.fid
     */
    @Property
    private String pay_ids;

    /**
     * 消息推送ID
     */
    @Property
    private String msmq_id;

    /**
     * 开票项目
     */
    @Property
    private String invoice_project;

    /**
     * 开票税号
     */
    @Property
    private String invoice_taxno;

    /**
     * 打印促销内容
     */
    @Property
    private String print_prom;

    /**
     * 开票销售方名称
     */
    @Property
    private String invoice_xsf_mc;

    /**
     * 开票销售方地址电话
     */
    @Property
    private String invoice_xsf_dzdh;

    /**
     * 开票销售方银行账户
     */
    @Property
    private String invoice_xsf_yhzh;

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
     * 获取POS名称
     *
     * @return POS名称
     */
    public String getPos_name() {
        return this.pos_name;
    }

    /**
     * 设置POS名称
     *
     * @param pos_name POS名称
     */
    public void setPos_name(String pos_name) {
        this.pos_name = pos_name;
    }

    /**
     * 获取商品部门shop_dept.fid
     *
     * @return 商品部门shop_dept
     */
    public Integer getDept_id() {
        return this.dept_id;
    }

    /**
     * 设置商品部门shop_dept.fid
     *
     * @param dept_id 商品部门shop_dept.fid
     */
    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    /**
     * 获取登录用户
     *
     * @return 登录用户
     */
    public String getLogin_user() {
        return this.login_user;
    }

    /**
     * 设置登录用户
     *
     * @param login_user 登录用户
     */
    public void setLogin_user(String login_user) {
        this.login_user = login_user;
    }

    /**
     * 获取登录时间
     *
     * @return 登录时间
     */
    public Date getLogin_time() {
        return this.login_time;
    }

    /**
     * 设置登录时间
     *
     * @param login_time 登录时间
     */
    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    /**
     * 获取登录IP
     *
     * @return 登录IP
     */
    public String getLogin_ip() {
        return this.login_ip;
    }

    /**
     * 设置登录IP
     *
     * @param login_ip 登录IP
     */
    public void setLogin_ip(String login_ip) {
        this.login_ip = login_ip;
    }

    /**
     * 获取POS状态0未连接1连机2交易3空闲
     *
     * @return POS状态0未连接1连机2交易3空闲
     */
    public Integer getPos_status() {
        return this.pos_status;
    }

    /**
     * 设置POS状态0未连接1连机2交易3空闲
     *
     * @param pos_status POS状态0未连接1连机2交易3空闲
     */
    public void setPos_status(Integer pos_status) {
        this.pos_status = pos_status;
    }

    /**
     * 获取当前交易金额
     *
     * @return 当前交易金额
     */
    public BigDecimal getSale_amount() {
        return this.sale_amount;
    }

    /**
     * 设置当前交易金额
     *
     * @param sale_amount 当前交易金额
     */
    public void setSale_amount(BigDecimal sale_amount) {
        this.sale_amount = sale_amount;
    }

    /**
     * 获取用户备注
     *
     * @return 用户备注
     */
    public String getMemo1() {
        return this.memo1;
    }

    /**
     * 设置用户备注
     *
     * @param memo1 用户备注
     */
    public void setMemo1(String memo1) {
        this.memo1 = memo1;
    }

    /**
     * 获取是否需要下载数据
     *
     * @return 是否需要下载数据
     */
    public Integer getIs_down_data() {
        return this.is_down_data;
    }

    /**
     * 设置是否需要下载数据
     *
     * @param is_down_data 是否需要下载数据
     */
    public void setIs_down_data(Integer is_down_data) {
        this.is_down_data = is_down_data;
    }

    /**
     * 获取下载时间
     *
     * @return 下载时间
     */
    public Date getDown_time() {
        return this.down_time;
    }

    /**
     * 设置下载时间
     *
     * @param down_time 下载时间
     */
    public void setDown_time(Date down_time) {
        this.down_time = down_time;
    }

    /**
     * 获取下载版本号
     *
     * @return 下载版本号
     */
    public Long getDown_ver() {
        return this.down_ver;
    }

    /**
     * 设置下载版本号
     *
     * @param down_ver 下载版本号
     */
    public void setDown_ver(Long down_ver) {
        this.down_ver = down_ver;
    }

    /**
     * 获取上传时间
     *
     * @return 上传时间
     */
    public Date getUp_time() {
        return this.up_time;
    }

    /**
     * 设置上传时间
     *
     * @param up_time 上传时间
     */
    public void setUp_time(Date up_time) {
        this.up_time = up_time;
    }

    /**
     * 获取上传版本号
     *
     * @return 上传版本号
     */
    public Long getUp_ver() {
        return this.up_ver;
    }

    /**
     * 设置上传版本号
     *
     * @param up_ver 上传版本号
     */
    public void setUp_ver(Long up_ver) {
        this.up_ver = up_ver;
    }

    /**
     * 获取mac地址
     *
     * @return mac地址
     */
    public String getMac_code() {
        return this.mac_code;
    }

    /**
     * 设置mac地址
     *
     * @param mac_code mac地址
     */
    public void setMac_code(String mac_code) {
        this.mac_code = mac_code;
    }

    /**
     * 获取CPU序列号
     *
     * @return CPU序列号
     */
    public String getCpu_id() {
        return this.cpu_id;
    }

    /**
     * 设置CPU序列号
     *
     * @param cpu_id CPU序列号
     */
    public void setCpu_id(String cpu_id) {
        this.cpu_id = cpu_id;
    }

    /**
     * 获取注册码
     *
     * @return 注册码
     */
    public String getRegister_code() {
        return this.register_code;
    }

    /**
     * 设置注册码
     *
     * @param register_code 注册码
     */
    public void setRegister_code(String register_code) {
        this.register_code = register_code;
    }

    /**
     * 获取版本号
     *
     * @return 版本号
     */
    public String getVersion_id() {
        return this.version_id;
    }

    /**
     * 设置版本号
     *
     * @param version_id 版本号
     */
    public void setVersion_id(String version_id) {
        this.version_id = version_id;
    }

    /**
     * 获取生效
     *
     * @return 生效
     */
    public Integer getStatus_id() {
        return this.status_id;
    }

    /**
     * 设置生效
     *
     * @param status_id 生效
     */
    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    /**
     * 获取到期日
     *
     * @return 到期日
     */
    public Date getStop_date() {
        return this.stop_date;
    }

    /**
     * 设置到期日
     *
     * @param stop_date 到期日
     */
    public void setStop_date(Date stop_date) {
        this.stop_date = stop_date;
    }

    /**
     * 获取屏幕类型1单品2双屏
     *
     * @return 屏幕类型1单品2双屏
     */
    public Integer getScrn_type() {
        return this.scrn_type;
    }

    /**
     * 设置屏幕类型1单品2双屏
     *
     * @param scrn_type 屏幕类型1单品2双屏
     */
    public void setScrn_type(Integer scrn_type) {
        this.scrn_type = scrn_type;
    }

    /**
     * 获取屏幕尺寸10151721
     *
     * @return 屏幕尺寸10151721
     */
    public Integer getScrn_size() {
        return this.scrn_size;
    }

    /**
     * 设置屏幕尺寸10151721
     *
     * @param scrn_size 屏幕尺寸10151721
     */
    public void setScrn_size(Integer scrn_size) {
        this.scrn_size = scrn_size;
    }

    /**
     * 获取OS类型1windows2linux3安卓
     *
     * @return OS类型1windows2linux3安卓
     */
    public Integer getOs_type() {
        return this.os_type;
    }

    /**
     * 设置OS类型1windows2linux3安卓
     *
     * @param os_type OS类型1windows2linux3安卓
     */
    public void setOs_type(Integer os_type) {
        this.os_type = os_type;
    }

    /**
     * 获取1POS机2电子秤
     *
     * @return 1POS机2电子秤
     */
    public Integer getPos_type() {
        return this.pos_type;
    }

    /**
     * 设置1POS机2电子秤
     *
     * @param pos_type 1POS机2电子秤
     */
    public void setPos_type(Integer pos_type) {
        this.pos_type = pos_type;
    }

    /**
     * 获取可用支付pay_info.fid
     *
     * @return 可用支付pay_info
     */
    public String getPay_ids() {
        return this.pay_ids;
    }

    /**
     * 设置可用支付pay_info.fid
     *
     * @param pay_ids 可用支付pay_info.fid
     */
    public void setPay_ids(String pay_ids) {
        this.pay_ids = pay_ids;
    }

    /**
     * 获取消息推送ID
     *
     * @return 消息推送ID
     */
    public String getMsmq_id() {
        return this.msmq_id;
    }

    /**
     * 设置消息推送ID
     *
     * @param msmq_id 消息推送ID
     */
    public void setMsmq_id(String msmq_id) {
        this.msmq_id = msmq_id;
    }

    /**
     * 获取开票项目
     *
     * @return 开票项目
     */
    public String getInvoice_project() {
        return this.invoice_project;
    }

    /**
     * 设置开票项目
     *
     * @param invoice_project 开票项目
     */
    public void setInvoice_project(String invoice_project) {
        this.invoice_project = invoice_project;
    }

    /**
     * 获取开票税号
     *
     * @return 开票税号
     */
    public String getInvoice_taxno() {
        return this.invoice_taxno;
    }

    /**
     * 设置开票税号
     *
     * @param invoice_taxno 开票税号
     */
    public void setInvoice_taxno(String invoice_taxno) {
        this.invoice_taxno = invoice_taxno;
    }

    /**
     * 获取打印促销内容
     *
     * @return 打印促销内容
     */
    public String getPrint_prom() {
        return this.print_prom;
    }

    /**
     * 设置打印促销内容
     *
     * @param print_prom 打印促销内容
     */
    public void setPrint_prom(String print_prom) {
        this.print_prom = print_prom;
    }

    /**
     * 获取开票销售方名称
     *
     * @return 开票销售方名称
     */
    public String getInvoice_xsf_mc() {
        return this.invoice_xsf_mc;
    }

    /**
     * 设置开票销售方名称
     *
     * @param invoice_xsf_mc 开票销售方名称
     */
    public void setInvoice_xsf_mc(String invoice_xsf_mc) {
        this.invoice_xsf_mc = invoice_xsf_mc;
    }

    /**
     * 获取开票销售方地址电话
     *
     * @return 开票销售方地址电话
     */
    public String getInvoice_xsf_dzdh() {
        return this.invoice_xsf_dzdh;
    }

    /**
     * 设置开票销售方地址电话
     *
     * @param invoice_xsf_dzdh 开票销售方地址电话
     */
    public void setInvoice_xsf_dzdh(String invoice_xsf_dzdh) {
        this.invoice_xsf_dzdh = invoice_xsf_dzdh;
    }

    /**
     * 获取开票销售方银行账户
     *
     * @return 开票销售方银行账户
     */
    public String getInvoice_xsf_yhzh() {
        return this.invoice_xsf_yhzh;
    }

    /**
     * 设置开票销售方银行账户
     *
     * @param invoice_xsf_yhzh 开票销售方银行账户
     */
    public void setInvoice_xsf_yhzh(String invoice_xsf_yhzh) {
        this.invoice_xsf_yhzh = invoice_xsf_yhzh;
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