package com.sublime.niaclone.data.news

import kotlinx.coroutines.flow.Flow

/**
 * Data layer implementation for [NewsResource]
 */
interface NewsResourceRepository {

    /**
     * Fetches available news resources
     */
    fun monitor(): Flow<List<NewsResource>>
}