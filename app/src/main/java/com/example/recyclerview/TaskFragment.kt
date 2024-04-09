package com.example.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.recyclerview.adapter.TareasAdapter
import com.example.recyclerview.databinding.FragmentTaskBinding


class TaskFragment(
    private val layout: Int = R.layout.fragment_task
) : Fragment() {

    private lateinit var binding: FragmentTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, layout, container, false) as FragmentTaskBinding
        initRecyclerView()
        return binding.root
    }


    private fun initRecyclerView() {
        binding.rvTasks.adapter = TareasAdapter(TaskListProvider.taskList, ::navigate)

    }

    private fun navigate(task: Task) {
        //Nav directions
        //Codelab Base de Datos
        //TaskDetails
        binding.addButtom.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_itemFragment_to_addTask)
        )
    }

}