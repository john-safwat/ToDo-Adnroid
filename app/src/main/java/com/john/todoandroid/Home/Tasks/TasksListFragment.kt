package com.john.todoandroid.Home.Tasks

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.john.todoandroid.Models.CalenderDate
import com.john.todoandroid.databinding.FragmentTaskListBinding
import java.time.LocalDate

class TasksListFragment : Fragment() {

    private lateinit var viewBinding: FragmentTaskListBinding
    private lateinit var adapter: TasksListRecyclerView

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        viewBinding = FragmentTaskListBinding.inflate(inflater, container, false);
        initRecyclerView()
        return viewBinding.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun initRecyclerView() {
        adapter = TasksListRecyclerView(createListOfCalender())
        adapter.onItemClickListener =
            TasksListRecyclerView.OnItemClickListener { calenderDate, position ->
                    Log.e("Date" ,calenderDate.date.toString())
            }
        viewBinding.dateItemsRecyclerview.adapter = adapter
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun createListOfCalender(): MutableList<CalenderDate> {

        val dateList: MutableList<CalenderDate> = arrayListOf()
        for (i in 0..400) {
            val today = LocalDate.now().plusDays(i.toLong());
            dateList.add(
                CalenderDate(
                    date = today,
                    dayOfWeek = replaceDayShortCut(today.dayOfWeek.toString()),
                    number = today.dayOfMonth.toString(),
                    selected = (i == 0)
                )
            )
        }
        return dateList

    }

    private fun replaceDayShortCut(dayName: String): String {
        return when (dayName) {
            "THURSDAY" -> "Thu"
            "FRIDAY" -> "Fri"
            "SATURDAY" -> "Sat"
            "SUNDAY" -> "Sun"
            "MONDAY" -> "Mon"
            "TUESDAY" -> "Tue"
            else -> "Wed"
        }
    }


}