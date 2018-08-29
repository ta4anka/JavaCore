package net.proselyte.javacore.practice.mycollection_1;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class DynamicArray extends ArrayList<Integer> {

    @Override
    public boolean add(Integer integer) {
        for (int i = 0; i < this.size(); i++)
            this.set(i, this.get(i) + integer);
        return super.add(integer);
    }

    public int specialRemove(Integer integer)throws ArrayIndexOutOfBoundsException {
        if (!this.contains(integer)) {
            throw new ArrayIndexOutOfBoundsException("There isn't a such element in the collection!");
        } else {
            super.remove(this.indexOf(integer));
            for (int i = 0; i < this.size(); i++) {
                this.set(i, this.get(i) - integer);
            }
            return integer;
        }
    }

    public int getElByValue(int value) throws NoSuchElementException {
        if (!this.contains(value)) {
            throw new NoSuchElementException("There isn't a such element in collection!");
        }
        return indexOf(value);
    }


    public int getElByIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || ((this.size() - 1) < index)) {
            throw new IndexOutOfBoundsException("This an index is out of bounds of the collection!");
        } else {
            return get(index);
        }
    }

    public int maxElement() throws IndexOutOfBoundsException {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("The collection is empty!");
        } else {
            int maxElement = getElByIndex(0);
            for (Integer x : this) {
                if (x > maxElement) maxElement = x;
            }
            return maxElement;
        }
    }

    public int minElement() throws IndexOutOfBoundsException{
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("The collection is empty!");
        } else {
            int minElement = getElByIndex(0);
            for (Integer x : this) {
                if (x < minElement) minElement = x;
            }
            return minElement;
        }
    }


    public double average() throws IndexOutOfBoundsException{
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("The collection is empty!");
        } else {
            int sum = 0;
            for (Integer x : this) {
                sum += x;
            }
            return (double) sum / this.size();
        }
    }
}

