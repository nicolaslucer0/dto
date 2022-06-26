# TP 3 - DTO

## To create docker mysql database

```bash
docker run -d -p 33060:3306 --name mysql-db -e MYSQL_ROOT_PASSWORD=root mysql
docker exec -it mysql-db mysql -p
CREATE USER 'progava'@'172.17.0.1' IDENTIFIED BY 'root';
GRANT ALL PRIVILEGES ON *.* TO 'progava'@'172.17.0.1' WITH GRANT OPTION;
```

## Create database & tables

```SQL
CREATE DATABASE dao;
USE dao;
CREATE TABLE alumnos(DNI INT(8) NOT NULL, APY_NOM VARCHAR(20) NOT NULL, FEC_NAC DATE, CANT_MAT_APROB int, PROMEDIO DOUBLE, FEC_ING DATE, SEXO CHAR, ESTADO CHAR, CONSTRAINT DNI_PK PRIMARY KEY (DNI));
INSERT INTO alumnos VALUES(11111111, 'Test 1', '1991-01-01',16,7.6, '2020-01-01','f','A');
INSERT INTO alumnos VALUES(22222222, 'Test 2',	'1992-02-02',14,8.4, '2020-02-02','m','A');
INSERT INTO alumnos VALUES(33333333, 'Test 3', 	'1993-03-03',12,9.6, '2020-03-03','m','I');
```
