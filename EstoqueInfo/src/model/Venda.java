package model;

import java.util.Date;

public class Venda {
  int codVenda;
  int codProduto;
  Date dataVenda;
  double qtdVenda;
  double totalVenda;
  
  public void saidaEstoque() {
	  
  }
  
  public int getcodVenda() {
	  return codVenda;
  }
  public void setcodVenda(int codVenda) {
	  this.codVenda = codVenda;
  }
  
  
  public Date getdataVenda() { 
	  return dataVenda;
  }
  public void setdataVenda(Date dataVenda) {
	  this.dataVenda = dataVenda;
  }
  public double getqtdVenda() {
	  return qtdVenda;
  }
  public void setqtdCompra(double qtdVenda) {
	  this.qtdVenda = qtdVenda;
  }
  
  public double gettotalVenda() {
	  return totalVenda;
  }
  public void settotalVenda(double totalVenda) {
	  this.totalVenda = totalVenda;
  }
}
