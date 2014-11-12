package práctica2;

//Éric y Laura

import static java.lang.Math.sqrt;

class Ordenar2Vector implements OrdenarVector{
    
    @Override
    public String nombreMetodo(){
        return "Selección cuadrática";
    }    
    
    @Override 
    public void ordena(int[] vec , DatosEstadisticos de){
        int n = vec.length;
        int[] vecs = new int[n];
        int menor;
        
        double comienzo = System.currentTimeMillis();
        
        int npart = (int) sqrt(n);
        int nelement = npart;
        int[] aux = new int[npart];
        
        if (nelement*npart<n){
            nelement++;
            if (nelement*npart<n){
                npart++;
            }
        }
        
        for (int part = 1; part < npart; part++) {
            selpart(vec, n,aux,nelement,part);
        }

        int part;
        for (int m = 0; m < vec.length; m++) {
            menor = aux[1];
            part = 1;
            
            for(int e = 2; e <= npart; e++){
                de.añadeComparacion();
                if(aux[e] < menor){
                    menor = aux[e];
                    part=e;
                }
            }
            de.añadeMovimiento();
            vecs[m] = menor;
            selpart(vec, n, aux, nelement,part);
        }
        
        
        double fin = System.currentTimeMillis();
        de.estableceTiempo(fin-comienzo);
    }

    private void selpart(int[] vec, int n, int[] aux, int nelement, int part) {
        int primero = (part-1)*nelement+1;
        int último = 0;
        
        
        if(nelement*part < n ){
            último = nelement*part;
        }
        else{
            último = n;
        }
        
        int pos  = primero;
        int menor = vec[primero];
        
        for (int elem = primero+1; elem < último; elem++) {
            if(vec[elem] < menor){
                menor = vec[elem];
                pos = elem;
            }
        }
        
        aux[part] = menor;
        vec[pos] = Integer.MAX_VALUE;
    }
}