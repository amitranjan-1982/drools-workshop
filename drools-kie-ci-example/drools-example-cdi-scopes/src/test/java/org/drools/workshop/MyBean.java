/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drools.workshop;

/**
 *
 * @author salaboy
 */
public class MyBean {

    public MyBean() {
    }
    
    public String doSomething(String text){
        System.out.println("Doing Something with: "+text);
        return text + "processed!";
    }
}
