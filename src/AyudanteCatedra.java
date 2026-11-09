public class AyudanteCatedra extends PersonalUniversitario {

    private int asignacionPracticas;

    public AyudanteCatedra(String nombre, int legajo,
                           int antiguedadAnios, double sueldoBase,
                           int asignacionPracticas) {

        super(nombre, legajo, antiguedadAnios, sueldoBase);

        this.asignacionPracticas = asignacionPracticas;
    }

    @Override
    public double calcularSalarioMensualBruto() {

        double bonoAntiguedad = sueldoBase * 0.02 * antiguedadAnios;
        double bonoPracticas = asignacionPracticas * 10000;

        return sueldoBase + bonoAntiguedad + bonoPracticas;
    }
}