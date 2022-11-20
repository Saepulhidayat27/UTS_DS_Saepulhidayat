/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ardin
 */
public class UTS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          List<mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new mahasiswa(2255201, "Saepul hidayat", "TIFRM22A", 270504));
        mahasiswaList.add(new mahasiswa(2255202, "Syahrul dayat", "TIFRM22B", 280604));
        mahasiswaList.add(new mahasiswa(2255203, "Selmi agustian", "TIF22A", 290704));
        mahasiswaList.add(new mahasiswa(2255204, "Siti syadiah", "TIF22B", 240904));
        mahasiswaList.add(new mahasiswa(2255205, "opik muhammad", "TIFRM22C", 181022));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
        mahasiswaList.remove(0);

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
    }
    
}
