package com.driver;

public class Main {
    public static void main(String[] args){
        int x = 1,y = 1,z = 1;
        double a= 1,b = 1;
        Product p = new Product();
        System.out.println(p.product(x,y));
        System.out.println(p.product(x,y,z));
        System.out.println(p.product(a,b));
    }
    public static class Product{
        public int product(int x,int y) {
            return x+y;
        }
        public int product(int x, int y, int z){
            return x+y+z;
        }
        public double product(double x, double y){
            return x+y;
        }
    }
}