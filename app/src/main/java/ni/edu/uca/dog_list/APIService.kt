package ni.edu.uca.dog_list

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

// Interfaz con la peticion GET

interface APIService {
    @GET
   suspend fun getDogsByBreeds(@Url url:String):Response<DogResponse>
}