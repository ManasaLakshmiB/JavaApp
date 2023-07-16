package com.example.javaapp.di;

import com.example.javaapp.Repository.Repository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    String  Base_URL= "https://restcountries.com/v3.1/";//all?fields=flags
    //https://restcountries.com/v3.1/all?fields=flags

    @Singleton
    @Provides
    public Repository getrepository(Retrofit retrofit){
        return retrofit.create(Repository.class);

    }
    @Singleton
    @Provides
    public Retrofit getRetrofitInstance(){
        return new Retrofit.Builder()
                .baseUrl(Base_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
