package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Task
import com.example.recyclerview.databinding.ItemTaskBinding

class TareasAdapter(
    private val tasksList:List<Task>,
    private val navigate: (Task) -> Unit
) : RecyclerView.Adapter<TareasViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TareasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = ItemTaskBinding.inflate(layoutInflater, parent, false)
        return TareasViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = tasksList.size


    override fun onBindViewHolder(holder: TareasViewHolder, position: Int) {
        val item = tasksList[position]
        holder.render(item, navigate)
    }

}

class TareasViewHolder(
    private val binding: ItemTaskBinding
):RecyclerView.ViewHolder(binding.root) {

    fun render(
        task: Task,
        navigate: (Task) -> Unit
    ){
        println("GPH render $task")
        binding.tvWeek.text = task.week
        binding.tvDay.text = task.day
        binding.tvHours.text = task.hours.toString()

        binding.container.setOnClickListener { navigate(task) }
    }

}