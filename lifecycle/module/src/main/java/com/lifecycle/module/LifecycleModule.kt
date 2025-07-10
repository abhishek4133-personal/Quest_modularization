package com.lifecycle.module

import android.app.Application
import com.share.api.SharingActivityHolder
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface LifecycleModule {

    @Binds
    fun activityLifecycleCallbacks(activityLifecycleCallbacks: Application.ActivityLifecycleCallbacks): Application.ActivityLifecycleCallbacks

    @Binds
    fun sharingActivityHolder(activityLifecycleCallbacks: Application.ActivityLifecycleCallbacks): SharingActivityHolder
}