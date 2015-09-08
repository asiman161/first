package com.example.asiman.lessons;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {
    TextView textView;
    boolean week;
    int day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_second);
    }

    public boolean selectWeek(View view){
        switch (view.getId()){
            case R.id.radioButton:
                week = false;
                break;
            case R.id.radioButton2:
                week = true;
                break;
        }
        return week;
    }

    public int selectDay(View view){
        switch (view.getId()){
            case R.id.radioButton3:
                day = 1;
                break;
            case R.id.radioButton4:
                day = 2;
                break;
            case R.id.radioButton5:
                day = 3;
                break;
            case R.id.radioButton6:
                day = 4;
                break;
            case R.id.radioButton7:
                day = 5;
                break;
            case R.id.rb8:
                day = 6;
                break;
        }
        return day;
    }

    public void setLessonToday(View view){
        textView = (TextView) findViewById(R.id.textView4);
        textView.setText(CheckDayAndSet.setTodayLesson(week, day));
    }

    public void goToNewActivity(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
