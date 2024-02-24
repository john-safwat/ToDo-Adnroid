package com.john.todoandroid.Home.Tasks

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.john.todoandroid.Models.CalenderDate
import com.john.todoandroid.R
import com.john.todoandroid.databinding.ItemDateCardBinding

class TasksListRecyclerView(
    private var dateList: MutableList<CalenderDate>,
    private var selectedItemPos: Int = 0,
    private var oldPos: Int = 0
) : RecyclerView.Adapter<TasksListRecyclerView.ViewHolder>() {

    class ViewHolder(var viewBinding: ItemDateCardBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bind(calenderDate: CalenderDate) {
            viewBinding.textViewDayName.text = calenderDate.dayOfWeek
            viewBinding.textViewDayNumber.text = calenderDate.number
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
        return dateList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(dateList[position])
        holder.viewBinding.textViewDayName.setTextColor(Color.parseColor("#000000"))
        holder.viewBinding.textViewDayNumber.setTextColor(Color.parseColor("#000000"))

        if(selectedItemPos == position){
            holder.viewBinding.textViewDayName.setTextColor(Color.parseColor("#5D9CEC"))
            holder.viewBinding.textViewDayNumber.setTextColor(Color.parseColor("#5D9CEC"))
        }

        onItemClickListener.let {
            holder.itemView.setOnClickListener {
                oldPos = selectedItemPos
                selectedItemPos = position
                onItemClickListener?.onClickListener(dateList[position], position)
                notifyItemChanged(position)
                notifyItemChanged(oldPos)
            }
        }
    }


    fun interface OnItemClickListener {
        fun onClickListener(calenderDate: CalenderDate, position: Int)
    }

    var onItemClickListener: OnItemClickListener? = null;

}