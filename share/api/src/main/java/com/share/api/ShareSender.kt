package com.share.api

interface ShareSender {
    fun share(text: String): ShareResult
}