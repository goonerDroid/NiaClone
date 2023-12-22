package com.sublime.niaclone.data.news.fake

import android.content.Context
import com.sublime.niaclone.R
import com.sublime.niaclone.data.news.NewsResource
import com.sublime.niaclone.data.news.NewsResourceRepository
import kotlinx.coroutines.flow.Flow

/**
 * [NewsResourceRepository] implementation that provides static news resources to aid development
 */
class FakeNewsResourceRepository(
    private val context: Context
) : NewsResourceRepository {
    override fun monitor(): Flow<List<NewsResource>> {
        context.resources.openRawResource(R.raw.data)
        TODO("Deserialize json and return news resources")
    }
}