/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FileNotFoundException;

/**
 *
 * @author Alvin Mishael Halim, Alexander Bleuvito Fevrier
 */
public class MainTest2 {

    @Test
    public void t11() {
        System.out.println("t11");
        String[] namaFile = new String[] {"D:\\whitebox\\t11.txt", "0"};
        Main instance = new Main();
        double expResult = 86;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void t12() {
        System.out.println("t12");
        String[] namaFile = new String[] {"D:\\whitebox\\t12.txt", "0"};
        Main instance = new Main();
        double expResult = 86.1;
        double result = instance.hitungNilai(namaFile);
        assertNotEquals(expResult, result, 0);
    }
    
    @Test
    public void t13() {
        System.out.println("t13");
        String[] namaFile = new String[] {"D:\\whitebox\\t13.txt", "0"};
        Main instance = new Main();
        double expResult = 82.95;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void t14() {
        System.out.println("t14");
        String[] namaFile = new String[] {"D:\\whitebox\\t14.txt", "0"};
        Main instance = new Main();
        double expResult = 83.065;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void t15() {
        System.out.println("t15");
        String[] namaFile = new String[] {"D:\\whitebox\\t15.txt", "0"};
        Main instance = new Main();
        try{
            double result = instance.hitungNilai(namaFile);
        }catch(java.lang.NumberFormatException ex){
            String msg= "Menyebabkan exception " + ex;
            fail(msg);
        }
    }
    
    @Test
    public void t16() {
        System.out.println("t16");
        String[] namaFile = new String[] {"D:\\whitebox\\Penilaian2020\\t16.txt", "0"};
        Main instance = new Main();
        double expResult = 83;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void t17() {
        System.out.println("t17");
        String[] namaFile = new String[] {"D:\\whitebox\\t17.txt", "0"};
        Main instance = new Main();
        try{
            double result = instance.hitungNilai(namaFile);
        }catch(java.lang.NumberFormatException ex){
            String msg= "Menyebabkan exception " + ex;
            fail(msg);
        }
    }
    
    @Test
    public void t18() {
        System.out.println("t18");
        String[] namaFile = new String[] {"D:\\whitebo\\t18.txt", "0"};
        Main instance = new Main();
        double result = instance.hitungNilai(namaFile);
        Throwable exc = assertThrows(FileNotFoundException.class, () -> {instance.hitungNilai(namaFile);});
        
    }
    
    @Test
    public void t19() {
        System.out.println("t19");
        String[] namaFile = new String[] {"D:\\whitebox\\t19.docx", "0"};
        Main instance = new Main();
        try{
            double result = instance.hitungNilai(namaFile);
        }catch(java.lang.IndexOutOfBoundsException ex){
            String msg= "Menyebabkan exception " + ex;
            fail(msg);
        }
    }
    
    @Test
    public void t20() {
        System.out.println("t20");
        String[] namaFile = new String[] {".\\t20.txt", "0"};
        Main instance = new Main();
        double expResult = 83;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void t21() {
        System.out.println("t21");
        String[] namaFile = new String[] {"D:\\whitebox\\white box\\t21.txt", "0"};
        Main instance = new Main();
        double result = instance.hitungNilai(namaFile);
        Throwable exc = assertThrows(FileNotFoundException.class, () -> {instance.hitungNilai(namaFile);});
    }
    
    @Test
    public void t22() {
        System.out.println("t22");
        String[] namaFile = new String[] {"D:\\whitebox\\t22.txt", "0"};
        Main instance = new Main();
        double expResult = 79.5;
        double result = instance.hitungNilai(namaFile);
        assertNotEquals(expResult, result, 0);
    }
    
    @Test
    public void t23() {
        System.out.println("t23");
        String[] namaFile = new String[] {"D:\\whitebox\\t23.txt", "0"};
        Main instance = new Main();
        double expResult = 86.5;
        double result = instance.hitungNilai(namaFile);
        assertNotEquals(expResult, result, 0);
    }
}
