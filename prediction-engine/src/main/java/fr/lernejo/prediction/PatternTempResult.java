package fr.lernejo.prediction;

import java.awt.*;
import java.util.ArrayList;

public record PatternTempResult(String country, ArrayList<TempCountryDay> temperatures) {
}
