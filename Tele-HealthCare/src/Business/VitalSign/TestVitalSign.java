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
 * @author Daniel Machado
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

    @Test
    public void testValidHeartRate() {
        VitalSign v = new VitalSign(10,120,12,90,"2016-05-20 11:00:05","Sinais vitais normais");
        
        int actual = v.getHeartRate();
        int expected = 120;
        assertEquals(expected,actual);
    }

    @Test
    public void testValidBloodPressure() {
        VitalSign v = new VitalSign(10,120,12,90,"2016-05-20 11:00:05","Sinais vitais normais");
        
        int actual = v.getBloodPressure();
        int expected = 12;
        assertEquals(expected,actual);

    }
    
    @Test
    public void testValidWeight() {
        VitalSign v = new VitalSign(10,120,12,90,"2016-05-20 11:00:05","Sinais vitais normais");
        
        int actual = v.getWeight();
        int expected = 90;
        assertEquals(expected,actual);
    }

    @Test
    public void testValidTimestamp() {
        VitalSign v = new VitalSign(10,120,12,90,"2016-05-20 11:00:05","Sinais vitais normais");
        
        String actual = v.getTimestamp();
        String expected = "2016-05-20 11:00:05";
        assertEquals(expected,actual);
    }
    
    @Test
    public void testValidStatusReport() {
        VitalSign v = new VitalSign(10,120,12,90,"2016-05-20 11:00:05","Sinais vitais normais");
        
        String actual = v.getStatusReport();
        String expected = "Sinais vitais normais";
        assertEquals(expected,actual);
    }

}
