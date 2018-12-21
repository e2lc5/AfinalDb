package net.tsz.afinal.demo.pos;

import net.tsz.afinal.annotation.sqlite.Id;
import net.tsz.afinal.annotation.sqlite.Table;

import java.util.Date;

/**
 * Pos_fault_result 报修界面需要用到的数据
 * Created by zhanghuiqiang on 2018/3/16.
 */
@Table(name = "pos_fault_result")
public class Pos_fault_result {
    @Id(column = "fid")
    private int fid;
    private int status_id;
    private String apply_num;
    private String type_ids;
    private String type_names;
    private Date apply_time;
    private Date end_time;
    private String result_ids;
    private String result_names;
    private String result_memo;

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getApply_num() {
        return apply_num;
    }

    public void setApply_num(String apply_num) {
        this.apply_num = apply_num;
    }

    public String getType_ids() {
        return type_ids;
    }

    public void setType_ids(String type_ids) {
        this.type_ids = type_ids;
    }

    public String getType_names() {
        return type_names;
    }

    public void setType_names(String type_names) {
        this.type_names = type_names;
    }

    public Date getApply_time() {
        return apply_time;
    }

    public void setApply_time(Date apply_time) {
        this.apply_time = apply_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getResult_ids() {
        return result_ids;
    }

    public void setResult_ids(String result_ids) {
        this.result_ids = result_ids;
    }

    public String getResult_names() {
        return result_names;
    }

    public void setResult_names(String result_names) {
        this.result_names = result_names;
    }

    public String getResult_memo() {
        return result_memo;
    }

    public void setResult_memo(String result_memo) {
        this.result_memo = result_memo;
    }
}
