package co.edu.uniquindio.ordenadores.model;

public class OrdenadorBuilder {

    private String procesador;
    private String tarjetaGrafica;
    private int ram;
    private String fuenteAlimentacion;
    private String sistemaRefrigeracion;
    private String monitor;
    private String tecladoMecanico;
    private String ratonGaming;

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getFuenteAlimentacion() {
        return fuenteAlimentacion;
    }

    public void setFuenteAlimentacion(String fuenteAlimentacion) {
        this.fuenteAlimentacion = fuenteAlimentacion;
    }

    public String getSistemaRefrigeracion() {
        return sistemaRefrigeracion;
    }

    public void setSistemaRefrigeracion(String sistemaRefrigeracion) {
        this.sistemaRefrigeracion = sistemaRefrigeracion;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getTecladoMecanico() {
        return tecladoMecanico;
    }

    public void setTecladoMecanico(String tecladoMecanico) {
        this.tecladoMecanico = tecladoMecanico;
    }

    public String getRatonGaming() {
        return ratonGaming;
    }

    public void setRatonGaming(String ratonGaming) {
        this.ratonGaming = ratonGaming;
    }
}
