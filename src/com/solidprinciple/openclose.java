public static void main(String[] args) {
// Violates OCP: We need to modify the class whenever a new shape is added.
//class openclose {
//    public double calculate(Object shape) {
//        if (shape instanceof Circle) {
//            Circle circle = (Circle) shape;
//            return Math.PI * circle.radius * circle.radius;
//        } else if (shape instanceof Rectangle) {
//            Rectangle rectangle = (Rectangle) shape;
//            return rectangle.length * rectangle.width;
//        }
//        return 0;
//    }
//}

// Solution: Use polymorphism to extend without modifying existing code.
    interface Shape {
        double area();
    }


    class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle implements Shape {
        private double length, width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double area() {
            return length * width;
        }
    }

    class AreaCalculator {
        public double calculateArea(Shape shape) {
            return shape.area();
        }
    }
}