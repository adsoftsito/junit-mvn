import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    void factorialDeCeroDebeSerUno() {
        assertEquals(1, Factorial.calcular(0));
    }

    @Test
    void factorialDeUnoDebeSerUno() {
        assertEquals(1, Factorial.calcular(1));
    }

    @Test
    void factorialDeDosDebeSerDos() {
        assertEquals(2, Factorial.calcular(2));
    }

    @Test
    void factorialDeTresDebeSerSeis() {
        assertEquals(6, Factorial.calcular(3));
    }

    @Test
    void factorialDeCuatroDebeSer24() {
        assertEquals(24, Factorial.calcular(4));
    }

    @Test
    void factorialDeCincoDebeSer120() {
        assertEquals(120, Factorial.calcular(5));
    }
}
