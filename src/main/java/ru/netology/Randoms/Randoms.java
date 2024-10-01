package ru.netology.Randoms;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;
    protected Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            final int now = (int) (random.nextFloat() * (max - min) + min);

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return (int) (random.nextFloat() * (max - min) + min);
            }
        };
    }
}
