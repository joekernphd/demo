package com.example.joe.demo;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TestFragment extends Fragment implements View.OnClickListener{

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.layout_test, container, false);

        Button action = myView.findViewById(R.id.action);
        action.setOnClickListener(this);

        return myView;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.action :
                TextView display = myView.findViewById(R.id.userDisplay);
                EditText input = myView.findViewById(R.id.userInput);
                display.setText(input.getText().toString());
                MainActivity mainActivity = (MainActivity) getActivity();
                //Toast.makeText(getActivity(), mainActivity.username, Toast.LENGTH_LONG).show();
                mainActivity.cryptodaddies();
        }
    }
}
