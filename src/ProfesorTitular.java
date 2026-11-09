public class ProfesorTitular extends PersonalUniversitario {

    private int horasFrenteAlumnos;
    private String categoriaDocencia;

    public ProfesorTitular(String nombre, int legajo,
                           int antiguedadAnios, double sueldoBase,
                           int horasFrenteAlumnos, String categoriaDocencia) {

        super(nombre, legajo, antiguedadAnios, sueldoBase);

        this.horasFrenteAlumnos = horasFrenteAlumnos;
        this.categoriaDocencia = categoriaDocencia;
    }

    @Override
    public double calcularSalarioMensualBruto() {

        double bonoAntiguedad = sueldoBase * 0.02 * antiguedadAnios;
        double bonoHoras = horasFrenteAlumnos * 5000;

        double bonoCategoria = 0;

        if (categoriaDocencia.equalsIgnoreCase("Titular")) {
            bonoCategoria = 80000;
        }

        return sueldoBase + bonoAntiguedad + bonoHoras + bonoCategoria;
    }
}