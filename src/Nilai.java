
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author keannen renaldo halim, neil christopher, wilson
 */
public class Nilai {
    ArrayList<String[]> tableNilai;
    double totalNilai;
            
    public Nilai(){
        this.tableNilai = new ArrayList<>();
        this.totalNilai = 0;
    }
    
    private void addNilai(String kategori, String bobot, String nilai){
        String[] rowNilai = new String[3];
        rowNilai[0] = kategori;
        rowNilai[1] = bobot;
        rowNilai[2] = nilai;
        this.tableNilai.add(rowNilai);
    }
    
    //split data satu baris menjadi kategori, bobot, dan nilai
    public void inputData(String row){
        String[] res = row.split(" ");
        this.addNilai(res[0], res[1], res[2]);
    }
    
    private void countTotal(){
        for(int i = 0; i < this.tableNilai.size(); i++){
            String[] temp = this.tableNilai.get(i);
            double nilai = Double.parseDouble(temp[1])/100.0 * Double.parseDouble(temp[2]);
            this.totalNilai+= nilai;
        }
    }
    
    
    //dapatkan total dari semua nilai dikali dengan bobotnya
    public double getTotal(){
        this.countTotal();
        return this.totalNilai;
    }
}
