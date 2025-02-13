class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}

// Unit tests for Greeting class
import kotlin.test.Test
import kotlin.test.assertEquals

class GreetingTest {
    @Test
    fun testGreet() {
        val greeting = Greeting()
        val expectedGreeting = "Hello, ${greeting.platform.name}!"
        assertEquals(expectedGreeting, greeting.greet())
    }
}
