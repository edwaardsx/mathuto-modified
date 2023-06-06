package tip.capstone.mathuto.fragments.lesson1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tip.capstone.mathuto.databinding.ActivityFragmentWhatIsItBinding

class WhatIsItFragment : Fragment() {

    private lateinit var binding: ActivityFragmentWhatIsItBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ActivityFragmentWhatIsItBinding.inflate(inflater, container, false)
        return binding.root
    }

    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }*/
}