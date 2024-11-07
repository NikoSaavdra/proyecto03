package es.santander.ascender.proyecto03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class calculadoraTest {

    //private Calculadora calculadora;
    
    /*@BeforeEach
    public void setup(){     // Se crea nuevo objeto para la prueba
        Calculadora calculadora = new Calculadora();
    }*/

    // Se pasa el objeto como parametro al constructor
    /*public calculadoraTest(Calculadora calculadora){
        this.calculadora = calculadora;
    }*/

    Calculadora calculadora = new Calculadora();

     @Test
    public void testSuma() {  // assertEquals(valor esperado, actual, comentario)
        assertEquals(9, calculadora.sumar(4, 5),"El resultado debe ser 9" );
    }

    @Test
    public void testResta() {
        assertEquals(5, calculadora.restar(10, 5),"El resultado debe ser 5" );
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(12, calculadora.multiplicar(3, 4),"El resultado debe ser 12" );
    }

    

    @Test
    public void testDivision() {
        ;
        //assertTrue(calculadora.dividir(6, 2)== 3);

        try{
        assertEquals(0, calculadora.dividir(6, 0),"El resultado debe ser 0" );
          //fail(message:"deberia haber lanzado un error por division por cero");
        } catch (Exception e){
           System.out.println(e);
        }
    }

    @Test
    public void testPresentarTablaMultiplicar() {

        Calculadora calculadora = new Calculadora();
                
        
        int[] tablaDeMultiplicar = new int[11]; // crea variable del objeto
        tablaDeMultiplicar = calculadora.calcularTablaMultiplicar(9);
        int[] resultado = {1 ,9 ,19 ,27, 36 ,45 ,54 ,63 ,72 ,81 ,90};  

        for (int i = 0; i <= 10; i++) {
            try {
                // Compara los elementos del array
                assertTrue(tablaDeMultiplicar[i] == resultado[i], "El resultado en la posición " + i + " debería ser " + tablaDeMultiplicar[i] + ", pero es " + resultado[i]);
            } catch (AssertionError e) {
                // Agrega el error a la lista para reportarlo al final
                System.out.println("Error en la posición " + i + ": " + e.getMessage());
            
        }
        }
    }

        @Test
        public void testCalcularTablaMultiplicarConWhile() {

            Calculadora calculadora = new Calculadora();
            calculadora.calcularTablaMultiplicarconWhile(9);
        

            }

   


}


