package com.john.todoandroid.Home.Tasks

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.graphics.blue
import androidx.recyclerview.widget.RecyclerView
import com.john.todoandroid.Models.CalenderDate
import com.john.todoandroid.R
import com.john.todoandroid.databinding.ItemDateCardBinding

class TasksListRecyclerView (private var dateList: MutableList<CalenderDate>): RecyclerView.Adapter<TasksListRecyclerView.ViewHolder>() {

    class ViewHolder(private var viewBinding: ItemDateCardBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        private var selectedIndex = 0
        fun bind(calenderDate: CalenderDate , position: Int) {
            viewBinding.textViewDayName.text = calenderDate.dayOfWeek
            viewBinding.textViewDayNumber.text = calenderDate.number
            if(selectedIndex == position){
                viewBinding.textViewDayName.setTextColor(R.attr.onCardColor)
                viewBinding.textViewDayNumber.setTextColor(R.attr.onCardColor)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemDateCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return  dateList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dateList[position] , position)
    }

}