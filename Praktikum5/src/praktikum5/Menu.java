package praktikum5;

/**
 * @author DAFA N.F
 */
public class Menu {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    public Menu(){
        this.nama_makanan = "";
        this.harga_makanan = 0;
        this.stok = 0;
    }
    /**
     * @return the nama_makanan
     */
    public String getNama_makanan() {
        return nama_makanan;
    }

    /**
     * @param nama_makanan the nama_makanan to set
     */
    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    /**
     * @return the harga_makanan
     */
    public double getHarga_makanan() {
        return harga_makanan;
    }

    /**
     * @param harga_makanan the harga_makanan to set
     */
    public void setHarga_makanan(double harga_makanan) {
        this.harga_makanan = harga_makanan;
    }

    /**
     * @return the stok
     */
    public int getStok() {
        return stok;
    }

    /**
     * @param stok the stok to set
     */
    public void setStok(int stok) {
        this.stok = stok;
    }
    
}
