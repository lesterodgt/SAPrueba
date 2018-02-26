/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo2;

import com.grupo2.ws2.WS2;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 *
 * @author lesterod
 */

public class TestWS2 {
    

    public void testCaseOne(){
        assertEquals(3, 3);
    }
    
    public void testCaseTwo(){
        WS2 servicio = new WS2();
        assertEquals( servicio.hello("1"), "1!");
    }
    
   
    
}
