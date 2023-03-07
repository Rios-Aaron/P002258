package POO_2258;

import java.awt.*;
public class Main {
    public static void main(String[] args) {
        public class Perro {
            private String nombre;
            private String raza;
            private Color ojos;
            private String tamanio;
            private int vacunas;

            public Perro() {
            }

            public Perro(String nombre, String raza, Color ojos, String tamanio, int vacunas) {
                this.nombre = nombre;
                this.raza = raza;
                this.ojos = ojos;
                this.tamanio = tamanio;
                this.vacunas = vacunas;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public String getRaza() {
                return raza;
            }

            public void setRaza(String raza) {
                this.raza = raza;
            }

            public Color getOjos() {
                return ojos;
            }

            public void setOjos(Color ojos) {
                this.ojos = ojos;
            }

            public String getPequeño_o_grande() {
                return tamanio;
            }

            public void setPequeño_o_grande(String pequeño_o_grande) {
                this.tamanio = pequeño_o_grande;
            }

            public int getVacunas() {
                return vacunas;
            }

            public void setVacunas(int vacunas) {
                this.vacunas = vacunas;
            }


            @Override
            public String toString() {
                return "Perro{" +
                        "nombre='" + nombre + '\'' +
                        ", raza='" + raza + '\'' +
                        ", ojos=" + ojos +
                        ", pequeño_o_grande='" + tamanio + '\'' +
                        ", vacunas=" + vacunas +
                        '}';
            }
            public boolean ladrar(){
                System.out.println(nombre + " ¿Está ladrando?");
                boolean ladrando = Math.random() >= 0.51;
                return ladrando;
            }
            public boolean comer (){
                System.out.println(nombre + " ¿Está comiendo?");
                boolean comiendo = Math.random() > 0.51;
                return comiendo;
            }
            public boolean dormir (){
                System.out.println(nombre + " ¿Está durmiendo?");
                boolean durmiendo = Math.random() > 0.51;
                return durmiendo;
            }

        }

    }
}