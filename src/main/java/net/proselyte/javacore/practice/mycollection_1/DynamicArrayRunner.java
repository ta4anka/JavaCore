package net.proselyte.javacore.practice.mycollection_1;

public class DynamicArrayRunner {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        //Some test:
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        System.out.println("The contain of array : " + da);

        try {
            System.out.println("The contain of array after removing " + da.specialRemove(5) + ": " + da);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This is "  + e.getClass().getSimpleName() + ". There isn't a such element in the collection!");
        }

        try {
            System.out.println("An element by index: " + da.getElByIndex(0)); // 0
        } catch (IndexOutOfBoundsException e){
            System.out.println("This is "  + e.getClass().getSimpleName() + ". This an index is out of bounds of the collection!");
        }

        int idx = da.getElByValue(7);
        if(idx!= -1){
            System.out.println("An index by value: " + idx);
        }else{
            System.out.println("There isn't a such element in collection!");
        }

        try{
            System.out.println("The maximum element is: " + da.maxElement());
        }catch (IndexOutOfBoundsException e){
            System.out.println("The collection is empty!");
        }

        try{
            System.out.println("The minimum element is: " + da.minElement());
        }catch (IndexOutOfBoundsException e){
            System.out.println("The collection is empty!");
        }

        Double avg = da.average();
        if(!avg.isNaN()){
            System.out.println("The arithmetic mean is: " + da.average());
        } else {
            System.out.println("The collection is empty!");
        }
    }
}
