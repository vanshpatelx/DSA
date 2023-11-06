import java.util.Arrays;
import java.util.Scanner;

class array {
    public static void main(String[] args) {
        int[] marks = {10, 11, 12, 12};
        int[] mark = new int[10];

        System.out.println(Arrays.toString(mark));
        System.out.println(Arrays.toString(marks));

        // Input
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));

        
    }   
}