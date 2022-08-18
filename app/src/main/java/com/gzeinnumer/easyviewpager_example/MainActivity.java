package com.gzeinnumer.easyviewpager_example;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;

import com.google.android.material.tabs.TabLayout;
import com.gzeinnumer.evp.SimpleViewPager;
import com.gzeinnumer.evp.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    SimpleViewPager simpleViewPager;
    TabLayout dotsTab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        simpleViewPager = findViewById(R.id.dc);
        dotsTab = findViewById(R.id.dots_tab);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        viewPagerAdapter.addFragment(FirstFragment.instance());
        viewPagerAdapter.addFragment(FirstFragment.instance());

//        viewPagerAdapter.addFragment(FirstFragment.instance(),"First");
//        viewPagerAdapter.addFragment(FirstFragment.instance(),"Second");

//        viewPagerAdapter.addFragment(FirstFragment.instance(), R.drawable.icon);
//        viewPagerAdapter.addFragment(FirstFragment.instance(), R.drawable.icon);

//        viewPagerAdapter.addFragment(FirstFragment.instance(),"First", R.drawable.icon);
//        viewPagerAdapter.addFragment(FirstFragment.instance(),"Second", R.drawable.icon);

        tabLayout.setVisibility(View.GONE);

        simpleViewPager.setAdapter(viewPagerAdapter)
//                .setTabLayout(tabLayout)
                .setDotsTab(dotsTab, true)
//                .enableSwipe(false)
                .build();

//        simpleViewPager.setSelectedPosition(1);

//        dotsTab.getTabAt( 1).select();

    }
}