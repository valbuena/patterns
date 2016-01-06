package com.patterns.decorator;

import com.patterns.decorator.condiments.Milk;
import com.patterns.decorator.condiments.Sugar;
import com.patterns.decorator.drinks.Expresso;
import com.patterns.decorator.drinks.Tea;
import com.patterns.decorator.products.Drink;
import org.junit.Test;

/**
 * Created by pep on 6/01/16.
 */
public class OrderTest {

    @Test
    public void testProductsAndCondiments(){
        Order orderEmma= new Drink();
        orderEmma = new Expresso(orderEmma);
        orderEmma.print();

        Order orderOtto = new Drink();
        orderOtto = new Tea(orderOtto);
        orderOtto = new Milk(orderOtto);
        orderOtto = new Sugar(orderOtto);
        orderOtto.print();


        Order orderInma = new Drink();
        orderInma = new Tea(orderInma);
        orderInma = new Milk(orderInma);
        orderInma = new Sugar(orderInma);
        orderInma = new Sugar(orderInma);
        orderInma.print();

        Order orderMix = new Drink();
        orderMix = new Tea(orderMix);
        orderMix = new Milk(orderMix);
        orderMix = new Expresso(orderMix);
        orderMix = new Sugar(orderMix);
        orderMix.print();



    }

}
