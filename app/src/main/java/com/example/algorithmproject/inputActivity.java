//package com.example.algorithmproject;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//import java.text.BreakIterator;
//
//
//public class InputActivity extends AppCompatActivity {
//
//    EditText start_station_;
//    EditText arrive_station_;
//    Button calculate_btn;
//    Intent moveToResult;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.input);
//
//        start_station_=(EditText)findViewById(R.id.start_station);
//        arrive_station_=(EditText)findViewById(R.id.arrive_station);
//        calculate_btn=(Button)findViewById(R.id.calculate_btn);
//
////        moveToResult=new Intent(this,ResultActivity.class);
//
//
//        calculate_btn.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//                String start_station=start_station_.getText().toString();
//                String arrive_station=arrive_station_.getText().toString();
//
//                moveToResult.putExtra("start",start_station);
//                moveToResult.putExtra("arrive",arrive_station);
//
//                startActivity(moveToResult);
//            }
//
//
//        });
//
//
//
//
//
//    }
//
//
//
//
//
//
//}