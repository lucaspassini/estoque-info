
<h3 align="center">EstoqueInfo <br/> <br/>
 <img src="https://img.shields.io/github/license/lucaspassini/EstoqueInfo?style=flat&logo">
</h3>


## 🖼 Telas

<p>
<img src="https://user-images.githubusercontent.com/47937044/98877997-99c1b000-2460-11eb-846f-ffca468ab6fa.png" alt="Tela de Login" width="440"/>
<img src="https://user-images.githubusercontent.com/47937044/98879676-dd1e1d80-2464-11eb-8c37-782e093fc2b3.png" alt="Tela de Menu" width="324"/>
 <p/>
<br></br>
 


## :pushpin: Sobre o projeto
Este projeto é um Sistema Java responsável pelo controle e cadastro de estoque, produtos, clientes e fornecedores. Desenvolvido por um estudante da Universidade São Francisco, Campus Itatiba.

Estudante: Lucas Cristiano Passini

Professor: José Matias Lemes Filho


## :computer: Instalação
Este Sistema foi desenvolvido em Java. Para instalar, é necessário ter um IDE em sua máquina que suporte a linguagem para poder ser executado o projeto.

Assim que sua máquina estiver configurada, clone este projeto:
```
https://github.com/lucaspassini/EstoqueInfo.git
```
Crie um Banco de Dados MySQL:
```
CREATE DATABASE estoqueinfo;
```
Crie as tabelas com os seguintes valores:
```
create table Clientes (idCodigo integer not null primary key auto_increment, cNome varchar(30) not null unique, cCNPJ integer, nValor numeric default 0.0, dDataCad date);

create table Fornecedores (idCodigo integer not null primary key auto_increment, cNome varchar(30) not null unique, cCNPJ integer, nValor numeric default 0.0, dDataCad date);

create table Compras (idCompra integer not null primary key auto_increment, nCodProd integer not null unique, cDescProd varchar(30), nQuant numeric default 0.0, nTotal numeric default 0.0, dDataCompra date);

create table Estoque (idEst integer not null primary key auto_increment, nCodProd integer not null,  cDescProd varchar(30) not null unique, nSaldo numeric default 0.0);

create table Usuario (idUsuario integer not null primary key auto_increment , cNome varchar(30) not null unique, cSenha varchar(10));

create table Produtos (idProduto integer not null primary key auto_increment, cNomeProd varchar(30) not null unique, dDataCad date);

create table Vendas (idCodigo integer not null primary key auto_increment, nCodProd integer, cDescProd varchar(30), nQuant numeric default 0.0, nTotal numeric default 0.0, dDataVenda date);
```


## 🚀 Tecnologias

Esse projeto utiliza as seguintes ferramentas:

- [MySQL](https://www.mysql.com/)
- [Java](https://www.java.com/en/)
- [Java Swing](https://www.eclipse.org/windowbuilder/)


## 🔗 Links 

- [Diagrama UML](https://app.lucidchart.com/invitations/accept/7e6ed4c8-8616-476c-89ef-e3aa2263c2e2)
- [Diagrama Descritivo](https://app.lucidchart.com/invitations/accept/f05a816f-ced4-4eb2-8c4c-4093bf8d198b)
- [MySQL Docs](https://dev.mysql.com/doc/)
- [Java Docs](https://docs.oracle.com/en/java/javase/14/)
- [Java Swing Docs](https://www.eclipse.org/documentation/)



## 📝 License

Distributed under the MIT License. See `LICENSE` for more information.
