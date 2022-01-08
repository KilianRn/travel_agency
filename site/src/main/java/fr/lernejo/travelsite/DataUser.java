package fr.lernejo.travelsite;

public record DataUser(String userEmail, String userName, String userCountry, Weather weatherExpectation, Integer minimumTemperatureDistance) {
}
