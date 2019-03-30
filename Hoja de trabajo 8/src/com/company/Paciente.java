package com.company;

    public class Paciente <E extends Comparable<E>> {
        public String Nombre;
        public String Condicion;
        public String Importancia;

        public Paciente (String Nom, String Con, String Imp){
            this.Nombre = Nombre;
            this.Condicion = Condicion;
            this.Importancia = Importancia;
        }

    }
