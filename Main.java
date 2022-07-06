public class Main {
  public static void main(String[] args) {
    /*
     * - Crear una clase coche.
     * - Dentro de la clase coche, una variable numérica que almacene el número de
     *   puertas que tiene.
     * - Una función que incremente el número de puertas que tiene el coche.
     * - Crear un objeto miCoche en el main y añadirle una puerta.
     * - Mostrar el número de puertas que tiene el objeto.
     */
 Coche miCoche = new Coche();
            miCoche.AumentaPuerta();
            miCoche.AumentaPuerta();
        System.out.println("El coche tiene "+miCoche.puertas+" puertas");
    }
}
  
class Coche {
    public int puertas = 0;

    public void AumentaPuerta(){
        this.puertas++;
    }
  }