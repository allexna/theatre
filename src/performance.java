import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class performance {
    int i;

    private String name;
    private String zhanr;
    private String theatr;
    private String date;
    private double cost;
    private int actors_count;
    private ArrayList<String>fathername=new ArrayList<String>();
    //private ArrayList<performance>listofperformance=new ArrayList<performance>();



    public performance(){

    }





   public performance (String name,String zhanr,String theatr,String date,double cost,int actors_count){
        this.name=name;
        this.zhanr=zhanr;
        this.theatr=zhanr;
        this.date=date;
        this.cost=cost;
        this.actors_count=actors_count;


    }

    public double getCost() {
        return cost;
    }

    public int getActors_count() {
        return actors_count;
    }

    public ArrayList<String> getFathername() {
        return fathername;
    }

    public String getZhanr() {
        return zhanr;
    }

    public void setActors_count(int actors_count) {
        this.actors_count = actors_count;
    }

    public void setFathername(ArrayList<String> fathername) {

         this.fathername = fathername;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZhanr(String zhanr) {
        this.zhanr = zhanr;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void compass_fathername(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input fathername to compass ");
        String comp = in.nextLine();

        for (var i:this.fathername
             )
        {if(comp.equals(i) )
        {System.out.println("Есть такая фамилия");break;}
        else {System.out.println("Нет фамилии");}

        }

    }
    public void add_fathername(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input fathername ");
        String fathername = in.nextLine();
        this.fathername.add(fathername);

    }



}



