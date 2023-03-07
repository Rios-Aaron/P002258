package POO_2258;

import java.awt.*;
public class Main {
    public static void main(String[] args) {
        public class Gato {
            private String nombre;
            private byte edad;
            private Color pelaje;
            private String raza;
            private String tamanio;
            public Gato(){
            }
            public Gato(String nombre, byte edad, Color pelaje, String raza, String tamanio) {
                this.nombre = nombre;
                this.edad = edad;
                this.pelaje = pelaje;
                this.raza = raza;
                this.tamanio = tamanio;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public byte getEdad() {
                return edad;
            }

            public void setEdad(byte edad) {
                if (edad>0 && edad<=25){
                    this.edad = edad;
                } else {
                    System.out.println(" Error: esa edad no es correcta");
                }
            }

            public Color getPelaje() {
                return pelaje;
            }

            public void setPelaje(Color pelaje) {
                this.pelaje = pelaje;
            }

            public String getRaza() {
                return raza;
            }

            public void setRaza(String raza) {
                this.raza = raza;
            }

            public String getTamanio() {
                return tamanio;
            }

            public void setTamanio(String tamanio) {
                this.tamanio = tamanio;
            }

            @Override
            public String toString() {
                return "Gato{" +
                        "nombre='" + nombre + '\'' +
                        ", edad=" + edad +
                        ", pelaje=" + pelaje +
                        ", raza='" + raza + '\'' +
                        ", tamanio=" + tamanio +
                        '}';
            }
            public float caminar(float camino){
                System.out.print(nombre + " camino: " + camino + " metros"+ " o " );
                float metroscamino = camino * 50;
                return metroscamino;
            }
            public boolean comer(){
                System.out.println("¿El gato está comiendo?: ");
                boolean comiendo =Math.random()>0.51;
                return comiendo;
            }
            public boolean rascar(){
                System.out.println("¿El gato está rascando?: ");
                boolean rascar =Math.random()>0.51;
                return rascar;
            }
        }
    }