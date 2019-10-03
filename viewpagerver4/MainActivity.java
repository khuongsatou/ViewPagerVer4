package com.nvk.viewpagerver4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager vpgShowCauHoi;
    private CauHoiAdapter cauHoiAdapter;
    List<CauHoi> cauHoiList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Radiation();
        CreatePagerAdapter();
    }

    private void CreatePagerAdapter() {
        cauHoiList = new ArrayList<>();
        cauHoiList.add(new CauHoi("Ngôi nhà","Núi","Đại dương","Biển"));
        cauHoiList.add(new CauHoi("Ngôi nhà 1","Núi","Đại dương","Biển"));
        cauHoiList.add(new CauHoi("Ngôi nhà 2","Núi","Đại dương","Biển"));
        cauHoiList.add(new CauHoi("Ngôi nhà 3","Núi","Đại dương","Biển"));
        cauHoiList.add(new CauHoi("Ngôi nhà 4","Núi","Đại dương","Biển"));

        cauHoiAdapter = new CauHoiAdapter(this,cauHoiList);
        vpgShowCauHoi.setAdapter(cauHoiAdapter);
    }

    @Override
    public void onBackPressed() {
        if (vpgShowCauHoi.getCurrentItem() == 0){
            super.onBackPressed();
        }else{
            vpgShowCauHoi.setCurrentItem(vpgShowCauHoi.getCurrentItem() - 1);
        }

    }

    private void Radiation() {
        vpgShowCauHoi = findViewById(R.id.vpgShowCauHoi);
    }
}
