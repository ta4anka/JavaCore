package net.proselyte.javacore.Schildt.Chapter_5;

// The for-each loop is essentially read-only.
class NoChange {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for(int x: nums) {
            System.out.print(x + " ");
            x = x * 10; // no effect on nums !!!!!!!

        }
        System.out.println();
        for(int x : nums)
            System.out.print(x + " ");
        System.out.println();
    }
}

// 1 2 3 4 5 6 7 8 9 10
// 1 2 3 4 5 6 7 8 9 10