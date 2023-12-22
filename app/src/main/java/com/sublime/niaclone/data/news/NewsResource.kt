package com.sublime.niaclone.data.news

import java.util.Date

/**
 * Item representing a summary of a noteworthy item from a Now In Android episode
 */
data class NewsResource(
    val episode: Int,
    val title: String,
    val content: String,
    val url: String,
    val authorName: String,
    // TODO: Replace this with a type from kotlinx-datetime or similar in row al0AcTYbwbU6lyRWL5dOQ1
    val publishDate: Date,
    val type: String,
    val topics: List<String>,
    val alternateVideo: VideoInfo?
)

/**
 * Data class summarizing video metadata
 */
data class VideoInfo(
    val url: String,
    val startTimestamp: String,
    val endTimestamp: String,
)