CREATE SCHEMA `bethateste` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `bethateste`.`produto` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NULL,
  `imagem` VARCHAR(255) NULL,
  `quantidade` INT NULL,
  `preco` DOUBLE NULL,
  `descricao` VARCHAR(255) NULL,
  `data_criacao` DATETIME NULL,
  `data_alteracao` DATETIME NULL,
  PRIMARY KEY (`id`));


INSERT INTO bethateste.produto (nome, descricao, preco, quantidade, data_criacao, data_alteracao, imagem) 
VALUES('Produto1', 'esta é a descrição do produto 1', 101, 100, '2017-05-04', '2017-05-04', 'http://images.agrofauna.com.br/imagens_novo_trator/imagem_produto/png/24damina840gl.png');

INSERT INTO bethateste.produto (nome, descricao, preco, quantidade, data_criacao, data_alteracao, imagem) 
VALUES('Produto2', 'esta é a descrição do produto 2', 102, 100, '2017-05-04', '2017-05-04', 'fauna.com.br/imagens_novo_trator/imagem_produto/jpg/24damina840sl1l.jpg');

INSERT INTO bethateste.produto (nome, descricao, preco, quantidade, data_criacao, data_alteracao, imagem) 
VALUES('Produto3', 'esta é a descrição do produto 3', 103, 100, '2017-05-04', '2017-05-04', 'http://images.agrofauna.com.br/imagens_novo_trator/imagem_produto/png/abamex5l.png');

INSERT INTO bethateste.produto (nome, descricao, preco, quantidade, data_criacao, data_alteracao, imagem) 
VALUES('Produto4', 'esta é a descrição do produto 4', 104, 100, '2017-05-04', '2017-05-04', 'http://images.agrofauna.com.br/imagens_novo_trator/imagem_produto/png/afalon1l.png');

INSERT INTO bethateste.produto (nome, descricao, preco, quantidade, data_criacao, data_alteracao, imagem) 
VALUES('Produto5', 'esta é a descrição do produto 5', 105, 100, '2017-05-04', '2017-05-04', 'http://images.agrofauna.com.br/imagens_novo_trator/imagem_produto/png/ancosar20l.png');

INSERT INTO bethateste.produto (nome, descricao, preco, quantidade, data_criacao, data_alteracao, imagem) 
VALUES('Produto6', 'esta é a descrição do produto 6', 106, 100, '2017-05-04', '2017-05-04', 'http://images.agrofauna.com.br/imagens_novo_trator/imagem_produto/png/amerisbd.png');

INSERT INTO bethateste.produto (nome, descricao, preco, quantidade, data_criacao, data_alteracao, imagem) 
VALUES('Produto7', 'esta é a descrição do produto 7', 107, 100, '2017-05-04', '2017-05-04', 'http://images.agrofauna.com.br/imagens_novo_trator/imagem_produto/png/atrazinaatanor20l.png');

INSERT INTO bethateste.produto (nome, descricao, preco, quantidade, data_criacao, data_alteracao, imagem) 
VALUES('Produto8', 'esta é a descrição do produto 8', 108, 100, '2017-05-04', '2017-05-04', 'http://images.agrofauna.com.br/imagens_novo_trator/imagem_produto/png/aureo5l.png');

INSERT INTO bethateste.produto (nome, descricao, preco, quantidade, data_criacao, data_alteracao, imagem) 
VALUES('Produto5', 'esta é a descrição do produto 5', 105, 100, '2017-05-04', '2017-05-04', 'http://images.agrofauna.com.br/imagens_novo_trator/imagem_produto/png/avatar5l.png');

INSERT INTO bethateste.produto (nome, descricao, preco, quantidade, data_criacao, data_alteracao, imagem) 
VALUES('Produto6', 'esta é a descrição do produto 6', 106, 100, '2017-05-04', '2017-05-04', 'http://images.agrofauna.com.br/imagens_novo_trator/imagem_produto/png/clorpirifos20l.png');

INSERT INTO bethateste.produto (nome, descricao, preco, quantidade, data_criacao, data_alteracao, imagem) 
VALUES('Produto7', 'esta é a descrição do produto 7', 107, 100, '2017-05-04', '2017-05-04', 'fauna.com.br/imagens_novo_trator/imagem_produto/jpg/cuprozeb2kg.jpg');

INSERT INTO bethateste.produto (nome, descricao, preco, quantidade, data_criacao, data_alteracao, imagem) 
VALUES('Produto8', 'esta é a descrição do produto 8', 108, 100, '2017-05-04', '2017-05-04', 'fauna.com.br/imagens_novo_trator/imagem_produto/jpg/24damina840sl1l.jpg');