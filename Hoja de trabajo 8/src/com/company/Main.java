package com.company;
import java.io.*;
import java.util.Scanner;
import java.util.PriorityQueue;

/**
 * Renato Estrada 181099
 */
public class Main {

    public static void main(String[] args) throws Exception{
        VectorHeap<Paciente> Vector = new VectorHeap<Paciente>();
        PriorityQueue<Paciente> Queue = new PriorityQueue<Paciente>();
        Scanner scan = new Scanner(System.in);
        System.out.println(menu1());
        Integer op1;
        System.out.println(">");
        op1 = scan.nextInt();
        String Nombre;
        String Cond;
        String Importancia;
        boolean cont = true;
        Integer op2;
        if (op1 == 1){
            // Codigo obtenido de https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
            File file = new File("pacientes.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null) {
                String[] paciente = st.split(",");
                Nombre = paciente[0];
                Cond = paciente[1];
                Importancia = paciente[2];
                Paciente taMalito = new Paciente(Nombre, Cond, Importancia);
                Vector.add(taMalito);
            }
            while(cont){
                System.out.println(menu2());
                op2 = scan.nextInt();
                System.out.println(">");
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
            // Codigo obtenido de https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
            File file = new File("pacientes.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null) {
                String[] paciente = st.split(",");
                Nombre = paciente[0];
                Cond = paciente[1];
                Importancia = paciente[2];
                Paciente taMalito = new Paciente(Nombre, Cond, Importancia);
                Queue.add(taMalito);
            }
            while(cont) {
                System.out.println(menu2());
                System.out.println(">");
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


        }else if (op1 == 3 ) {
            System.out.println("Gracias por preferirnos");
        }else{
            System.out.println("No se puede esta opcion");
        }
        }

    /**
     * Inpiracion tomada de mi hoja 4
     */
    public static String menu1(){
        return "\n\ntMenu\n"+
                "Como desea que se ordenen los datos?"+
                "\n1. Con VectorHeap"+
                "\n2. PriorityQueue"+
                "\n3. Salir";
    }

    /**
     * Inpiracion tomada de mi hoja 4
     */
    public static String menu2(){
        return "\n\ntMenu\n"+
                "\n1. Curar un paciete"+
                "\n2. Terminar";
    }
}
