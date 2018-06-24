package com.example.kazokmr.stopwatch

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainActivityTest {

    private val activity = MainActivity()

    @Test
    fun _3600秒なら1時間を表示する() {
        val calc = activity.timeToText(3600)
        assertThat(calc).isEqualTo("01:00:00")
    }
    @Test
    fun _90秒なら1分30秒を表示する() {
        val calc = activity.timeToText(90)
        assertThat(calc).isEqualTo("00:01:30")
    }
}
