package com.example.softicastle30.connectingapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Button button = (Button)this.findViewById(R.id.applistBTN);      // activity_main에 있는 것 중에 id가 applistBTN인 애의 주소를 리턴해라

        button.setOnClickListener(new View.OnClickListener() {                //1. click을 하면 listener를 하겠다
            @Override
            public void onClick(View view) {
                TextView textView=(TextView)findViewById(R.id.textView2);       //textView2를 보여줘라
                textView.setText("App List로 이동합니다.");
                Toast.makeText(getApplication(),"가즈아", Toast.LENGTH_LONG).show();

            }
        });

        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                TextView textView=(TextView)findViewById(R.id.textView2);       //textView2를 보여줘라
                textView.setText("No Thanks");
                Toast.makeText(getApplication(),"called onClicked", Toast.LENGTH_LONG).show();
                return true;       //true 반환 시에는 클릭 뗐을 때 위의 온클릭리스너로 돌아가지 않음 (false는 뒤에 더 해줄게 있으면 해주는 거임)
            }
        });
        */

       // button.setOnClickListener(new MyListener());       //2. MyListener 함수 호출해라

    }

   /* class MyListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            TextView textView=(TextView)findViewById(R.id.textView2);       //textView2를 보여줘라
            textView.setText("Thank you for click");
        }
    }   */

    /*
    public  void onButtonClicked(View view){
        TextView textView=(TextView)findViewById(R.id.textView2);       //3. textView2를 보여줘라
        textView.setText("Thank you for click");
    }
    */

    public void onApplistClicked(View view){
        Toast.makeText(getApplication(),"가즈아", Toast.LENGTH_LONG).show();
        Intent intent =new Intent(this, ApplistActivity.class);
        startActivity(intent);
    }

}
