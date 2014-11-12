package práctica2;

class DatosEstadisticos {
    
    private double tiempo;
    private int comparaciones;
    private int movimientos;
    
    public DatosEstadisticos() {
        this.tiempo = 0;
        this.comparaciones = 0;
        this.movimientos = 0;
    }

    //--->Métodos incrementa ++
    
    public void añadeTiempo(double tiempoTemp) {
        tiempo += tiempoTemp;
    }
    
    public void añadeComparacion(){
        this.comparaciones++;
    }
    
    public void añadeMovimiento(){
        this.movimientos++;
    }


    //--->Métodos dame (getters)
    
    public double dameTiempo() {
        return tiempo;
   }
   
    public int dameComparaciones() {
        return this.comparaciones;
   }
   
    public int dameMovimientos() {
        return this.movimientos;
   }
   
   
   //--->Métodos establece (setters)
   
    public void estableceTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
    public void estableceComparaciones(int cmp) {
        this.comparaciones = cmp;
    }
   
    public void estableceMovimientos(int mv) {
        this.movimientos = mv;
    }
   
 
}