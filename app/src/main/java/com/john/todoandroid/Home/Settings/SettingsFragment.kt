package com.john.todoandroid.Home.Settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.john.todoandroid.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {
    private lateinit var viewBinding: FragmentSettingsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentSettingsBinding.inflate(inflater , container , false)
        return viewBinding.root
    }
}