package com.imobile3.spacexsample.ui;

import android.os.Bundle;
import android.widget.Toast;

import com.imobile3.spacexsample.R;
import com.imobile3.spacexsample.dto.Launch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LaunchViewModel mLaunchViewModel;
    private LaunchAdapter mLaunchAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initViewModel();
    }

    private void initViews() {
        mLaunchAdapter = new LaunchAdapter(this);
        RecyclerView recyclerView = findViewById(R.id.list_launches);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(mLaunchAdapter);
    }

    private void initViewModel() {
        mLaunchViewModel = ViewModelProviders.of(this,
                new ViewModelProvider.NewInstanceFactory()).get(LaunchViewModel.class);

        mLaunchViewModel.getLaunches().observe(this, launches -> {
            if (launches != null) {
                syncUi(launches);
            } else {
                Toast.makeText(MainActivity.this, "Error loading launches",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    private void syncUi(@NonNull List<Launch> launches) {
        // Set data to adapter
        mLaunchAdapter.setLaunches(launches);
    }
}
