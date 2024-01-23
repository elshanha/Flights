package com.example.data.di

import com.example.data.repo.FlightsRepo
import com.example.data.repo.FlightsRepoInterface
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
    abstract fun bindRepoModule(repo: FlightsRepo) : FlightsRepoInterface
}