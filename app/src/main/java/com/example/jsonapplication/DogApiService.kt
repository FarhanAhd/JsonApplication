package com.example.jsonapplication

import retrofit2.Call
import retrofit2.http.GET

interface DogApiService {
    @GET("breeds/image/random/10")
    fun getRandomDogs(): Call<DogResponse>
}
