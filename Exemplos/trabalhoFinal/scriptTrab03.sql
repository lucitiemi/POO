-- script Trabalho 03 - POO
-- Eros e Luciana

create table tblRegistro(
    Codigo_Registro number(4,0) PRIMARY KEY,
    DtEntrada_Registro date,
    DtSaida_Registro date,
    ValHospedagem_Registro number (6,2),
    RegFunc_Recep number(4,0) not null REFERENCES tblRecepcionista,
    Cpf_Hospede Varchar2(11) References Tblhospede,
    Numero_Quarto number(4,0) REFERENCES tblQuarto
);

create table tblListaServ(
    Codigo_ListaServ NUMBER GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) PRIMARY KEY,
    Codigo_Registro number(4,0) not null REFERENCES tblRegistro,
    Codigo_ServQuarto number(4,0) not null REFERENCES tblServicoQuarto
);



-- inserção de dados para teste

INSERT INTO tblQuarto VALUES (1, 'S', 100, 0, 0);
INSERT INTO tblQuarto VALUES (2, 'C', 200, 0, 0);

INSERT INTO tblHospede VALUES ('12345678909', 'Carlos Ferreira', 'Rua do Carlos, 10', '99999-9999', 10);

INSERT INTO tblRecepcionista VALUES (10, 'Marcela Moreira', 'Rua da Marcela, 20', '99999-8888', 'T');

INSERT INTO tblServicoQuarto VALUES (1010, 'Água', 5.0);
INSERT INTO tblServicoQuarto VALUES (2020, 'Lanche', 15.0);
INSERT INTO tblServicoQuarto VALUES (3030, 'Doce', 8.0);

INSERT INTO tblListaServ (Codigo_Registro, Codigo_ServQuarto) VALUES (1, 1010);
INSERT INTO tblListaServ (Codigo_Registro, Codigo_ServQuarto) VALUES (1, 2020);
INSERT INTO tblListaServ (Codigo_Registro, Codigo_ServQuarto) VALUES (1, 3030);


-- queries úteis

SELECT * FROM tblQuarto;
SELECT * FROM tblHospede;
SELECT * FROM tblRecepcionista;
SELECT * FROM tblServicoQuarto;
SELECT * FROM tblRegistro;
SELECT * FROM tblListaServ;

DELETE tblListaServ;
DELETE tblRegistro;
DELETE tblServicoQuarto;
DELETE tblRecepcionista;
DELETE tblHospede;
DELETE tblQuarto;