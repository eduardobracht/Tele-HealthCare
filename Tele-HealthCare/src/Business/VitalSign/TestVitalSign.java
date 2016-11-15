/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSign;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author 09100324
 */
public class TestVitalSign {
    
    @Test
    public void testValidRespiratoryRate() {
        VitalSign v = new VitalSign(10,120,12,90,"2016-05-20 11:00:05","Sinais vitais normais");
        
        int actual = v.getRespiratoryRate();
        int expected = 10;
        assertEquals(expected,actual);
        /*
        
        private int respiratoryRate;
        private int heartRate;
        private int bloodPressure;
        private int weight;
        private String timestamp;
        private String statusReport;
        
        Consumer c = new Consumer("001", "Cersei", "fogovivo", 
				"a34ab54", "cersei@got.com", "+11 11 8080-89765",
				"Rainha Regente", false);
		String actual = c.getId();
		String expected = "001";
		assertEquals(expected, actual);
        */

    }


    public void testValidHeartRate() {

    }

    public void testValidBloodPressure() {

    }

    public void testValidWeight() {

    }

    public void testValidTimestamp() {

    }

    public void testValidStatusReport() {

    }

}
