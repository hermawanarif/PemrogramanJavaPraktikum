/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasedmodopert7;

import java.util.Arrays;

/**
 *
 * @author Axce29
 */
public class olahMahasiswa {
   Mahasiswa[] data;
   private boolean asc;
    private int i;
    private int x;
   
   
    Mahasiswa dt = new Mahasiswa();
    public olahMahasiswa(){
        data = new Mahasiswa[100];
    }
   
    public void get(int ind){
                System.out.println("NIM   : "+data[ind].getNim());
                System.out.println("Nama  : "+data[ind].getNama());
                System.out.println("IPK   : "+data[ind].getIpk());
                System.out.print("\n---------------------------------\n");
                }
   
    public void set(int index, Mahasiswa datmhs){
        data[index] = datmhs;
    }

    public int getIndeks(){
        return i;
    }
   
    public void getIndeks(int index){
        this.i = index;
    }
  public boolean isAsc(){
  return asc;
  }
  public void setAsc(boolean asc){
      this.asc=asc;
  }  
  public int compare(Mahasiswa o1, Mahasiswa o2){
      return o1.getNim().compareTo(o2.getNim());
  }      

    
} 

