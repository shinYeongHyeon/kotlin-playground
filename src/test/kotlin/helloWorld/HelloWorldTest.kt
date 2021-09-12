package helloWorld

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

public class HelloWorldTest {
    @Test
    fun helloWordTest() {
        val message = HelloWorld()

        assertEquals("Hello World", message.main())
    }
}