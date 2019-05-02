//Created By Emma Seehousz on 4/16

public class Question9_9Class {
	private int n = 3;
    private double side = 1;
    
    private double x = 0;
    private double y = 0;
    
    public Question9_9Class() {
        
    }
    
    public Question9_9Class(int n, double side) {
        this.n = n;
        this.side = side;
    }
    
    public Question9_9Class(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    public double getArea() {
        double area = n * side * side / (4 * Math.tan(Math.PI / n));
        return area;
    }
    
    public double getPerimeter() {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += side;
        }
        
        return result;
    }
    
    public void setN(int n) {
        this.n = n >= 3 ? n : 3;
    }
    
    public void setSide(double length) {
        this.side = length > 0 ? length : 1;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public int getN() {
        return this.n;
    }
    
    public double getSide() {
        return this.side;
    }
    
    public double getX() {
        return this.x;
    }
    
    public double getY() {
        return this.y;
    }

}
