import java.util.Scanner;

public class Demo2 {
    // Khai báo mảng của 1 sinh viên
    // Điểm sinh viên bao gồm: Toán, Lý, Hóa
    // Nhập từng điểm cho sinh viên
    // Tính điểm trung bình của sinh viên đó
    // B1: Khai báo mảng float[] diems = new float[3]
    // B2: Nhập giá trị cho từng phần tử diems[index] = ?
    // B3: (toan + ly + hoa) / 3
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float[] marks = new float[3];
        System.out.println("Nhập vào điểm Toán, Lý, Hóa: ");
        for(int i = 0; i < marks.length; i++) {
            marks[i] = Float.parseFloat(scanner.nextLine());
        }
        // Tính điểm TB
        float sum = 0;
        for(float mark: marks) {
            sum += mark;
        }
        System.out.printf("Điểm TB: %.1f ", (sum / marks.length));

        // Tìm max trong mảng
        float max = marks[0];
        for(int i = 0; i < marks.length; i++) {
            if(max < marks[i]) {
                max = marks[i];
            }
        }
        System.out.println("\nGiá trị lớn nhất là: " + max);
    }
}
