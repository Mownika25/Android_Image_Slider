package com.example.androidimageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //now we can create two types of slider first using viewpager
        //and another using third party library which is easy to use let's get started
        ImageSlider imageSlider=findViewById(R.id.slider);

        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.s1png,"#BeMoreOotsuk"));
        slideModels.add(new SlideModel(R.drawable.s2png,"#BeMoreOotsuk"));
        slideModels.add(new SlideModel(R.drawable.s3png,"#BeMoreOotsuk"));
        //slideModels.add(new SlideModel("https://picsum.photos/id/891/300/200","Image 4"));
        imageSlider.setImageList(slideModels,true);
    }
}
