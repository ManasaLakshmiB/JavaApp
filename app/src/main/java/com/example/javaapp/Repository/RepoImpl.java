package com.example.javaapp.Repository;

import androidx.lifecycle.MutableLiveData;

import com.example.javaapp.model.RecyclerData;
import com.example.javaapp.model.RecyclerList;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepoImpl {

    private Repository repository;

    public RepoImpl(Repository repository) {
        this.repository = repository;
    }
    public  void makeAPICall(String query, MutableLiveData<List<RecyclerData>> liveData){
        Call<RecyclerData[]> call =repository.getDataFromApi(query);







        call.enqueue(new Callback<RecyclerData[]>() {
            @Override
            public void onResponse(Call<RecyclerData[]> call, Response<RecyclerData[]> response) {
                if(response.isSuccessful()){
                    liveData.postValue(Arrays.asList(response.body()));
                }else {
                    liveData.postValue(null);
                }

            }

            @Override
            public void onFailure(Call<RecyclerData[]> call, Throwable t) {
                liveData.postValue(null);

            }
        });
    }
}