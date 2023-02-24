
public class Control {

	private TV tv;
	
	public void turnOn(boolean estado) {
		this.tv.turnOn(estado);	
	}
	public void turnOff(boolean estado) {
		this.tv.turnOff(estado);
	}
	public void canalUp() {
		this.tv.canalUp();
		}
	public void canalDown() {
		this.tv.canalUp();
	}
	public void volumenUp() {
		this.tv.volumenUp();
	}
	public void volumenDown() {
		this.tv.canalDown();
	}
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}
	public void enlazar(TV televisor) {
		this.tv = televisor;
		televisor.setControl(this);
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	public TV getTv() {
		return this.tv;
	}
	
}
