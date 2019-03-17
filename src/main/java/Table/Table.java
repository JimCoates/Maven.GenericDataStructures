package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry> entries;

    public Table() {
        entries = new ArrayList();
    }

    public V get(K foo) {
        for (Entry entry : entries) {
            if (entry.getKey().equals(foo)) {
                return (V) entry.getValue();
            }
        }
        return null;
    }

    public void put(K foo, V i) {
        Entry newEntry = new Entry(foo, i);
        for (Entry entry : entries) {
            if (entry.getKey() == foo) {
                entry.setValue(i);
                break;
            }
        }
            entries.add(newEntry);
    }

    public void remove(K foo) {
        entries.remove(getEntry(foo));
    }

    public Entry getEntry(K foo) {
        for (Entry entry : entries) {
            if (entry.getKey() == foo) {
                return entry;
            }
        }
        return null;
    }
}
