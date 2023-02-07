package lekcja9.zadanie1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OwnHashMapTest {

    @Test
    void shouldPutKeyAndValue() {
        //given
        OwnMap ownMap = new OwnHashMap();
        String key = "key1";
        String value = "value1";
        //when
        boolean put = ownMap.put(key, value);
        //then
        Assertions.assertTrue(put);
        Assertions.assertTrue(ownMap.containsKey(key));
        Assertions.assertTrue(ownMap.containsValue(value));
    }

    @Test
    void shouldContainsKey() {
        //given
        OwnMap ownMap = new OwnHashMap();
        ownMap.put("key1", "value1");
        ownMap.put("key2", "value2");
        String key = "key1";

        //when
        boolean containsKey = ownMap.containsKey(key);

        //then
        Assertions.assertTrue(containsKey);
        }

    @Test
    void shouldNotContainsKey() {
        //given
        OwnMap ownMap = new OwnHashMap();
        ownMap.put("key1", "value1");
        ownMap.put("key2", "value2");
        String key = "key3";

        //when
        boolean containsKey = ownMap.containsKey(key);

        //then
        Assertions.assertFalse(containsKey);
    }

    @Test
    void shouldContainsValue() {
        //given
        OwnMap ownMap = new OwnHashMap();
        ownMap.put("key1", "value1");
        ownMap.put("key2", "value2");
        String value = "value1";

        //when
        boolean containsValue = ownMap.containsValue(value);

        //then
        Assertions.assertTrue(containsValue);
    }

    @Test
    void shouldNotContainsValue() {
        //given
        OwnMap ownMap = new OwnHashMap();
        ownMap.put("key1", "value1");
        ownMap.put("key2", "value2");
        String value = "value4";

        //when
        boolean containsValue = ownMap.containsValue(value);

        //then
        Assertions.assertFalse(containsValue);
    }

    @Test
    void shouldRemove() {
        //given
        OwnMap ownMap = new OwnHashMap();
        ownMap.put("key1", "value1");
        ownMap.put("key2", "value2");
        String key = "key1";

        //when
        String remove = ownMap.remove(key);

        //then
        Assertions.assertEquals("value1", remove);
        Assertions.assertFalse(ownMap.containsKey(key));
        Assertions.assertFalse(ownMap.containsValue("value1"));
    }

    @Test
    void shouldGet() {
        //given
        OwnMap ownMap = new OwnHashMap();
        ownMap.put("key1", "value1");
        ownMap.put("key2", "value2");
        String key = "key1";

        //when
        String get = ownMap.get(key);

        //then
        Assertions.assertEquals("value1", get);
    }
}