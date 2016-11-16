/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.VitalSign;

/**
 *
 * @author Neelu
 */
public class VitalSignDTO {
    private int patientId;
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private int weight;
    private String timestamp;
    private String statusReport;

    public VitalSignDTO() {
    }
    
    public VitalSignDTO(int patientId, int respiratoryRate, int heartRate, int bloodPressure, int weight, String timestamp, String statusReport) {
        this.patientId = patientId;
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.weight = weight;
        this.timestamp = timestamp;
        this.statusReport = statusReport;
    }
    
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatusReport() {
        return statusReport;
    }

    public void setStatusReport(String statusReport) {
        this.statusReport = statusReport;
    }
    
    
     @Override
    public String toString() {
        return this.timestamp;
    }
    
    
    
    
    
}
