package classinteraction;

import java.util.Scanner;

/**
 * @author  DAFA N.F
 * @version 1.0
 * @since   2022-02-21
 */
class Mahasiswa{
    private String nama;
    private String nim;
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNIM(){
        return this.nim;
    }
    
    public void setNIM(String nim){
        this.nim = nim;
    }
}

class Matakuliah{
    private String namaMatkul;
    private String kodeDosen;
    private int jumlahSKS;
    
    public String getNamaMatkul(){
        return this.namaMatkul;
    }
    
    public void setNamaMatkul(String namaMatkul){
        this.namaMatkul = namaMatkul;
    }
    
    public String getKode(){
        return this.kodeDosen;
    }
    
    public void setKode(String kodeDosen){
        this.kodeDosen = kodeDosen;
    }
    
    public int getjumlahSKS(){
        return this.jumlahSKS;
    }
    
    public void setjumlahSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
        
    }
}
public class ClassInteraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kodeMatkul;
        String nimMahasiswa, namaMahasiswa;
        Scanner in = new Scanner(System.in);
        Mahasiswa Dafa = new Mahasiswa();
        System.out.print("Masukan nim anda : ");
        nimMahasiswa = in.nextLine();
        Dafa.setNIM(nimMahasiswa);
        System.out.print("Masukan nama anda : ");
        namaMahasiswa = in.nextLine();
        Dafa.setNama(namaMahasiswa);
        
        //Deklarasi Objek pada Class Matakuliah
        Matakuliah Tekpro = new Matakuliah();
        Matakuliah Sda = new Matakuliah();
        Matakuliah Pkn = new Matakuliah();
        
        //Inisialisasi untuk objek Tekpro
        Tekpro.setNamaMatkul("Teknik Pemrograman");
        Tekpro.setKode("KD001");
        Tekpro.setjumlahSKS(4);
        
        //Inisialisasi untuk objek Sda
        Sda.setNamaMatkul("Struktur Data dan Algoritma");
        Sda.setKode("KD002");
        Sda.setjumlahSKS(3);
        
        //Inisialisasi untuk objek Pkn
        Pkn.setNamaMatkul("Pendidikan Kewarganegaraan");
        Pkn.setKode("KD003");
        Pkn.setjumlahSKS(2);
        
        System.out.println("=================================================");
        System.out.println("List Matakuliah");
        System.out.println("1. "+Tekpro.getNamaMatkul()+" ("+Tekpro.getjumlahSKS()+") ");
        System.out.println("2. "+Sda.getNamaMatkul()+" ("+Sda.getjumlahSKS()+") ");
        System.out.println("3. "+Pkn.getNamaMatkul()+" ("+Pkn.getjumlahSKS()+") ");
        System.out.println("=================================================");
        System.out.print("Masukan kode matakuliah yang ingin diambil : ");
        kodeMatkul = in.nextInt();
        
        System.out.println("NIM\t\t\t: "+Dafa.getNIM());
        System.out.println("Nama\t\t\t: "+Dafa.getNama());
        switch(kodeMatkul){
            case 1:
                System.out.println("Matakuliah yang diambil\t: "+Tekpro.getNamaMatkul());
                System.out.println("Kode Dosen Pengampu\t: "+Tekpro.getKode());
                System.out.println("Jumlah SKS\t\t: "+Tekpro.getjumlahSKS());
                break;
            case 2:
                System.out.println("Matakuliah yang diambil\t: "+Sda.getNamaMatkul());
                System.out.println("Kode Dosen Pengampu\t: "+Sda.getKode());
                System.out.println("Jumlah SKS\t\t: "+Sda.getjumlahSKS());
                break;
            case 3:
                System.out.println("Matakuliah yang diambil\t: "+Pkn.getNamaMatkul());
                System.out.println("Kode Dosen Pengampu\t: "+Pkn.getKode());
                System.out.println("Jumlah SKS\t\t: "+Pkn.getjumlahSKS());
                break;
            default:
                System.out.println("Kode matakuliah yang anda masukan kurang tepat harap masukan antara 1 / 2 / 3 !!!");
                break;
        }
    }
    
}