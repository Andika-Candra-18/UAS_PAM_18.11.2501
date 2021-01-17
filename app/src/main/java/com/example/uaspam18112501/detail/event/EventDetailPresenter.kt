package com.example.uaspam18112501.detail.event


import com.google.gson.Gson
import com.example.uaspam18112501.api.ApiRepository
import com.example.uaspam18112501.api.TheSportDBApi
import com.example.uaspam18112501.event.EventDetailView
import com.example.uaspam18112501.model.EventDetailResponse
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class EventDetailPresenter(private val view: EventDetailView,
                           private val apiRepository: ApiRepository,
                           private val gson: Gson){

    fun getEventDetail(eventId: String?){
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                .doRequest(TheSportDBApi.getEventDetail(eventId)),
                EventDetailResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showEventDetail(data.events)
            }
        }
    }
}