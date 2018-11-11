/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasedmodopert7;

import java.util.ArrayList;

/**
 *
 * @author Axce29
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;
    private int i;
    
    public Mahasiswa(){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.i = i;
        
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public int getIndek() {
        return i;
    }

    public void setIndek(int ind) {
        this.i = i;
    }
    
}
