package com.sublime.niaclone

import com.sublime.niaclone.data.news.fake.FakeDataSource
import com.sublime.niaclone.data.news.fake.FakeNewsResourceRepository
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.TestCoroutineDispatcher
import org.junit.Assert.assertEquals
import org.junit.Before

class FakeNewsResourceRepositoryTest {

    private lateinit var subject: FakeNewsResourceRepository

    @Before
    fun setup() {
        subject = FakeNewsResourceRepository(
            ioDispatcher = TestCoroutineDispatcher()
        )
    }

    @org.junit.Test
    fun testDeserializationOfNewsResources() = runBlocking {
        assertEquals(
            FakeDataSource.sampleResource,
            subject.monitor().first().first()
        )
    }
}