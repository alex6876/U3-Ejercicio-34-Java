public class Main {

    public static void main(String[] args) {

        ProfesorTitular profesor = new ProfesorTitular(
                "Carlos Gomez", 1001, 10, 800000,
                20, "Titular"
        );

        Investigador investigador = new Investigador(
                "Laura Martinez", 1002, 5, 900000,
                8, 1500000
        );

        AyudanteCatedra ayudante = new AyudanteCatedra(
                "Pedro Fernandez", 1003, 3, 500000,
                12
        );

        PersonalUniversitario[] personal = {
                profesor,
                investigador,
                ayudante
        };

        System.out.println("===== REPORTE INSTITUCIONAL =====");

        for (PersonalUniversitario empleado : personal) {

            System.out.println("\n------------------------------");

            empleado.mostrarInformacion();

            System.out.println("Salario mensual bruto: $"
                    + empleado.calcularSalarioMensualBruto());

            if (empleado instanceof Investigador) {

                Investigador inv = (Investigador) empleado;

                System.out.println("Subsidio asignado: $"
                        + inv.getSubsidioAsignado());
            }
        }
    }
}