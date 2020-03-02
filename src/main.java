import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] a = {1,3,5,9,11,15,898,1001};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();
        System.out.println("\n"+recursiveBinarySearch(inputNumber,a));
    }

    public static int recursiveBinarySearch(int number, int[] array) {
        int first = 0;
        int last = array.length-1;
        int mid;
        while (last>=first){
             mid = (first + last)/2;
             if (number<array[mid]){
                 last = mid - 1;
             }
             else if (number == array[mid]){
                 return mid;
             }
             else {
                 first = mid + 1;
             }
        }
        return -1;
    }
}
