/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujian;

/**
 *
 * @author HP 14s
 */
public class fakebinary {
      public static String fakeBin(String numberString){
          String result ="";
          for(int i=0; i<numberString.length(); i++){
              char numberchar = numberString.charAt(i);
              String numberStr = String.valueOf(numberchar);
              int numberInt = Integer.parseInt(numberStr);
              
              if (numberInt < 5){
                  result += "0";
              }
          }
      



