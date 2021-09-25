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
    fun returnGreatestCommonFactor() {
        val greatestCommonFactorOf2And4 = this.greatestCommonDivisor?.exec(2, 4)
        val greatestCommonFactorOf6and15 = this.greatestCommonDivisor?.exec(6, 15)

        assertEquals(2, greatestCommonFactorOf2And4)
        assertEquals(3, greatestCommonFactorOf6and15)
    }

    @Test
    fun returnGreatestCommonFactorWhenFirstArgumentWasBiggerThanSecondArgument() {
        val greatestCommonFactorOf86And34 = this.greatestCommonDivisor?.exec(86, 34)
        val greatestCommonFactorOf192952and12 = this.greatestCommonDivisor?.exec(192952, 12)

        assertEquals(2, greatestCommonFactorOf86And34)
        assertEquals(4, greatestCommonFactorOf192952and12)
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

    @Test
    fun throwErrorIfSecondIntegerWasZero() {
        Assertions.assertThrows(IllegalArgumentException::class.java, ) {
            this.greatestCommonDivisor?.exec(1, 0)
        }
    }

    @Test
    fun throwErrorIfSecondIntegerWasNegative() {
        Assertions.assertThrows(IllegalArgumentException::class.java, ) {
            this.greatestCommonDivisor?.exec(1, -1)
        }
    }
}