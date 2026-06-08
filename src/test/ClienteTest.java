import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarDescricaoCliente() {
        Cliente cliente = new Cliente();
        cliente.setPedido("X-Bacon");
        assertEquals("X-Bacon", cliente.getPedido());
    }

    @Test
    void deveRetornarValorCliente() {
        Cliente cliente = new Cliente();
        cliente.setPedido("X-Bacon");
        assertEquals(25.0f, cliente.getValor());
    }
}