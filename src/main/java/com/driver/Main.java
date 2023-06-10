package com.driver;

public class Main {
    public static void main(String[] args){
        Product p = new Product();
        p.product(1,1);
        p.product(1,1,1);
        p.product(1.0,1.0);
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