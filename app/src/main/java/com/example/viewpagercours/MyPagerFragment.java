package com.example.viewpagercours;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyPagerFragment extends Fragment {
    TextView txtNom,txtPrix;
    ImageView img;

    public MyPagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_my_pager, container, false);
        txtNom=v.findViewById(R.id.txtNom);
        txtPrix=v.findViewById(R.id.txtPrix);
        img= v.findViewById(R.id.img);

        String NomP=getArguments().getString("NomPro");
        double PrixP=getArguments().getDouble("PrixPro");
        int imgP=getArguments().getInt("ImgPro");

        txtNom.setText(NomP);
        txtPrix.setText(PrixP+"");
        img.setImageResource(imgP);
        return v;
    }
}
