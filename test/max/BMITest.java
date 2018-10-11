/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max;
import max.BMI;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Thuy Hoang
 */
public class BMITest {
    @Test
    public void test1(){
        BMI x= new BMI();
        String y="Thieu can";
        assertEquals(y,x.bmi(40,1.5));
        
    }
     @Test
    public void test2(){
        BMI x= new BMI();
        String y="Binh thuong";
        assertEquals(y,x.bmi(58,1.6));  
    }
     @Test
    public void test3(){
        BMI x= new BMI();
        String y="Thua can";
        assertEquals(y,x.bmi(60,1.6));
        
    }
     @Test
    public void test4(){
        BMI x= new BMI();
        String y="Beo phi";
        assertEquals(y,x.bmi(65,1.55));
        
    }
     @Test
    public void test5(){
        BMI x= new BMI();
        String y="Khong binh thuong";
        assertEquals(y,x.bmi(200,1.6));
        
    }
    
    
}
