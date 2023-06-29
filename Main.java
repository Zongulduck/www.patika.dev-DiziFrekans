import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi uzunluğunu: ");
        int a = scanner.nextInt();

        int[] array = new int[a];
        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }

        int[] countArray = new int[a];
        for (int i = 0; i < a; i++) {
            countArray[i] = -1;
        }

        int count;
        for (int i = 0; i < a; i++) {
            count = 1;
            for (int j = i+1; j < a; j++) {
                if (array[i] == array[j]) {
                    count++;
                    countArray[j] = 0;
                }
            }
            if (countArray[i] != 0) {
                countArray[i] = count;
            }
        }

        System.out.println("Elemanların tekrar sayıları:");
        for (int i = 0; i < a; i++) {
            if (countArray[i] != 0) {
                System.out.println(array[i] + " - " + countArray[i]);
            }
        }
    }
}