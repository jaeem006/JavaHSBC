import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Prueba del metodo suma")
    void sumaTest() {
        assertEquals(44,calculadora.suma(10,34));
        assertEquals(5,5);
        assertEquals(4,4);
    }

    @Test
    @DisplayName("Prueba del metodo resta")
    void restaTest(){
        assertEquals(1, calculadora.resta(3,2));
    }

    @Test
    @DisplayName("Prueba del metodo multiplica")
    void multiplicaTest(){
        assertEquals(6, calculadora.multiplica(3,2));
    }

    @Test
    @DisplayName("Prueba del metodo división")
    void divideTest() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> calculadora.divide(100, 0));

        assertEquals("No es posible dividir un valor entre 0", exception.getMessage());
    }

    @Test
    @DisplayName("Prueba del metodo división 2")
    void divideTest2() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.divide(100, 0), "No es posible dividir un valor entre 0");
    }
}