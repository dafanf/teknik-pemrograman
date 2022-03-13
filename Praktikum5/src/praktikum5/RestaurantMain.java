package praktikum5;

import java.util.Scanner;

/**
 * @author DAFA N.F
 */
public class RestaurantMain {
    public static void main(String[] args) {
        byte kodeMakanan;
        int jumlahPesanan;
        Scanner in = new Scanner(System.in);
        Restaurant menu = new Restaurant();
        menu.textHeader();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_500, 10);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 2_000, 50);
        menu.tampilMenuMakanan();
        menu.textFooter();
        System.out.print("Masukan kode makanan yang  dipesan : ");
        kodeMakanan = in.nextByte();
        kodeMakanan -= 1;
        System.out.print("\nMasukan jumlah pesanan : ");
        jumlahPesanan = in.nextInt();
        menu.beliMakanan(kodeMakanan, jumlahPesanan);
    }
}
