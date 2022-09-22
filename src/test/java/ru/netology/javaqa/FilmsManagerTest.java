package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmsManagerTest {
    @Test
    public void test() {
        FilmsManager manager = new FilmsManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        String[] expected = {"Third", "Second", "First"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void test2() {
        FilmsManager manager = new FilmsManager(10);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }
}