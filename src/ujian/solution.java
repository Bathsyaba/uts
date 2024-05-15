/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujian;

/**
 *
 * @author HP 14s
 */
public class solution {
    public static String doubleChar(String s){
        String text ="";
        for(int i=0; i < s.length(); i++){
            char huruf = s.charAt(i);
            String hurufStr = String.valueOf(huruf);
            text += hurufStr + hurufStr;
        }
        return text;
    }
    
}
