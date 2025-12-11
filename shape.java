public class shape {

    protected double a;
    public double area() {
        return 0;
    }
}

class circle extends shape {
    public double r;

        circle (double r) {
            this.r = r;
        }
        @Override
        public double area() {
            return a = 3.14*(r*r);
        }
       
    }

class rec extends shape {
    public double w; 
         double l;

        rec (double w, double l) {
            this.w = w;
            this.l = l;
        }
   
        @Override
        public double area() {
            return a = w*l;
        }
    }

class triangle extends shape {
    public double b; double h;

        triangle (double b, double h) {
            this.b = b;
            this.h =h;
        }
   
        @Override
        public double area() {
            return a = (b*h)/2;
        }
    }