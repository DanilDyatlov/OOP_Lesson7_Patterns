package meteo;

public class Main {

    // Есть библиотека сбора данных от датчиков. Все они были куплены в комплекте с этой библиотекой.
    // Поступил новый датчик от другой компании, интерфейс которого отличается от предыдущих.
    // Надо включить этот датчик в систему.
    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();
        MeteoSensor st500_1 = new AdapterSensorTemperature(new ST500Info().getData());
        // Создаем новый экземпляр датчика, который создастся через обертку через адаптер
        // После полученого датчика получаем его данные
        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);
        meteoDb.save(st500_1);
        // Добавляем в базу данных

        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb
    }
}