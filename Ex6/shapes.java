package Ex6;

public class shapes {
    protected double a;
    

    public double area() {
        return 0;
    }
    
}

class circle extends shapes {
    public double r;

        circle (double r) {
            this.r = r;
        }
   
        @Override
        public double area() {
            return a = 3.14*(r*r);
        }
       
    }


class rec extends shapes {
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


class triangle extends shapes {
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

