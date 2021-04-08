import kotlin.test.Test
import kotlin.test.assertEquals

class JsPlatformStringTest {
    @Test
    fun testJsPlatformString() {
        assertEquals("JavaScript", platformString())
    }
}
