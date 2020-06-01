/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Juanc
 */
public class Television extends Electrodomestico{
    private int resolucion;
    private boolean puertoHDMI;
    
     public Television(int codigo ) {
         super(codigo);
    }
     
    public Television() {
    }

    public Television(int resolucion, boolean puertoHDMI, int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.puertoHDMI = puertoHDMI;
    }
    
    @Override
    public double obtenerPrecioFinal() {
        return 0;
        
    }
    
}
