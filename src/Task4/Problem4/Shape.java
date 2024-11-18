package Task4.Problem4;
    abstract class Shape {
        abstract void area();
    }
    class Circle extends Shape {
        private float radius;
        Circle(float radius){//constructor
            this.radius = radius;
        }

        void area() {
            float area =3.14f* radius * radius;
            System.out.println("Area of circle:"+ area);

        }
    }
    class Rectangle extends Shape{
        private float length;
        private float breadth;
        Rectangle(float length, float breadth){//constructor
            this.length = length;
            this.breadth = breadth;
        }
        void area(){
            float area = length * breadth;
            System.out.println("Area of rectangle:"+ area);
        }
    }

