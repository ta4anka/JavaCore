package net.proselyte.javacore.practice.mycollection_1;

import java.util.ArrayList;

public class DynamicArray extends ArrayList<Integer> {

    @Override
    public boolean add(Integer integer) {
        for (int i = 0; i < this.size(); i++)
            this.set(i, this.get(i) + integer);
        return super.add(integer);
    }

    public int specialRemove(Integer integer) {
        super.remove(this.indexOf(integer));
        for (int i = 0; i < this.size(); i++) {
            this.set(i, this.get(i) - integer);
        }
        return integer;
    }

    public int getElByValue(int value) {
        return indexOf(value);
    }

    public int getElByIndex(int index) {
        return get(index);
    }

    public int maxElement() {
        int maxElement = getElByIndex(0);
        for (Integer x : this) {
            if (x > maxElement) maxElement = x;
        }
        return maxElement;
    }

    public int minElement() {
        int minElement = getElByIndex(0);
        {
            for (Integer x : this)
                if (x < minElement) minElement = x;
        }
        return minElement;
    }

    public double average() {
        int sum = 0;
        for (Integer x : this) {
            sum += x;
        }
        return (double) sum / this.size();
    }
}


