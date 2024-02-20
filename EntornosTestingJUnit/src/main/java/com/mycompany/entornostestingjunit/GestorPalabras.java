/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entornostestingjunit;

/**
 *
 * @author dev
 */
public class GestorPalabras {

    public boolean esPalindromo(String palabra) {
        String palabraFormateada = palabra.replaceAll(" ", "").toLowerCase();
        String[] compTilde = palabraFormateada.split(" ");
        for (int i = 0; i < compTilde.length; i++) {
            String palabraTilde = compTilde[i];

            for (int j = 0; j < palabraFormateada.length(); j++) {
                
                if (palabraFormateada.charAt(j) == 'á') {
                  palabraFormateada =   palabraFormateada.replace(palabraFormateada.charAt(j), 'a');
                         
                } else if (palabraFormateada.charAt(j) == 'é') {
                   palabraFormateada = palabraFormateada.replace(palabraFormateada.charAt(j), 'e');
                    

                } else if (palabraFormateada.charAt(j) == 'í') {
                     palabraFormateada = palabraFormateada.replace(palabraFormateada.charAt(j), 'i');
                   

                } else if (palabraFormateada.charAt(j) == 'ó') {
                    palabraFormateada= palabraFormateada.replace(palabraFormateada.charAt(j), 'o');
                    

                } else if (palabraFormateada.charAt(j) == 'ú') {
                   palabraFormateada =  palabraFormateada.replace(palabraFormateada.charAt(j), 'u');
                   
                }
            }
        }
        for (int i = 0; i < palabraFormateada.length() / 2; i++) {
            if (palabraFormateada.charAt(i) != palabraFormateada.charAt(palabraFormateada.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int contarVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = Character.toLowerCase(palabra.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public String invertirPalabra(String palabra) {
        StringBuilder resultado = new StringBuilder();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            resultado.append(palabra.charAt(i));
        }
        return resultado.toString();
    }
}
