import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("burcunuzu ogrenmek icin gun ve ay  girin:");
        Scanner sc = new Scanner(System.in);
        int gun=sc.nextInt();
        int ay=sc.nextInt();

        if (ay==3) {
            if (21 <=gun)
                System.out.println("burcunuz koc'tur");
            else System.out.println("burcunuz balik'tir");

        }
        if (ay==4) {
            if (21 <=gun)
                System.out.println("burcunuz boga'dir");
            else System.out.println("burcunuz koc'tur");

        }
        if (ay==5) {
            if (22 <=gun)
                System.out.println("burcunuz ikizler'tur");
            else System.out.println("burcunuz boga'dir");

        }
        if (ay==6) {
            if (23 <=gun)
                System.out.println("burcunuz yengec'tir");
            else System.out.println("burcunuz ikizler'dir");

        }
        if (ay==7) {
            if (23 <=gun)
                System.out.println("burcunuz aslan'dir");
            else System.out.println("burcunuz yengec'tir");

        }
        if (ay==8) {
            if (23<=gun)
                System.out.println("burcunuz basak'dir");
            else System.out.println("burcunuz aslan'dir");

        }
        if (ay==9) {
            if (21 <=gun)
                System.out.println("burcunuz terazi'dir");
            else System.out.println("burcunuz basak'dir");

        }
        if (ay==10) {
            if (23 <=gun)
                System.out.println("burcunuz akrep'tir");
            else System.out.println("burcunuz terazi'dir");

        }
        if (ay==11) {
            if (22 <=gun)
                System.out.println("burcunuz yay'dir");
            else System.out.println("burcunuz akrep'tir");

        }
        if (ay==12) {
            if (22 <=gun)
                System.out.println("burcunuz oglak'tur");
            else System.out.println("burcunuz yay'dir");

        }
        if (ay==1) {
            if (22 <=gun)
                System.out.println("burcunuz kova'dir");
            else System.out.println("burcunuz oglak'dir");

        }
        if (ay==2) {
            if (20 <=gun)
                System.out.println("burcunuz balik'tir");
            else System.out.println("burcunuz kova'dir");

        }
    }
}
