/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.entornos;

/**
 *
 * @author dev
 */
public class Checker {

    public boolean check(int n) throws Exception {
       if(n < 0){
           throw new Exception("Error");
       }else if(n == 0 || n < 9){
           return false;
       }else{
           return true;
       }

    }
}
