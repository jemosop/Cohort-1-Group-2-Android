package com.example.movies_poa_app.view.fragments

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.movies_poa_app.R
import com.example.movies_poa_app.viewModel.ListMoviesViewModel

class ListMoviesFragment : Fragment() {

    companion object {
        fun newInstance() = ListMoviesFragment()
    }

    private val viewModel: ListMoviesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return inflater.inflate(R.layout.fragment_list_movies, container, false)
    }
}