package com.sublime.niaclone.data.news.fake

import com.sublime.niaclone.data.news.NewsResource
import com.sublime.niaclone.data.news.NewsResourceRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

/**
 * [NewsResourceRepository] implementation that provides static news resources to aid development
 */
class FakeNewsResourceRepository(
    private val ioDispatcher: CoroutineDispatcher
) : NewsResourceRepository {

    private val deserializer = Json { ignoreUnknownKeys = true }
    override fun monitor(): Flow<List<NewsResource>> = flow {
        emit(deserializer.decodeFromString<ResourceData>(FakeDataSource.data).resources)
    }
        .flowOn(ioDispatcher)
}

/**
 * Representation of resources aas fetched from [FakeDataSource]
 */
@Serializable
private data class ResourceData(
    val resources: List<NewsResource>
)