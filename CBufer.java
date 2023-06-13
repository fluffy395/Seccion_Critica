package Hilos.Seccion_critica;

public class CBufer {
    // Atributos
    public double[] muestras;
    public int index = 0;
    public int longitud;

    // Metodos
    public CBufer(int n) {
        if (n < 1) n = 10;
        longitud = n;
        muestras = new double[n];
    }

    public double obtener(int i) {
        return muestras[i];
    }

    public void asignar(double x, int i) {
        muestras[i] = x;
    }

    public synchronized int adquirirDato(String hilo) {
        if (index >= longitud) return longitud;
        double x = Math.round(Math.random() * 10) + 1;
        System.out.println(hilo + " tomó la muestra " + index + ", valor:" + x);
        asignar(x, index);
        System.out.println("valor [" + index + "]: " + obtener(index));
        index++;
        return index;
    }
}