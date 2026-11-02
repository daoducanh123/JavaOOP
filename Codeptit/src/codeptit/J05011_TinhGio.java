/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;


/**
 *
 * @author DAGaming
 */
public class J05011_TinhGio {
    public static class Gamer{
        String ma,name;
        long h, p;

        public Gamer(String ma, String name, long h, long p) {
            this.ma = ma;
            this.name = name;
            this.h = h;
            this.p = p;
        }
        
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Gamer> listGamer = new ArrayList<>();
        while (n-->0){
            String ma = sc.nextLine();
            String name =sc.nextLine();
            String strGioVao = sc.nextLine();
            String strGioRa = sc.nextLine();
            
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime gioVao = LocalTime.parse(strGioVao.trim(),fmt);

            LocalTime gioRa = LocalTime.parse(strGioRa.trim(),fmt);
            long s = ChronoUnit.SECONDS.between(gioVao, gioRa);
            long h = s / 3600;
            long tmp = s - h * 3600;
            long p = tmp / 60;
            
            Gamer gamer = new Gamer (ma,name,h,p);
            listGamer.add(gamer);
        }
            listGamer.sort((a,b)->Long.compare(b.p, a.p)) ; 
            listGamer.sort((a,b)->Long.compare(b.h, a.h)) ;
            for (int i = 0; i < listGamer.size(); ++i){
                Gamer gamer = listGamer.get(i);
                System.out.printf("%s %s %d gio %d phut", gamer.ma, gamer.name, gamer.h, gamer.p);
                System.out.println("");
            }
    }
}
