public class BT9 {
    public static void main(String[] args) {
        // Khởi tạo mảng số nguyên
        int[] arr = {22, 62, 56, 24, 13, 4, 7, 4, 19 ,5};

        // Khởi tạo hai biến max1 và max2 với giá trị nhỏ nhất
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        // Duyệt qua từng phần tử trong mảng
        for(int i = 0; i < arr.length; i++) {
            // Nếu phần tử hiện tại lớn hơn max1
            if(max1 < arr[i]) {
                // Gán giá trị của max1 cho max2
                max2 = max1;
                // Gán giá trị của phần tử hiện tại cho max1
                max1 = arr[i];
            }
            // Nếu phần tử hiện tại lớn hơn max2 và nhỏ hơn max1
            else if(max2 < arr[i] && arr[i] < max1) {
                // Gán giá trị của phần tử hiện tại cho max2
                max2 = arr[i];
            }
        }

        // In ra giá trị lớn nhất
        System.out.println("Giá trị lớn nhất là: " + max1);
        // In ra giá trị lớn thứ hai
        System.out.println("Giá trị lớn hai là: " + max2);
    }
}
