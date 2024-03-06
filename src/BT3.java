import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        // Khởi tạo hai mảng arr1 và arr2
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        // Tính tổng độ dài của hai mảng
        int length = arr1.length + arr2.length;

        // Khởi tạo mảng arr3
        int[] arr3 = new int[length];
        int count = 0;

        // Duyệt qua từng phần tử trong mảng arr1
        for(int element: arr1) {
            // Gán giá trị của phần tử hiện tại cho phần tử tương ứng trong mảng arr3
            arr3[count] = element;
            count++;
        }

        // Duyệt qua từng phần tử trong mảng arr2
        for(int element: arr2) {
            // Gán giá trị của phần tử hiện tại cho phần tử tương ứng trong mảng arr3
            arr3[count] = element;
            count++;
        }

        // In ra các phần tử trong mảng arr3
        for(int element: arr3) {
            System.out.print(element);
        }
    }
}
