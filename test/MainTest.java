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
        System.out.println("hitungNilai");
        String[] namaFile = new String[] {"C:\\Users\\vitof\\OneDrive\\Documents\\GitHub\\TubesRPL\\src"};
        Main instance = new Main();
        double expResult = 84;
        double result = instance.hitungNilai(namaFile);
        assertEquals(expResult, result, 0);
    }
    
}
