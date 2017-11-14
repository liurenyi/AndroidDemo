package com.example.liurenyi.androiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.liurenyi.androiddemo.db.Weather;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "";
    private static final boolean DEBUG = true;
    private Button addData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData = (Button) this.findViewById(R.id.add_data);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Weather weather = new Weather();
                weather.setCityName("北京");
                weather.setCityCode("10010");
                weather.setTemperature(20);
                weather.setWeatherStatus("duoyu");
                weather.save();
            }
        });
    }
}
