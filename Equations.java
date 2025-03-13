public class Equations {
    private static final double PI = 3.14;

        static void slopeFormula(double X1, double X2, double Y1, double Y2) {
            // plug in your variables in the corosponding spot 
                double x1 = X1;
                double y1 = Y1;
                double x2 = X2;
                double y2 = Y2;
                System.out.println(y2 - y1 / x2 - x1);
        }
            static void slopeIntercept (double slope, double numx, double intercept) {
            // plug in your variables in the corosponding spot 
                double m =  slope;
                double x =  numx;
                double b = intercept;
                System.out.println(m*x+b);
        }
            static void riseoverrun (double numrise, double numrun) {
            // plug in your variables/numbers in the corosponding spot
                double rise = numrise ;
                double run = numrun; 
                double simp = (rise/run);
                System.out.println(simp);
        }
            public static void pagther(int side1 , int side2) {
            // plug in your variables/numbers in the corosponding spot
                int a = side2;
                int b = side1;
                double p = Math.pow(a, 2) + Math.pow(b, 2);
                System.out.println (Math.sqrt(p));  
        }           
            public static void squarearea (int onlyside){
            // plug in your variables/numbers in the corosponding spot
                int q = onlyside;
                onlyside = (int) Math.pow(q, 2);
                System.out.println(onlyside);
        }
            public static void rectarea (double longside, double shortside){
            //plug in your variables/numbers in the corosponding spot
                double big = (int) longside;
                double small = (int) shortside;
                System.out.println (big * small);
        }
            public static void circlearea (double radius){
            //plug in your variables/numbers in the corosponding spot
                int r2 = (int) Math.pow (radius, 2);
                System.out.println(PI * r2);
        }
            public static void circlecircumference (double r){
            //plug in your variables/numbers in the corosponding spot
                double radius2 =  r;
                double c = (2 * PI * radius2);
                System.out.println(c);
        }
            public static void volumesphere(double radius) {
            //plug in your variables/numbers in the corosponding spot
                double r3 = ((Math.pow(radius, 3)));
                double spherevolume = (PI * 4/3 * r3);
                System.out.println(spherevolume);
        }
            public static void volumecube(double side){
            //plug in your variables/number in the corosponding spot
                double cubevolume = Math.pow(side, 3);
                System.out.println(cubevolume);
        }
            public static void trianglearea (double base, double hight){
            //plug in your variables/numbers in the corosponding spot
                double areatriangle = (base * hight / 2);
                System.out.println(areatriangle);
        }
            public static void addition (double data1, double data2, double data3, double data4){
            //plug in your variables/numbers in the corosponding spot
                double add = data1 + data2 + data3 + data4;   
                System.out.println(add);
        }
            public static void volumecylinder(double radius, double hight){
            //plug in your variables/numbers in the corosponding spot

                int r2 = (int) Math.pow (radius, 2);
                System.out.println(PI * r2 * hight);
        } 
            public static void subtraction (double big, double small){
            //plug in your variables/numbers in the corosponding spot
                System.out.println(big - small);
        }
            public static void multiplication (int first, int second){
            //plug in your variables/numbers in the corosponding spot
                System.out.println(first * second);
        }
            public static void division (int divided, int divider){
            //plug in your variables/numbers in the corosponding spot
                System.out.println(divided / divider);
        } 
            public static void perimeterform (double length, double width){
            //plug in your variables/numbers in the corosponding spot
                double lengthx2 = length * 2;
                double widthx2 = width * 2;
                System.out.println(lengthx2 + widthx2);
        }
            public static void interiorangles (int sides){
            //plug in your variables/numbers in the corosponding spot
                int n = sides;
                int sum4ia = (n - 2) * 180;
                System.out.println(sum4ia);
        }
            public static void exteriorangles (int sides){
            //plug in your variables/numbers in the corosponding spot
                int n = sides;
                int sum4ex = 360 / n;
                System.out.println(sum4ex);    
        }
            
    }