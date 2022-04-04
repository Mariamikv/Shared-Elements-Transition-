package com.example.sharedelementstransition.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.sharedelementstransition.R
import com.example.sharedelementstransition.databinding.FragmentMainBinding
import com.example.sharedelementstransition.utlis.BaseFragment

class MainFragment : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {
    override fun startCreating(inflater: LayoutInflater, container: ViewGroup?) {
        init()
    }

    private fun init(){
        binding.ivImage.setOnClickListener {
            val extras = FragmentNavigatorExtras(binding.ivImage to "image_big")
            findNavController().navigate(
                R.id.action_mainFragment_to_transitionFragment,
                null,
                null,
                extras
            )
        }
    }
}