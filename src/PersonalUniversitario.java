public abstract class PersonalUniversitario {

    protected String nombre;
    protected int legajo;
    protected int antiguedadAnios;
    protected double sueldoBase;

    public PersonalUniversitario(String nombre, int legajo,
                                 int antiguedadAnios, double sueldoBase) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.antiguedadAnios = antiguedadAnios;
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularSalarioMensualBruto();

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Antiguedad: " + antiguedadAnios + " años");
    }
}