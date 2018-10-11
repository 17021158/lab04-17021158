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
public class BMI {
    public String bmi(double kg,double cao){
        double x= kg/(cao*cao);
        if(kg>=200||cao>=2.5)
            return "Khong binh thuong";
        if(x<18.5) return "Thieu can";
       else if(x<23&&x>=18.5) return "Binh thuong";
       else if(x<=24.99&&x>=23) return "Thua can";
       else return "Beo phi";
    }  
}
