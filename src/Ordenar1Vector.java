import práctica2.DatosEstadisticos;
import práctica2.OrdenarVector;

public class Ordenar1Vector implements OrdenarVector {

    @Override
    public String nombreMetodo() {
        return "El método de la burbuja";
    }

    @Override
    public void ordena(int[] v, DatosEstadisticos de) {
        int aux = 0;
        de.estableceTiempo(0);
        double tiempo = (double) System.currentTimeMillis();
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (v[i] < v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }

        }
        double temp = System.currentTimeMillis() - tiempo;
        de.estableceTiempo(temp);
    }

   
}