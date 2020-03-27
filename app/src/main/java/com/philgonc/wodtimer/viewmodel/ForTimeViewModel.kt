package com.philgonc.wodtimer.viewmodel

import android.os.SystemClock
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*
import kotlin.concurrent.timerTask

class ForTimeViewModel : ViewModel() {

    val mElapsedTimeCounter: MutableLiveData<Long> = MutableLiveData<Long>()
    val timer = Timer()

    public fun getElapsedTime(): LiveData<Long> {
        return this.mElapsedTimeCounter
    }

    fun onClickPlayButton() {
        val initialTime = SystemClock.elapsedRealtime()
        timer.scheduleAtFixedRate(timerTask {
            val timerValue = (SystemClock.elapsedRealtime() - initialTime) / 1000
            mElapsedTimeCounter.postValue(timerValue)
        }, 1000, 1000)
    }

    fun onClickStopButton() {
        timer.cancel()
    }


}