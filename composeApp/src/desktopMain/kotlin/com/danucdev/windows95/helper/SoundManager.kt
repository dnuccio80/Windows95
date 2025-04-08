package com.danucdev.windows95.helper

import java.io.File
import java.net.URL
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.LineEvent

class SoundManager {

    fun playSplashSound(onSoundFinished: () -> Unit) {
        val classLoader = Thread.currentThread().contextClassLoader
        val resource: URL? = classLoader.getResource("splashsound.wav")

        if (resource != null) {
            val audioInputStream = AudioSystem.getAudioInputStream(resource)
            val clip = AudioSystem.getClip()

            clip.addLineListener { event ->
                if (event.type == LineEvent.Type.STOP) {
                    clip.stop()
                    onSoundFinished()
                }
            }
            clip.open(audioInputStream)
            clip.start()
        } else {
            onSoundFinished()
        }
    }
}