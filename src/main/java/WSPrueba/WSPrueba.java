/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSPrueba;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author lesterod
 */
@WebService(serviceName = "WSPrueba")
public class WSPrueba {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "suma")
    public int suma(@WebParam(name = "n1")int n1,@WebParam(name = "n2")int n2 ) {
        return n1+n2;
    }
    
    @WebMethod(operationName = "igual")
    public boolean igual(@WebParam(name = "n1")int n1,@WebParam(name = "n2")int n2 ) {
        return n1==n2;
    }
    
}
