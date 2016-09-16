/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author aldair
 */
public class Cafeteria {
    private double capacidadM;
    private double cantidadA;

    public Cafeteria(double capacidadM, double cantidad) {
        this.capacidadM = (1000);
        this.cantidadA = (0);
    }

    public double getCapacidadM() {
        return capacidadM;
    }

    public void setCapacidadM(double capacidadM) {
        this.capacidadM = capacidadM;
    }

    public double getCantidad() {
        return cantidadA;
    }

    public void setCantidad(double cantidad) {
        this.cantidadA = cantidad;
    }
    
    public void agregar(int cant){
        
        this.setCantidad(getCantidad() + cant);
    } 
    
    public void igualar(double capacidadM){
        
        this.capacidadM = capacidadM;
        
        if (cantidadA > capacidadM) {
            
            this.cantidadA = capacidadM;
            
        } else {
            
            this.cantidadA = cantidadA;
        }
        
    }
    
    public void servir(double tazas, double CantTaza){
        
        double aux;
        
        aux = (this.cantidadA - tazas*(CantTaza));
        
        if(this.cantidadA < tazas);
            tazas = this.cantidadA;
        
    }
    
    public void vaciar(){
        
        this.cantidadA = 0;
    }
    
    public void llenar(){
        
        this.cantidadA = this.capacidadM;
    }
}
