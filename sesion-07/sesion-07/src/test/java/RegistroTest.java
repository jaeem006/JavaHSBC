import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {

    Registro registro = new Registro();

    /**
     * La entrada NO es válida si:
     *  X el username o password son vacios
     *  X El username contiene el caracter #
     *  X Las contraseñas no coinciden
     *  X La contraseña tiene una longitud menor a 8
     */

    @Test
    public void username1 (){
        boolean result = registro.valida("",
                "12345678",
                "12345678");

        assertFalse(result);
    }

    @Test
    public void password1 (){
        boolean result = registro.valida("Javier",
                "",
                "");

        assertFalse(result);
    }

    @Test
    public void username2 (){
        boolean result = registro.valida("Javi#",
                "12345678",
                "12345678");

        assertFalse(result);
    }

    @Test
    public void password2 (){
        boolean result = registro.valida("Javier",
                "12345678",
                "abcdefgh");

        assertFalse(result);
    }

    @Test
    public void password3 (){
        boolean result = registro.valida("Javier",
                "123",
                "123");

        assertFalse(result);
    }

    @Test
    public void general(){
        boolean result = registro.valida("Javi#",
                "",
                "123");
        assertFalse(result);
    }

    @Test
    public void general2(){
        boolean result = registro.valida("Javier",
                "12345678",
                "12345678");
        assertTrue(result);
    }

}