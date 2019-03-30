package com.company;

    public class Paciente implements Comparable<Paciente>{
        public String Nombre;
        public String Condicion;
        public String Importancia;

        public Paciente (String Nom, String Con, String Imp){
            this.Nombre = Nombre;
            this.Condicion = Condicion;
            this.Importancia = Importancia;
        }
        public int compareTo (Paciente o){
            return Importancia.compareTo(o.Importancia);
        }
    }
