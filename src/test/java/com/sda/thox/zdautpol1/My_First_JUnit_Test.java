package com.sda.thox.zdautpol1;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class My_First_JUnit_Test {


    @BeforeEach
    public void setUp() {
        System.out.println("wykon przed kazdym test");
    }
    @AfterAll
    public void setUp2(){

    }
//    beforeall  aftereach
    @Test
    public void myTest1(){
        System.out.println("wykon testu 1");

    }
    @Test
    public void myTest2(){
        System.out.println("wykon testu 2");



    }
}

