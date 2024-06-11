package com.example.coroutinezerotohero

import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServices {

@GET("/api/10231813113486884/search/{name}")
suspend fun getSuperHeroes(@Path("name") superheroName:String):Response<SuperHeroResponse>
}
data class SuperHeroResponse(@SerializedName("response") val  response:String)