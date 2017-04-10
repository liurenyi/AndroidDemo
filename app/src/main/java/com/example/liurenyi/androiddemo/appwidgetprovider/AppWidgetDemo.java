package com.example.liurenyi.androiddemo.appwidgetprovider;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.util.Log;
import android.widget.RemoteViews;

import com.example.liurenyi.androiddemo.R;
import com.example.liurenyi.androiddemo.db.Weather;

import org.litepal.crud.DataSupport;

/**
 * Implementation of App Widget functionality.
 */
public class AppWidgetDemo extends AppWidgetProvider {

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

        Weather last = DataSupport.findLast(Weather.class);
        String cityName = last.getCityName();
        String weatherStatus = last.getWeatherStatus();
        int temperature = last.getTemperature();

        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.app_widget_demo);
        views.setTextViewText(R.id.appwidget_weather_info_text, temperature + "℃");
        views.setTextViewText(R.id.appwidget_weather_status, weatherStatus);
        views.setTextViewText(R.id.appwidget_weather_address, cityName);

        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
        Log.e("liu", "updateAppWidget()");
    }


    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
        Log.e("liu","onUpdate()");
    }

    /**
     * 所有桌面小部件被移除时调用
     * @param context
     */
    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
        Log.e("liu","onEnabled()");
    }

    /**
     * 任意一个小部件被移除时调用
     * @param context
     */
    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
        Log.e("liu","onDisabled()");
    }

}

