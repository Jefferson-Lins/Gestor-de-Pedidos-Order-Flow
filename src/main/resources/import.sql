INSERT INTO cliente (data_nascimento, endereco, genero, nome, telefone) VALUES ('1990-05-15', 'Rua das Flores, 123', 'Masculino', 'João Silva', '11999999999');
INSERT INTO estabelecimento (cnpj, configuracoes, email, endereco, razao_social, telefone) VALUES ('12.345.678/0001-99', '{"horario":"08:00-18:00"}', 'contato@empresa.com', 'Av. Paulista, 1000', 'Empresa Exemplo Ltda', '1133334444');
INSERT INTO funcionario (estabelecimento_id, cpf, email, endereco, funcao, nome, senha, telefone, usuario) VALUES (1, '123.456.789-00', 'funcionario1@empresa.com', 'Rua das Flores, 123', 'Gerente', 'João Silva', 'senhaSegura123', '11999998888', 'joaosilva');
INSERT INTO pedido (valor_total, cliente_id, data_hora, estabelecimento_id, endereco_entrega, motivo_cancelamento, status, telefone_cliente) VALUES (60.00, 1, '2025-06-05 14:30:00', 1, 'Rua das Palmeiras, 456', NULL, 'Em andamento', '11988887777');
INSERT INTO produto (preco, qtd_estoque, codigo_referencia, descricao, nome) VALUES (60.00, 15, 'PIZZ789', 'PIZZA MAGUERITA', 'Pizzas Italianas');
INSERT INTO pedido_produto (pedido_id, produto_id) VALUES (1, 1);
