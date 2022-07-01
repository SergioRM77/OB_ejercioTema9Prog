public class Herencia {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCredito(1224.52);
        cliente.setEdad(50);
        cliente.setNombre("Antonio López");
        cliente.setTelefono(665547722);
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Paco Palma");
        trabajador.setSalario(1045.40);
        trabajador.setTelefono(123456789);
        trabajador.setEdad(41);
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getSalario());

    }
}

class Persona{
    protected int edad;
    protected String nombre;
    protected int telefono;
}
class Cliente extends Persona{
    private double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public double getCredito() {
        return this.credito;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }
}

class Trabajador extends Persona{
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public double getSalario() {
        return this.salario;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }
}
