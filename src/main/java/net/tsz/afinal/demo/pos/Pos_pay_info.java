package net.tsz.afinal.demo.pos;

import android.os.Parcel;
import android.os.Parcelable;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付类型(pos_pay_info)
 *
 * @author bianj
 * @version 1.0.0 2018-01-02
 */
@Table(name = "pos_pay_info")
public class Pos_pay_info implements java.io.Serializable, Parcelable {
    public static final Creator<Pos_pay_info> CREATOR = new Creator<Pos_pay_info>() {
        @Override
        public Pos_pay_info createFromParcel(Parcel source) {
            return new Pos_pay_info(source);
        }

        @Override
        public Pos_pay_info[] newArray(int size) {
            return new Pos_pay_info[size];
        }
    };
    /**
     * 版本号
     */
    @Transient
    private static final long serialVersionUID = -2563564565588801448L;
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
     * 支付ID
     */
    @Property
    private Integer pay_id;
    /**
     * 父级ID,最多2级
     */
    @Property
    private Long father_id;
    /**
     * 支付代码
     */
    @Property
    private String pay_code;
    /**
     * 支付名称
     */
    @Property
    private String pay_name;
    /**
     * 类型1现金2礼券3储值卡4信用卡5银联卡6电子券
     */
    @Property
    private Integer pay_type;
    /**
     * 面值
     */
    @Property
    private BigDecimal default_value;
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
     * 是否找零
     */
    @Property
    private Integer is_change;
    /**
     * 是否刷卡
     */
    @Property
    private Integer is_card;
    /**
     * 记录卡号
     */
    @Property
    private Integer is_code;
    /**
     * 计入收入
     */
    @Property
    private Integer is_income;
    /**
     * 输入密码
     */
    @Property
    private Integer is_pwd;
    /**
     * 交易取消
     */
    @Property
    private Integer is_cancel;
    /**
     * 显示余额
     */
    @Property
    private Integer is_balance;
    /**
     * 是否需要开钱箱
     */
    @Property
    private Integer is_cashdrawer;
    /**
     * 是否支持退货
     */
    @Property
    private Integer is_return;
    /**
     * 支付服务
     */
    @Property
    private String pay_service;
    /**
     * 图片
     */
    @Property
    private String image_url;
    /**
     * 排序
     */
    @Property
    private Integer findex;
    /**
     * 销售折扣
     */
    @Property
    private BigDecimal sale_rate;
    /**
     * 销售折扣开始时间
     */
    @Property
    private Date rate_begin_time;
    /**
     * 销售折扣开始时间
     */
    @Property
    private Date rate_end_time;
    /**
     * 汇率
     */
    @Property
    private BigDecimal pay_rate;
    /**
     * 是否有效
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
     * 更新用户
     */
    @Property
    private String update_user;
    /**
     * 时间戳
     */
    @Property
    private Long ver;

    public Pos_pay_info() {
    }

