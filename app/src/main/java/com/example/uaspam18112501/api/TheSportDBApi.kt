package com.example.uaspam18112501.api


object TheSportDBApi {
    const val BASE_URL = "https://www.thesportsdb.com/"
    const val TSDB_API_KEY = "1"

    fun getEvent(league: String?, event: String?): String{
        return BASE_URL + "api/v1/json/${TSDB_API_KEY}" + "eventsnextleague.php?id=4328"+league
        return BASE_URL + "api/v1/json/${TSDB_API_KEY}" + "eventspastleague.php?id=4328"+league
    }

    fun getEventDetail(eventId: String?): String{
        return BASE_URL + "api/v1/json/${TSDB_API_KEY}" + "lookupevent.php?id=441613"+eventId
    }
}