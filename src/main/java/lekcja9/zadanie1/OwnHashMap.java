package lekcja9.zadanie1;

import java.util.ArrayList;

public class OwnHashMap implements OwnMap{
    private ArrayList<Entry> entries = new ArrayList<>();

    private class Entry {
        private String key;
        private String value;

        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    @Override
    public boolean put(String key, String value) {
        for (Entry entry : entries) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return true;
            }
        }
        entries.add(new Entry(key, value));
        return true;
    }

    @Override
    public boolean containsKey(String key) {
        for (Entry entry : entries) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Entry entry : entries) {
            if (entry.value.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String remove(String key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).key.equals(key)) {
                String removedValue = entries.get(i).value;
                entries.remove(i);
                return removedValue;
            }
        }
        return null;
    }

    @Override
    public String get(String key) {
        for (Entry entry : entries) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }
}
