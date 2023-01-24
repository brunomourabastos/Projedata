package iniflex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data {
	private int dia, mes, ano;
	
	public Data() {}
	public Data(String dataString) {
		int[] dataInt = converterParaArray(dataString);
		if(validarData(dataString)) {
			this.dia = dataInt[0];
			this.mes = dataInt[1];
			this.ano = dataInt[2];
		}
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	public int getAno() {
		return this.ano;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setData(String dataString) {
		int[] data = converterParaArray(dataString);
		this.dia = data[0];
		this.mes = data[1];
		this.ano = data[2];
	}
	
	public String toString() {
		return String.format("%02d", this.dia)+"/"+String.format("%02d", this.mes)+"/"+this.ano;
		
	}
	
	public int[] converterParaArray(String dataString) {
		String partes[] = dataString.split("/");
		int[] dataInt = new int[3];
		for(int x=0; x<partes.length; x++) {
			dataInt[x]= Integer.parseInt(partes[x]);
		}
		return dataInt;
	}
	
	public boolean validarData(String dataString) {
		Date calendario = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		int[] data = converterParaArray(dataString);
		if(data[2] > 0 && data[2] <= Integer.parseInt(dateFormat.format(calendario))) {
			switch(data[1]) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(data[0]<=31) return true;
				break;
			case 2:
				if(data[2]%4==0) {
					if(data[0]<=29) return true;
				}
				else {if(data[0]<=28) return true;}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(data[0]<=30) return true;
				break;
			default:
				break;
			}
		}
		return false;
		
		}
}
