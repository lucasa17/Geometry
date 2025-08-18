package Shapes;

public class Rectangle {
	private float baseSize;
	private float heightSize;
	private float area;
	
    public Float getArea() {
        return this.area;
    }
    public void setArea(float baseSizeRectangle, float heightSizeRectangle) {
        this.area = baseSize * heightSizeRectangle;
    }
    
    public float getBaseSize() {
        return this.baseSize;
    }
    public void setBaseSize(float baseSizeRectangle) {
        this.baseSize = baseSizeRectangle;
    }
    
    public float getHeightSize() {
        return this.heightSize;
    }
    public void setHeightSize(float heightSizeRectangle) {
        this.heightSize = heightSizeRectangle;
    }

    void Draw(){
    	int base = Math.round(this.baseSize);
    	int height = Math.round(this.heightSize);		
    	for(int i = 0; i < baseSize; i++){
			for(int j = 0; j < heightSize; j++){
				System.out.print("*");
			}
		System.out.println("");
		}
	}
}
