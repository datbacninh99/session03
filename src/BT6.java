import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột của mảng: ");
        int col = Integer.parseInt(scanner.nextLine());

        // Khởi tạo mảng hai chiều với số hàng và cột đã nhập
        int[][] arr = new int[row][col];

        // Nhập giá trị cho từng phần tử của mảng
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Giá trị của phần tử arr[%d][%d] là: ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        // In ra mảng đã nhập
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("[%d]", arr[i][j]);
            }
            System.out.println();
        }

        // Nhập cột muốn tính tổng
        System.out.println("Nhập cột muốn tính");
        int choice = Integer.parseInt(scanner.nextLine());

        // Tính tổng các phần tử trong cột đã chọn
        int sumCol = 0;
        for(int i = 0; i < row; i++) {
            sumCol += arr[i][choice - 1];
        }

        // In ra tổng các phần tử trong cột đã chọn
        System.out.printf("Tổng các phần tử trong cột %d là %d: ", choice, sumCol);
    }
}
