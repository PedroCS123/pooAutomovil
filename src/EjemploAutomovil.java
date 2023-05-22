public class EjemploAutomovil {

    public static void main(String args[]){

        Automovil subaru = new Automovil();
        subaru.setFabricante("Subaru");
        subaru.setModelo("FB-600");
        subaru.setColor("Gris");
        subaru.setCilindrada(2.0);
        subaru.setCapacidadTanque(300);
        subaru.calcularConsumo(300, 0.75f);
        System.out.println(subaru.leerFabricante() + " " +subaru.leerModelo() + " " + subaru.leerColor() + " " +
                subaru.leerCilindrada() + " " + subaru.leerCapacidadTanque()+ " Consume =  " + subaru.calcularConsumo(300, 0.75f));


System.out.println();


        Automovil mazda = new Automovil();
        mazda.setFabricante("MAZDA");
        mazda.setModelo("CVR-7");
        mazda.setColor("Rojo");
        mazda.setCilindrada(3.0);
        mazda.setCapacidadTanque(350);

        System.out.println( mazda.leerFabricante() + " " + mazda.leerModelo() + " " + mazda.leerColor() + " " + mazda.leerCilindrada()+ " " +
                mazda.leerCapacidadTanque()+ " Consume: " +mazda.calcularConsumo(350, 1));



        /*
        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println( subaru.acelerar(3000) ) ;
        System.out.println( subaru.frenar() );
        System.out.println( "kilometros por litro: " + subaru.calcularConsumo(300, 0.75f) );
        System.out.println( "kilometros por litro: " + subaru.calcularConsumo(300, 1) );


        System.out.println("subaru.fabricante = " + auto.fabricante);
        System.out.println("subaru.modelo = " + auto.modelo);
        System.out.println("subaru.color =" + auto.color);
        System.out.println("subaru.cilindrada = " + auto.cilindrada);

        System.out.println("mazda.fabricante = " + mazda.fabricante);
        System.out.println("mazda.modelo = " + mazda.modelo);
        System.out.println("mazda.color =" + mazda.color);
        System.out.println("mazda.cilindrada = " + mazda.cilindrada);
        */


    }

}
