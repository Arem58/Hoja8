package com.company;

/**
 * Renato Estrada
 */
    public class Paciente implements Comparable<Paciente>{
        public String Nombre;
        public String Condicion;
        public String Importancia;

    /**
     * @param Nom
     * @param Con
     * @param Imp
     */
        public Paciente (String Nom, String Con, String Imp){
            this.Nombre = Nombre;
            this.Condicion = Condicion;
            this.Importancia = Importancia;
        }

    /**
     * compara las importancias
     * @param o
     * @return 1, 0 .-1
     */
        public int compareTo (Paciente o){
            return Importancia.compareTo(o.Importancia);
        }
    }
