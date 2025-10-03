package com.studentapp.ui.courses

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CoursesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Course Management\n\n• Add new courses\n• View course list\n• Manage course schedule\n• Track learning progress"
    }
    val text: LiveData<String> = _text
}

