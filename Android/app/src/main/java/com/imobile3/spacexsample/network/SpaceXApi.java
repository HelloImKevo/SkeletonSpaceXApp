package com.imobile3.spacexsample.network;

import com.imobile3.spacexsample.dto.Launch;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface SpaceXApi {

    @GET("launches")
    Call<List<Launch>> listAllLaunches();
}
