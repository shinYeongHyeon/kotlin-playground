package greateCommonDivisor

import greatestCommonDivisor.GreatestCommonDivisor
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GreatestCommonDivisorTest {

    @Test
    // Coprime : 서로소
    fun returnOneIfEachIntegerWasCoprime() {
        val greatestCommonDivisor = GreatestCommonDivisor()

        val greatestCommonFactor = greatestCommonDivisor.exec(2, 3)

        assertEquals(1, greatestCommonFactor)
    }
}