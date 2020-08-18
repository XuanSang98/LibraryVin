package com.vinstudio.vinsdks

import android.util.Log
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

object RequestApi {
    fun getApps(nameOs: String):List<App>{
        var apps = listOf<App>()
        val serviceBuilder = ServiceBuilder.buildService(ApiService::class.java)
        serviceBuilder.getAllApp(nameOs)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe (
                {
                    apps = it.apps
                },
                {
                    Log.e("ERROR",it.message.toString())
                }
            )
        return apps
    }
}
