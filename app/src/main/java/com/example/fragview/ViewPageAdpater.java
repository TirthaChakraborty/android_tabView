package com.example.fragview;
import android.content.Context;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPageAdpater extends FragmentPagerAdapter {
   private final String[] PAGE_TITILE=new String[4];
    private final Context context = null;

    public ViewPageAdpater(FragmentManager fm){
      super(fm);
      PAGE_TITILE[0]="PageOne";
      PAGE_TITILE[1]="PageTwo";
      PAGE_TITILE[2]="PageThree";
      PAGE_TITILE[3]="PageFour";
    }
    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: return new Fragment1();
            case 1: return new Fragment2();
            case 2: return new Fragment3();
            case 3: return new Fragment4();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){ //Tab_Layout
        return PAGE_TITILE[position];
    }

}
