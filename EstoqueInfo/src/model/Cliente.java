package model;

import java.util.Date;

public class Cliente {
	
  private int codCliente;
  private Date dataCadastro;
  private double valorAberto;
  private int cnpj;
  private char nome;
  
  public int getcodCliente() {
	  return codCliente;
  }
  public void setcodCliente(int codCliente) {
	  this.codCliente = codCliente;
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
