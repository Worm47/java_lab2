package com.example.lab1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BlankFragment extends Fragment {
fragmentList mlist;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mlist=(fragmentList) context;
    }

    public BlankFragment() {


    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        Button btn1 = rootView.findViewById(R.id.btn1);
        Button btn2 = rootView.findViewById(R.id.btn2);
        Button btn3 = rootView.findViewById(R.id.btn3);

        btn1.setOnClickListener(View -> {
            if (mlist != null) {
                mlist.sendMessageToActivity("Message From Fragment 1");
            }
        });

        btn2.setOnClickListener(View -> {
            if (mlist != null) {
                mlist.sendMessageToActivity("Message From Fragment 2");
            }
        });

        btn3.setOnClickListener(View -> {
            if (mlist != null) {
                mlist.sendMessageToActivity("Message From Fragment 3");
            }
        });

        return rootView;
    }

    public interface fragmentList {
        void sendMessageToActivity(String messageFromFragment);
    }
}

