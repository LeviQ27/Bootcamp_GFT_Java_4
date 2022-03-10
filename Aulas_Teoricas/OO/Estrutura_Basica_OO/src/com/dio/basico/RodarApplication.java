package com.dio.basico;

public class RodarApplication {
    

    public static void main(String[] args) {
        


        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Polo");
        carro1.setCapacidadeTanque(39);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.TotalValorTanque(6.89));

        Carro carro2 = new Carro("Volvo","Cinza",45);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.TotalValorTanque(6.89));




    }


}
