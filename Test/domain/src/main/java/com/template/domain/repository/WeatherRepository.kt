package com.template.domain.repository

import com.template.domain.entities.ForecastWeather
import com.template.domain.entities.WeatherCurrent
import com.template.sharelocal.network.NetworkStatus

interface WeatherRepository {
    suspend fun getTodayWeather(city: String): NetworkStatus<WeatherCurrent>

    suspend fun getTodayWeather(lat: Double, long: Double): NetworkStatus<WeatherCurrent>

    suspend fun getWeatherForecast(lat: String, long: String): NetworkStatus<ForecastWeather>
}