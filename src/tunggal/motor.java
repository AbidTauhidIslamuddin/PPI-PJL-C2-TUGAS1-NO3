/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunggal;

/**
 *
 * @author Night's Watch
 */
public class motor extends kendaraan{
    public static void main(String[] args){
        motor data = new motor();
        data.setAtribut("HONDA", "Motor");

        //Menampilkan hasil
        System.out.println("Jenis Kendaraan: "+data.getJanis());
        System.out.println("Merek Kendaraan: "+data.getMerek());
        data.Melaju(290);
    }
}