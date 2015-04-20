package com.example.admin.groovyapp.models

import com.example.admin.groovyapp.TraitsExample
import groovy.transform.ToString;
@ToString
class Person  {
    String firstName
    String lastName
    String sex
   //example default parametr in method
    public Person(String firstName, String lastName, String sex='male') {
        this.firstName = firstName
        this.lastName = lastName
        this.sex = sex
    }
    public Person(){}

}