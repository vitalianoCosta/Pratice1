import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureHelperTest {

    @BeforeEach
    @org.junit.jupiter.api.Test
    void celsiusToKelvin() {
        TemperatureHelper temp1 = new TemperatureHelper();
        assertEquals(-273.15, temp1.CelsiusToKelvin(0.0));
    }

    @org.junit.jupiter.api.Test
    void kelvinToCelsius() {
        TemperatureHelper temp2 = new TemperatureHelper();
        assertEquals(0, temp2.KelvinToCelsius(-273.15));
    }

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        TemperatureHelper temp3 = new TemperatureHelper();
        assertEquals(95, temp3.CelsiusToFahrenheit(35));
    }

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        TemperatureHelper temp4 = new TemperatureHelper();
        assertEquals(0, temp4.FahrenheitToCelsius(32));
    }

    @org.junit.jupiter.api.Test
    void kelvinToFahrenheit() {
        TemperatureHelper temp5 = new TemperatureHelper();
        assertEquals(32, temp5.KelvinToFahrenheit(-273.15));
    }

    @org.junit.jupiter.api.Test
    void fahrenheitToKelvin() {
        TemperatureHelper temp6 = new TemperatureHelper();
        assertEquals(-273.15, temp6.FahrenheitToKelvin(32));
    }

}