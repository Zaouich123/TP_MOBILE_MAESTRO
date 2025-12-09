import com.example.myapplication.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.example.myapplication.service.PokemonServiceInterface

object PokemonService {
    val retrofit: PokemonServiceInterface = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(PokemonServiceInterface::class.java)
}
