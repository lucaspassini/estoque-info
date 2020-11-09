package model;

import java.util.Date;

public class Fornecedor {
	
  private int codFornecedor;
  private Date dataCadastro;
  private double valorAberto;
  private int cnpj;
  private char nome;
  
  public int getcodFornecedor() {
	  return codFornecedor;
  }
  public void setcodFornecedor(int codFornecedor) {
	  this.codFornecedor = codFornecedor;
  }
  public Date getdataCadastro() {
	  return dataCadastro;
  }
  public void setdataCadastro(Date dataCadastro) {
	  this.dataCadastro = dataCadastro;
  }
  public double getvalorAberto() { 
	  return valorAberto;
  }
  public void setvalorAberto(double valorAberto) {
	  this.valorAberto = valorAberto;
  }
  public int getcnpj() {
	  return cnpj;
  }
  public void setcnpj(int cnpj) {
	  this.cnpj = cnpj;
  }
  
  public char getnome() {
	  return nome;
  }
  public void setnome(char nome) {
	  this.nome = nome;
  }
}
