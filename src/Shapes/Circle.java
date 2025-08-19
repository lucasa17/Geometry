package Shapes;

public class Circle {
	private float radiusSize;
	private float area;

	public Float getArea() {
        return this.area;
    }
    public void setArea(float radiusSize) {
        this.area = (float)(Math.PI * Math.pow(radiusSize, 2));
    }
    
    public float getRadiusSize() {
        return this.radiusSize;
    }
    public void setRadiusSize(float radiusSize) {
        this.radiusSize = radiusSize;
    }
    
    void draw(){
        int radius = Math.round(this.radiusSize);
        for (int y = -radius; y <= radius; y++) {
            for (int x = -radius; x <= radius; x++) {
                if (x * x + y * y <= radius * radius) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}
