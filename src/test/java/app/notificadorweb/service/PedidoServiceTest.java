package app.notificadorweb.service;

import app.notificadorweb.domain.Pedido;
import app.notificadorweb.repository.PedidoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PedidoServiceTest {

    @Mock
    private PedidoRepository pedidoRepository;

    @Mock
    private SmsService smsService;

    @InjectMocks
    private PedidoService pedidoService;

    @DisplayName("Dado um pedido, quando chamar listagem, então deve retornar todos os pedidos")
    @Test
    void deveRetornarTodosOsPedidos() {
        Pedido pedido1 = new Pedido("Mackbook pró","xr3");
        Pedido pedido2 = new Pedido("Mackbook air","xr4");

        when(pedidoRepository.findAll()).thenReturn(List.of(pedido1,pedido2));

        List<Pedido> pedidos = pedidoService.listarPedidos();

        assertEquals(2, pedidos.size());
        verify(pedidoRepository).findAll();
    }

    @Test
    void buscarPedidoPorId() {
    }

    @Test
    void criarPedido() {
    }

    @Test
    void atualizarStatus() {
    }
}