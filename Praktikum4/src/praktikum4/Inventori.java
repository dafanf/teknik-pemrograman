package praktikum4;

/**
 *
 * @author DAFA N.F
 */
public class Inventori {
    Barang[] barangs;
    
    void initBarang(){
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("001", "Celana", 20);
    }
    
    void showBarang(){
        System.out.println(barangs[0].getNama() + " ( " + barangs[0].getStok() + " ) ");
        System.out.println(barangs[1].getNama() + " ( " + barangs[1].getStok() + " ) ");
    }
    
    void pengadaaan(){
        initBarang();
        barangs[0].addStokBarang(500);
        barangs[1].addStokBarang(500);
        showBarang();
    }
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaaan();
}
}
