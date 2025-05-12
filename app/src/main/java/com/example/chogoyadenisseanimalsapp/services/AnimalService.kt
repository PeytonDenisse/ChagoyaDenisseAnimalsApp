package com.example.chogoyadenisseanimalsapp.services

import com.example.chogoyadenisseanimalsapp.models.Animal
import com.example.chogoyadenisseanimalsapp.models.Environment
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AnimalService {

    //todos los animales
    @GET("animals")
    suspend fun getAnimals(): List<Animal>

    // animales por ambiente específico
    @GET("animals")
    suspend fun getAnimalsByEnvironment(@Query("enviromentId") envId: String): List<Animal>

    //animal por su ID
    @GET("animals/{id}")
    suspend fun getAnimalById(@Path("id") id: String): Animal

    //todos los ambientes
    @GET("enviroment")
    suspend fun getEnvironments(): List<Environment>

    //ambiente específico
    @GET("enviroment/{id}")
    suspend fun getEnvironmentById(@Path("id") id: String): Environment
}
