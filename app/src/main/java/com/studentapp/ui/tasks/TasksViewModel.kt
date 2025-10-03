package com.studentapp.ui.tasks

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TasksViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Task Management\n\n• Create new tasks\n• Set task priorities\n• Track task progress\n• Complete task reminders"
    }
    val text: LiveData<String> = _text
}

