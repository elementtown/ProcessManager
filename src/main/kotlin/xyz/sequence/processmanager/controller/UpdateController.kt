package xyz.sequence.processmanager.controller

import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import xyz.sequence.processmanager.ProcessManager
import xyz.sequence.processmanager.d
import xyz.sequence.processmanager.i
import xyz.sequence.processmanager.network.api.UpdateAPI

/**
 * Created by moltendorf on 2017-04-15.
 */
class UpdateController {
  companion object {
    val API: UpdateAPI

    fun CheckForUpdate() {
      val observable = API.getLatestInfo(ProcessManager.VERSION)

      observable.subscribeOn(Schedulers.io())
      observable.observeOn(Schedulers.computation())
      observable.doOnError { error -> d { "Could not check for updates." } }
      observable.subscribe { response ->
        if (response.version != ProcessManager.VERSION) {
          // Download latest version.
          i { "Downloading latest version from ${response.downloadURL}." }

          //val observable =
        }

        // Looks like this file wasn't even here for some reason lmao.
      }
    }

    init {
      val builder = Retrofit.Builder()
        .baseUrl(UpdateAPI.URL)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
        .addConverterFactory(GsonConverterFactory.create())
        .build()

      API = builder.create(UpdateAPI::class.java)
    }
  }
}
