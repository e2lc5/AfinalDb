package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Property;
import net.tsz.afinal.annotation.sqlite.Table;
import net.tsz.afinal.annotation.sqlite.Transient;

import java.io.Serializable;
import java.util.Date;

/**
 * 服务器配置文件
 *
 * @author wjs
 */
@Table(name = "pos_config")
public class Pos_config implements Serializable {
    @Transient
    private static final long serialVersionUID = -4393887448213450425L;
    // id标识
    @Id(column = "fid")
    private int fid;
    // 商家ID
    @Property
    private int shop_id;
    // 商家编号
    @Property
    private String shop_code;
    // 商家名称
    @Property
    private String shop_name;
    // 门店ID
    @Property
    private int branch_id;
    // 门店编号
    @Property
    private String branch_code;
    // 门店名称
    @Property
    private String branch_name;
    // Pos编号
    @Property
    private int pos_no;
    // Pos机号
    @Property
    private int pos_info;
    // 服务器地址
    @Property
    private String server_adress;

    private Date last_down_time;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getServer_adress() {
        return server_adress;
    }

    public void setServer_adress(String server_adress) {
        this.server_adress = server_adress;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_code() {
        return shop_code;
    }

    public void setShop_code(String shop_code) {
        this.shop_code = shop_code;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public int getPos_no() {
        return pos_no;
    }

    public void setPos_no(int pos_no) {
        this.pos_no = pos_no;
    }

    public int getPos_info() {
        return pos_info;
    }

    public void setPos_info(int pos_info) {
        this.pos_info = pos_info;
    }

    public Date getLast_down_time() {
        return last_down_time;
    }

    public void setLast_down_time(Date last_down_time) {
        this.last_down_time = last_down_time;
    }
}
