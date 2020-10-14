package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnMoveActivity;
    private Button btnMoveActivity2;
    private Button btnMoveActivity3;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMoveActivity = (Button)findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);
        btnMoveActivity2 = (Button)findViewById(R.id.btn_move_activity);
        btnMoveActivity2.setOnClickListener(this);
        btnMoveActivity3 = (Button)findViewById(R.id.btn_move_activity);
        btnMoveActivity3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent =new Intent(MainActivity.this,MoveActivity.class);
                moveIntent.putExtra( "satu",text);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity2:
                Intent moveIntent2 =new Intent(MainActivity.this,MoveActivity.class);
                moveIntent2.putExtra( "dua",text);
                startActivity(moveIntent2);
                break;
            case R.id.btn_move_activity3:
                Intent moveIntent3 =new Intent(MainActivity.this,MoveActivity.class);
                moveIntent3.putExtra( "satu",text);
                startActivity(moveIntent3);
                break;
        }

    }
}