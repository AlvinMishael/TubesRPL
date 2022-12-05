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
class Penilaian {
    String nama;
    List<Komponen> list;
    
    public Penilaian(String nama){
        this.nama = nama;
        list = new ArrayList<>();
    }
    
    public void addNilai(String nama,  int bobot){
        list.add(new Komponen(nama, bobot));
    }
    
    public boolean validasiBobot(){
        int sum =0;
        for(int i =0; i < list.size(); i++){
            sum += list.get(i).getBobot();
        }
        return sum == 100;
    }
}
