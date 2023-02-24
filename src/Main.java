public class Main {
    public static void main(String[] args) {
        suma (1 , 3 , 2);
        Coche miCoche = new Coche ();
        miCoche.SumarPuertas();
        miCoche.SumarPuertas();
        System.out.println("El numero de puertas es: " + miCoche.puertas);

    }
    public static int suma (int a, int b, int c) {

        int resultado = a + b + c;
        return resultado;
    }
}
    class Coche {
        public int puertas = 0;

        public void SumarPuertas () {
            this.puertas++;
        }
    }
