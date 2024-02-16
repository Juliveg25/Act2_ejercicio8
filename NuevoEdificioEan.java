import java.util.Scanner;

public class NuevoEdificioEan {

    private int totalEstudiantes;
    private int capacidadSalon;
    private int salonesPorPiso;

    public NuevoEdificioEan() {
    }

    public void setTotalEstudiantes() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuántos estudiantes tiene la Universidad EAN? ");
        this.totalEstudiantes = scan.nextInt();
    }

        public void setCapacidadSalon() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuántos estudiantes podrán entrar en cada salón? ");
        this.capacidadSalon = scan.nextInt();
    }

    public void setSalonesPorPiso() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuántos salones habrá en cada piso? ");
        this.salonesPorPiso = scan.nextInt();
    }

    public int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public int getCapacidadSalon() {
        return capacidadSalon;
    }

    public int getSalonesPorPiso() {
        return salonesPorPiso;
    }

    public int calcularNumeroSalones(int totalEstudiantes, int capacidadSalon){
        return totalEstudiantes / capacidadSalon;
    }

    public int calcularNumeroPisos(int totalSalones, int salonesPorPiso){
        return (int) Math.ceil((double) totalSalones / salonesPorPiso);
    }
}
