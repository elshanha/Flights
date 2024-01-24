package com.example.domain.di

import com.example.data.repo.FlightsRepoInterface
import com.example.domain.usecases.FlightsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseDependency {

    @Provides
    @Singleton
    fun provideFlightUseCase(repoInterface: FlightsRepoInterface) = FlightsUseCase(repoInterface)
}