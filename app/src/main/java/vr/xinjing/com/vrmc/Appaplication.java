package vr.xinjing.com.vrmc;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;
import com.uphyca.stetho_realm.RealmInspectorModulesProvider;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.log.LoggerInterceptor;

import java.util.concurrent.TimeUnit;


import okhttp3.OkHttpClient;
import okhttp3.*;
import vr.xinjing.com.vrmc.utils.NoteService;
import vr.xinjing.com.vrmc.utils.SpUtils;


/**
 * Created by 123 on 2017/2/4.
 */

public class Appaplication extends Application {
    private static Appaplication appaplication;
    private static Context instance;
    public NoteService noteService;
    //记录是否第一次登陆
    public boolean states = true;

    public static Context getContext() {
        return appaplication;
    }

    public boolean isStates() {
        return states;
    }
    public void setStates(boolean states) {
        this.states = states;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appaplication = this;
        SpUtils.getInstance().init(this);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
//                .addInterceptor(new LoggerInterceptor("TAG"))
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)

                //其他配置
                .build();
        OkHttpUtils.initClient(okHttpClient);
//        RealmConfiguration realmConfig = new RealmConfiguration.Builder(this)
//                .name(BaseDao.DB_NAME)
//                .deleteRealmIfMigrationNeeded()
//                //.assetFile(this,"realm file path in assets，will copy this file to Context.getFilesDir() replace an empty realm file")
//                .build();
//        Realm.setDefaultConfiguration(realmConfig);
        //使用默认的配置
//        Realm.init(this);
//        RealmConfiguration config = new RealmConfiguration.Builder().build();
//        Realm.setDefaultConfiguration(config);
        Stetho.initializeWithDefaults(this);
        noteService = NoteService.getNoteService(getApplicationContext());
    }
    public static Appaplication getAppaplication(){
        return appaplication;
    }

}
