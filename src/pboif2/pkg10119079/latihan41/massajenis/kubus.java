/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119079.latihan41.massajenis;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class kubus {
    private int sisi,massa;
    
public int getSisi(){
    return sisi;
}

public void setSisi(int sisi){
    this.sisi = sisi;
}

public int getMassa(){
    return massa;
}

public void setMassa(int massa){
    this.massa= massa;

}

public int hitungVolume(int parSisi){
    return (int) Math.pow(parSisi, 3);
}

public int hitungMassaJenis(int parMassa, int volume){

    this.massa = parMassa/volume;
    return this.massa;
}    
}