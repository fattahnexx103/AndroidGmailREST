package com.neehad.gmailrest.network;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    public static final String BASE_URL = "https://api.androidhive.info/json/";

    private static Retrofit retrofit = null; //creating retorfit object

    public static Retrofit getClient(){

        if(retrofit == null){ //if there is no current connection
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL) //takes in url
                    .addConverterFactory(GsonConverterFactory.create()) //convers json to gson
                    .build(); //builds request
        }
        return retrofit;
    }
}
