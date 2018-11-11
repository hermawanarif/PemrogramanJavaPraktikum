/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasedmodopert7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Axce29
 */
public class TugasEdmodoPert7 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        olahMahasiswa od = new olahMahasiswa();
        Mahasiswa  data = new Mahasiswa();
        Scanner masukan = new Scanner (System.in);
        int input;
        int in =0;
        int jml;
        do{
            do{
                System.out.println("=========Menu==========");
                System.out.println("1.Masukan data");
                System.out.println("2.Menampilkan data");
                System.out.println("3.Sorting data");
                System.out.println("4.Keluar");
                System.out.print("Masukan pilihan Anda : ");               
                input = masukan.nextInt();
               
                if(input<=0){
                    System.out.print("Harap pilih menu 1-4");
                }
                else if(input>4){
                    System.out.print("Harap pilih menu 1-4");
                }               
            }while(input>6);
           
            System.out.print("---------------------------------\n\n");
           
            switch(input){
                case 1: do{
                            System.out.print("Jumlah data mahasiswa yang dimasukan [1-100] : ");
                            jml = masukan.nextInt();
                            od.getIndeks(jml);
                            if(jml>100){
                                System.out.print("\nJumlah data mahasiswa yang dimasukan \nmelebihi kapasitas yang ditentukan\n\n");
                            }
                        }while(jml>100);
                        for(int i = 0; i<jml; i++){
                          
                           
                            System.out.println("Data mahasiswa ke- "+(i+1));
                            System.out.print("NIM : ");
                            String nim = masukan.next();
                            data.setNim(nim);
                            System.out.print("Nama : ");
                            String nam = masukan.next();
                            data.setNama(nam);
                            System.out.print("IPK : ");
                            double ip = masukan.nextDouble();
                            data.setIpk(ip);
                            System.out.print("\n");
                            od.set(i, data);    
                        }
                        break;
                   
                case 2: 
                           for(int i = 0; i<i; i++){
                                        System.out.print("\n---------------------------------\n");
                                        System.out.print("Data mahasiswa"+(i+1)+"\n");
                                        od.get(i);
                                    }
                                    break;
                case 3: System.out.println("---------------------------------");
                        System.out.println("Sorting data :");
                        System.out.println("1.Sorting by NIM");
                        System.out.println("2.Sorting by Nama");
                        System.out.println("3.Sorting by IPK");;
                        System.out.print("Pilih : ");
                        System.out.print("\n---------------------------------\n");
                        int car = masukan.nextInt();

                        switch(car){
                            case 1:   
                                    System.out.print("\n---------------------------------\n");
                                  
                                    break;
                               
                            case 2: System.out.print("Masukan NIM mahasiswa yang dicari : ");
                                    
                                    break;
                            case 3: System.out.print("Masukan IPK mahasiswa yang dicari : ");
                                    
                                    break;
                        }
                        break;   
                case 4: System.out.println("Terima Kasih");
                        System.exit(0);
                        break;
            }
        }while(in==0);
    }
}