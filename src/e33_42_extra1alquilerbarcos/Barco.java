
package e33_42_extra1alquilerbarcos;

public abstract class Barco {
    protected String matricula;
    protected double  eslora;
    protected int anioFabricacion;

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }
    
    public double moduloAlquilerBarco() {
        return eslora * 10;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion;
    }
    
}
