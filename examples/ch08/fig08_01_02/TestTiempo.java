public class TestTiempo {
    public static void main(String[] args) {
        // creamos e inicializamos u nobjeti de tipo : Tiempo
        Tiempo hora = new Tiempo(); // invoca al constructor de tiempo

        // imprime representaciones de cadena del tiempo :
        mostrarTiempo("Despues de crear el objeto tiempo", hora);
        System.out.println();

        // modifica la hora e imprime la hora actualizada :
        hora.establecerTiempo(12, 27, 6);
        mostrarTiempo("Despues de llamar a establecerTiempo", hora);
        System.out.println();

        // intenta establecer la hora con valores invalidos;
        try {
            hora.establecerTiempo(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exepcion: %s%n%n", e.getMessage());
        }

        // muestra el tiempo despeus de tratrar de establecer valores invalidos
        mostrarTiempo("Despues de llamar a establecerTiempo con valores invalidos", hora);

    }// fin MAIN

    // muestra un objeto Tiempo en formatos de  24 horas y 12 horas
    private static void mostrarTiempo(String encabezado, Tiempo h) {
        System.out.printf("%s%nHora Universal: %s%nTiempo estandar: %s%n",
                encabezado, h.aStringUniversal(), h.toString());
    }
}// fin de la clase
