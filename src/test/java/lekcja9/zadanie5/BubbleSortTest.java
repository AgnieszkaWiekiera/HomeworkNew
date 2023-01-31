package lekcja9.zadanie5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void shouldSortInteger() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(2);

        bubbleSort.sort(list);

        assertEquals(Integer.valueOf(2), list.get(0));
        assertEquals(Integer.valueOf(4), list.get(1));
        assertEquals(Integer.valueOf(5), list.get(2));
        assertEquals(Integer.valueOf(7), list.get(3));
    }

    @Test
    void shouldSortString() {
        BubbleSort<String> bubbleSort = new BubbleSort<>();
        List<String> list = new ArrayList<>();
        list.add("złoto");
        list.add("srebro");
        list.add("platyna");
        list.add("iryd");

        bubbleSort.sort(list);

        assertEquals("iryd", list.get(0));
        assertEquals("platyna", list.get(1));
        assertEquals("srebro", list.get(2));
        assertEquals("złoto", list.get(3));
    }
}