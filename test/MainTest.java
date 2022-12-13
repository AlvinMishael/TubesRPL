/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.io.FileNotFoundException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vitof
 */
public class MainTest {

    @Test
    public void t01() {
        System.out.println("t01");
        String[] namaFile = new String[]{"D:\\whitebox\\t01.txt", "0"};
        Main instance = new Main();
        double expResult = 84;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void t02() {
        System.out.println("t02");
        String[] namaFile = new String[]{"D:\\whitebox\\t02.txt", "0"};
        Main instance = new Main();
        double expResult = 84;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void t03() {
        System.out.println("t03");
        String[] namaFile = new String[]{"D:\\whitebox\\t03.txt", "0"};
        Main instance = new Main();
        double expResult = 84;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void t04() {
        System.out.println("t04");
        String[] namaFile = new String[]{"D:\\whitebox\\t04.txt", "0"};
        Main instance = new Main();
        double expResult = 79.9;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void t05() {
        System.out.println("t05");
        String[] namaFile = new String[]{"D:\\whitebox\\t05.txt", "0"};
        Main instance = new Main();
        double expResult = 100;
        double result = instance.hitungNilai(namaFile);
        assertNotEquals(expResult, result);
    }

    @Test
    public void t06() {
        System.out.println("t06");
        String[] namaFile = new String[]{"D:\\whitebox\\t06.txt", "0"};
        Main instance = new Main();
        double expResult = 99.9;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void t07() {
        System.out.println("t07");
        String[] namaFile = new String[]{"D:\\whitebox\\t07.txt", "0"};
        Main instance = new Main();
        double expResult = 75.9;
        double result = instance.hitungNilai(namaFile);
        assertNotEquals(expResult, result);
    }

    @Test
    public void t08() {
        System.out.println("t08");
        String[] namaFile = new String[]{"D:\\whitebox\\t08.txt", "0"};
        Main instance = new Main();
        double expResult = 76;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void t09() {
        System.out.println("t09");
        String[] namaFile = new String[]{"D:\\whitebox\\t09.txt", "0"};
        Main instance = new Main();
        double expResult = 76.1;
        double result = instance.hitungNilai(namaFile);
        assertNotEquals(expResult, result);
    }

    @Test
    public void t10() {
        System.out.println("t10");
        String[] namaFile = new String[]{"D:\\whitebox\\t10.txt", "0"};
        Main instance = new Main();
        double expResult = 85.9;
        double result = instance.hitungNilai(namaFile);
        assertNotEquals(expResult, result);
    }

    @Test
    public void t11() {
        System.out.println("t11");
        String[] namaFile = new String[]{"D:\\whitebox\\t11.txt", "0"};
        Main instance = new Main();
        double expResult = 86;
        double result = instance.hitungNilai(namaFile);
        assertNotEquals(expResult, result);
    }

    @Test
    public void t12() {
        System.out.println("t12");
        String[] namaFile = new String[]{"D:\\whitebox\\t12.txt", "0"};
        Main instance = new Main();
        double expResult = 86.1;
        double result = instance.hitungNilai(namaFile);
        assertNotEquals(expResult, result, 0);
    }

    @Test
    public void t13() {
        System.out.println("t13");
        String[] namaFile = new String[]{"D:\\whitebox\\t13.txt", "0"};
        Main instance = new Main();
        double expResult = 82.95;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void t14() {
        System.out.println("t14");
        String[] namaFile = new String[]{"D:\\whitebox\\t14.txt", "0"};
        Main instance = new Main();
        double expResult = 83.065;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void t15() {
        System.out.println("t15");
        String[] namaFile = new String[]{"D:\\whitebox\\t15.txt", "0"};
        Main instance = new Main();
        try {
            double result = instance.hitungNilai(namaFile);
        } catch (java.lang.NumberFormatException ex) {
            String msg = "Menyebabkan exception " + ex;
            fail(msg);
        }
    }

    @Test
    public void t16() {
        System.out.println("t16");
        String[] namaFile = new String[]{"D:\\whitebox\\Penilaian2020\\t16.txt", "0"};
        Main instance = new Main();
        double expResult = 83;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void t17() {
        System.out.println("t17");
        String[] namaFile = new String[]{"D:\\whitebox\\t17.txt", "0"};
        Main instance = new Main();
        try {
            double result = instance.hitungNilai(namaFile);
        } catch (java.lang.NumberFormatException ex) {
            String msg = "Menyebabkan exception " + ex;
            fail(msg);
        }
    }

    @Test
    public void t18() {
        System.out.println("t18");
        String[] namaFile = new String[]{"D:\\whitebo\\t18.txt", "0"};
        Main instance = new Main();
        double result = instance.hitungNilai(namaFile);
        Throwable exc = assertThrows(FileNotFoundException.class, () -> {
            instance.hitungNilai(namaFile);
        });

    }

    @Test
    public void t19() {
        System.out.println("t19");
        String[] namaFile = new String[]{"D:\\whitebox\\t19.docx", "0"};
        Main instance = new Main();
        try {
            double result = instance.hitungNilai(namaFile);
        } catch (java.lang.IndexOutOfBoundsException ex) {
            String msg = "Menyebabkan exception " + ex;
            fail(msg);
        }
    }

    @Test
    public void t20() {
        System.out.println("t20");
        String[] namaFile = new String[]{".\\t20.txt", "0"};
        Main instance = new Main();
        double expResult = 83;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void t21() {
        System.out.println("t21");
        String[] namaFile = new String[]{"D:\\whitebox\\white box\\t21.txt", "0"};
        Main instance = new Main();
        double result = instance.hitungNilai(namaFile);
        Throwable exc = assertThrows(FileNotFoundException.class, () -> {
            instance.hitungNilai(namaFile);
        });
    }

    @Test
    public void t22() {
        System.out.println("t22");
        String[] namaFile = new String[]{"D:\\whitebox\\t22.txt", "0"};
        Main instance = new Main();
        double expResult = 79.5;
        double result = instance.hitungNilai(namaFile);
        assertNotEquals(expResult, result, 0);
    }

    @Test
    public void t23() {
        System.out.println("t23");
        String[] namaFile = new String[]{"D:\\whitebox\\t23.txt", "0"};
        Main instance = new Main();
        double expResult = 86.5;
        double result = instance.hitungNilai(namaFile);
        assertNotEquals(expResult, result, 0);
    }

}
