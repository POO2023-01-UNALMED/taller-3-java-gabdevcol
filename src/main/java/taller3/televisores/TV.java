package taller3.televisores;

public class TV {

	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;		
	}
	public void setMarca(Marca marca) {
		this.marca = marca;		
	 }
	public Marca getMarca() {
		return this.marca;
	}
	public void setControl(Control control) {
		this.control = control;		
	 }
	public Control getControl() {
		return this.control;
	}
	public void setPrecio(int precio) {
		this.precio = precio;		
	 }
	public int getPrecio() {
		return this.precio;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;		
	 }
	public int getVolumen() {
		return this.volumen;
	}
	public void setCanal(int canal) {
		this.canal = canal;		
	 }
	public int getCanal() {
		return this.canal;
	}
	public int numTV() {
		return this.numTV;
	}
	public void turnOn(boolean estado) {
		this.estado = estado;	
	}
	public void turnOff(boolean estado) {
		this.estado = estado;
	}
	public boolean getEstado() {
		return this.estado;
	}
	public void canalUp() {
		if (this.getCanal() < 120 && this.getEstado() ) {
			this.canal++;
		}
	}
	public void canalDown() {
		if (this.getCanal() > 1 && this.getEstado() ) {
			this.canal--;
		}
	}
	public void volumenUp() {
		if (this.getVolumen() < 7 && this.getEstado() ) {
			this.volumen++;
		}
	}
	public void volumenDown() {
		if (this.getVolumen() > 0 && this.getEstado() ) {
			this.volumen--;
		}
	}
	
}
