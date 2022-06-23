# TP 3 - DTO

## To create docker mysql database

```bash
docker run -d -p 33060:3306 --name mysql-db -e MYSQL_ROOT_PASSWORD=root mysql
docker exec -it mysql-db mysql -p
CREATE USER 'progava'@'172.17.0.1' IDENTIFIED BY 'root';
GRANT ALL PRIVILEGES ON *.* TO 'progava'@'172.17.0.1' WITH GRANT OPTION;
```

## Create tables

```SQL
CREATE TABLE alumno ();
```
