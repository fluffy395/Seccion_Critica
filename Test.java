package Hilos.Seccion_critica;

public class Test {
    public static void main(String[] args) {
        CBufer Mimuestras = new CBufer(20);
        CAdquirirDatos adquirirDatos_1 = new CAdquirirDatos(Mimuestras, "hilo-1");
        CAdquirirDatos adquirirDatos_2 = new CAdquirirDatos(Mimuestras, "hilo-2");
        adquirirDatos_1.start();
        adquirirDatos_2.start();
    }
}