    protected Pos_pay_info(Parcel in) {
        this.fid = (Long) in.readValue(Long.class.getClassLoader());
        this.shop_id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.branch_id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.pos_no = (Integer) in.readValue(Integer.class.getClassLoader());
        this.pay_id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.father_id = (Long) in.readValue(Long.class.getClassLoader());
        this.pay_code = in.readString();
        this.pay_name = in.readString();
        this.pay_type = (Integer) in.readValue(Integer.class.getClassLoader());
        this.default_value = (BigDecimal) in.readSerializable();
        long tmpBegin_date = in.readLong();
        this.begin_date = tmpBegin_date == -1 ? null : new Date(tmpBegin_date);
        long tmpEnd_date = in.readLong();
        this.end_date = tmpEnd_date == -1 ? null : new Date(tmpEnd_date);
        this.is_change = (Integer) in.readValue(Integer.class.getClassLoader());
        this.is_card = (Integer) in.readValue(Integer.class.getClassLoader());
        this.is_code = (Integer) in.readValue(Integer.class.getClassLoader());
        this.is_income = (Integer) in.readValue(Integer.class.getClassLoader());
        this.is_pwd = (Integer) in.readValue(Integer.class.getClassLoader());
        this.is_cancel = (Integer) in.readValue(Integer.class.getClassLoader());
        this.is_balance = (Integer) in.readValue(Integer.class.getClassLoader());
        this.is_cashdrawer = (Integer) in.readValue(Integer.class.getClassLoader());
        this.is_return = (Integer) in.readValue(Integer.class.getClassLoader());
        this.pay_service = in.readString();
        this.image_url = in.readString();
        this.findex = (Integer) in.readValue(Integer.class.getClassLoader());
        this.sale_rate = (BigDecimal) in.readSerializable();
        long tmpRate_begin_time = in.readLong();
        this.rate_begin_time = tmpRate_begin_time == -1 ? null : new Date(tmpRate_begin_time);
        long tmpRate_end_time = in.readLong();
        this.rate_end_time = tmpRate_end_time == -1 ? null : new Date(tmpRate_end_time);
        this.pay_rate = (BigDecimal) in.readSerializable();
        this.status_id = (Integer) in.readValue(Integer.class.getClassLoader());
        long tmpAdd_time = in.readLong();
        this.add_time = tmpAdd_time == -1 ? null : new Date(tmpAdd_time);
        this.add_user = in.readString();
        long tmpUpdate_time = in.readLong();
        this.update_time = tmpUpdate_time == -1 ? null : new Date(tmpUpdate_time);
        this.update_user = in.readString();
        this.ver = (Long) in.readValue(Long.class.getClassLoader());
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
     * 获取支付ID
     *
     * @return 支付ID
     */
    public Integer getPay_id() {
        return this.pay_id;
    }

    /**
     * 设置支付ID
     *
     * @param pay_id 支付ID
     */
    public void setPay_id(Integer pay_id) {
        this.pay_id = pay_id;
    }

    /**
     * 获取父级ID,最多2级
     *
     * @return 父级ID
     */
    public Long getFather_id() {
        return this.father_id;
    }

    /**
     * 设置父级ID,最多2级
     *
     * @param father_id 父级ID,最多2级
     */
    public void setFather_id(Long father_id) {
        this.father_id = father_id;
    }

    /**
     * 获取支付代码
     *
     * @return 支付代码
     */
    public String getPay_code() {
        return this.pay_code;
    }

    /**
     * 设置支付代码
     *
     * @param pay_code 支付代码
     */
    public void setPay_code(String pay_code) {
        this.pay_code = pay_code;
    }

    /**
     * 获取支付名称
     *
     * @return 支付名称
     */
    public String getPay_name() {
        return this.pay_name;
    }

    /**
     * 设置支付名称
     *
     * @param pay_name 支付名称
     */
    public void setPay_name(String pay_name) {
        this.pay_name = pay_name;
    }

    /**
     * 获取类型1现金2礼券3储值卡4信用卡5银联卡6电子券
     *
     * @return 类型1现金2礼券3储值卡4信用卡5银联卡6电子券
     */
    public Integer getPay_type() {
        return this.pay_type;
    }

    /**
     * 设置类型1现金2礼券3储值卡4信用卡5银联卡6电子券
     *
     * @param pay_type 类型1现金2礼券3储值卡4信用卡5银联卡6电子券
     */
    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    /**
     * 获取面值
     *
     * @return 面值
     */
    public BigDecimal getDefault_value() {
        return this.default_value;
    }

    /**
     * 设置面值
     *
     * @param default_value 面值
     */
    public void setDefault_value(BigDecimal default_value) {
        this.default_value = default_value;
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
     * 获取是否找零
     *
     * @return 是否找零
     */
    public Integer getIs_change() {
        return this.is_change;
    }

    /**
     * 设置是否找零
     *
     * @param is_change 是否找零
     */
    public void setIs_change(Integer is_change) {
        this.is_change = is_change;
    }

    /**
     * 获取是否刷卡
     *
     * @return 是否刷卡
     */
    public Integer getIs_card() {
        return this.is_card;
    }

    /**
     * 设置是否刷卡
     *
     * @param is_card 是否刷卡
     */
    public void setIs_card(Integer is_card) {
        this.is_card = is_card;
    }

    /**
     * 获取记录卡号
     *
     * @return 记录卡号
     */
    public Integer getIs_code() {
        return this.is_code;
    }

    /**
     * 设置记录卡号
     *
     * @param is_code 记录卡号
     */
    public void setIs_code(Integer is_code) {
        this.is_code = is_code;
    }

    /**
     * 获取计入收入
     *
     * @return 计入收入
     */
    public Integer getIs_income() {
        return this.is_income;
    }

    /**
     * 设置计入收入
     *
     * @param is_income 计入收入
     */
    public void setIs_income(Integer is_income) {
        this.is_income = is_income;
    }

    /**
     * 获取输入密码
     *
     * @return 输入密码
     */
    public Integer getIs_pwd() {
        return this.is_pwd;
    }

    /**
     * 设置输入密码
     *
     * @param is_pwd 输入密码
     */
    public void setIs_pwd(Integer is_pwd) {
        this.is_pwd = is_pwd;
    }

    /**
     * 获取交易取消
     *
     * @return 交易取消
     */
    public Integer getIs_cancel() {
        return this.is_cancel;
    }

    /**
     * 设置交易取消
     *
     * @param is_cancel 交易取消
     */
    public void setIs_cancel(Integer is_cancel) {
        this.is_cancel = is_cancel;
    }

    /**
     * 获取显示余额
     *
     * @return 显示余额
     */
    public Integer getIs_balance() {
        return this.is_balance;
    }

    /**
     * 设置显示余额
     *
     * @param is_balance 显示余额
     */
    public void setIs_balance(Integer is_balance) {
        this.is_balance = is_balance;
    }

    /**
     * 获取是否需要开钱箱
     *
     * @return 是否需要开钱箱
     */
    public Integer getIs_cashdrawer() {
        return this.is_cashdrawer;
    }

    /**
     * 设置是否需要开钱箱
     *
     * @param is_cashdrawer 是否需要开钱箱
     */
    public void setIs_cashdrawer(Integer is_cashdrawer) {
        this.is_cashdrawer = is_cashdrawer;
    }

    /**
     * 获取是否支持退货
     *
     * @return 是否支持退货
     */
    public Integer getIs_return() {
        return this.is_return;
    }

    /**
     * 设置是否支持退货
     *
     * @param is_return 是否支持退货
     */
    public void setIs_return(Integer is_return) {
        this.is_return = is_return;
    }

    /**
     * 获取支付服务
     *
     * @return 支付服务
     */
    public String getPay_service() {
        return this.pay_service;
    }

    /**
     * 设置支付服务
     *
     * @param pay_service 支付服务
     */
    public void setPay_service(String pay_service) {
        this.pay_service = pay_service;
    }

    /**
     * 获取图片
     *
     * @return 图片
     */
    public String getImage_url() {
        return this.image_url;
    }

    /**
     * 设置图片
     *
     * @param image_url 图片
     */
    public void setImage_url(String image_url) {
        this.image_url = image_url;
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
     * 获取销售折扣
     *
     * @return 销售折扣
     */
    public BigDecimal getSale_rate() {
        return this.sale_rate;
    }

    /**
     * 设置销售折扣
     *
     * @param sale_rate 销售折扣
     */
    public void setSale_rate(BigDecimal sale_rate) {
        this.sale_rate = sale_rate;
    }

    /**
     * 获取销售折扣开始时间
     *
     * @return 销售折扣开始时间
     */
    public Date getRate_begin_time() {
        return this.rate_begin_time;
    }

    /**
     * 设置销售折扣开始时间
     *
     * @param rate_begin_time 销售折扣开始时间
     */
    public void setRate_begin_time(Date rate_begin_time) {
        this.rate_begin_time = rate_begin_time;
    }

    /**
     * 获取销售折扣开始时间
     *
     * @return 销售折扣开始时间
     */
    public Date getRate_end_time() {
        return this.rate_end_time;
    }

    /**
     * 设置销售折扣开始时间
     *
     * @param rate_end_time 销售折扣开始时间
     */
    public void setRate_end_time(Date rate_end_time) {
        this.rate_end_time = rate_end_time;
    }

    /**
     * 获取汇率
     *
     * @return 汇率
     */
    public BigDecimal getPay_rate() {
        return this.pay_rate;
    }

    /**
     * 设置汇率
     *
     * @param pay_rate 汇率
     */
    public void setPay_rate(BigDecimal pay_rate) {
        this.pay_rate = pay_rate;
    }

    /**
     * 获取是否有效
     *
     * @return 是否有效
     */
    public Integer getStatus_id() {
        return this.status_id;
    }

    /**
     * 设置是否有效
     *
     * @param status_id 是否有效
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
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.fid);
        dest.writeValue(this.shop_id);
        dest.writeValue(this.branch_id);
        dest.writeValue(this.pos_no);
        dest.writeValue(this.pay_id);
        dest.writeValue(this.father_id);
        dest.writeString(this.pay_code);
        dest.writeString(this.pay_name);
        dest.writeValue(this.pay_type);
        dest.writeSerializable(this.default_value);
        dest.writeLong(this.begin_date != null ? this.begin_date.getTime() : -1);
        dest.writeLong(this.end_date != null ? this.end_date.getTime() : -1);
        dest.writeValue(this.is_change);
        dest.writeValue(this.is_card);
        dest.writeValue(this.is_code);
        dest.writeValue(this.is_income);
        dest.writeValue(this.is_pwd);
        dest.writeValue(this.is_cancel);
        dest.writeValue(this.is_balance);
        dest.writeValue(this.is_cashdrawer);
        dest.writeValue(this.is_return);
        dest.writeString(this.pay_service);
        dest.writeString(this.image_url);
        dest.writeValue(this.findex);
        dest.writeSerializable(this.sale_rate);
        dest.writeLong(this.rate_begin_time != null ? this.rate_begin_time.getTime() : -1);
        dest.writeLong(this.rate_end_time != null ? this.rate_end_time.getTime() : -1);
        dest.writeSerializable(this.pay_rate);
        dest.writeValue(this.status_id);
        dest.writeLong(this.add_time != null ? this.add_time.getTime() : -1);
        dest.writeString(this.add_user);
        dest.writeLong(this.update_time != null ? this.update_time.getTime() : -1);
        dest.writeString(this.update_user);
        dest.writeValue(this.ver);
    }
}