package com.studentapp.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Welcome to Student Time Management App!\n\nThis is your dashboard where you can:\n• View today's tasks\n• Check study progress\n• Manage your schedule"
    }
    val text: LiveData<String> = _text
}

