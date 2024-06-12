package com.example.movies_poa_app.view.fragments

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movies_poa_app.R
import com.example.movies_poa_app.viewModel.NowPlayingViewModel

class NowPlayingFragment : Fragment() {

    companion object {
        fun newInstance() = NowPlayingFragment()
    }

    private val viewModel: NowPlayingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return inflater.inflate(R.layout.fragment_now_playing, container, false)
    }
}