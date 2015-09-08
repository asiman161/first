package com.example.asiman.lessons;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        textView = (TextView) findViewById (R.id.textView);
        textView.setText(SetTodayLesson.setTodayLesson(GetWeekAndDay.flag(), GetWeekAndDay.getDay()));
    }

    public void goToNewActivity(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void setLessonToday(View view){
        textView.setText(SetTodayLesson.setTodayLesson(GetWeekAndDay.flag(), GetWeekAndDay.getDay()));
    }


}
