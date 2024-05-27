/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorph;

/**
 * An interface for populating employee information based on the provided
 * employee number.
 *
 * @author Lance1
 */
interface EmployeeInformationPopulator {

    /**
     * Populates the employee information fields.
     */
    void populateEmployeeInformation();

    /**
     * Enables the date input fields.
     */
    void enableDateInputs();

    /**
     * Populates the wage information fields.
     */
    void populateWageInformation();

    /**
     * Displays an error dialog with the provided error message.
     *
     * @param errorMessage The message to be displayed in the error dialog.
     */
    void showErrorDialog(String errorMessage);
}
