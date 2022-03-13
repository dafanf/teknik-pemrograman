package praktikum5;

/**
 *
 * @author DAFA N.F
 */
public class Restaurant {
    private final Menu[] newMenu;
    private static byte id=0;
    
    public Restaurant() {
        newMenu = new Menu[10];
        for(int i=0 ; i < 10;i++){
            newMenu[i] = new Menu();
        }
    }
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.newMenu[id].setNama_makanan(nama);
        this.newMenu[id].setHarga_makanan(harga);
        this.newMenu[id].setStok(stok);
    }
    public void tampilMenuMakanan(){
        int kodeMakanan;
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                kodeMakanan = i + 1;
                System.out.println(kodeMakanan+")\t"+newMenu[i].getNama_makanan() +"["+newMenu[i].getStok()+"]"+"\tRp. "+newMenu[i].getHarga_makanan());
            }
        }
    }
    public boolean isOutOfStock(int id){
        if(newMenu[id].getStok() == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void nextId(){
        id++;
    }
    public void textHeader(){
        System.out.println("=====Menu Makanan di The Restaurant=====");
    }
    public void textFooter(){
        System.out.println("========================================");
    }
    public void kurangStok(byte id, int jumlahMakan){
        int stokAwal, stokSekarang;
        stokAwal = newMenu[id].getStok();
        newMenu[id].setStok(stokAwal-jumlahMakan);
    }
    public void beliMakanan(byte id, int jumlahMakanan){
        int stokSekarang = 0;
        kurangStok(id,jumlahMakanan);
        textHeader();
        tampilMenuMakanan();
        textFooter();
    }
}
