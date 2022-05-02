import java.util.Scanner;

public class ArraySample {
    private int [] arr = new int [7];
    public void setArray () {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr [i] = scanner.nextInt();
        }
    }
    public int [] getArr () {
        return arr;
    }
    public int sum (int a, int b) {
        int sum = a + b;
        return sum;
    }
}
