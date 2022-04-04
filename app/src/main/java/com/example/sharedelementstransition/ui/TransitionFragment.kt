package com.example.sharedelementstransition.ui

import android.transition.TransitionInflater
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.sharedelementstransition.databinding.FragmentTransitionBinding
import com.example.sharedelementstransition.utlis.BaseFragment

class TransitionFragment : BaseFragment<FragmentTransitionBinding>(FragmentTransitionBinding::inflate) {
    override fun startCreating(inflater: LayoutInflater, container: ViewGroup?) {
        init()
    }

    private fun init(){
        val animation = TransitionInflater.from(requireContext()).inflateTransition(
            android.R.transition.move
        )
        sharedElementEnterTransition = animation
        sharedElementReturnTransition = animation
    }
}