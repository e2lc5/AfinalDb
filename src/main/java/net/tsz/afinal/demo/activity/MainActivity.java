package net.tsz.afinal.demo.activity;

import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import net.tsz.afinal.FinalDb;
import net.tsz.afinal.db.table.TableInfo;
import net.tsz.afinal.demo.R;
import net.tsz.afinal.demo.pos.Pos_branch_info;
import net.tsz.afinal.demo.pos.Pos_config;
import net.tsz.afinal.demo.pos.Pos_customer_info;
import net.tsz.afinal.demo.pos.Pos_fault_apply;
import net.tsz.afinal.demo.pos.Pos_fault_info;
import net.tsz.afinal.demo.pos.Pos_fault_result;
import net.tsz.afinal.demo.pos.Pos_food_category;
import net.tsz.afinal.demo.pos.Pos_food_item;
import net.tsz.afinal.demo.pos.Pos_item_info;
import net.tsz.afinal.demo.pos.Pos_onpay_set;
import net.tsz.afinal.demo.pos.Pos_operate_log;
import net.tsz.afinal.demo.pos.Pos_para;
import net.tsz.afinal.demo.pos.Pos_pay_info;
import net.tsz.afinal.demo.pos.Pos_prepaycard_trans;
import net.tsz.afinal.demo.pos.Pos_receive_fast;
import net.tsz.afinal.demo.pos.Pos_second_scrn;
import net.tsz.afinal.demo.pos.Pos_setting;
import net.tsz.afinal.demo.pos.Pos_status_info;
import net.tsz.afinal.demo.pos.Pos_supplier_info;
import net.tsz.afinal.demo.pos.Pos_trade_info;
import net.tsz.afinal.demo.pos.Pos_trade_item;
import net.tsz.afinal.demo.pos.Pos_trade_other;
import net.tsz.afinal.demo.pos.Pos_trade_pay;
import net.tsz.afinal.demo.pos.Pos_user;
import net.tsz.afinal.demo.pos.Pos_version;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FinalDb db;
    private boolean isDo = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_add).setOnClickListener(this);
        findViewById(R.id.btn_update).setOnClickListener(this);
        findViewById(R.id.btn_delete).setOnClickListener(this);
        findViewById(R.id.btn_stop).setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        db = FinalDb.create(getApplicationContext(), "ts_db.db", false);

        db.getDb().rawQuery("PRAGMA journal_mode = DELETE;", new String[0]).close();
        db.getDb().rawQuery("PRAGMA main.journal_mode = DELETE;", new String[0]).close();

        if (!db.tableIsExist(TableInfo.get(Pos_branch_info.class))) {
            db.checkTableExist(Pos_branch_info.class);
            db.execSQL("CREATE INDEX branch_index ON pos_branch_info(shop_id,branch_id,pos_no)");
        }
        // 初始化"配置表"
        if (!db.tableIsExist(TableInfo.get(Pos_config.class))) {
            db.checkTableExist(Pos_config.class);
            db.execSQL("CREATE INDEX config_index ON pos_config(shop_id,branch_id,pos_no)");
        }
        if (!db.tableIsExist(TableInfo.get(Pos_fault_apply.class))) {
            db.checkTableExist(Pos_fault_apply.class);
        }
        if (!db.tableIsExist(TableInfo.get(Pos_fault_result.class))) {
            db.checkTableExist(Pos_fault_result.class);
        }
        if (!db.tableIsExist(TableInfo.get(Pos_fault_info.class))) {
            db.checkTableExist(Pos_fault_info.class);
        }
        if (!db.tableIsExist(TableInfo.get(Pos_status_info.class))) {
            db.checkTableExist(Pos_status_info.class);
        }
        if (!db.tableIsExist(TableInfo.get(Pos_supplier_info.class))) {
            db.createTable(Pos_supplier_info.class);
        }
        if (!db.tableIsExist(TableInfo.get(Pos_receive_fast.class))) {
            db.checkTableExist(Pos_receive_fast.class);
        }
        if (!db.tableIsExist(TableInfo.get(Pos_customer_info.class))) {
            db.checkTableExist(Pos_customer_info.class);
        }
        // 初始化分类表
        if (!db.tableIsExist(TableInfo.get(Pos_food_category.class))) {
            db.checkTableExist(Pos_food_category.class);
            db.execSQL("CREATE INDEX food_category_index ON pos_food_category(shop_id,branch_id," +
                    "pos_no)");
        }
        // 初始化菜品表
        if (!db.tableIsExist(TableInfo.get(Pos_food_item.class))) {
            db.checkTableExist(Pos_food_item.class);
            db.execSQL("CREATE INDEX food_item_index ON pos_food_item(shop_id,branch_id,pos_no," +
                    "item_id)");
        }
        // 初始化商品明细表
        if (!db.tableIsExist(TableInfo.get(Pos_item_info.class))) {
            db.checkTableExist(Pos_item_info.class);
            db.execSQL("CREATE INDEX item_info_index ON pos_item_info(shop_id,branch_id,pos_no," +
                    "item_id)");
        }
        // 初始化操作表
        if (!db.tableIsExist(TableInfo.get(Pos_operate_log.class))) {
            db.checkTableExist(Pos_operate_log.class);
            db.execSQL("CREATE INDEX operate_log_index ON pos_operate_log(shop_id,branch_id," +
                    "pos_no)");
        }
        // 初始化参数表
        if (!db.tableIsExist(TableInfo.get(Pos_para.class))) {
            db.checkTableExist(Pos_para.class);
            db.execSQL("CREATE INDEX para_index ON pos_para(shop_id,branch_id,pos_no)");
        }
        // 初始化支付信息
        if (!db.tableIsExist(TableInfo.get(Pos_pay_info.class))) {
            db.checkTableExist(Pos_pay_info.class);
            db.execSQL("CREATE INDEX pay_info_index ON pos_pay_info(shop_id,branch_id,pos_no)");
        }
        // 初始化交易表
        if (!db.tableIsExist(TableInfo.get(Pos_trade_info.class))) {
            db.checkTableExist(Pos_trade_info.class);
            db.execSQL("CREATE INDEX trade_info_index ON pos_trade_info(shop_id,branch_id,pos_no)");
        }
        // 初始化交易明细表
        if (!db.tableIsExist(TableInfo.get(Pos_trade_item.class))) {
            db.checkTableExist(Pos_trade_item.class);
            db.execSQL("CREATE INDEX trade_item_index ON pos_trade_item(shop_id,branch_id,pos_no," +
                    "item_id)");
        }
        // 初始化日志表
        if (!db.tableIsExist(TableInfo.get(Pos_trade_other.class))) {
            db.checkTableExist(Pos_trade_other.class);
            db.execSQL("CREATE INDEX trade_other_index ON pos_trade_other(shop_id,branch_id," +
                    "pos_no,item_id)");
        }
        // 初始化交易支付表
        if (!db.tableIsExist(TableInfo.get(Pos_trade_pay.class))) {
            db.checkTableExist(Pos_trade_pay.class);
            db.execSQL("CREATE INDEX trade_pay_index ON pos_trade_pay(shop_id,branch_id,pos_no)");
        }
        // 初始化用户列表
        if (!db.tableIsExist(TableInfo.get(Pos_user.class))) {
            db.checkTableExist(Pos_user.class);
            db.execSQL("CREATE INDEX user_index ON pos_user(shop_id,branch_id,pos_no,user_code," +
                    "user_pwd)");
        }
        // 初始化设置
        if (!db.tableIsExist(TableInfo.get(Pos_setting.class))) {
            db.checkTableExist(Pos_setting.class);
            db.execSQL("CREATE INDEX setting_index ON pos_setting(setting_id)");
        }
        // 储值卡
        if (!db.tableIsExist(TableInfo.get(Pos_prepaycard_trans.class))) {
            db.checkTableExist(Pos_prepaycard_trans.class);
        }
        // 初始化设置
        if (!db.tableIsExist(TableInfo.get(Pos_second_scrn.class))) {
            db.checkTableExist(Pos_second_scrn.class);
        }
        if (!db.tableIsExist(TableInfo.get(Pos_version.class))) {
            db.checkTableExist(Pos_version.class);
        }
        // 初始化pos_onpay_set
        if (!db.tableIsExist(TableInfo.get(Pos_onpay_set.class))) {
            db.checkTableExist(Pos_onpay_set.class);
            db.execSQL("CREATE INDEX onpay_set_index ON pos_user(shop_id,branch_id,pos_no)");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_add:
                // 纯添加,5.3毫秒
                isDo = true;
                new Thread() {
                    @Override
                    public void run() {
                        long start = System.currentTimeMillis();
                        MainActivity.this.start();
                        for (int i = 0; i < 1000; i++) {
                            Pos_trade_info info = new Pos_trade_info();
                            info.setShop_id(1);
                            info.setBranch_id(2);
                            info.setPos_no(3);
                            info.setAccept_money(new BigDecimal(200));
                            info.setBuyer_onpay_id("10001");
                            info.setCard_code("2222222");
                            info.setCard_tsn("2222929299292929292");
                            info.setCashier_code("999");
                            info.setCashier_id(107);
                            info.setChange_money(new BigDecimal(200));
                            info.setCreate_time(new Date());
                            info.setCredit_amount("292929");
                            info.setCredit_posRef("29348029384");
                            info.setCredit_resultCode("22223");
                            info.setCredit_resultDescribe("test");
                            info.setCredit_transDate("2000-12-12 23:00:00");
                            info.setCustomer_id("333333");
                            info.setDiscount_money(new BigDecimal(1.00));
                            info.setVer(System.currentTimeMillis());
                            info.setTrade_onpay_num("1000");
                            info.setEnd_time(new Date());
                            info.setIs_upload(0);
                            info.setMember_code("999");
                            info.setPay_alipay(new BigDecimal(0));
                            info.setPay_card(new BigDecimal(0));
                            info.setPay_cash(new BigDecimal(0));
                            info.setPay_credit(new BigDecimal(0));
                            info.setPay_point(new BigDecimal(0));
                            info.setPay_seq(9);
                            info.setPos_trade_id("000000000000000000000000000000");
                            info.setSys_date(new Date());
                            info.setTrade_type(3);
                            info.setEnd_time(new Date());
                            info.setGoods_money(new BigDecimal(100));
                            info.setPay_weixin(new BigDecimal(100));
                            info.setSeller_onpay_id("4848773");
                            info.setPay_time(new Date());
                            info.setTrade_num("39838347893497843987");
                            info.setMember_id("398383838");
                            info.setMobile_code("3983847474843");
                            info.setCredit_transTime("3838388383");
                            db.save(info);
                            Log.i("add item", "add items " + i);
                        }
                        MainActivity.this.end();
                        Log.i("add item", "spend " + (System.currentTimeMillis() - start) + "ms");
                    }
                }.start();
                break;
            case R.id.btn_update:
                // 纯更新,4.3毫秒
                isDo = true;
                new Thread() {
                    @Override
                    public void run() {
                        List<Pos_trade_info> infos = db.findAll(Pos_trade_info.class);
                        int dataCount = 0;
                        long start = System.currentTimeMillis();
                        MainActivity.this.start();
                        for (Pos_trade_info info : infos) {
                            if (!isDo)
                                break;
                            db.update(info);
                            dataCount++;
                            Log.i("update item", "update items " + dataCount);
                        }
                        MainActivity.this.end();
                        Log.i("update item", "spend " + (System.currentTimeMillis() - start) + "ms");
                    }
                }.start();
                break;
            case R.id.btn_delete:
                isDo = true;
                new Thread() {
                    @Override
                    public void run() {
                        List<Pos_trade_info> infos = db.findAll(Pos_trade_info.class);
                        int dataCount = 0;
                        long start = System.currentTimeMillis();
                        MainActivity.this.start();
                        for (Pos_trade_info info : infos) {
                            if (!isDo)
                                break;
                            db.delete(info);
                            dataCount++;
                            Log.i("delete item", "update items " + dataCount);
                        }
                        MainActivity.this.end();
                        Log.i("delete item", "spend " + (System.currentTimeMillis() - start) + "ms");
                    }
                }.start();
                break;
            case R.id.btn_stop:
                isDo = false;
                db.getDb().close();
                break;
        }
    }

    public void start() {
        db.execSQL("BEGIN;");
    }

    public void end() {
        db.execSQL("COMMIT;");
        File file= new File(Environment.getDataDirectory()+"/data/net.tsz.afinal.demo/databases/ts_db.db-journal");
        Log.i("path",file.getAbsolutePath());
        file.delete();
    }
}
