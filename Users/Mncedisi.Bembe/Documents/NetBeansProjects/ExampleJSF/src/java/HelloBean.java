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


@Named(value = "myHelloBean")
@RequestScoped
public class HelloBean{
    private String name = "APD302 Student";
    public HelloBean(){}

    public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return this.name;
	}

}

