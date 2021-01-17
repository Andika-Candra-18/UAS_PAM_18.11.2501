package com.example.uaspam18112501.event

import com.example.uaspam18112501.model.Event

interface EventView{
        fun showLoading()
        fun hideLoading()
        fun showEventList(data: List<Event>)
    }

}