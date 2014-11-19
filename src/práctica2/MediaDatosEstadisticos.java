//juan daniel ,Osvaldo 
package práctica2;
class MediaDatosEstadisticos{

    private int numeroDatos;
    private float tiempo;
    private float numeroDeComparaciones;
    private float numeroDeMovimiento;
    
    public MediaDatosEstadisticos() {
    }

    
    public void añadeDatosEstadisticos(DatosEstadisticos de){
        numeroDatos++;
        tiempo+=(float)de.dameTiempo();
        numeroDeComparaciones+=de.dameComparaciones();
        numeroDeMovimiento+=de.dameMovimientos();
    }
    
    public double dameMediaTiempos(){
        return tiempo/numeroDatos;
        
    }
    
    public double dameMediaComparaciones(){
        return numeroDeComparaciones/numeroDatos;
       
    }
    
    
    public double dameMediaMovimientos(){
        return numeroDeMovimiento/numeroDatos;
       
    }
    
    
}