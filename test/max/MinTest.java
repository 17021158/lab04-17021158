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
//import java.lang.ArrayIndexOutOfBoundsException;
import max.Min;
import static org.junit.Assert.*;
import org.junit.Test;
public class MinTest {
     Min x=new Min();
        @Test
        public void test1(){   
            int mang[]={1,2,3};
            assertEquals("gia tri min la 1",1,x.minmang( mang));
        }
        @Test
        public void test2(){
            int mang[]={0,0,0};
            assertEquals("cac phan tu nhu nhau",0,x.minmang( mang));
        }
        @Test
        public void test3(){
            int mang[]={0};
            assertEquals("mang rong",0,x.minmang( mang));
        }
        @Test
        public void test4(){
            int mang[]={6,6,8};
            assertEquals("co hai phan tu bang nhau",6,x.minmang(mang));
        }
        @Test
        public void test5(){
            int mang[]={5,10,11,12};
            assertEquals("gia tri min la 5",5,x.minmang( mang));
        }
}
