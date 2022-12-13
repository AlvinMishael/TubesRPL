/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alvin Mishael Halim, Alexander Bleuvito Fevrier
 */
public class MainTest {

    @Test
    public void t01() {
        System.out.println("t01");
        String[] namaFile = new String[] {"D:\\whitebox\\t01.txt", "0"};
        Main instance = new Main();
        double expResult = 84;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void t02() {
        System.out.println("t02");
        String[] namaFile = new String[] {"D:\\whitebox\\t02.txt", "0"};
        Main instance = new Main();
        double expResult = 84;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void t03() {
        System.out.println("t03");
        String[] namaFile = new String[] {"D:\\whitebox\\t03.txt", "0"};
        Main instance = new Main();
        double expResult = 84;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void t04() {
        System.out.println("t04");
        String[] namaFile = new String[] {"D:\\whitebox\\t04.txt", "0"};
        Main instance = new Main();
        double expResult = 79.9;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void t05() {
        System.out.println("t05");
        String[] namaFile = new String[] {"D:\\whitebox\\t05.txt", "0"};
        Main instance = new Main();
        double expResult = 100;
        double result = instance.hitungNilai(namaFile);
        assertNotEquals(expResult, result);
    }
    
    @Test
    public void t06() {
        System.out.println("t06");
        String[] namaFile = new String[] {"D:\\whitebox\\t06.txt", "0"};
        Main instance = new Main();
        double expResult = 99.9;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }
}
