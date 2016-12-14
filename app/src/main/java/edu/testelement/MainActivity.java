package edu.testelement;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new Data();

        mViewPager = (ViewPager)findViewById(R.id.viewpager);
        mViewPager.setAdapter(new MyPagerAdaptert(getSupportFragmentManager()));
    }

    private class MyPagerAdaptert extends FragmentStatePagerAdapter{

        public MyPagerAdaptert(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return PageFragment.newInstance(data.getMen());
                case 1: return PageFragment.newInstance(data.getWomen());
                default: return PageFragment.newInstance(data.getMen());
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
