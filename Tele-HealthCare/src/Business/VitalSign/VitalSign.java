/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSign;

/**
 *
 * @author Neelu
 */
public class VitalSign {
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private int weight;
    private String timestamp;
    private String statusReport;
      
    public VitalSign(int respiratoryRate, int heartRate, int bloodPressure, int weight,String timestamp, String statusReport) {
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.weight = weight;
        this.timestamp = timestamp;
        this.statusReport = statusReport;
    }
    
    public VitalSign(){
        
    }

    /*@ pure @*/    
    public int getRespiratoryRate() {
        return respiratoryRate;
    }
    
    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    /*@ pure @*/
    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    /*@ pure @*/
    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    /*@ pure @*/
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /*@ pure @*/
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /*@ pure @*/
    public String getStatusReport() {
        return statusReport;
    }

    public void setStatusReport(String statusReport) {
        this.statusReport = statusReport;
    }
    
    /*@ pure @*/
     @Override
    public String toString() {
        return this.timestamp;
    }
}
