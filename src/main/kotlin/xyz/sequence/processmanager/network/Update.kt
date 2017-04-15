package xyz.sequence.processmanager.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import xyz.sequence.processmanager.network.api.UpdateAPI

/**
 * Created by moltendorf on 2017-04-14.
 */

private val builder = Retrofit.Builder()
  .baseUrl(UpdateAPI.URL)
  .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
  .addConverterFactory(GsonConverterFactory.create())
  .build()

val Update: UpdateAPI = builder.create(UpdateAPI::class.java)
