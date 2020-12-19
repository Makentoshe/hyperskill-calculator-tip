package org.hyperskill.calculator.tip

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

// TODO implement robolectric tests
@RunWith(RobolectricTestRunner::class)
class ExampleUnitTest {

    private val activityController = Robolectric.buildActivity(MainActivity::class.java)

    @Test
    fun test() {
        Assert.assertEquals(4, 2 + 2)
    }
}