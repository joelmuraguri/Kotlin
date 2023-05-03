package objects

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SampleTest{

    private val sampleTest : Sample = Sample()

    @Test
    fun testSum(){
        val sum = 34
        assertEquals(sum, sampleTest.sum(32,2))
    }

}