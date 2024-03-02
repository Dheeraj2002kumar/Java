abstract class Shape {
    private String color;
  
    public Shape(String color) {
      this.color = color;
    }
  
    public abstract double getArea();
  
    public String getColor() {
      return this.color;
    }
  }
  
  class Circle extends Shape {
    private double radius;
  
    public Circle(String color, double radius) {
      super(color);
      this.radius = radius;
    }
  
    public double getArea() {
      return Math.PI * radius * radius;
    }
  }
  
  class Rectangle extends Shape {
    private double width;
    private double height;
  
    public Rectangle(String color, double width, double height) {
      super(color);
      this.width = width;
      this.height = height;
    }
  
    public double getArea() {
      return width * height;
    }
  }
  
  public class Abstract {
    public static void main(String args[]) {
      Shape circle = new Circle("Red", 2.5);
      Shape rectangle = new Rectangle("Blue", 3.0, 4.0);
  
      System.out.println("Circle color: " + circle.getColor() + " and area: " + circle.getArea());
      System.out.println("Rectangle color: " + rectangle.getColor() + " and area: " + rectangle.getArea());
    }
  }