package com.example.viewpagercours;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    String[] Produits=new String[]{"Stylo","Carnet","Feuilles Blanches","Crayon"};
    double[] Prix = new double[]{15.5, 25,35,3};
    int[] Photos= new int[]{R.drawable.ic_stylo,R.drawable.ic_carnet,R.drawable.ic_feuille,R.drawable.ic_crayon};

    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        MyPagerFragment F=new MyPagerFragment();
        Bundle B=new Bundle();
        B.putString("NomPro",Produits[position]);
        B.putDouble("PrixPro",Prix[position]);
        B.putInt("ImgPro",Photos[position]);
        F.setArguments(B);
        return F;
    }

    @Override
    public int getCount() {
        return Produits.length;
    }
}
