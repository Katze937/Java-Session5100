/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainframe;

/**
 *
 * @author isabe
 */
public class User {
    private String FirstName;
    private String LastName;
    private String Email;
    private String Age;
    private String Gender;
    private String Type;
    
    public String getFirstName(){
        return FirstName;
    }
    
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    
    public String getLastName(){
        return LastName;
    }
    
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public String getAge(){
        return Age;
    }
    
    public void setAge(String Age){
        this.Age = Age;
    }
    
    
    public String getGender(){
        return Gender;
    }
    
    public void setGender(String Gender){
        this.Gender = Gender;
    }
    
    public String getType(){
        return Type;
    }
    
    public void setType(String Type){
        this.Type = Type;
    }
}
