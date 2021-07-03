

public class TemperatureHelper {
    private double celsius;
    private double kelvin;
    private double fahrenheit;

    public TemperatureHelper() {

    }
    public double CelsiusToKelvin(double celsius){
        return celsius - 273.15;
    }
    public double KelvinToCelsius(double kelvin){
        return kelvin + 273.15;
    }
    public double CelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
    public double FahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32) * 5/9;
    }
    public double KelvinToFahrenheit(double kelvin){
        return (KelvinToCelsius(kelvin)) * 9/5 + 32;
    }
    public double FahrenheitToKelvin(double fahrenheit){
        return (FahrenheitToCelsius(fahrenheit)) -273.15;
    }
}
