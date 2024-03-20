package com.john.todoandroid.Home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.john.todoandroid.Constants.Constants
import com.john.todoandroid.Home.AddTaskBottomSheetFragment.AddTaskBottomSheetFragment
import com.john.todoandroid.Home.Settings.SettingsFragment
import com.john.todoandroid.Home.Tasks.TasksListFragment
import com.john.todoandroid.R
import com.john.todoandroid.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        setSelectedFragment()
    }


    private fun initView() {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setUpFloatingActionButton()
        setContentView(binding.root)
    }

    private fun setUpFloatingActionButton() {
        binding.fab.setOnClickListener{
            AddTaskBottomSheetFragment().show(supportFragmentManager , Constants.BOTTOM_SHEET_TAG)
        }
    }

    private fun setSelectedFragment() {
        binding.bottomNavigationView.setOnItemSelectedListener {
            pushFragment(
                when (it.itemId) {
                    R.id.navigation_tasks -> {
                        TasksListFragment()
                    }
                    R.id.navigation_settings -> {
                        SettingsFragment()
                    }
                    else -> TasksListFragment()
                }
            )
            true
        }
        binding.bottomNavigationView.selectedItemId = R.id.navigation_tasks
    }

    private fun pushFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.content_fragment, fragment).commit()
    }

}