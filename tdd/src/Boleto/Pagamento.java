/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.Boleto;

/**
 *
 * @author Aluno
 */
class Pagamento {
	
    private double valor;
	private String data;


	public void setvalor(double d) {
    	this.valor=d;
        }
public void setdata(String data) {
	this.data=data;
    }
public Object getdata() {
	// TODO Auto-generated method stub
	return data;
}


public Object getvalor() {
	// TODO Auto-generated method stub
	return valor;
}

}
