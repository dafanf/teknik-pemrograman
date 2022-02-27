/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

/**
 *
 * @author DAFA N.F
 */
public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;
    
    public Barang(String kode, String nama, int stk){
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    public void setKode(String kodeBarang){
        kode_barang = kodeBarang;
    }
    
    public String getKode(){
        return kode_barang;
    }
    
    public void setNama(String namaBarang){
        nama_barang = namaBarang;
    }
    
    public String getNama(){
        return nama_barang;
    }
    
    public void setStok(int stokBarang){
        stok = stokBarang;
    }
    
    public int getStok(){
        return stok;
    }
    
    public void addStokBarang(int stokBaru){
        stok += stokBaru; 
    }
}
