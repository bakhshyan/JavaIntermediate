package FirstPackage;

public class Main {
    public static void main(String args[]) {
        int[][] myComplexArray = {{5, 1, 2}, {4, 5, 6},{4, 9, 7}};
       for(int[]mySimpleArray:myComplexArray){
           for (int i=0;i<mySimpleArray.length;i++){
               System.out.println(mySimpleArray[i]);
           }
           System.out.println();
        }
    }

}
