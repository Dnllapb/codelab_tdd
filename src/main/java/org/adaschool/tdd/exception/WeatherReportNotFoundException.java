package org.adaschool.tdd.exception;

public class WeatherReportNotFoundException
    extends RuntimeException
{
    public WeatherReportNotFoundException(String s) {
        super("Weather report not found with ID:" );
    }

}
