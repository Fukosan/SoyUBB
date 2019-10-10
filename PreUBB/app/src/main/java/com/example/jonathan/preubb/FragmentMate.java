package com.example.jonathan.preubb;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMate extends Fragment implements View.OnClickListener {

    public FragmentMate() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_fragment_mate, container, false);
        v.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Ensayo.class);
                startActivity(intent);
                //do your operation here
                // this will be called whenever user click anywhere in Fragment
            }
        });
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_mate, container, false);
    }

    @Override
    public void onClick(View v) {

    }
}
