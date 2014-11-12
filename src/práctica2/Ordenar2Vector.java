package práctica2;

//Éric y Laura
class Ordenar2Vector implements OrdenarVector{
    
    public String nombremetodo(){
        return "Selección cuadrática";
    }    
    
    public void ordena (int[] vec , DatosEstadisticos de){
        int n = vec.length;
        int[] vecs = new int[n];
        double comienzo = System.currentTimeMillis();
        
        
        
        double fin = System.currentTimeMillis();
        de.estableceTiempo(fin-comienzo);
    }
}