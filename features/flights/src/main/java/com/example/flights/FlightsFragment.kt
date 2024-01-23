package com.example.flights

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.flights.databinding.FragmentFlightsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FlightsFragment : Fragment() {


    lateinit var binding: FragmentFlightsBinding
    val viewModel : FlightsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFlightsBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
                viewModel.getFlightsData()
        }

        viewModel.data.observe(viewLifecycleOwner) {

        }
    }


}