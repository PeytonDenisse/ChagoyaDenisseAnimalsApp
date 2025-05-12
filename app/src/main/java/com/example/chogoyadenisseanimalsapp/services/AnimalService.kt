package com.example.chogoyadenisseanimalsapp.services

import com.example.chogoyadenisseanimalsapp.models.Animal
import com.example.chogoyadenisseanimalsapp.models.Environment
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AnimalService {

    @GET("animals")
    suspend fun getAnimals(): List<Animal>

    @GET("animals")
    suspend fun getAnimalsByEnvironment(@Query("enviromentId") envId: String): List<Animal>

    @GET("animals/{id}")
    suspend fun getAnimalById(@Path("id") id: String): Animal

    //
    @GET("enviroment")
    suspend fun getEnvironments(): List<Environment>

    @GET("enviroment/{id}")
    suspend fun getEnvironmentById(@Path("id") id: String): Environment
}
