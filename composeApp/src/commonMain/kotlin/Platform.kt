interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

// Unit tests for Platform interface and getPlatform function
import kotlin.test.Test
import kotlin.test.assertTrue

class PlatformTest {
    @Test
    fun testGetPlatform() {
        val platform = getPlatform()
        assertTrue(platform.name.isNotEmpty(), "Platform name should not be empty")
    }
}
