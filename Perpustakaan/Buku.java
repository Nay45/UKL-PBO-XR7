package UKLPBO.Perpustakaan;

import java.util.ArrayList;

public class Buku {
    //    Array List
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    //    Add Array
    public Buku() { // contructor
        this.idBuku.add(1);
        this.namaBuku.add("Kimia");
        this.stok.add(7);
        this.harga.add(20000);

        this.idBuku.add(2);
        this.namaBuku.add("Fisika");
        this.stok.add(5);
        this.harga.add(22000);
    }

    //    Mencari banyak elemen di array
    public int getJmlBuku() {
        return this.idBuku.size();
    }

    //    Mendapatkan id
    public int getid(int id) {
        return this.idBuku.get(id);
    }

    //    Mendapatkan nama buku sesuai id buku
    public String getNamaBuku(int idBuku) {
        return this.namaBuku.get(idBuku);
    }

    //    Mendapatkan stok buku
    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    }

    //    Mendapatkan harga buku
    public int getHarga(int idBuku) {
        return this.harga.get(idBuku);
    }

//    Set stok minus
    public void setBukuMin (int idbuku, int banyak){
        int min = getStok(idbuku) - banyak;
        stok.set(idbuku, min);
    }

//    Set stok plus
    public void setBukuPlus (int idbuku, int banyak){
        int plus = getStok(idbuku) + banyak;
        stok.set(idbuku, plus);
    }
}
