package com.cranestylelabs.tabtest4.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cranestylelabs.tabtest4.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTab2 extends Fragment {


    public FragmentTab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        textView.setText(textView.getText() + " 2");
        return textView;
    }


}
