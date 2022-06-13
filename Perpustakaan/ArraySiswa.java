package UKLPBO.Perpustakaan;

import java.util.ArrayList;

public class ArraySiswa implements GetInfo {
    //    Array List
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    //    Add Array (contructor)
    public ArraySiswa(){ // public private protected defaul = modifiers
        this.idSiswa.add(1); // this = menyatakan objek sekarang
        this.namaSiswa.add("Nayo");
        this.alamat.add("Nganjuk");
        this.telepon.add("081252255258");
        this.status.add(true);

        this.idSiswa.add(2);
        this.namaSiswa.add("Zizi");
        this.alamat.add("Nganjuk");
        this.telepon.add("085851547479");
        this.status.add(true);
    }

    //    Mencari banyak elemen di array
    public int getJmlSiswa(){
        return this.namaSiswa.size();
    }

    //    Mendapatkan status true/false
    public boolean getStatus(int idSiswa){
        return this.status.get(idSiswa);
    }

    //    Edit status
    public void editStatus(int idSiswa, Boolean status){
        this.status.set(idSiswa, status);
    }

    //    Mendapatkan id
    public int getid(int id){
        return this.idSiswa.get(id);
    }

    @Override // accessor method
    public void setNama(String nama) {
        this.namaSiswa.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idPeminjam) {
        return this.namaSiswa.get(idPeminjam);
    }

    @Override
    public String getAlamat(int idAlamat) {
        return this.alamat.get(idAlamat);
    }

    @Override
    public String getTelepon(int idTelepon) {
        return this.telepon.get(idTelepon);
    }
}