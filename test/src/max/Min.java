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
public class Min {
    static int minmang( int [] a){
        int min= a[0];
        for(int i=0; i<a.length; i++)
            if(min>a[i])
                min=a[i];
        return min;
    }
}
