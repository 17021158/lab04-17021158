/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max;

/**
 *
 * @author Thuy Hoang
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import max.Max;
import static org.junit.Assert.*;
import org.junit.Test;
public class MaxTest {
    @Test
            public void test1(){
    Max x= new Max();
   assertEquals(3,x.max(1,3));
    System.out.println("ket qua la 3");
}
    @Test
            public void test2(){
    Max x= new Max();
   assertEquals(11,x.max(11,9));
    System.out.println("ket qua la 11");
}
    @Test
            public void test3(){
    Max x= new Max();
   assertEquals(99,x.max(99,13));
    System.out.println("ket qua la 99");
}
     @Test
            public void test4(){
    Max x= new Max();
   assertEquals("hai so bang nhau",9,x.max(9,9));
    System.out.println("Hai so bang nhau");
}
     @Test
            public void test5(){
    Max x= new Max();
   assertEquals(-5,x.max(-5,-5));
    System.out.println("hai so am bang nhau");
}
          
}
