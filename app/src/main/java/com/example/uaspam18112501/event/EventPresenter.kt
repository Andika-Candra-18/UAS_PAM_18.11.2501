package com.example.uaspam18112501.event

import com.google.gson.Gson
import com.example.uaspam18112501.api.ApiRepository
import com.example.uaspam18112501.api.TheSportDBApi
import com.example.uaspam18112501.model.EventResponse
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class EventPresenter(private val view: EventView,private val apiRepository: ApiRepository, private val gson: Gson){
    fun getEventList(league: String?, event: String?){
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                .doRequest(TheSportDBApi.getEvent(league, event)),
                EventResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showEventList(data.events)
            }
        }
    }
}
