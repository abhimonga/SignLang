package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.HashMap;

public class split extends AppCompatActivity {
    CarouselView carouselView;
    int [] output;
    HashMap<Character, Integer> mp=new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split);
      carouselView=findViewById(R.id.carousel);
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("text");
        Log.d("split",message);
        output=new int[message.length()];
        fillMap();
        carouselView.setPageCount(message.length());
        carouselView.setImageListener(imageListener);
        splitAndGet(message);

    }

    private void fillMap() {
        mp.put('a',R.drawable.aa);
        mp.put('b',R.drawable.bb);
        mp.put('c',R.drawable.cc);
        mp.put('d',R.drawable.dd);
        mp.put('e',R.drawable.ee);
        mp.put('f',R.drawable.ff);
        mp.put('g',R.drawable.gg);
        mp.put('h',R.drawable.hh);
        mp.put('i',R.drawable.ii);
        mp.put('j',R.drawable.jj);
        mp.put('k',R.drawable.kk);
        mp.put('l',R.drawable.ll);
        mp.put('m',R.drawable.mm);
        mp.put('n',R.drawable.nn);
        mp.put('o',R.drawable.oo);
        mp.put('p',R.drawable.pp);
        mp.put('q',R.drawable.qq);
        mp.put('r',R.drawable.rr);
        mp.put('s',R.drawable.ss);
        mp.put('t',R.drawable.tt);
        mp.put('u',R.drawable.uu);
        mp.put('v',R.drawable.vv);
        mp.put('w',R.drawable.ww);
        mp.put('x',R.drawable.xx);
        mp.put('y',R.drawable.yy);
        mp.put('z',R.drawable.zz);
        mp.put('1',R.drawable.one);
        mp.put('2',R.drawable.two);
        mp.put('3',R.drawable.three);
        mp.put('4',R.drawable.four);
        mp.put('5',R.drawable.five);
        mp.put('6',R.drawable.six);
        mp.put('7',R.drawable.seven);
        mp.put('8',R.drawable.eight);
        mp.put('9',R.drawable.nine);
        mp.put('0',R.drawable.zero);


    }

    private void splitAndGet(String message) {
        for(int i=0;i<message.length();i++){
              Log.d("split",""+message.charAt(i));
            output[i]=mp.get(message.charAt(i));
        }
        for(int i:output){
            Log.d("split",""+i);
        }

    }
ImageListener imageListener=new ImageListener() {
    @Override
    public void setImageForPosition(int position, ImageView imageView) {
        imageView.setImageResource(output[position]);

    }
};


}