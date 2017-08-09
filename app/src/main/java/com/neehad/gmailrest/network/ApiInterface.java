package com.neehad.gmailrest.network;


import com.neehad.gmailrest.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

import static com.neehad.gmailrest.network.ApiInterface.filepath;

public interface ApiInterface {

    String filepath = "inbox.json";

    @GET(filepath)
    Call<List<Message>> getInbox();
}
