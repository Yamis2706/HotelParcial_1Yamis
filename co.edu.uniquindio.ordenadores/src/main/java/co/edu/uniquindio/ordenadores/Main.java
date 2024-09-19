package co.edu.uniquindio.ordenadores;


import co.edu.uniquindio.ordenadores.model.OrdenadorBuilder;
import co.edu.uniquindio.ordenadores.model.OrdenadorDirector;


public class Main {
    public static void main(String[] args) {
        OrdenadorDirector director = new OrdenadorDirector();
        OrdenadorBuilder builder = new OrdenadorBuilder();

        OrdenadorBuilder ordenadorBuilder = director.construct();
        System.out.println(ordenadorBuilder);
    }
}