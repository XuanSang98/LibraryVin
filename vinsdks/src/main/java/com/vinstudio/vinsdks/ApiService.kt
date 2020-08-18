package com.vinstudio.vinsdks

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/apps")
    fun getAllApp(@Query("platform") platform : String) : Observable<Result>
    @GET("/apps/promo")
    fun getPromo(@Query("platform") platform : String) : Observable<Result>
}
