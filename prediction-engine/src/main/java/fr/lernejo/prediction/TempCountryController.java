package fr.lernejo.prediction;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@RestController
public class TempCountryController {

    @GetMapping("/api/temperature")
    public final Object TempCountry(@RequestParam String country){

            final TemperatureService temperatureService = new TemperatureService();
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ArrayList<TempCountryDay> listTempCountry = new ArrayList<>();
            try {
                cal.add(Calendar.DATE, -1);
            listTempCountry.add(new TempCountryDay(sdf.format(cal.getTime()), temperatureService.getTemperature(country)));
            cal.add(Calendar.DATE, -1);
            listTempCountry.add(new TempCountryDay(sdf.format(cal.getTime()), temperatureService.getTemperature(country)));
            return listTempCountry;
        }catch (UnknownCountryException error){
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Country doesn't exist... ERROR HTTP 417");}}}

