package es.santander.ascender.proyecto03;

public class Calculadora {
    public long  sumar(long sumando1, long sumando2) {
        return sumando1 + sumando2;
    }

    public long restar(long sustraendo, long minuendo){
        return sustraendo - minuendo;
    }

    public long multiplicar(long factor, long factor2){
         return factor * factor2;
    }

    public long dividir( long dividendo, long divisor){
        return dividendo/divisor;
    }
    
    public  void presentarTablaMultiplicar(int numero){

        
        for(int i =0; i <= 10; i++){

            System.out.println(i * numero);

        }
    }

    public int[] calcularTablaMultiplicar(int numero) {
        int[] tablaDeMultiplicar = new int[11];
        for (int i = 0 ; i <= 10; i++) {
            tablaDeMultiplicar[i] = i * numero;
        }
        return tablaDeMultiplicar;
    }

    public int[] calcularTablaMultiplicarconWhile(int numero) {
        //Creo el array
        int[] tablaDeMultiplicar = new int[11];

        int i = 0;
        while (i <= tablaDeMultiplicar.length - 1) {

            tablaDeMultiplicar[i] = i * numero;
            i ++;
            
        }
        
        // Retorna el array con la tabla de multiplicar
        return tablaDeMultiplicar;
    }





}
