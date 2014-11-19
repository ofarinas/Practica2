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
        MediaDatosEstadisticos mediaDatosEstadisticos = new MediaDatosEstadisticos();
        for (int i = 0; i < 10; i++) {
            mediaDatosEstadisticos.añadeDatosEstadisticos(estadisticaOrdenaVector(m, tam_vector, true));
        }

        return mediaDatosEstadisticos;
    }

    public static DatosEstadisticos[] estadisticasOrdenaVectoresInversos(OrdenarVector m, int[] tam_vectores) {
        DatosEstadisticos[] datosEstadisticos = new DatosEstadisticos[tam_vectores.length];
        for (int i = 0; i < tam_vectores.length; i++) {
            datosEstadisticos[i] = estadisticaOrdenaVector(m, tam_vectores[i], false);
        }
        return datosEstadisticos;
    }

    public static MediaDatosEstadisticos[] estadisticasOrdenaVectoresAleatorios(OrdenarVector m, int[] tam_vectores) {
        MediaDatosEstadisticos[] datosEstadisticoses=new MediaDatosEstadisticos[tam_vectores.length];
        for (int i = 0; i < tam_vectores.length; i++) {
            estadisticaOrdenaVector(m, tam_vectores[i], true);
        }
        return datosEstadisticoses;
    }

}
