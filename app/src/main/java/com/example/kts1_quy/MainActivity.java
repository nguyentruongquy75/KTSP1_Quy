package com.example.kts1_quy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button exitBtn;
    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitBtn = findViewById(R.id.exitBtn);
    }

    public void exitHandler(View view) {
        finish();
    }

    public void clickItemHandler(View view) {
        i = new Intent(MainActivity.this, MainActivity2.class);

        switch (view.getId()) {
            case R.id.personal:
                i.putExtra("data", "Cá nhân");
                break;

            case R.id.analyst:
                i.putExtra("data", "Chi tiêu cá nhân");
                break;

            case R.id.customer:
                i.putExtra("data", "Khách hàng");
                break;

            case R.id.list:
                i.putExtra("data", "Danh sách tuyến");
                break;

            case R.id.checkProduct:
                i.putExtra("data", "Tra cứu sản phẩm");
                break;
        }

        startActivity(i);
    }
}