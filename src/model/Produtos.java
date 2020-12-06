package model;

import java.util.Date;

public class Produtos {
	
  private int idProduto;
  private Date dDataCad;
  private String cNome;
  
  public int getidProduto() {
	  return idProduto;
  }
  public void setidProduto(int idProduto) {
	  this.idProduto = idProduto;
  }
  public Date getdDataCad() {
	  return dDataCad;
  }
  public void setdDataCad(Date dDataCad) {
	  this.dDataCad = dDataCad;
  }
  
  public String getcNome() {
	  return cNome;
  }
  public void setcNome(String cNome) {
	  this.cNome = cNome;
  }
}