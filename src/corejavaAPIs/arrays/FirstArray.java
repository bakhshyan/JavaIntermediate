package corejavaAPIs.arrays;

public class FirstArray {
    public static void main(String[] args) {
        int[][] array2D = new int[3][2];
        array2D[0][0] = 4;
        array2D[0][1] = 7;
        array2D[1][0] = 1;
        array2D[1][1] = 14;
        array2D[2][0] = 45;
        array2D[2][1] = 68;


        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.println(array2D[i][j] + " ");
            }
            System.out.println();
        }


    }
}
