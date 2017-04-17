package xyz.sequence.processmanager

/**
 * Created by moltendorf on 2017-04-15.
 */

inline fun i (s: () -> String) {
  println("[INFO] ${s.invoke()}")
}

inline fun d (s: () -> String) {
  println("[DEBUG] ${s.invoke()}")
}
