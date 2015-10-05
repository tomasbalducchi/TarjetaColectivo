
public class Colectivo {
	
	
	private String empresa;
	private String linea;
	private int numeroInterno;
	
	
	public Colectivo (String empresa, String linea, int numeroInterno){
		this.empresa = empresa;
		this.linea = linea;
		this.numeroInterno = numeroInterno;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public String getLinea() {
		return linea;
	}


	public void setLinea(String linea) {
		this.linea = linea;
	}


	public int getNumeroInterno() {
		return numeroInterno;
	}


	public void setNumeroInterno(int numeroInterno) {
		this.numeroInterno = numeroInterno;
	}
	
	
}	
