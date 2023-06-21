package meteo;

import java.time.LocalDateTime;

public class AdapterSensorTemperature implements MeteoSensor {
    // Суть метода в том, что он приводит наши параментры для другого сенсора, скрещиваем.
    // У нового есть другие функции и мы их соединяем с нашим датчиком
    // Преобразует элементы

    private SensorTemperature sensorTemperature;

    public AdapterSensorTemperature(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) sensorTemperature.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        int year = sensorTemperature.year();
        int day = sensorTemperature.day() - 1;
        int second = sensorTemperature.second();

        return LocalDateTime.of(year, 1, 1, 0, 0, 0).plusDays(day).plusSeconds(second);
    }
}
