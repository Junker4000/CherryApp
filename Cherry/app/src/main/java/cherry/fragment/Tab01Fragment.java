package cherry.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cherry.cherry.R;


/**
 * A simple {@link android.app.Fragment} subclass.
 */
public class Tab01Fragment extends Fragment {


    public Tab01Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab01, container, false);
    }


}