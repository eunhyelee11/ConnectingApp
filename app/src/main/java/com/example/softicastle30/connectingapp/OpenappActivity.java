package com.example.softicastle30.connectingapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OpenappActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_openapp);

        Intent intent = getIntent();
        if(intent != null){
            //TextView textView = (TextView)findViewById(R.id.test_textView);
            //String value = intent.getStringExtra("packageName");
            //textView.setText(value);

            String value = intent.getStringExtra("packageName");
            Intent intent1 = getApplicationContext().getPackageManager().getLaunchIntentForPackage(value);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent1);
        }
    }


    /*

    public static boolean openApp(Context context, String packageName) {
        PackageManager manager = context.getPackageManager();
        try {
            Intent i = manager.getLaunchIntentForPackage(packageName);
            if(i == null) {
                throw new PackageManager.NameNotFoundException();
            }
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            context.startActivity(i);
            return true;
            }catch (PackageManager.NameNotFoundException e){
            e.printStackTrace();
            return false;
        }catch (Exception e) {
                e.printStackTrace();
                return false;
        }
    }   */

}
