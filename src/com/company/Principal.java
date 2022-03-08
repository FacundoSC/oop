package com.company;

public class Principal {

    public static void main(String[] args) {



        Motor motorPeugeot208 = new Motor(3.0,TipoMotor.BENCINA);

        Persona conductorPeugeot208 = new Persona("Facundo","Cordoba");
        Automovil peugeot = new Automovil("Peugeot", "208",Color.AZUL ,motorPeugeot208,new Estanque(),conductorPeugeot208);
        peugeot.setTipo(TipoAutomovil.SEDAN);

            peugeot.addRueda(new Rueda("Yokohama",20,7.5))
                    .addRueda(new Rueda("Yokohama",20,7.5))
                    .addRueda(new Rueda("Yokohama",20,7.5))
                    .addRueda(new Rueda("Yokohama",20,7.5))
                    .addRueda(new Rueda("Yokohama",20,7.5));




        System.out.println("**** ver detalle *****");
        System.out.println(peugeot.verDetalle());


        Persona conductorCitroenC4 = new Persona("Fatima", "Quinteros");
        Motor motorCitroeC4 = new Motor(2.0,TipoMotor.BENCINA);
        Automovil citroenC4Louge = new Automovil("Citroën", "C4 Lounge",Color.BLANCO,motorCitroeC4,new Estanque(),conductorCitroenC4,null);
        citroenC4Louge.setColor(Color.BLANCO);
        citroenC4Louge.setTipo(TipoAutomovil.COUPE);

        switch(citroenC4Louge.getTipo()){
            case SEDAN ->
                System.out.println("es un sedan");
            case COUPE->
                System.out.println("es un coupe");
            case FURGON ->
                System.out.println("es un furgon");
            case PICKUP ->
                System.out.println("es una pickup");
            case HATCHBACK ->
                System.out.println("es una hatchback");
            case CONVERTIBLE ->
                System.out.println(" es un convertible");
            case STATION_WAGON ->
                System.out.println("es un station_wagon");
            default ->
                System.out.println("no es ninguno  de los tipos conocidos");
        }
        TipoAutomovil[] tiposAutomoviles = TipoAutomovil.values();

        System.out.println("****todos los tipos de automoviles*****");
        for (TipoAutomovil ta: tiposAutomoviles) {
            System.out.println( ta+":"+ ta.getDescripcion());
            
        }





        Automovil citroen = new Automovil();

        System.out.println("son iguales?:" + (peugeot == citroenC4Louge));
        System.out.println("son iguales con el metodo equals?:" + (peugeot.equals(citroenC4Louge)));
        System.out.println("son iguales con el metodo equals?:" + (citroen.equals(citroenC4Louge)));

        System.out.println(peugeot.verDetalle());
        System.out.println(peugeot.acelerarFrenar(3000));
        System.out.println("Kilometros por libro de  nafta : " + peugeot.calcularConsumo(300, 0.6f));
        System.out.println("Kilometros por libro de  nafta : " + peugeot.calcularConsumo(300, 60));

        System.out.println(citroenC4Louge.verDetalle());
        System.out.println("llamado de forma implicita");
        System.out.println("citroenC4Louge  = " + citroenC4Louge);
        System.out.println("llamado de forma  explicita");
        System.out.println("citroenC4Louge = " + citroenC4Louge.toString());
        System.out.println("peugeot = " + peugeot);

        Automovil.setColorPatente(Color.BLANCO);
        System.out.println("citroenC4Louge = " + citroenC4Louge);
        System.out.println("peugeot = " + peugeot);

    }
}
