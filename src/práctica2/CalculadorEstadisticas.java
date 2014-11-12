package práctica2;

public class CalculadorEstadisticas {

    public static DatosEstadisticos estadisticaOrdenaVector(OrdenarVector m, int tam_vector, boolean modo) {
        DatosEstadisticos resultado = new DatosEstadisticos();
        int[] vector = GeneraCaso.generaVector(tam_vector, modo);
        m.ordena(vector, resultado);
        CompruebaCaso.compruebaVector(vector, tam_vector);
        return resultado;
    }

    public static MediaDatosEstadisticos estadisticaOrdenaVectorAleatorio(OrdenarVector m, int tam_vector) {
        int[] vector;
        DatosEstadisticos datosEstadisticos = new DatosEstadisticos();
        for (int i = 0; i < 10; i++) {
            vector = GeneraCaso.generaVector(tam_vector, true);
            m.ordena(vector, datosEstadisticos);
            datosEstadisticos.añadeTiempo(datosEstadisticos.dameTiempo());
        }
     
        return new MediaDatosEstadisticos();
    }

    public static DatosEstadisticos[] estadisticasOrdenaVectoresInversos(OrdenarVector m, int[] tam_vectores) {
        DatosEstadisticos[] resultados = new DatosEstadisticos[tam_vectores.length];
        return resultados;
    }

    public static MediaDatosEstadisticos[] estadisticasOrdenaVectoresAleatorios(OrdenarVector m, int[] tam_vectores) {
        MediaDatosEstadisticos[] resultados = new MediaDatosEstadisticos[tam_vectores.length];
        return resultados;
    }

}
