

import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rocael Isidro
 */
public class pruebaF {
    
     
 public pruebaF() {
 }
  @Test
	public void shouldExecuteAllTestCases() throws Exception{
		// given
		SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
             //String path="C:\\Users\\Pamela Palacios\\Documents\\farmacia-soapui-project.xml";
              String path="/home/farmacia-soapui-project.xml";
             runner.setProjectFile(path);
     	//runner.setProjectProperties(properties);
     	runner.run();
	}

}