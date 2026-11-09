public class Investigador extends PersonalUniversitario {

    private int cantidadPapers;
    private double subsidioAsignado;

    public Investigador(String nombre, int legajo,
                        int antiguedadAnios, double sueldoBase,
                        int cantidadPapers, double subsidioAsignado) {

        super(nombre, legajo, antiguedadAnios, sueldoBase);

        this.cantidadPapers = cantidadPapers;
        this.subsidioAsignado = subsidioAsignado;
    }

    @Override
    public double calcularSalarioMensualBruto() {

        double bonoAntiguedad = sueldoBase * 0.02 * antiguedadAnios;
        double bonoInvestigacion = cantidadPapers * 20000;

        return sueldoBase + bonoAntiguedad + bonoInvestigacion;
    }

    public double getSubsidioAsignado() {
        return subsidioAsignado;
    }
}