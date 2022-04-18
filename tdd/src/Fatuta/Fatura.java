package src.Fatuta;

import java.util.ArrayList;

import src.Boleto.Boleto;

public class Fatura {

	private String nomedocliente;
	private String data;
	private double valortotal;
	private ArrayList<Boleto> boletos;
	private Boolean pago;
	

	public void setnomedocliente(String nomedocliente) {
		// TODO Auto-generated method stub
		this.nomedocliente=nomedocliente;
		
	}

	public void setdata(String data) {
		// TODO Auto-generated method stub
		this.data=data;
		
	}

	public void setvalortotal(double valortotal) {
		// TODO Auto-generated method stub
		this.valortotal=valortotal;
		
	}

	public Object getnomedocliente() {
		// TODO Auto-generated method stub
		return nomedocliente;
	}

	public Object getdata() {
		// TODO Auto-generated method stub
		return data;
	}

	public Object getvalortotal() {
		// TODO Auto-generated method stub
		return valortotal;
	}

	public Boolean pagar(ArrayList<Boleto> boletos) {
		
		if(this.boletos==null) {
			this.boletos=boletos;
		}
		else {
			this.boletos.addAll(boletos);
		}
		double valorpago=0;
		double valorparcial=0;
		for(int count=boletos.size()-1; count >= 0; count--){
		    valorparcial=Double.parseDouble(boletos.get(count).getvalor().toString());
			valorpago=valorparcial+valorpago;
        }
		if(valorpago>=valortotal) {
			pago=true;
		}else {
			pago=false;
		}
		return pago;
	}

	public ArrayList<Boleto> getboletos() {
		// TODO Auto-generated method stub
		return null;
	}

}
