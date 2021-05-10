package ru.androidschool.intensiv.network

import com.squareup.picasso.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import ru.androidschool.intensiv.BuildConfig.BASE_URL
import ru.androidschool.intensiv.network.MovieApiClient.BASE_URL


object MovieApiClient{
    private const val BASE_URL = ru.androidschool.intensiv.BuildConfig.BASE_URL

    private var client: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply{
            this.level = HttpLoggingInterceptor.Level.BODY
        })
        .build()

    val apiClient:MovieApiInterface by lazy {

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        return@lazy retrofit.create(MovieApiInterface::class.java)
    }
}
