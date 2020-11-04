package com.example.aprendaingles.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.aprendaingles.R;
import com.example.aprendaingles.fragments.BichosFragment;
import com.example.aprendaingles.fragments.NumerosFragment;
import com.example.aprendaingles.fragments.VogaisFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Configurações de actionBar
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("Aprenda inglês");

        smartTabLayout = findViewById(R.id.smartTabLayout);
        viewPager = findViewById(R.id.viewPager);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Bichos", BichosFragment.class)
                        .add("Número", NumerosFragment.class)
                        .add("Vogais", VogaisFragment.class)
                .create()
        );
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);

    }
}