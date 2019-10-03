package com.nvk.viewpagerver4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class CauHoiAdapter extends PagerAdapter {
    private LayoutInflater layoutInflater;
    private List<CauHoi> cauHoiList;
    private Context context;

    public CauHoiAdapter(Context context, List<CauHoi> cauHoiList) {
        this.layoutInflater = LayoutInflater.from(context);
        this.cauHoiList = cauHoiList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return cauHoiList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.inflate(R.layout.item_cauhoi,container,false);

        final Button btnCauMot = view.findViewById(R.id.btnCauMot);
        final Button btnCauHai = view.findViewById(R.id.btnCauHai);
        final Button btnCauBa = view.findViewById(R.id.btnCauBa);
        final Button btnCauBon = view.findViewById(R.id.btnCauBon);

        CauHoi cauHoi = cauHoiList.get(position);
        btnCauMot.setText(cauHoi.getCauMot());
        btnCauHai.setText(cauHoi.getCauHai());
        btnCauBa.setText(cauHoi.getCauBa());
        btnCauBon.setText(cauHoi.getCauBon());

        Log.d("abcxyz","1");

        btnCauMot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,btnCauMot.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        btnCauHai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,btnCauHai.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        btnCauBa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,btnCauBa.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        btnCauBon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,btnCauBon.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        container.addView(view);
        return view;
    }



    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
