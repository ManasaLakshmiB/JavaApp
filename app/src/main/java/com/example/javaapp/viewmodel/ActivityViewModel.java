package com.example.javaapp.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.javaapp.MainActivity;
import com.example.javaapp.Repository.RepoImpl;
import com.example.javaapp.Repository.Repository;
import com.example.javaapp.model.RecyclerData;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class ActivityViewModel extends ViewModel {
    MutableLiveData<List<RecyclerData>> liveData;

    @Inject
    Repository repository;
    @Inject
    public ActivityViewModel(){
        liveData = new MutableLiveData();
    }

    public  MutableLiveData<List<RecyclerData>> getLiveData(){
        return liveData;
    }
    public void makeAPICall(){
        RepoImpl repoImpl = new RepoImpl(repository);
        repoImpl.makeAPICall("flags",liveData);


    }
}
