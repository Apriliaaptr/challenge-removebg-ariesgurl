package com.example.challenge_removebg_ariesgurl.services;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {
    @Multipart
    @POST("removebg")
    Call<ResponseBody> doUpload(@Part MultipartBody.Part photo);
}
