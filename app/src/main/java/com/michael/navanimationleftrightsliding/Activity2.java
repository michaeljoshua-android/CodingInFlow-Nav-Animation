package com.michael.navanimationleftrightsliding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        getSupportActionBar().setTitle("Activity 2");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void openActivity3(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Log.d("taggy", "Item" +  item.getItemId());

        if (item.getItemId() == android.R.id.home) {
            finish();
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            return true;
        }
        return false;
    }

//    @Override
//    public void onBackPressed() {
//        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
//        this.finish();
//    }

//    @Override
//    public void finish() {
//        super.finish();
//        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
//    }
}
