
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author keannen renaldo halim, neil christopher, wilson
 */
public class Main {
    public double hitungNilai(String namaFile) {
        ArrayList<Nilai> kumpulanNilai = new ArrayList<>();
        while (true) {
            if(namaFile.equals("0")){//jika diisi dengan 0, artinya file nya sudah habis
                break;
            }
            try {
                Nilai n1 = new Nilai();
                FileInputStream fis = new FileInputStream(namaFile);
                Scanner sc1 = new Scanner(fis);
                while (sc1.hasNextLine()) {//scan isi dari file per baris
                    String row = sc1.nextLine();
                    n1.inputData(row);//masukkan ke dalam object Nilai
                }
                sc1.close();
                kumpulanNilai.add(n1);//masukkan nilai ke dalam kumpulanNilai
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        int banyak = kumpulanNilai.size();
        double total = 0;
        for(int i = 0; i < kumpulanNilai.size(); i++){
            total+=kumpulanNilai.get(i).getTotal();//cari total semua nilai
        }
        
        return total/banyak;
    }

    public static void main(String[] args) {
    }
}
