package ru.netology.javaqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviesManagerTest {
    @Test
    public void test() {
        MoviesManager manager = new MoviesManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        String[] expected = {"Third", "Second", "First"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void test2() {
        MoviesManager manager = new MoviesManager(10);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void test3() {
        MoviesManager manager = new MoviesManager(2);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"Third", "Second"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        MoviesManager manager = new MoviesManager(10);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eight");
        manager.add("Ninth");
        manager.add("Tenth");

        String[] expected = {"Tenth", "Ninth", "Eight", "Seventh", "Sixth", "Fifth", "Fourth", "Third", "Second", "First"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }


    @Test
    public void test6() {
        MoviesManager manager = new MoviesManager(15);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eight");
        manager.add("Ninth");
        manager.add("Tenth");

        String[] expected = {"Tenth", "Ninth", "Eight", "Seventh", "Sixth", "Fifth", "Fourth", "Third", "Second", "First"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void test7() {
        MoviesManager manager = new MoviesManager(2);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eight");
        manager.add("Ninth");
        manager.add("Tenth");

        String[] expected = {"Tenth", "Ninth"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

}