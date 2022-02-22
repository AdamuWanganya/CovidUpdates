package tech.adamu.covidupdates.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragmentList;
    private ArrayList<String> tittlesList;

public PagerAdapter(FragmentManager fragmentManager, ArrayList<Fragment> fragments, ArrayList<String> tittlesList) {
    super(fragmentManager);
    this.tittlesList = tittlesList;
    this.fragmentList = fragments;
    }

    public String getPageTitle(int position){
    return tittlesList.get(position);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
