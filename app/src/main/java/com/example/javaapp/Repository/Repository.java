package com.example.javaapp.Repository;

import com.example.javaapp.model.RecyclerData;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Repository {
    @GET("all")
    Call<List<RecyclerData>> getDataFromApi(@Query("fields") String query);
}
