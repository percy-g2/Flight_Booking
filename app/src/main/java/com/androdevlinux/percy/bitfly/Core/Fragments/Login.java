package com.androdevlinux.percy.bitfly.Core.Fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.androdevlinux.percy.bitfly.R;

/**
 * Created by percy on 24/09/2016.
 */

public class Login extends Fragment {

    private View rootView;

    private static final String TAG = "LoginActivity";

    private static final int REQUEST_SIGNUP = 0;

    //EditText
    private EditText input_email;
    private EditText input_password;

    //Button
    private Button btn_login;
    private Button btn_login_google;
    private Button btn_login_facebook;

    public Login () {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rootView = inflater.inflate(R.layout.login, container, false);

        input_email = (EditText) rootView.findViewById(R.id.input_email);
        input_password = (EditText) rootView.findViewById(R.id.input_password);

        btn_login = (Button) rootView.findViewById(R.id.btn_login);
        btn_login_google = (Button) rootView.findViewById(R.id.btn_login_google);
        btn_login_facebook = (Button) rootView.findViewById(R.id.btn_login_facebook);

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
