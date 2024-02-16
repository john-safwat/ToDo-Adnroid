package com.john.todoandroid.Home.Tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.john.todoandroid.databinding.FragmentTaskListBinding

class TasksListFragment : Fragment() {

    private lateinit var viewBinding: FragmentTaskListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentTaskListBinding.inflate(inflater , container , false);
        return  viewBinding.root
    }

}