import java.util.Arrays;

public class Main {

    public static void main (String[] args) {
        printArr();
        printArray();
        printDoubleArray();
        printMatrix();
        System.out.println(Arrays.toString(printInitialArr(8,234))+ "\n");
        findMaxMin();
        System.out.println(sumArr());
    }

    static void printArr(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            arr[i]= (arr[i] > 0)? 0 : 1;
        }
        System.out.println(Arrays.toString(arr) + "\n");
    }

    static void printArray(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr)+ "\n");
    }

    static void printDoubleArray(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i]*2;
            }
        }
        System.out.println(Arrays.toString(arr)+ "\n");
    }

    static void printMatrix(){
        int[][] matrix = new int[8][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i==j || j == matrix.length - 1 - i) {
                    matrix[i][j] = 1;
                } else matrix [i][j] = 0;
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int [] printInitialArr(int len,int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }return arr;
    }

    static void findMaxMin (){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }else if (i > max){
                max = i;
            }
        }
        System.out.println("The minimum is: " + min + "\nThe maximum is: " + max + "\n");
    }

    static boolean sumArr(){
        int[] arr = {1,2,3,4,2,1};
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = 0;
        for (int  i = 0; i < arr.length; i++) {
            right += arr[i];
        }
        for (int  i = 0; i < arr.length; i++) {
            if (left == right){
                return true;
            }
            left += arr[i];
            right -= arr[i];
        }
        return false;
    }

}

