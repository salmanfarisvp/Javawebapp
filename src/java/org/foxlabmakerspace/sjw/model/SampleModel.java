/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foxlabmakerspace.sjw.model;

/**
 *
 * @author Salman Faris
 */
public class SampleModel {
    private String inputData;
    
    /**
     * Method for getting inputData
     * @return String input
     */
    public String getInputData() {
        return inputData;
    }

    public void setInputData(String inputData) {
        this.inputData = inputData;
    }
    
    public String getUpperCaseForm(String inputText) {
        return inputText.toUpperCase();
    }
}
