import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        // Khai báo và khởi tạo mảng số nguyên
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Mảng ban đầu: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        // Nhập phần tử cần xóa
        System.out.println("Nhập phần tử cần xóa: ");
        int x = Integer.parseInt(scanner.nextLine());

        // Tìm x xem có xuất hiện trong mảng không
        int index_del = -1;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }
        // Kiểm tra xem phần tử còn trong mảng không
        if(index_del != -1) {
            // Xóa phần tử khỏi mảng
            for(int i = index_del; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            // In mảng sau khi xóa
            System.out.println("Mảng sau khi xóa 1 phần tử: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Phần tử " + x + " không tồn tại trong mảng.");
        }
    }
}
