public class Tiempo {
    private int hora;       // hora de 0 - 23
    private int minuto;     // mionutos de 0 - 59
    private int segundo;     // segundos de 0 - 59


    // Establecer un nuevlo valor de tiempo, usando la hora universal;
    // lanza una excepcion si la hora, minuto o segundo son invalidos
    public void establecerTiempo(int hora, int minuto, int segundo) {
        // valida la hora, el munito y el segundo
        if (hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 ||
                segundo < 0 || segundo >= 60) {
            throw new IllegalArgumentException(
                    "hora, munuto y/o segundo esta fuera de rango");
        }

        this.hora;
        this.minuto;
        this.segundo;
    }

    // convertir a objeto String en formato de hira Universal(HH:MM:SS)
    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    // convierte a objeto String en formto de hora estandar (HH:MM:SS AM o PM)
    public String toString() {
        return String.format("%d:%02d:%02d",
                ((hora == 0 || hora == 12) ? 12 : hora % 12),
                minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }
}// Fin de la clase tiempo
