package taller3.televisores;

public class TV {

	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.numTV++;
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
		this.canal = canal;		
	 }
	public int getCanal() {
		return this.canal;
	}
	public static void setNumTV(int num) {
		numTV += num;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void turnOn() {
		return;	
	}
	public void turnOff() {
		return;
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
