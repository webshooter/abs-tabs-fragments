package com.cranestylelabs.tabtest4.activities;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.cranestylelabs.tabtest4.R;
import com.cranestylelabs.tabtest4.fragments.FragmentTab1;
import com.cranestylelabs.tabtest4.fragments.FragmentTab2;
import com.cranestylelabs.tabtest4.fragments.FragmentTab3;
import com.cranestylelabs.tabtest4.fragments.FragmentTab4;


public class MainActivity extends SherlockActivity implements ActionBar.TabListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int tabCount = 4;

        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        for (int i=0; i < tabCount; i++) {
            ActionBar.Tab tab = getSupportActionBar().newTab();
            tab.setText("Tab " + (i+1));
            tab.setTag("TAG" + (i+1));
            tab.setTabListener(this);
            getSupportActionBar().addTab(tab);
        }
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        // When the given tab is selected, show the tab contents in the container view.
        Fragment fragment = null;
        switch(tab.getPosition()) {
            case 0:
                fragment = new FragmentTab1();
                break;
            case 1:
                fragment = new FragmentTab2();
                break;
            case 2:
                fragment = new FragmentTab3();
                break;
            case 3:
                fragment = new FragmentTab4();
                break;
        }
        getFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        //
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        //
    }
}
