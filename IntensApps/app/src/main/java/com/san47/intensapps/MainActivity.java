package com.san47.intensapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    int request_Code = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        startActivityForResult(new Intent("com.san47.intensapps.SecondActivity"),request_Code);
    }
    public void onActivityResult(int request_Code,int resultCode,Intent data)
    {
        if(request_Code == request_Code){
            if (resultCode == RESULT_OK){
                Toast.makeText(this,data.getData().toString(),Toast.LENGTH_SHORT).show();
            }
        }
    }
}
