package model;

import java.util.Date;

public class Compra {
  
  private int codCompra;
  private int codProduto;
  private Date dataCompra;
  private double qtdCompra;
  private double totalCompra;
  
  public void entradaEstoque() {
	  
  }
  
  
  public int getcodCompra() {
	  return codCompra;
  }
  public void setcodCliente(int codCompra) {
	  this.codCompra = codCompra;
  }
  
  public int getcodProduto() {
	  return codProduto;
  }
  public void setcodProduto(int codProduto) {
	  this.codProduto = codProduto;
  }
  
  public Date getdataCompra() { 
	  return dataCompra;
  }
  public void setdataCompra(Date dataCompra) {
	  this.dataCompra = dataCompra;
  }
  public double getqtdCompra() {
	  return qtdCompra;
  }
  public void setqtdCompra(double qtdCompra) {
	  this.qtdCompra = qtdCompra;
  }
  
  public double gettotalCompra() {
	  return totalCompra;
  }
  public void settotalCompra(double totalCompra) {
	  this.totalCompra = totalCompra;
  }
  
}
