package com.plcoding.weatherapp.di

import com.plcoding.weatherapp.data.repository.WeatherRepoImpl
import com.plcoding.weatherapp.domain.repository.WeatherRepo
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

     @Binds
     @Singleton
     abstract fun bindWeatherRepository(weatherRepoImpl: WeatherRepoImpl) : WeatherRepo

}