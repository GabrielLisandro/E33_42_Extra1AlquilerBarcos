
package e33_42_extra1alquilerbarcos;

public class YateLujo extends Barco{
    private double potenciaCV;
    private int numeroCamarotes;

    public YateLujo(double potenciaCV, int numeroCamarotes, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public double moduloAlquilerBarco() {
        return super.moduloAlquilerBarco() + potenciaCV + numeroCamarotes;
    }

    @Override
    public String toString() {
        return "YatesDeLujo{" + "potenciaCV=" + potenciaCV + ", numeroCamarotes=" + numeroCamarotes + ", " + super.toString();
    }
     
    
    
}
