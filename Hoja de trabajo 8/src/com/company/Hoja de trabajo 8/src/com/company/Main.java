package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws Exception{
    Scanner scan = new Scanner(System.in);
    System.out.println(menu1());
    Integer op1;
    op1 = scan.nextInt();
    String Nombre;
    String Cond;
    String Importancia;
    boolean cont = true;
    Integer op2;
    if (op1 == 1){
        VectorHeap<Paciente> Vector = new VectorHeap<Paciente>();
        File file = new File("pacientes.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            String[] paciente = st.split(", ");
            Nombre = paciente[0];
            Cond = paciente[1];
            Importancia = paciente[2];
            Vector.add(new Paciente (Nombre, Cond, Importancia));
        }
        while(cont){
            System.out.println(menu2());
            op2 = scan.nextInt();
            if (op2 == 2){
                cont = false;
            }else if(op2 == 1){
                System.out.println(Vector.remove());
            }
            if (Vector.size()!= 0){
                cont = false;
            }

        }

    }else if (op1 == 2) {
        PriorityQueue<Paciente> Queue = new PriorityQueue<Paciente>();
        File file = new File("pacientes.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            String[] paciente = st.split(", ");
            Nombre = paciente[0];
            Cond = paciente[1];
            Importancia = paciente[2];
            Queue.add(new Paciente (Nombre, Cond, Importancia));
        }
        while(cont) {
            System.out.println(menu2());
            op2 = scan.nextInt();
            if (op2 == 2) {
                cont = false;
            } else if (op2 == 1) {
                System.out.println(Queue.remove());
            }
            if (Queue.size() != 0) {
                cont = false;
            }
        }


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
    public static String menu2(){
        return "\n\ntMenu\n"+
                "1. Curar un paciete"+
                "2. Terminar";
    }
}
