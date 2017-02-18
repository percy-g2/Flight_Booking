package com.androdevlinux.percy.bitfly.Core.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androdevlinux.percy.bitfly.R;

/**
 * Created by percy on 24/09/2016.
 */

public class Search extends Fragment{

    public Search () {}

    private View rootView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.search_fragment, container, false);


        return rootView;
    }
}
