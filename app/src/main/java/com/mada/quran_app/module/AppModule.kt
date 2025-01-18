package com.mada.quran_app.module

import com.mada.quran_app.domain.repository.SurahRepository
import com.mada.quran_app.domain.repository.SurahRepositoryImpl
import com.mada.quran_app.domain.useCase.GetSurahsUseCase
import com.mada.quran_app.mvvm.SplashViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.koin.dsl.module
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSurahRepository(): SurahRepository {
        return SurahRepositoryImpl()
    }

    @Provides
    @Singleton
    fun provideGetSurahsUseCase(repository: SurahRepository): GetSurahsUseCase {
        return GetSurahsUseCase(repository)
    }
}