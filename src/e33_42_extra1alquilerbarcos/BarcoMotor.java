
package e33_42_extra1alquilerbarcos;

public class BarcoMotor extends Barco {
    private double  potenciaCV;

    public BarcoMotor(double potenciaCV, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    @Override
    public double moduloAlquilerBarco() {
        return super.moduloAlquilerBarco() + potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoAmotor{" + "potenciaCV=" + potenciaCV + ", " + super.toString();
    }
    
    
}
