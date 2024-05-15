/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ujian;

/**
 *
 * @author HP 14s
 */
public class convertnumber {
    public static void main(String[] args) {
        String numbersStr = "12345"; // Dideklarasikan dan diinisialisasi variabel numbersStr
        int length = numbersStr.length();
        int[] number = new int[length];
        int index = 0;
        for (int i = length - 1; i >= 0; i--) {
            char numberChar = numbersStr.charAt(i);
            String numberStr = String.valueOf(numberChar);
            int numberInt = Integer.parseInt(numberStr);

            number[index] = numberInt;
            index++;
        }
    }
}