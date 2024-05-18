

// Civan Metin - 101441732
// Maggie Hall - 101447078
// Tomer Edelman - 101400506


package com.example.groupassign2;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CivanMetin1 {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField flightNumberField;

    @FXML
    private TextField sourceField;

    @FXML
    private TextField destinationField;

    @FXML
    private TextField fareField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField ageField;

    @FXML
    private DatePicker travelDatePicker;

    private final List<TomerEdelman3> reservations = new ArrayList<>();
    private int currentReservationIndex = -1;

    public CivanMetin1() {
    }

    @FXML
    protected void onAddButtonClick() {
        try {
            Flight flight = new Flight(
                    this.flightNumberField.getText(),
                    this.sourceField.getText(),
                    this.destinationField.getText(),
                    Double.parseDouble(this.fareField.getText())
            );
            Passenger passenger = new Passenger(
                    this.firstNameField.getText(),
                    this.lastNameField.getText(),
                    Integer.parseInt(this.ageField.getText())
            );
            LocalDate travelDate = this.travelDatePicker.getValue();
            if (travelDate == null || travelDate.isBefore(LocalDate.now())) {
                throw new IllegalArgumentException("Invalid travel date");
            }

            TomerEdelman3 reservation = new TomerEdelman3(flight, passenger, travelDate);
            this.reservations.add(reservation);
            this.welcomeText.setText("Reservation added successfully!");
        } catch (NumberFormatException var5) {
            this.welcomeText.setText("Error: Invalid number format");
        } catch (IllegalArgumentException var6) {
            this.welcomeText.setText("Error: " + var6.getMessage());
        }
    }

    @FXML
    protected void onViewPreviousButtonClick() {
        if (!this.reservations.isEmpty()) {
            this.currentReservationIndex = (this.currentReservationIndex - 1 + this.reservations.size()) % this.reservations.size();
            this.displayTicket(this.reservations.get(this.currentReservationIndex));
        } else {
            this.welcomeText.setText("No reservations available.");
        }
    }

    @FXML
    protected void onViewNextButtonClick() {
        if (!this.reservations.isEmpty()) {
            this.currentReservationIndex = (this.currentReservationIndex + 1) % this.reservations.size();
            this.displayTicket(this.reservations.get(this.currentReservationIndex));
        } else {
            this.welcomeText.setText("No reservations available.");
        }
    }

    @FXML
    protected void onDeleteButtonClick() {
        if (!this.reservations.isEmpty() && this.currentReservationIndex >= 0) {
            this.reservations.remove(this.currentReservationIndex);

            if (!this.reservations.isEmpty()) {
                this.currentReservationIndex = (this.currentReservationIndex + 1) % this.reservations.size();
                this.displayTicket(this.reservations.get(this.currentReservationIndex));
            } else {
                this.currentReservationIndex = -1;
                this.welcomeText.setText("No reservations available.");
            }
        } else {
            this.currentReservationIndex = -1;
            this.welcomeText.setText("No reservations available.");
        }
    }


    @FXML
    protected void onResetButtonClick() {
        this.flightNumberField.clear();
        this.sourceField.clear();
        this.destinationField.clear();
        this.fareField.clear();
        this.firstNameField.clear();
        this.lastNameField.clear();
        this.ageField.clear();
        this.travelDatePicker.setValue(null);
        this.welcomeText.setText("");
    }

    @FXML
    protected void onDisplayButtonClick() {
        if (!this.reservations.isEmpty()) {
            this.currentReservationIndex = (this.currentReservationIndex + 1) % this.reservations.size();
            this.displayTicket(this.reservations.get(this.currentReservationIndex));
        } else {
            this.welcomeText.setText("No reservations available.");
        }
    }

    private void displayTicket(TomerEdelman3 reservation) {
        this.welcomeText.setText(String.format("Flight: %s\nSource: %s\nDestination: %s\nDate: %s\nPassenger: %s %s\nAge: %d\nTotal Fare: $%.2f",
                reservation.getFlight().getFlightNumber(),
                reservation.getFlight().getSource(),
                reservation.getFlight().getDestination(),
                reservation.getTravelDate(),
                reservation.getPassenger().getFirstName(),
                reservation.getPassenger().getLastName(),
                reservation.getPassenger().getAge(),
                reservation.calculateTotalFare())
        );
    }
}
