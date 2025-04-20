package com.nit.main;

import com.nit.service.Arithmetic;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	Arithmetic ar = new Arithmetic();  
    	System.out.println("result : "+ar.sum(20, 10));
    }
}
