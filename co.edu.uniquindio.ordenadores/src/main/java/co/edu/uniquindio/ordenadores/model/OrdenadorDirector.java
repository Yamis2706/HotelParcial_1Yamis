package co.edu.uniquindio.ordenadores.model;

public class OrdenadorDirector {

    private IOrdenadorBuilder builder;

    public OrdenadorBuilder construct() {
        builder.setProcesador("Intel i9");
        builder.setTarjetaGrafica("RTX 3090");
        builder.setRam(64);
        builder.setFuenteAlimentacion("Lineal");
        builder.setSistemaRefrigeracion("Líquido");
        builder.setMonitor("Pantalla LCD");
        builder.setTecladoMecanico("Ergonómico");
        builder.setRatonGaming("Inalámbrico");

        return builder.build();
    }
}
