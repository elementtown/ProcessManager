package xyz.sequence.processmanager.network.api

import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Url

/**
 * Created by moltendorf on 2017-04-16.
 */

interface DownloadAPI {
  @GET
  fun getFileFromRemote(@Url url: String): Observable<ResponseBody>
}
