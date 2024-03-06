import java.util.Scanner;

public class Demo4 {
    // Nhập vào số hàng (row), số cột (col) của mảng
    // Khai báo mảng arr[r][c]
    // ======MENU======
    // Nhập giá trị cho tất cả phần tử của mảng
    // In các phần tử của mảng dưới dạng ma trận
    // Tính tổng tất cả phần tử mảng
    // In ra đường chéo chính
    // In ra đường chéo phụ (phải là ma trận vuông)
    // In ra đường biên
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số hàng, số cột của mảng");
        System.out.println("Nhập số hàng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột: ");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];

        do {
            System.out.println("======MENU======");
            System.out.println("1. Nhập giá trị cho tất cả phần tử của mảng");
            System.out.println("2. In các phần tử của mảng dưới dạng ma trận");
            System.out.println("3. Tính tổng tất cả phần tử mảng");
            System.out.println("4. In ra đường chéo chính");
            System.out.println("5. In ra đường chéo phụ");
            System.out.println("6. In ra đường biền");
            System.out.println("7. Thoát");
            System.out.println("Mời bạn chọn 1 - 7");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.printf("array[%d][%d]= ", i, j);
                            arr[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr.length; j++) {
                            System.out.printf("array[%d][%d]= %d\n", i, j, arr[i][j]);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.print(arr[i][j] + "");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            sum += arr[i][j];
                        }
                    }
                    System.out.println("Tổng tất cả phần tử mảng là: " + sum);
                    break;
                case 4:
                    System.out.println("Đường chéo chính");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            if (i == j) {
                                System.out.printf("% - 3d", arr[i][j]);
                            } else {
                                System.out.printf("% - 3s", "");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    if (row == col) {
                        System.out.println("Đường chéo phụ");
                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr[i].length; j++) {
                                if (i + j == arr.length - 1) {
                                    System.out.printf("% - 3d", arr[i][j]);
                                } else {
                                    System.out.printf("% - 3s", "");
                                }
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Chéo phụ chỉ dành cho ma trận vuông thôi");
                    }
                    break;
                case 6:
                    System.out.println("Đường biên");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                                System.out.printf("% - 3d", arr[i][j]);
                            } else {
                                System.out.printf("% - 3s", "");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}