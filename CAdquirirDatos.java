package Hilos.Seccion_critica;

public class CAdquirirDatos extends Thread {
    private CBufer muestras; // Objeto para almacenar los datos

    public CAdquirirDatos(CBufer muestrasx, String nombre) { // Constructor
        setName(nombre);
        this.muestras = muestrasx;
    }

    @Override
    public void run() {
        int i = 0;
        do {
            i = muestras.adquirirDato(getName()); // Adquirir datos
        } while (muestras.index < muestras.longitud);
    }
}