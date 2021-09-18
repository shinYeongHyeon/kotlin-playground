package greateCommonDivisor

import greatestCommonDivisor.GreatestCommonDivisor
import org.junit.jupiter.api.*
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GreatestCommonDivisorTest {
    private var greatestCommonDivisor: GreatestCommonDivisor? = null

    @BeforeAll
    fun beforeAll() {
        this.greatestCommonDivisor = GreatestCommonDivisor()
    }

    @Test
    // Coprime : 서로소
    fun returnOneIfEachIntegerWasCoprime() {
        val greatestCommonFactor = this.greatestCommonDivisor?.exec(2, 3)

        assertEquals(1, greatestCommonFactor)
    }

    @Test
    fun throwErrorIfFirstIntegerWasZero() {
        Assertions.assertThrows(IllegalArgumentException::class.java, ) {
            this.greatestCommonDivisor?.exec(0, 1)
        }
    }

    @Test
    fun throwErrorIfFirstIntegerWasNegative() {
        Assertions.assertThrows(IllegalArgumentException::class.java, ) {
            this.greatestCommonDivisor?.exec(-1, 1)
        }
    }
}