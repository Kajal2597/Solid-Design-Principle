package com.solidprinciple;

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // YAGNI Violation: Unnecessary methods that aren't needed yet
    public String exportToCSV() {
        return make + "," + model + "," + year;
    }

    public String exportToXML() {
        return "<car><make>" + make + "</make><model>" + model + "</model><year>" + year + "</year></car>";
    }

    public String exportToJSON() {
        return "{ \"make\": \"" + make + "\", \"model\": \"" + model + "\", \"year\": " + year + " }";
    }

    public static void main(String[] args) {

    }
}

