import java.util.Arrays;

public class SimplifiedStrBuilder {
    private char[] buffer;
    private int size;
    private static final int DEFAULT_CAPACITY = 32;

    public SimplifiedStrBuilder() {
        this(DEFAULT_CAPACITY);
    }

    public SimplifiedStrBuilder(int initialCapacity) {
        if (initialCapacity <= 0) {
            initialCapacity = DEFAULT_CAPACITY;
        }
        buffer = new char[initialCapacity];
    }

    public SimplifiedStrBuilder(String str) {
        this(str != null ? str.length() + DEFAULT_CAPACITY : DEFAULT_CAPACITY);
        if (str != null) {
            append(str);
        }
    }

    public SimplifiedStrBuilder append(String str) {
        if (str == null) {
            str = "null";
        }
        int strLen = str.length();
        if (strLen > 0) {
            ensureCapacity(size + strLen);
            str.getChars(0, strLen, buffer, size);
            size += strLen;
        }
        return this;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > buffer.length) {
            char[] old = buffer;
            buffer = new char[capacity * 2];
            System.arraycopy(old, 0, buffer, 0, size);
        }
    }

    public int length() {
        return size;
    }

    public int capacity() {
        return buffer.length;
    }

    public String toString() {
        return new String(buffer, 0, size);
    }
}
