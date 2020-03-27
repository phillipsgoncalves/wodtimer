package com.philgonc.wodtimer.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.philgonc.wodtimer.R
import com.philgonc.wodtimer.R.id.main_activity_container

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openWorkoutPickerView()
        //savedInstanceState?.let { openWorkoutPickerView() }
    }

    private fun openWorkoutPickerView() {
        supportFragmentManager.beginTransaction()
            .add(main_activity_container, ForTimeFragment(), "workout_picker").commit()
    }
}
