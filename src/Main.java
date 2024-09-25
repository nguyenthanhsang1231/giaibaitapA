import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //b1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap so dien: ");
//        int soDien = sc.nextInt();
//        int[] donGia = {1806, 1866, 2167, 2729, 3050, 3151};
//        int[] sanLuong = {50, 50, 100, 100, 100, 0};
//        int tongTien = 0;
//        for (int i = 0; i < donGia.length; i++) {
//            if (soDien > 0) {
//                int suDung;
//                if (soDien >= sanLuong[i]) {
//                    suDung = sanLuong[i];
//                } else {
//                    suDung = soDien;
//                }
//                tongTien += suDung * donGia[i];
//                soDien -= suDung;
//            }
//        }
//
//        System.out.println("Tong tien: " + tongTien + " dong");


        //b2
//        int[] menhGia = {100, 20, 5, 1};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("nhap so tien can rut: ");
//        int T = sc.nextInt();
//        int[] soLuongTo = new int[menhGia.length];
//        for (int i = 0; i < menhGia.length; i++) {
//            soLuongTo[i] = T / menhGia[i];
//            T %= menhGia[i];
//        }
//        for (int i = 0; i < menhGia.length; i++) {
//            System.out.println("menh gia " + menhGia[i] + ": " + soLuongTo[i] + " vnd");
//        }


        // b3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();

        List<List<Test.E>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.get(u).add(new Test.E(v, w));
        }
        Test.dijkstra(n, start, graph);
    }
}