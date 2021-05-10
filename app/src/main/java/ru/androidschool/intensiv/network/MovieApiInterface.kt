package ru.androidschool.intensiv.network

import com.xwray.groupie.BuildConfig
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import ru.androidschool.intensiv.BuildConfig.BUILD_TYPE
import ru.androidschool.intensiv.BuildConfig.THE_MOVIE_DATABASE_API
import ru.androidschool.intensiv.data.MovieResponse
import java.util.*


interface MovieApiInterface{

    @GET("movie/now_playing")
    fun getNowPlayingMovies(@Query("api_key")apiKey: String = ru.androidschool.intensiv.BuildConfig.THE_MOVIE_DATABASE_API): Observable<MovieResponse>

    @GET("movie/upcoming")
    fun getUpComingMovies(@Query("api_key")akiKey:String = ru.androidschool.intensiv.BuildConfig.THE_MOVIE_DATABASE_API): Observable<MovieResponse>

    @GET("movie/popular")
    fun getPopularMovies(@Query("api_key")akiKey: String = ru.androidschool.intensiv.BuildConfig.THE_MOVIE_DATABASE_API): Observable<MovieResponse>
}
