package com.example.uaspam18112501.event

import com.example.uaspam18112501.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}