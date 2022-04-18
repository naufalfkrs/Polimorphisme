/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author asus
 */
public class Interface {
    public static void main(String[] args) {
        // TODO code application logic here
        Line coba = new Line(2.5, 3, 4, 5);
        Line pertama = new Line(3, 4, 5, 6); 
        coba.getLength();
        coba.isGreater(coba, pertama);
        System.out.println(coba.isGreater(coba, pertama));
    }
}
