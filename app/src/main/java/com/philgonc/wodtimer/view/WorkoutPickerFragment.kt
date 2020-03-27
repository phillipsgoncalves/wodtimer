package com.philgonc.wodtimer.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.philgonc.wodtimer.R
import com.philgonc.wodtimer.viewmodel.WorkoutPickerViewModel
import kotlinx.android.synthetic.main.fragment_workout_picker.*

class WorkoutPickerFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //observe
        val viewModel = ViewModelProvider(this).get(WorkoutPickerViewModel::class.java)
        bindViews(viewModel)
    }

    private fun bindViews(viewModel: WorkoutPickerViewModel) {
        for_time_button.setOnClickListener { _ -> viewModel.handleForTimeClick() }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_workout_picker, container, false)
    }
}
