USE notificador;

CREATE TABLE IF NOT EXISTS pedido (
                                      id BIGINT PRIMARY KEY,
                                      codigo_rastreio VARCHAR(255),
    data_ultima_atualizacao DATETIME,
    nome_produto VARCHAR(255),
    status VARCHAR(50),
    ativo TINYINT
    );

INSERT INTO pedido (
    id,
    codigo_rastreio,
    data_ultima_atualizacao,
    nome_produto,
    status,
    ativo
)
VALUES
    (1, 'ABC123', '2025-12-31 19:34:19', 'iPHONE', 'EM_PREPARO', 1),
    (2, 'ABC456', '2025-12-31 19:36:29', 'MacBook', 'EM_PREPARO', 1),
    (3, 'RAST-1766245072392', '2026-01-07 08:46:22', 'Moto G', 'EM_PREPARO', 1);
