

class Ordenar2Vector implements OrdenarVector{
    
    public String nombremetodo(){
        return null;
    }    
    
    public void ordena (int[] vec , DatosEstadisticos de){
        
        double comienzo = System.currentTimeMillis();
        
        int menor;
        int pos;
        for (int i = 0; i < vec.length; i++) {
            menor = vec[i];
            pos = i;
            for (int j = i+1; j <= vec.length; j++) {
                de.añadeComparacion();
                if (menor>vec[j]) {
                    menor = vec[j];
                    pos = j;
                }
            }
            de.añadeMovimiento();
            vec[pos] = vec[i];
            vec[i] = menor;
        }
        
        double fin = System.currentTimeMillis();
        
        de.estableceTiempo(fin-comienzo);
    }

    


}
