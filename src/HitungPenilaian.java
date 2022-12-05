/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alvin
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class HitungPenilaian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Penilaian Tahun2020 = new Penilaian("Tahun 2020");
        Tahun2020.addNilai("Presentasi", 20);
        Tahun2020.addNilai("Implementasi", 40);
        Tahun2020.addNilai("Skripsi", 40);
        System.out.println("Aplikasi Sidang Skripsi");
        String barrier = "-------------------";
        System.out.println("");
        System.out.println(barrier);
        System.out.println("");
        System.out.println("Penilaian " + Tahun2020.getNama());
        double total = 0;
        for(int i =0; i < Tahun2020.getSize(); i++){
            System.out.print((i+1) + ". Masukan Nilai " + Tahun2020.getKomponen(i).getnama() + " dengan Bobot " + Tahun2020.getKomponen(i).getBobot()+ "% : ");
            double nilai = sc.nextDouble();
            total += (nilai*Tahun2020.getKomponen(i).getBobot())/100;
        }
        System.out.printf("Nilai Akhir: %.2f%n" ,total);
    }
}

class Penilaian {
    private String nama;
    private List<Komponen> list;
    
    public Penilaian(String nama){
        this.nama = nama;
        list = new ArrayList<>();
    }
    
    public void addNilai(String nama,  int bobot){
        list.add(new Komponen(nama, bobot));
    }
    
    public int getSize(){
        return list.size();
    }
    
    public String getNama(){
        return nama;
    }
    
    public Komponen getKomponen(int idx){
        return list.get(idx);
    }
}

class Komponen {
    private String nama;
    private int bobot;

    public Komponen(String nama, int bobot) {
        this.nama = nama;
        this.bobot = bobot;
    }

    public String getnama() {
        return this.nama;
    }

    public int getBobot() {
        return this.bobot;
    }
}
