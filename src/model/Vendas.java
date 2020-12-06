package model;

import java.util.Date;

public class Vendas extends Produtos {
  private int idCodigo;
  private int nCodProd;
  private String cDescProd;
  private Date dDataVenda;
  private double nQuant;
  private double nTotal;
  
  public void saidaEstoque() {
	  
  }
  
  public int getidCodigo() {
	  return idCodigo;
  }
  public void setidCodigo(int idCodigo) {
	  this.idCodigo = idCodigo;
  }
  
  public Date getdDataVenda() { 
	  return dDataVenda;
  }
  public void setdDataVenda(Date dDataVenda) {
	  this.dDataVenda = dDataVenda;
  }
  
  public String getcDescProd() {
	  return cDescProd;
  }
  public void setcodVenda(String cDescProd) {
	  this.cDescProd = cDescProd;
  }
  
  public double getnQuant() {
	  return nQuant;
  }
  public void setnQuant(double nQuant) {
	  this.nQuant = nQuant;
  }
  
  public double getnTotal() {
	  return nTotal;
  }
  public void setnTotal(double nTotal) {
	  this.nTotal = nTotal;
  }
}