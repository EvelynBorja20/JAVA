
public class TestPlato {
    public static void main(String[] args) {
        // Crear 3 objetos de tipo Plato
        Plato platoA = new Plato();
        platoA.nombre = "Ceviche de Camarón";
        platoA.tipo = "Entrada";
        platoA.precio = 8.50;
        platoA.disponible = true;
        
        Plato platoB = new Plato();
        platoB.nombre = "Churrasco Ecuatoriano";
        platoB.tipo = "Plato Fuerte";
        platoB.precio = 12.00;
        platoB.disponible = true;
        
        Plato platoC = new Plato();
        platoC.nombre = "Tiramisú";
        platoC.tipo = "Postre";
        platoC.precio = 5.50;
        platoC.disponible = false;
        
        // Mostrar en consola
        System.out.println("--- Plato A ---");
        System.out.println("Nombre: " + platoA.nombre + " | Tipo: " + platoA.tipo + " | Precio: $" + platoA.precio + " | Disponible: " + platoA.disponible);
        
        System.out.println("\n--- Plato B ---");
        System.out.println("Nombre: " + platoB.nombre + " | Tipo: " + platoB.tipo + " | Precio: $" + platoB.precio + " | Disponible: " + platoB.disponible);
        
        System.out.println("\n--- Plato C ---");
        System.out.println("Nombre: " + platoC.nombre + " | Tipo: " + platoC.tipo + " | Precio: $" + platoC.precio + " | Disponible: " + platoC.disponible);
    }
}
