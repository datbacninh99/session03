import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng số nguyên
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Mảng ban đầu: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        // Nhập phần tử cần chèn
        System.out.println("Nhập phần tử cần chèn: ");
        int x = Integer.parseInt(scanner.nextLine());
        // Nhập vào vị trí index cần chèn x vào trong mảng
        System.out.println("Nhập vị trí cần chèn: ");
        int index = Integer.parseInt(scanner.nextLine());
        // Kiểm tra xem phần tử có chèn được không
        if (index < 0 || index > arr.length) {
            System.out.println("Không thể chèn phần tử vào mảng.");
        } else {
            // Thực hiện chèn phần tử X ở vị trí index vào mảng
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = x;
            for (int i = index + 1; i < newArr.length; i++) {
                newArr[i] = arr[i - 1];
            }

            // In ra mảng sau khi chèn
            System.out.println("Mảng sau khi chèn: ");
            for (int i : newArr) {
                System.out.print(i + " ");
            }
        }
    }
}