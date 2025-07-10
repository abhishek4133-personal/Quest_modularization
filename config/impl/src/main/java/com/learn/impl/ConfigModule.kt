package com.learn.impl

import com.learn.api.Config
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface ConfigModule {

    @Binds
    fun config(config: AndroidBuildConfig): Config
}