package taller3.televisores;

public class TV {

	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
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
		this.precio += precio;		
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
		if (0 < canal && canal <121) 
			this.canal = canal;		
	 }
	public int getCanal() {
		return this.canal;
	}
	public static void setNumTV(int num) {
		numTV = num;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void turnOn() {
		this.estado = true;	
	}
	public void turnOff() {
		this.estado = false;
	}
	public boolean getEstado() {
		return this.estado;
	}
	public void canalUp() {
		if (this.getCanal() < 120 && this.getEstado()) {
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