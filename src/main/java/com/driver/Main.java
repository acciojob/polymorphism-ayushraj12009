package com.driver;

public class Main {
    static class product{
        public int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }

    public static void main(String[] args) {

        product p = new product();
        int result = p.product(5,10);
        System.out.print(result);

        int result1 = p.product(5,6,8);
        System.out.print(result1);

        double result3 = p.product(2.5, 3.5);
        System.out.print(result3);






    }

}