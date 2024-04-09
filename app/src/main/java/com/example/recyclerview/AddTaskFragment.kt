package com.example.recyclerview


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.fragment.app.Fragment
import com.example.recyclerview.databinding.FragmentAddTaskBinding

class AddTaskFragment(
    private val layout:Int = R.layout.fragment_add_task
) : Fragment() {

    private val viewModel: AddTareaViewModel by viewModels()
    private lateinit var binding: FragmentAddTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, layout, container, false) as FragmentAddTaskBinding
        return binding.root
    }

}