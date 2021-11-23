-- noinspection SqlNoDataSourceInspectionForFile
-- noinspection SqlDialectInspectionForFile

-- CITY
INSERT INTO citieye.city(id, name)VALUES(1, 'São Paulo');
INSERT INTO citieye.city(id, name)VALUES(2, 'Rio de Janeiro');
INSERT INTO citieye.city(id, name)VALUES(3, 'Minas Gerais');
INSERT INTO citieye.city(id, name)VALUES(5, 'Espirito Santo');

--USER
INSERT INTO citieye.user(id, email, name, surname)VALUES(1, 'joaquinbarbosa@gmail.com', 'Joaquin', 'Barbosa');
INSERT INTO citieye.user(id, email, name, surname)VALUES(2, 'joaquinoliveira@gmail.com', 'senha123', 'Oliveira');
INSERT INTO citieye.user(id, email, name, surname)VALUES(3, 'mariarosa@gmail.com', 'Maria', 'Rosa');

--CATEGORY
INSERT INTO citieye.category(id, name)VALUES(1, 'Saúde');
INSERT INTO citieye.category(id, name)VALUES(2, 'Assistencia Social');
INSERT INTO citieye.category(id, name)VALUES(3, 'Transporte/Mobilidade');
INSERT INTO citieye.category(id, name)VALUES(4, 'Eletrica');
INSERT INTO citieye.category(id, name)VALUES(5, 'Sinalização em vias');
