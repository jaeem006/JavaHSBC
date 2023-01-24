import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;


import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {

    Registro registro = new Registro();

    @Test
    public void username1 (){
        boolean result = registro.valida("", "123","123");
        assertFalse(result);
    }

    @Test
    public void username2 (){
        boolean result = registro.valida("Jose#", "123","123");
        assertFalse(result);
    }

    @Test
    public void password1 (){
        boolean result = registro.valida("Jose", "123","123");
        assertFalse(result);
    }

    @Test
    public void password2 (){
        boolean result = registro.valida("Jose","12345678","abcdefghi");
        assertFalse(result);
    }

    @Test
    public void password3 (){
        boolean result = registro.valida("Jose","12345678","abcdefghi");
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void palindromes(int candidate){

        assertTrue(candidate % 2 == 0);
    }

}