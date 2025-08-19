package Shapes;

public class Square {
    private float sideSize;
	private float area;
	
    public Float getArea() {
        return this.area;
    }
    public void setArea(float sideSize) {
        this.area = sideSize * sideSize;
    }
    
    public float getSideSize() {
        return this.sideSize;
    }
    public void setSideSize(float sideSize) {
        this.sideSize = sideSize;
    }
    
	void draw(){
        int size = Math.round(this.sideSize);
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				System.out.print("*");
			}
		System.out.println("");
		}
	}
}
