package co.edu.uniquindio.ordenadores.model;

public interface IOrdenadorBuilder {

    void setProcesador(String procesador);
    void setTarjetaGrafica(String tarjetaGrafica);
    void setRam(int ram);
    void setFuenteAlimentacion(String fuenteAlimentacion);
    void setSistemaRefrigeracion(String sistemaRefrigeracion);
    void setMonitor(String monitor);
    void setTecladoMecanico(String tecladoMecanico);
    void setRatonGaming(String ratonGaming);
    OrdenadorBuilder build();
}
