package model;

import java.util.Date;

public class Produto {
	
  private int codProduto;
  private Date dataProduto;
  private char nome;
  
  public int getcodProduto() {
	  return codProduto;
  }
  public void setcodProduto(int codProduto) {
	  this.codProduto = codProduto;
  }
  public Date getdataProduto() {
	  return dataProduto;
  }
  public void setdataProduto(Date dataProduto) {
	  this.dataProduto= dataProduto;
  }
  
  public char getnome() {
	  return nome;
  }
  public void setnome(char nome) {
	  this.nome = nome;
  }
}
