package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println(menu1());
    Integer op1;
    op1 = scan.nextInt();
    if (op1 == 1){


    }else if (op1 == 2) {

    }else if (op1 > 2 ) {
        System.out.println("Gracias por preferirnos");
    }
    }
    public static String menu1(){
        return "\n\ntMenu\n"+
                "Como desea que se ordenen los datos?"+
                "1. Con VectorHeap"+
                "2. PriorityQueue"+
                "3. Salir";
    }
    public static String secondMenu(){
        return "\n\ntMenu\n"+
                "1. Curar un paciete"+
                "2. Terminar";
    }
}
