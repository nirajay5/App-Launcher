package com.example.niranjana115.applauncher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        setContentView(R.layout.activity_main);

        //Initializing grid view and setting the adapter to ImageAdapter
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        //launching apps
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.a302201.auditmanagermenu");
                        startActivity(launchIntent);//calling an activity class in a Audit Manager Menu
                        break;
                    case 1:
                        Intent launchIntent2 = getPackageManager().getLaunchIntentForPackage("com.android.chrome");
                        startActivity(launchIntent2);
                        break;
                    case 2:
                        Intent launchIntent3 = getPackageManager().getLaunchIntentForPackage("com.kiloo.subwaysurf");
                        startActivity(launchIntent3);
                        break;
                    case 3:
                        Intent launchIntent4 = getPackageManager().getLaunchIntentForPackage("com.robtopx.geometryjumplite");
                        startActivity(launchIntent4);
                        break;
                    case 4:
                        Intent launchIntent5 = getPackageManager().getLaunchIntentForPackage("com.meetappevent.volvo_group_eventss");
                        startActivity(launchIntent5);
                        break;
                    case 5:
                        Intent launchIntent6 = getPackageManager().getLaunchIntentForPackage("in.swiggy.android");
                        startActivity(launchIntent6);
                        break;
                    default:

                }
            }
        });
    }
}