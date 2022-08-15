/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number_guessing;

/**
 *
 * @author hp
 */
public class guessNumbers {
      private static int randomgen=0;
    public  static int _randomNumber(){
        randomgen=(int) Math.round(Math.random()*100);
        return randomgen;
    
}
    private static int checkifZero(int num){
        int newNum=0;
        if(num==0)
        {
         newNum=_randomNumber();
        }
        else
        {
            newNum=num;
            
        }
        return newNum;
    }
    
}
