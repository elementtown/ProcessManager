package xyz.sequence.processmanager

import xyz.sequence.processmanager.util.Manifest

/**
 * Created by moltendorf on 2017-04-08.
 *
 * Feel free to add comments if you're curious.
 */

/* This is a comment. Notice how it starts and ends.
   They can also be multi-line in this style. */

// This is also a comment, it goes until the end of the line.
// For multiple lines in this style just add multiple // to each line.

// While everyone can edit this repository, since it will be production code on my server, everything is safely checked and committed via Git.
// I'll keep the comments though (since they won't actually break any code if you're responsible).

// If I'm online and you want to see me edit in real time, click on the Collaborate menu at the top, and select Follow Changes (with the magnet icon).

fun main(args: Array <String>) {
  i { "Starting ProcessManager ${ProcessManager.VERSION}." }
}

class ProcessManager {
  companion object {
    val PROJECT: String = Manifest.GetProperty("Release-Name")
    val VERSION: String = Manifest.GetProperty("Release-Version")
  }
}
