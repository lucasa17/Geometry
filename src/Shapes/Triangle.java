package Shapes;

public class Triangle {
	private float baseSize;
	private float heightSize;
	private float area;
	
    public Float getArea() {
        return this.area;
    }
    public void setArea(float baseSizeTriangle, float heightSizeTriangle) {
        this.area = (baseSizeTriangle * heightSizeTriangle)/2;
    }
    
    public float getBaseSize() {
        return this.baseSize;
    }
    public void setBaseSize(float baseSizeTriangle) {
        this.baseSize = baseSizeTriangle;
    }
    
    public float getHeightSize() {
        return this.heightSize;
    }
    public void setHeightSize(float heightSizeTriangle) {
        this.heightSize = heightSizeTriangle;
    }
    
    void draw(){
    	int height = Math.round(this.heightSize);
    	for (int i = 1; i <= height; i++) {
    	    for (int j = 1; j <= i; j++) {
    	        System.out.print("*");
    	    }
    	    System.out.println();
    	}
    }
}
