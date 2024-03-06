public class Demo3 {
    public static void main(String[] args) {
        int[] sv1 = {10, 10, 10};
        int[] sv2 = {10, 4, 5};
        int[] sv3 = {5, 5, 5};
        int[] sv4 = {6, 6, 9};

        int[][] svs = {sv1, sv2, sv3, sv4};

//        System.out.println("sv1[0][0]= " + svs[0][0]);
//        System.out.println("sv1[0][1]= " + svs[0][1]);
//        System.out.println("sv1[0][2]= " + svs[0][2]);
//
//        System.out.println("sv1[1][0]= " + svs[1][0]);
//        System.out.println("sv1[1][1]= " + svs[1][1]);
//        System.out.println("sv1[1][2]= " + svs[1][2]);
//
//        System.out.println("sv1[2][0]= " + svs[2][0]);
//        System.out.println("sv1[2][1]= " + svs[2][1]);
//        System.out.println("sv1[2][2]= " + svs[2][2]);
//
//        System.out.println("sv1[3][0]= " + svs[3][0]);
//        System.out.println("sv1[3][1]= " + svs[3][1]);
//        System.out.println("sv1[3][2]= " + svs[3][2]);

        for(int i = 0; i < svs.length; i++) {
            for (int j = 0; j < svs[i].length; j++) {
                System.out.printf("array[%d][%d]= %d\n", i, j, svs[i][j]);
            }
        }
    }
}
