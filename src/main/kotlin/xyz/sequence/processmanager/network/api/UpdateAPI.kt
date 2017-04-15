package xyz.sequence.processmanager.network.api

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import xyz.sequence.processmanager.model.UpdateResult

/**
 * Created by moltendorf on 2017-04-14.
 */

interface UpdateAPI {
  @GET("update")
  fun getLatestInfo(
    @Query("version") version: String)
    : Observable<UpdateResult>

  companion object {
    val URL = "https://moltendorf.net/ci//job/sequence-develop/lastStableBuild/api/json/"
  }
}

