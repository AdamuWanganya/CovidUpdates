package tech.adamu.covidupdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import tech.adamu.covidupdates.adapters.PagerAdapter;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tabLayout) TabLayout tabLayout;
    @BindView(R.id.viewpager ) ViewPager viewPager;

    ArrayList<String> titles = new ArrayList<>();
    ArrayList<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        titles.add("Country Updates");
        titles.add("Vaccine News");
        titles.add("Favorite News");

        fragments.add(new  CountryFragment());
        fragments.add(new VaccineFragment());
        fragments.add(new FavoriteFragment());
//        TODO add fragments for Treatment Infor and Favorite;

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(),fragments,titles);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}