package lekcja8.zadanie2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnArrayListTest {

    private OwnArrayList list = new OwnArrayList();

    @Test
    void shouldGetListSize() {
        list.add(9);
        list.add(8);
        assertEquals(2, list.size());
    }

    @Test
    void shouldGetIsEmptyTrue() {
        assertTrue(list.isEmpty());
    }

    @Test
    void shouldGetIsEmptyFalse() {
        list.add(5);
        assertFalse(list.isEmpty());
    }

    @Test
    void shouldAdd() {
        list.add(1);
        list.add(2);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    void shouldGetAtIndex() {
        list.add(1);
        list.add(2);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    void shouldAddWithIndex() {
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    void shouldRemoveFromList() {
        list.add(4);
        list.add(6);
        list.remove(1);
        assertEquals(4, list.get(0));
        assertEquals(1, list.size());
    }

    @Test
    void shouldRemoveOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }
}