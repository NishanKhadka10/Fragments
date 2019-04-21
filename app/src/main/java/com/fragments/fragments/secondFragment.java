package com.fragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class secondFragment extends Fragment implements View.OnClickListener {
    private EditText etradius;
    private Button btnAreaofcircle;

    public secondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_second, container, false);

        etradius = view.findViewById(R.id.etradius);
        btnAreaofcircle = view.findViewById(R.id.btnAreaofcircle);
        btnAreaofcircle.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        float radius = Float.parseFloat(etradius.getText().toString());
        float area = 3.14f * radius * radius;
        Toast.makeText(getActivity(),"Area of Circle:" + area, Toast.LENGTH_LONG).show();

    }
}
