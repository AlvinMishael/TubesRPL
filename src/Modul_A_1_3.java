/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alvin, Alexander Bleuvito Fevrier
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Modul_A_1_3 {
    public static void init(Penilaian penilaian) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah komponen: ");
        int jumlahPenilaian = sc.nextInt();
        while(jumlahPenilaian > 0) {
            System.out.println("Masukkan nama komponen: ");
            String nama = sc.next();

            System.out.println("Masukkan bobot komponen: ");
            int bobot = sc.nextInt();

            penilaian.addNilai(nama, bobot);
            jumlahPenilaian--;
        }
        // penilaian.addNilai("Presentasi", 20);
        // penilaian.addNilai("Implementasi", 40);
        // penilaian.addNilai("Skripsi", 40);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Penilaian penilaian = new Penilaian("Tahun 2020");
        init(penilaian);

        System.out.println("Aplikasi Sidang Skripsi: Hitung Nilai Sidang");
        String barrier = "-------------------";
        System.out.println("");
        System.out.println(barrier);
        System.out.println("");
        System.out.println("Penilaian " + penilaian.getNama());
        double total = 0;
        for (int i = 0; i < penilaian.getSize(); i++) {
            Komponen komponen = penilaian.getKomponen(i);
            System.out.print((i + 1) + ". Masukan Nilai " + komponen.getnama() + " dengan Bobot "
                    + komponen.getBobot() + "%: ");
            double nilai = sc.nextDouble();
            total += (nilai * komponen.getBobot()) / 100;
        }
        System.out.printf("Nilai Akhir: %.2f%n", total);
    }
}

class Penilaian {
    private String nama;
    private List<Komponen> list;

    public Penilaian(String nama) {
        this.nama = nama;
        list = new ArrayList<>();
    }

    public void addNilai(String nama, int bobot) {
        list.add(new Komponen(nama, bobot));
    }

    public int getSize() {
        return list.size();
    }

    public String getNama() {
        return nama;
    }

    public Komponen getKomponen(int idx) {
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