import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khởi tạo mảng hai chiều
        double[][] matrix = {{1.3, 1.4, 1.5},
                             {2.3, 2.6, 2.8},
                             {4.2, 2.1, 3.3}};

        // Khởi tạo giá trị lớn nhất ban đầu là phần tử đầu tiên của mảng
        double maxElement = matrix[0][0];
        int row = 0;
        int col = 0;

        // Duyệt qua từng phần tử trong mảng
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                // Nếu phần tử hiện tại lớn hơn giá trị lớn nhất hiện tại
                if(matrix[i][j] > maxElement) {
                    // Cập nhật giá trị lớn nhất và vị trí của nó
                    maxElement = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        // In ra giá trị lớn nhất và vị trí của nó trong mảng
        System.out.println("Phần tử lớn nhất " + maxElement + " tại vị tri " + row + col);
    }
}
