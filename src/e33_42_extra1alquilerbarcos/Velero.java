
package e33_42_extra1alquilerbarcos;

public class Velero extends Barco {
    private int numeroMastiles;

    public Velero(int numeroMastiles, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    
    @Override
    public double moduloAlquilerBarco() {
        return super.moduloAlquilerBarco() + numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numeroMastiles=" + numeroMastiles + ", " + super.toString();
    }
    
    
}
