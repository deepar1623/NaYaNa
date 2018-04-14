package org.metastudio.nayana_language;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
//import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder(
//         .setDefaultFontPath("fonts/nayana.ttf")
//            .setFontAttrId(R.attr.fontPath)
//           .build()
// );

    }
}

