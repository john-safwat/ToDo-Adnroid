package com.john.todoandroid.Home.AddTaskBottomSheetFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.john.todoandroid.databinding.FragmentBottomSheetBinding

class AddTaskBottomSheetFragment : BottomSheetDialogFragment() {

    lateinit var binding:FragmentBottomSheetBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBottomSheetBinding.inflate(inflater ,container , false)
        return binding.root
    }

}