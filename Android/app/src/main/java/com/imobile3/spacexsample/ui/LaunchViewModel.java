package com.imobile3.spacexsample.ui;

import com.imobile3.spacexsample.dto.Launch;
import com.imobile3.spacexsample.network.RetrofitManager;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class LaunchViewModel extends ViewModel {

    private MutableLiveData<List<Launch>> mLaunches;

    public LaunchViewModel() {
        mLaunches = new MutableLiveData<>();
        loadAllLaunches();
    }

    public LiveData<List<Launch>> getLaunches() {
        return mLaunches;
    }

    private void loadAllLaunches() {
        Call<List<Launch>> call = RetrofitManager.getInstance()
                .getClient().listAllLaunches();
        call.enqueue(new Callback<List<Launch>>() {
            @Override
            public void onResponse(@NonNull Call<List<Launch>> call,
                    @NonNull Response<List<Launch>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    mLaunches.postValue(response.body());
                } else {
                    mLaunches.postValue(null);
                }
            }

            @Override
            public void onFailure(@NonNull Call<List<Launch>> call, @NonNull Throwable t) {
                mLaunches.postValue(null);
            }
        });
    }
}
