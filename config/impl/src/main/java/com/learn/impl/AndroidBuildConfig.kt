package com.learn.impl

import com.learn.api.Config
import com.learn.config.api.BuildConfig
import javax.inject.Inject

class AndroidBuildConfig @Inject constructor() : Config {
    override val isDebug: Boolean = BuildConfig.DEBUG
}