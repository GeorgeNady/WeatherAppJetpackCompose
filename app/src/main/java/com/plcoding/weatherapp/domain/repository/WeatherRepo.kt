package com.plcoding.weatherapp.domain.repository

import com.plcoding.weatherapp.domain.util.Resource
import com.plcoding.weatherapp.domain.weather.WeatherInfo

interface WeatherRepo {

    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>

}