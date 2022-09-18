package VL20InRaCacChuCai;

import java.util.Scanner;

/**
 *
 * @author LapHoang
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanne= new Scanner(System.in);
        char x= scanne.next().charAt(0);
        char y= scanne.next().charAt(0);
        for (char i = x; i <= y; i++) {
            System.out.print(Character.toUpperCase(i)+" "); 
        }
    }
}
