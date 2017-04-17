package xyz.sequence.processmanager.util

import xyz.sequence.processmanager.ProcessManager
import java.net.URL
import java.util.jar.Manifest

/**
 * Created by moltendorf on 2017-04-16.
 */
class Manifest {
  companion object {
    /**
     * Get a property from the manifest file bundled with the jar.
     * Provides no mechanism for handling errors. Will crash if property does not exist. Only use for initial setup.
     * 
     * @param key
     */
    fun GetProperty(key: String): String {
      val clazz = ProcessManager::class.java
      val className = clazz.simpleName + ".class"

      val classPath = clazz.getResource(className).toString()

      val manifestPath = classPath.substring(0, classPath.lastIndexOf("!") + 1) + "/META-INF/MANIFEST.MF"
      val manifest = Manifest(URL(manifestPath).openStream())
      val attr = manifest.mainAttributes

      return attr.getValue(key)
    }
  }
}
