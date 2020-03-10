/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mncedisi.Bembe
 */
import javax.enterprise.context.*;
import javax.inject.Named;


@Named(value = "myHelloBean1")
@RequestScoped
public class HelloBean1{
    private String name ;
    public HelloBean1(){}

    public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}

}

