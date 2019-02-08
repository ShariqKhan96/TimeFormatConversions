package com.webxert.drawname;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    String HOUR_FORMAT = "12";
    String startTime = "2019-02-10 02:00 PM";
    String endTime = "2019-02-10 10:00 PM";
    SimpleDateFormat _12Format = new SimpleDateFormat("yyyy-MM-dd hh:mm a", Locale.ENGLISH);
    SimpleDateFormat _12FormatDummy = new SimpleDateFormat("yyyy-MM-dd hh:mm a", Locale.ENGLISH);
    SimpleDateFormat _24Format = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 //       _24Format.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
       _12Format.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));

        try {
            if (HOUR_FORMAT.equals("24")) {

                Log.e("formattedStart", _24Format.format(_12Format.parse(startTime)));
                Log.e("formattedEnd", _24Format.format(_12Format.parse(endTime)));

            }else
                {
                    Log.e("formattedStart", _12FormatDummy.format(_12Format.parse(startTime)));
                    Log.e("formattedEnd", _12FormatDummy.format(_12Format.parse(endTime)));
                }
        } catch (Exception e) {
            Log.e("Exception", e.getMessage());
        }


//
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
//        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
//        format.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
//        String time = "2019-01-25 01:00 PM";
//        try {
//            Log.e("Time", String.valueOf(format.parse(time)));
//            Date formattedDate = format.parse(time);
//            Log.e("diff", timeFormat.format(formattedDate.getTime()));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }


//        ImageView img = (ImageView) findViewById(R.id.image);
//
//        Bitmap bitmap = Bitmap.createBitmap(
//                500, // Width
//                300, // Height
//                Bitmap.Config.ARGB_8888 // Config
//        );
//
//        Canvas canvas = new Canvas(bitmap);
//
//        // Draw a solid color to the canvas background
//        canvas.drawColor(Color.LTGRAY);
//
//        // Initialize a new Paint instance to draw the Rectangle
//        Paint paint = new Paint();
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setColor(Color.YELLOW);
//        paint.setAntiAlias(true);
//
//        // Set a pixels value to padding around the rectangle
//        int padding = 50;
//
//        Rect rectangle = new Rect(
//                padding, // Left
//                padding, // Top
//                canvas.getWidth() - padding, // Right
//                canvas.getHeight() - padding // Bottom
//        );
//
//
//        canvas.drawRect(rectangle,paint);
//
//        Paint paint2 = new Paint();
//        paint2.setAntiAlias(true);
//        paint2.setStyle(Paint.Style.STROKE);
//        paint2.setColor(Color.WHITE);
//        paint2.setStrokeWidth(1);
//        paint2.setTextSize(40.0f);
//
//        float textWidth = paint2.measureText("Rectangle");
//        canvas.drawText("Rectangle", 50, 50, paint2);
//
//        // Display the newly created bitmap on app interface
//        img.setImageBitmap(bitmap);
//
////        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
////        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
////
////        Canvas canvas = new Canvas(copy);
////        Paint paint = new Paint();
////        paint.setAntiAlias(true);
////        paint.setStyle(Paint.Style.STROKE);
////
////        paint.setColor(Color.WHITE);
////        paint.setStrokeWidth(12);
////
////       canvas.drawRect(new Rect);


    }
}
