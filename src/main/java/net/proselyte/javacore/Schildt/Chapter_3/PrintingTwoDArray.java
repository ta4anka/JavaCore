package net.proselyte.javacore.Schildt.Chapter_3;

//Demonstrate how to print a two-dimensional array
public class PrintingTwoDArray {
    public static void main(String[] args) {

        int [][] matrix  = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

        for(int i=0;i<matrix.length;i++){       //first loop - for row
            for(int j=0;j<matrix[i].length;j++){    //second loop - for column
                System.out.print(matrix[i][j] + " ");
                }
            System.out.println();
        }
    }
}

