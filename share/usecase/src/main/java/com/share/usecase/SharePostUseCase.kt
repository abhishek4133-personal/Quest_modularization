package com.share.usecase

import com.analytics.event.AnalyticsEvent
import com.analytics.tracking.Analytics
import com.learn.logging.Logger
import com.learn.logging.create
import com.share.api.ShareResult
import com.share.api.ShareSender
import javax.inject.Inject

class SharePostUseCase @Inject constructor(
    private val shareSender: ShareSender,
    private val analytics: Analytics,
    loggerFactory: Logger.Factory,
) {
    private val logger by lazy { loggerFactory.create(this::class) }

    fun execute(post: Post) {
        val text = "${post.title}\n\n${post.body}"
        val shareResult = shareSender.share(text)
        when (shareResult) {
            ShareResult.Success -> analytics.logEvent(AnalyticsEvent.POST_SHARED)
            is ShareResult.Failure -> logger.error("Failed to share post", shareResult.reason)
        }
    }
}