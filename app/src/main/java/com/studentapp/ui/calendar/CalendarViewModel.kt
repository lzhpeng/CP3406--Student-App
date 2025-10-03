package com.studentapp.ui.calendar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalendarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Calendar View\n\n• View your schedule\n• Add new events\n• Manage your timetable\n• Set reminders"
    }
    val text: LiveData<String> = _text
}

