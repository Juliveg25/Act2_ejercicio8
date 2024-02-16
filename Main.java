
public class Main {
    public static void main(String[] args) {
        NuevoEdificioEan edificioEan = new NuevoEdificioEan();
        edificioEan.setTotalEstudiantes();
        edificioEan.setCapacidadSalon();
        edificioEan.setSalonesPorPiso();

        int totalEstudiantes = edificioEan.getTotalEstudiantes();
        int capacidadSalon = edificioEan.getCapacidadSalon();
        int salonesPiso = edificioEan.getSalonesPorPiso();

        int totalSalones = edificioEan.calcularNumeroSalones(totalEstudiantes, capacidadSalon);
        int totalPisos = edificioEan.calcularNumeroPisos(totalSalones, salonesPiso);

        System.out.println("Se necesita construir un edificio de " + totalPisos + " pisos.\n " +
                "Que tenga " + salonesPiso + " salones por piso.\n " +
                "Con una capacidad de " + capacidadSalon + " " +
                "estudiantes por salon,\n " +
                "para los " + totalEstudiantes + " estudiantes de la Universidad EAN.");
    }
}