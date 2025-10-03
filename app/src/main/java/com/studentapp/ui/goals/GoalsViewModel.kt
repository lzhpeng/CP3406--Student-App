package com.studentapp.ui.goals

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GoalsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Goal Management\n\n• Set learning goals\n• Track goal progress\n• Celebrate achievements\n• Adjust goal plans"
    }
    val text: LiveData<String> = _text
}

