package interfaceapp.entidades;

/**
 *
 * @author Andres
 */
public class SmartTV
        extends Dispositivo
        implements Navegador, Reproductor {
    
    private int tipoEntrada;
    
    @Override
    public String getNombre() {
        
        String nombreEntrada = "";
        switch(tipoEntrada) {
            case 0 : 
                nombreEntrada = "HDMI"; 
                break;
            case 1: 
                nombreEntrada = "VGA"; 
                break;
            case 2 : 
                nombreEntrada = "DVI"; 
                break;
            case 3: 
                nombreEntrada = "DisplayPort"; 
                break;
            case 4 : 
                nombreEntrada = "RCA"; 
                break;
            case 5: 
                nombreEntrada = "Signal"; 
                break;
            case 6 : 
                nombreEntrada = "SVideo"; 
                break;
            case 7 : 
                nombreEntrada = "Coaxial"; 
                break;
        }
        return "Modelo: " + nombreEntrada;
    }
    
    /**
     * @return the tipoEntrada
     */
    public int getTipoEntrada() {
        return tipoEntrada;
    }

    /**
     * @param tipoEntrada the tipoEntrada to set
     */
    public void setTipoEntrada(int tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    @Override
    public void navegador() {
          
    }

    @Override
    public void abrirEnlace(String enlace) {
          
    }

    @Override
    public void reproducir() {
          
    }

    @Override
    public void adelantar() {
          
    }

    @Override
    public void retroceder() {
          
    }
}
