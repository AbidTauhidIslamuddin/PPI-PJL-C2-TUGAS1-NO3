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
public class kendaraan {
    
    String Merek;
    int Kecepatan;
    String Jenis;
    
    void Melaju(int Kecepatan){
        this.Kecepatan = Kecepatan;
        System.out.println("======== MELAJU ========");
        System.out.println("Kecepatan "+Kecepatan+" Km/Jam");
    }
    
    void setAtribut(String Merek, String Jenis){
        this.Merek = Merek;
        this.Jenis = Jenis;
    }
    
    String getMerek(){
        return Merek;
    }
    
    String getJanis(){
        return Jenis;
    }
}