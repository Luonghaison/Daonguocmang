package rikkei.academy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhập số phần tử của mảng muốn in:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("số phần tử ko đc quá 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("phần tử thứ " + (i + 1) + "là: ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Mảng cũ của bạn là: ");
        for(int j=0; j<array.length;j++){

            System.out.println(array[j]+ "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println("Mảng mới của bạn là: ");
        for(int j=0; j<array.length;j++){

            System.out.println(array[j]+ "\t");
        }

    }
}
