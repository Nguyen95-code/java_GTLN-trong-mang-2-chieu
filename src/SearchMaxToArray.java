import java.util.Scanner;

public class SearchMaxToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so hang : ");
        int row = scanner.nextInt();
        System.out.println("nhap so cot : ");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("nhap phan tu array[" + i + "," + j + "]= ");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int max = array[0][0];
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("max is " + max + " tai hang " + (indexRow + 1) + " ,tai cot " + (indexCol + 1));
    }
}
