package com.example.flights

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.common.flowstate.Status
import com.example.flights.databinding.FragmentFlightsBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FlightsFragment : Fragment() {


    lateinit var binding: FragmentFlightsBinding
    val viewModel: FlightsViewModel by viewModels()

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
            lifecycleScope.launch {
                viewModel.getFlightsList()
            }
        }

        viewModel.data.observe(viewLifecycleOwner) {

        }

        fun showLoading(isLoading: Boolean) {}

        lifecycleScope.launch {
            viewModel.state.collectLatest { state ->
                state?.let {
                    when (it.status) {
                        Status.SUCCESS -> showLoading(false)
                        Status.ERROR -> showLoading(false)
                        Status.LOADING -> showLoading(true)
                    }
                }
            }

        }




    }
}