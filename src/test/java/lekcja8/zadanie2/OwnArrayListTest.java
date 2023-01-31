package lekcja8.zadanie2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OwnArrayListTest {
    @Test
    void shouldGetListSize() {
        OwnArrayList list = new OwnArrayList();
        list.add(9);
        list.add(8);
        Assertions.assertEquals(2, list.size());
    }

    @Test
    void shouldGetIsEmptyTrue() {
        OwnArrayList list = new OwnArrayList();
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    void shouldGetIsEmptyFalse() {
        OwnArrayList list = new OwnArrayList();
        list.add(5);
        Assertions.assertFalse(list.isEmpty());
    }

    @Test
    void shouldAdd() {
        OwnArrayList list = new OwnArrayList();
        list.add(1);
        list.add(2);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
    }

    @Test
    void shouldGetAtIndex() {
        OwnArrayList list = new OwnArrayList();
        list.add(1);
        list.add(2);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
    }

    @Test
    void shouldAddWithIndex() {
        OwnArrayList list = new OwnArrayList();
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        Assertions.assertEquals(1, list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(3, list.get(2));
    }

    @Test
    void shouldRemoveFromList() {
        OwnArrayList list = new OwnArrayList();
        list.add(4);
        list.add(6);
        list.remove(1);
        Assertions.assertEquals(4, list.get(0));
        Assertions.assertEquals(1, list.size());
    }

    @Test
    void shouldRemoveOutOfBounds() {
        OwnArrayList list = new OwnArrayList();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
    }
}