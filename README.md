## `Estoque Info`

<p align="left">
<img src="https://user-images.githubusercontent.com/47937044/98877997-99c1b000-2460-11eb-846f-ffca468ab6fa.png" alt="Tela de Login" width="440"/>
<img src="https://user-images.githubusercontent.com/47937044/98879676-dd1e1d80-2464-11eb-8c37-782e093fc2b3.png" alt="Tela de Menu" width="324"/>
 <p/>

## 📕 About
This project is a Java stock management system, it is used for registration of stock, products, customers and suppliers. Developed by a student from Universidade São Francisco, Campus Itatiba.

Student: Lucas Cristiano Passini

Teacher: José Matias Lemes Filho


## 🧑🏻‍💻 Installation

To install, you must have an IDE on your machine that supports the language in order to run the project.

Once your machine is set up, clone this project:

```
https://github.com/lucaspassini/estoque-info.git
```
Create a MySQL database:
``` SQL
CREATE DATABASE estoqueinfo;
```
Create tables with the following values:
``` SQL
create table Clientes (idCodigo integer not null primary key auto_increment, cNome varchar(30) not null unique, cCNPJ integer, nValor numeric default 0.0, dDataCad date);

create table Fornecedores (idCodigo integer not null primary key auto_increment, cNome varchar(30) not null unique, cCNPJ integer, nValor numeric default 0.0, dDataCad date);

create table Compras (idCompra integer not null primary key auto_increment, nCodProd integer not null unique, cDescProd varchar(30), nQuant numeric default 0.0, nTotal numeric default 0.0, dDataCompra date);

create table Estoque (idEst integer not null primary key auto_increment, nCodProd integer not null,  cDescProd varchar(30) not null unique, nSaldo numeric default 0.0);

create table Usuario (idUsuario integer not null primary key auto_increment , cNome varchar(30) not null unique, cSenha varchar(10));

create table Produtos (idProduto integer not null primary key auto_increment, cNomeProd varchar(30) not null unique, dDataCad date);

create table Vendas (idCodigo integer not null primary key auto_increment, nCodProd integer, cDescProd varchar(30), nQuant numeric default 0.0, nTotal numeric default 0.0, dDataVenda date);
```


## 💻 Technologies

This project was developed with:

- [MySQL](https://www.mysql.com/)
- [Java](https://www.java.com/en/)
- [Java Swing](https://www.eclipse.org/windowbuilder/)


## 🔗 Docs 

- [UML Diagram](https://app.lucidchart.com/invitations/accept/7e6ed4c8-8616-476c-89ef-e3aa2263c2e2)
- [Descriptive Diagram](https://app.lucidchart.com/invitations/accept/f05a816f-ced4-4eb2-8c4c-4093bf8d198b)
- [Java](https://docs.oracle.com/en/java/javase/14/)
- [Java Swing](https://www.eclipse.org/documentation/)
- [MySQL](https://dev.mysql.com/doc/)


## 📝 Licence

Distributed under the MIT License. See `LICENSE` for more information.
