
public class TestRestaurante {
    public static void main(String[] args) {
        // Instanciar el primer restaurante
        Restaurante rest1 = new Restaurante();
        rest1.nombre = "La Parrilla del Abuelo";
        rest1.direccion = "Av. Amazonas y Naciones Unidas";
        rest1.calificacion = 4.8;
        
        // Instanciar el segundo restaurante
        Restaurante rest2 = new Restaurante();
        rest2.nombre = "Sushi Master";
        rest2.direccion = "Calle República del Salvador";
        rest2.calificacion = 4.2;
        
        // Mostrar en consola
        System.out.println("--- Restaurante 1 ---");
        System.out.println("Nombre: " + rest1.nombre);
        System.out.println("Dirección: " + rest1.direccion);
        System.out.println("Calificación: " + rest1.calificacion + " estrellas");
        
        System.out.println("\n--- Restaurante 2 ---");
        System.out.println("Nombre: " + rest2.nombre);
        System.out.println("Dirección: " + rest2.direccion);
        System.out.println("Calificación: " + rest2.calificacion + " estrellas");
    }
}
