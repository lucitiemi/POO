CREATE TABLE tblGameShop (
    codigo NUMBER,
    nome VARCHAR2(50),
    idade NUMBER,
    tipoGamer VARCHAR2(10),
    saldo NUMBER
);

SELECT * FROM tblGameShop;
SELECT * FROM tblGameShop WHERE codigo = 1;

INSERT INTO tblGameShop(codigo, nome, idade, tipoGamer, saldo) VALUES (1,'Luciana', 35, 'E', 100);

UPDATE tblGameShop SET nome = 'Luciana2', idade = 36, tipoGamer = 'F', saldo = 150 WHERE codigo = 1;

DELETE tblGameShop WHERE codigo = 1;