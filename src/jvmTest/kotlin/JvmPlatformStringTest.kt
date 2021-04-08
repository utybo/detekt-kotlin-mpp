import kotlin.test.Test
import kotlin.test.assertEquals

class JvmPlatformStringTest {
    @Test
    fun testJvmPlatformString() {
        assertEquals("JVM", platformString())
    }
}
