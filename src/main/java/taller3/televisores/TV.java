package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;
	
	public TV(Marca marc, boolean est) {
		this.marca = marc;
		this.estado = est;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public int getNumTV() {
		return numTV;
	}
	public void setNumTV(int num) {
		numTV = num;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	public void turnOff() {
		this.estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if(this.getEstado() == true && this.canal != 120 ) {
			this.canal++;
		}
	}
	public void canalDown() {
		if(this.getEstado() == true && this.canal != 1 ) {
			this.canal--;
		}
	}
	
	public void volumenUp() {
		if(this.getEstado() == true && this.canal != 7 ) {
			this.volumen++;
		}
	}
	public void volumenDown() {
		if(this.getEstado() == true && this.canal != 0 ) {
			this.volumen--;
		}
	}

}
