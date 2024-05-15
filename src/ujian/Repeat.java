/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ujian;

/**
 *
 * @author HP 14s
 */
public class Repeat {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        System.out.println(repeatString("a", 3)); // Mengulang string "a" sebanyak 3 kali
        System.out.println(repeatString("hello", 2)); // Mengulang string "hello" sebanyak 2 kali
    }

    public static String repeatString(String str, int times) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append(str);
        }
        return result.toString();
    }
    }