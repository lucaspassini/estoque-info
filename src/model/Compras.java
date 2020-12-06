package model;

import java.util.Date;

public class Compras extends Produtos {
  
  private int idCompra;
  private int nCodProd;
  private String cDescProd;
  private Date dDataCompra;
  private double nQuant;
  private double nTotal;
  
  public void entradaEstoque() {
	  
  }
  
  
  public int getidCompra() {
	  return idCompra;
  }
  public void setidCompra(int idCompra) {
	  this.idCompra = idCompra;
  }
  
  public int getnCodProd() {
	  return nCodProd;
  }
  public void setnCodProd(int nCodProd) {
	  this.nCodProd = nCodProd;
  }
  
  public String getcDescProd() {
	  return cDescProd;
  }
  public void setcDescProd(String cDescProd) {
	  this.cDescProd = cDescProd;
  }
  
  public Date getdDataCompra() { 
	  return dDataCompra;
  }
  public void setdDataCompra(Date dDataCompra) {
	  this.dDataCompra = dDataCompra;
  }
  public double getnQuant() {
	  return nQuant;
  }
  public void setnQuant(double nQuant) {
	  this.nQuant = nQuant;
  }
  
  public double getnTotal() {
	  return  nTotal;
  }
  public void setnTotal(double nTotal) {
	  this. nTotal =  nTotal;
  }
  
}