package com.philgonc.wodtimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.philgonc.wodtimer.view.WorkoutPickerFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        savedInstanceState?.let { openWorkoutPickerView() }
    }

    private fun openWorkoutPickerView() {
        supportFragmentManager.beginTransaction()
            .add(R.id.main_activity_container, WorkoutPickerFragment(), "workout_picker").commit()
    }
}
