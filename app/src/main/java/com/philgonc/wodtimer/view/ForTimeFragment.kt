package com.philgonc.wodtimer.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.philgonc.wodtimer.R
import com.philgonc.wodtimer.viewmodel.ForTimeViewModel
import kotlinx.android.synthetic.main.fragment_for_time.*

class ForTimeFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //observe
        val viewModel = ViewModelProvider(this).get(ForTimeViewModel::class.java)
        bindViews(viewModel)
    }

    private fun bindViews(viewModel: ForTimeViewModel) {
        handleTimerValue(viewModel)
        handlePlayClick(viewModel)
        handlePauseClick(viewModel)
    }

    private fun handlePauseClick(viewModel: ForTimeViewModel) {
        timer_stop_button.setOnClickListener { viewModel.onClickStopButton() }
    }

    private fun handlePlayClick(viewModel: ForTimeViewModel) {
        timer_play_button.setOnClickListener { viewModel.onClickPlayButton() }
    }

    private fun handleTimerValue(viewModel: ForTimeViewModel) {
        val elapsedTimeObserver = Observer<Long>() {
            timer_text.setText(getString(R.string.elapsed_seconds, it))
        }
        viewModel.getElapsedTime().observe(requireActivity(), elapsedTimeObserver)

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
        return inflater.inflate(R.layout.fragment_for_time, container, false)
    }
}
