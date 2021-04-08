import kotlin.test.Test
import kotlin.test.assertEquals

class ConcatTest {
    @Test
    fun testConcatNothing() {
        assertEquals("", concat());
    }

    @Test
    fun testConcatSingle() {
        assertEquals("Hello", concat("Hello"))
    }

    @Test
    fun testConcatTwo() {
        assertEquals("Hello World!", concat("Hello ", "World!"))
    }

    @Test
    fun testConcatMany() {
        assertEquals("Hello To Everyone In The World!",
            concat("Hello ", "To ", "Everyone ", "In ", "The ", "World!"))
    }
}
