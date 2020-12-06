package model;


public class Estoque extends Produtos{
  private int idEst;
  private int nCodProd;
  private String cDescProd;
  private double nSaldo;
  
  

  public int getidEst() { 
	  return idEst;
  }
  public void setidEst(int idEst) {
	  this.idEst = idEst;
  }
  
  public int getnCodProd() { 
	  return idEst;
  }
  public void setnCodProd(int nCodProd) {
	  this.nCodProd = nCodProd;
  }
  
  public String getcDescProd() { 
	  return cDescProd;
  }
  public void setscDescProd(String cDescProd) {
	  this.cDescProd = cDescProd;
  }
  
  public double getnSaldo() { 
	  return nSaldo;
  }
  public void setnSaldo(double nSaldo) {
	  this.nSaldo = nSaldo;
  }

}