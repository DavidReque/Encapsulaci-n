public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setNombre("David Requeno");
        System.out.println("El nombre es: "+persona1.getNombre());

        persona1.setEdad(17);
        System.out.println("La edad es: "+persona1.getEdad());

        persona1.setTelefono(968251);
        System.out.println("El telefono es: "+persona1.getTelefono());

    }
        
}
 
class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    //1 Settet Establecer la edad 
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    //Getter mostrar la edad
    public String getNombre () {
        return nombre;
    }

    //2
    public void setEdad (int edad) {
        this.edad = edad;
    }

    
    public int getEdad () {
        return edad;
    }

    //3
    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono () {
        return telefono;
    }


}
