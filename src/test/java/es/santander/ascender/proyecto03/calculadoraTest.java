package es.santander.ascender.proyecto03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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


   /*  @Test
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
    }*/

    @Test
    public void testDivision() {
        Calculadora calculadora = new Calculadora();
        assertTrue(calculadora.dividir(6, 2)== 5);
        //assertEquals(3, calculadora.dividir(6, 2),"El resultado debe ser 3" );
    }
}
