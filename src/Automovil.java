public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque = 40;

    public String leerFabricante(){
        return fabricante;
    }

    public String leerModelo(){
        return modelo;
    }

    public String leerColor(){
        return color;
    }

    public double leerCilindrada(){
        return cilindrada;
    }
    public int leerCapacidadTanque(){
        return capacidadTanque;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String detalle(){

        return "auto.fabricante = " + this.fabricante +
                " auto.modelo = " + this.modelo +
                " auto.color = " + this.color+
                " auto.cilindrada = " + this.cilindrada;

        /*
        System.out.println("auto.fabricante = " + this.fabricante);
        System.out.println("auto.modelo = " + this.modelo);
        System.out.println("auto.color =" + this.color);
        System.out.println("auto.cilindrada = " + this.cilindrada);

        System.out.println("mazda.fabricante = " + this.fabricante);
        System.out.println("mazda.modelo = " + this.modelo);
        System.out.println("mazda.color =" + this.color);
        System.out.println("mazda.cilindrada = " + this.cilindrada);
        */
    }

    public String acelerar(int rpm){
        return "El auto " + modelo + " acelerando "+ rpm + "revoluciones por minuto";
    }

    public String frenar(){
        return fabricante + " " + modelo + "frenando";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar =  "\n" + frenar();
        return acelerar + "\n" + frenar;

    }

    public String calcularConsumo(int km, float procentajeGasolina){
        return ""+km/(capacidadTanque * procentajeGasolina);

    }

    public String calcularConsumo(int km, int procentajeGasolina){
        return ""+km/(capacidadTanque * procentajeGasolina);

    }

}
