/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author Real Madrid
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        String[][]compañeros = new String[5][4];
           
      compañeros[0] = new String[]{"Daniel", "Medina", "Electronica", "TETS"};
      compañeros[1] = new String[]{"Monica", "Jimenes", "Computacion", "IMSA"};
      compañeros[2] = new String[]{"Joel", "Avila", "Computacion", "LOTELHSA"};
      compañeros[3] = new String[]{"Genesis", "Hernandez", "Electronica", "PBS"};
      compañeros[4] = new String[]{"Gissel", "Aguilera", "Electronica", "SISTELNET"};
        
        
        for (int i = 0; i< compañeros.length; i++) {
        
        System.out.println("Nombre: " + compañeros[i][0]+ " Apellido: " + compañeros[i][1]+ " Carrera: " + compañeros[i][2]+ " Lugar de Trabajo: " + compañeros[i][3]);
        }
    }
}
