package xyz.sequence.processmanager.model

/**
 * Created by moltendorf on 2017-04-14.
 */

class UpdateResult(
  val version: String?, // If you uncheck the collaborate option, you can also edit the files too.
  val /* just don't do weird stuff like putting comments mid-line like this */ downloadURL: String? // Comments look like this and can go virtually anywhere.
)
