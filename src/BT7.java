public class BT7 {
    public static void main(String[] args) {
        // Khởi tạo mảng hai chiều
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

        // Khởi tạo hai biến sum1 và sum2 để tính tổng các phần tử trên đường chéo chính và phụ
        int sum1 = 0;
        int sum2 = 0;

        // Duyệt qua từng phần tử trong mảng hai chiều
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                // Nếu phần tử nằm trên đường chéo chính
                if(i == j) {
                    // Cộng giá trị phần tử vào sum1
                    sum1 += arr[i][j];
                }
                // Nếu phần tử nằm trên đường chéo phụ
                if(i + j == arr.length - 1) {
                    // Cộng giá trị phần tử vào sum2
                    sum2 += arr[i][j];
                }
            }
        }

        // In ra tổng các phần tử trên đường chéo chính
        System.out.println("Tổng đơn vị đường chéo chính: " + sum1 );
        // In ra tổng các phần tử trên đường chéo phụ
        System.out.println("Tổng đơn vị đường chéo phụ: " + sum2 );
    }
}
