package com.apliecream.boardproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.apliecream.boardproject.R
import com.apliecream.boardproject.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)


        binding.boardTap.setOnClickListener{

            it.findNavController().navigate(R.id.action_homeFragment_to_boardFragment2)

        }

        binding.markTap.setOnClickListener{

            it.findNavController().navigate(R.id.action_homeFragment_to_markFragment2)

        }



        return binding.root
    }


}