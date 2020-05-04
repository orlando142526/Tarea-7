/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orlan
 */
public class Velero extends Barco{
    
    private int numeroMastiles;
    private float precio;

    public Velero() {
    }
    
    public Velero(int numeroMastiles, float eslora, int dias, String matricula) {
        super(eslora, dias, matricula);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public void calcularPrecio() {
        precio = 10*super.getEslora()*super.getDias()+8*numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero" + " precio: " + precio;
    }

}