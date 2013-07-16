package com.study.spring.scope;

import javax.inject.Provider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("coffeemaker.xml")
public class CoffeeTest {

    @Autowired Provider<Coffee> coffeeProvider;
    @Autowired Espresso espresso;
    
    @Test
    public void getFreshCoffeeByProvider() {
        Coffee coffee;
        for (int inx=0; inx<100; inx++)
            coffee=coffeeProvider.get();
    }
    
    @Test
    public void canHaveFreshCoffee() {
      for (int inx=0; inx<100; inx++) {
        System.out.println("Coffee="+espresso.getCoffee());
      }
    }

}
