public class App {
    public static void main(String[] args) throws Exception {
       Empleado[] empleados = new Empleado[2];
       empleados[0] = new EmpleadoTiempoCompleto("Carlos Fernando", "123", 48000.0);
       empleados[1] = new EmpleadoMedioTiempo("Juan antonio", "364", 15.0, 20);
       
       for (Empleado empleado : empleados) {
        System.out.println("Empleado: "+ empleado.getNombre()+ ", salario mensual: $"+ empleado.calcularSalario());
       }
    }
}
