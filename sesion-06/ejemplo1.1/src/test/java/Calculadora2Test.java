import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class Calculadora2Test {

    @Mock
    CalculadoraDAO calculadoraDAO;

    @InjectMocks
    Calculadora2 calculadora;

    @BeforeEach
    void setUp() {
        given(calculadoraDAO.findValorConstante()).willReturn(3);
    }

    @Test
    @DisplayName("Prueba de suma")
    void sumaTest(){
        assertEquals(8,calculadora.suma(3,2));
    }

    @Test
    @DisplayName("Prueba de resta")
    void restaTest(){
        assertEquals(-2,calculadora.resta(3,2));
    }

    @Test
    @DisplayName("Prueba de mult")
    void multTest(){
        assertEquals(18,calculadora.multiplica(3,2));
    }

}