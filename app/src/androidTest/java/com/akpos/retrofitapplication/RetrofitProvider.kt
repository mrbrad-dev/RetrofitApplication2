package com.akpos.retrofitapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitProvider {
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://jsonplaceholder.typicode.com")
        .build()

    val placeHolderAPI = retrofit.create(PlaceHolderAPI::class.java)

}