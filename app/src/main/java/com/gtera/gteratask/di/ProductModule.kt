package com.gtera.gteratask.di

import com.gtera.gteratask.data.remote.repository.ProductRemoteDataSource
import com.gtera.gteratask.domain.repository.ProductSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ProductModule {
    @Binds
    abstract fun provideProductSource(dataSource: ProductRemoteDataSource): ProductSource
}