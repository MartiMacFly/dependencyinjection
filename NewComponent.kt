package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

@dagger.Component
interface NewComponent {

    fun injectActivity(activity: Activity)

    fun getKeyboard() : Keyboard

    fun getMemory() : Memory
}