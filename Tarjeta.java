import java.util.ArrayList;
import java.util.Date;


public class Tarjeta {
	
	private double saldo;
	private Colectivo colectivo;
	
	private ArrayList <Viaje> viaje;
	
	
	public Tarjeta (double saldo, Colectivo colectivo){
		this.saldo = saldo;
		this.colectivo = colectivo;
		
	}
	
	public Tarjeta (){
		viaje = new ArrayList<Viaje>();
	}
	
	public double saldo (){
		return  saldo;
	}
	
	public boolean pagarBoleto (Colectivo c){
		if (saldo > 5.75) {
			return true;
		}else {
			return false;
		}
	}
	
	public double recarga (int monto){
		if (monto < 196) {
			saldo = saldo + monto;
		}else if (monto > 196 && monto < 368) {
			saldo = saldo + monto + 34;
		}else if (monto > 368) {
			saldo = saldo + monto + 92;
		}
		
		return saldo;
		
	}
	
	public void viajeRealizados (Viaje v){
		viaje.add(v);
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public Colectivo getColectivo() {
		return colectivo;
	}



	public void setColectivo(Colectivo colectivo) {
		this.colectivo = colectivo;
	}

	public ArrayList<Viaje> getViaje() {
		return viaje;
	}



	public void setViaje(ArrayList<Viaje> viaje) {
		this.viaje = viaje;
	}
	
	
	
}
