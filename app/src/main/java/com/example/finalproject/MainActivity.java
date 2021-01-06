package com.example.finalproject;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.finalproject.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saveDatabase();
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }
    public void saveDatabase(){
        SharedPreferences sharedPreferences=getSharedPreferences("ImageData",MODE_PRIVATE);
        String water="https://res.cloudinary.com/shradhadua/image/upload/v1609936421/Sign%20language/water_vdivyn.gif";
        String thankyou="https://res.cloudinary.com/shradhadua/image/upload/v1609936422/Sign%20language/thank_you_mrkdc1.gif";
        String sleep="https://res.cloudinary.com/shradhadua/image/upload/v1609936422/Sign%20language/sleep_ie9uwb.gif";
        String welcome="https://res.cloudinary.com/shradhadua/image/upload/v1609936421/Sign%20language/welcome_xavw6m.gif";
        String sorry="https://res.cloudinary.com/shradhadua/image/upload/v1609936421/Sign%20language/sorry_rncuqw.gif";
        String small="https://res.cloudinary.com/shradhadua/image/upload/v1609936421/Sign%20language/small_x52vsy.gif";
        String shirt="https://res.cloudinary.com/shradhadua/image/upload/v1609936420/Sign%20language/shirt_ux1nc8.gif";
        String please="https://res.cloudinary.com/shradhadua/image/upload/v1609936418/Sign%20language/please_pcfrnk.gif";
        String mad="https://res.cloudinary.com/shradhadua/image/upload/v1609936419/Sign%20language/mad_lxjstv.gif";
        String fire="https://res.cloudinary.com/shradhadua/image/upload/v1609936418/Sign%20language/fire_pvqipn.gif";
        String love="https://res.cloudinary.com/shradhadua/image/upload/v1609936418/Sign%20language/love_wlheqb.gif";
        String eat="https://res.cloudinary.com/shradhadua/image/upload/v1609936417/Sign%20language/eat_b5c706.gif";
        String hello="https://res.cloudinary.com/shradhadua/image/upload/v1609936417/Sign%20language/hello_jcfrvr.gif";
        String howAreYouDoing="https://res.cloudinary.com/shradhadua/image/upload/v1609936417/Sign%20language/how_are_you_doing_qwk4ki.gif";
        String food="https://res.cloudinary.com/shradhadua/image/upload/v1609936417/Sign%20language/food_lmza1q.gif";
        String clothes="https://res.cloudinary.com/shradhadua/image/upload/v1609936416/Sign%20language/clothes_cthl3z.gif";
        String happy="https://res.cloudinary.com/shradhadua/image/upload/v1609936415/Sign%20language/happy_kmgjje.gif";
        String bye="https://res.cloudinary.com/shradhadua/image/upload/v1609936621/Sign%20language/bye_qh4rpy.gif";
        String sad="https://res.cloudinary.com/shradhadua/image/upload/v1609937058/Sign%20language/sad_yyrtwu.gif";
        String big="https://res.cloudinary.com/shradhadua/image/upload/v1609937158/Sign%20language/big_acxwxt.gif";
       sharedPreferences.edit().putString("water",water).apply();
        sharedPreferences.edit().putString("thankyou",thankyou).apply();
        sharedPreferences.edit().putString("sleep",sleep).apply();
        sharedPreferences.edit().putString("welcome",welcome).apply();
        sharedPreferences.edit().putString("sorry",sorry).apply();
        sharedPreferences.edit().putString("small",small).apply();
        sharedPreferences.edit().putString("shirt",shirt).apply();
        sharedPreferences.edit().putString("please",please).apply();
        sharedPreferences.edit().putString("mad",mad).apply();
        sharedPreferences.edit().putString("fire",fire).apply();
        sharedPreferences.edit().putString("love",love).apply();
        sharedPreferences.edit().putString("eat",eat).apply();
        sharedPreferences.edit().putString("hello",hello).apply();
        sharedPreferences.edit().putString("howareyoudoing",howAreYouDoing).apply();
        sharedPreferences.edit().putString("food",food).apply();
        sharedPreferences.edit().putString("clothes",clothes).apply();
        sharedPreferences.edit().putString("happy",happy).apply();
        sharedPreferences.edit().putString("bye",bye).apply();
        sharedPreferences.edit().putString("sad",sad).apply();
        sharedPreferences.edit().putString("big",big).apply();



    }
}