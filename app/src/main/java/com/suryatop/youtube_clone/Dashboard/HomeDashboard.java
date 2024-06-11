package com.suryatop.youtube_clone.Dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.suryatop.youtube_clone.ChannelDashboardFragment;
import com.suryatop.youtube_clone.R;

public class HomeDashboard extends Fragment {


    public HomeDashboard() {
        // Required empty public constructor
    }

    public static HomeDashboard newInstance() {
        HomeDashboard fragment = new HomeDashboard();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.dashboard_home, container, false);
    }
}