package interfaceapp.entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Celular
        extends Dispositivo
        implements Camara, Navegador, Reproductor {
    
    private String marca;
    private String modelo;
    
    @Override
    public String getNombre() {
        return marca + " | " + modelo;
    }
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    @Override
    public void capturarFoto() {
       
    }

    @Override
    public void grabarVideo() {
        
    }

    @Override
    public void getApertura() {
        
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
