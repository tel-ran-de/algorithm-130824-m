package org.telran.lecture_14_hash.practice;

import  java.util.LinkedList;

/**
 * Класс, представляющий хэш-таблицу.
 */
class SimpleHashTable {
    private Object[] table;
    private int size;

    /**
     * Создает экземпляр хэш-таблицы.
     * @param size Размер хэш-таблицы.
     */
    public SimpleHashTable(int size) {
        this.size = size;
        this.table = new Object[size];
    }

    /**
     * Создает экземпляр хэш-таблицы с размером по умолчанию (10).
     */
    public SimpleHashTable() {
        this(10);
    }

    /**
     * Вычисляет хэш-код для заданного ключа.
     * @param key Ключ для вычисления хэш-кода.
     * @return Хэш-код ключа.
     */
    public int hash(Object key) {
        int hash = 0;
        if (key instanceof String) {
            String strKey = (String) key;
            for (int i = 0; i < strKey.length(); i++) {
                hash += strKey.charAt(i);
            }
        } else if (key instanceof Integer) {
            hash = (Integer) key;
        } else {
            hash = key.hashCode();
        }
        return hash % size;
    }

    /**
     * Добавляет пару "ключ-значение" в хэш-таблицу.
     * @param key Ключ.
     * @param value Значение.
     */
    public void set(Object key, Object value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        ((LinkedList<Pair>) table[index]).add(new Pair(key, value));
    }

    /**
     * Возвращает значение по заданному ключу.
     * @param key Ключ.
     * @return Значение, связанное с ключом, или null, если ключ не найден.
     */
    public Object get(Object key) {
        int index = hash(key);
        if (table[index] != null) {
            LinkedList<Pair> list = (LinkedList<Pair>) table[index];
            for (Pair pair : list) {
                if (pair.key.equals(key)) {
                    return pair.value;
                }
            }
        }
        return null;
    }

    /**
     * Проверяет, есть ли ключ в хэш-таблице.
     * @param key Ключ.
     * @return true, если ключ найден, иначе false.
     */
    public boolean has(Object key) {
        return get(key) != null;
    }

    /**
     * Удаляет пару "ключ-значение" из хэш-таблицы.
     * @param key Ключ.
     */
    public void remove(Object key) {
        int index = hash(key);
        if (table[index] != null) {
            LinkedList<Pair> list = (java.util.LinkedList<Pair>) table[index];
            list.removeIf(pair -> pair.key.equals(key));
            if (list.isEmpty()) {
                table[index] = null;
            }
        }
    }

    /**
     * Выводит содержимое хэш-таблицы в консоль.
     */
    public void display() {
        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                System.out.println(i + ": " + table[i]);
            }
        }
    }

    /**
     * Внутренний класс для хранения пары "ключ-значение".
     */
    private static class Pair {
        Object key;
        Object value;

        Pair(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + ": " + value + "}";
        }
    }

    public static void main(String[] args) {
        // Пример использования
        SimpleHashTable myHashTable = new SimpleHashTable();
        myHashTable.set("apple", 10);
        myHashTable.set("banana", 20);
        myHashTable.set("orange", 30);
        myHashTable.set("kivy", 35);
        myHashTable.set("guava", 3);
        myHashTable.set("lemon", 3);
        myHashTable.set("pineapple", 3);
        myHashTable.set("red_apple", 12);
        myHashTable.set("green_apple", 12);
        myHashTable.display();
    }
}