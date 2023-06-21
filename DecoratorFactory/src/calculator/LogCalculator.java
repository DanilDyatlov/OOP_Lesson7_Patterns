package calculator;

public class LogCalculator implements Calculable{
    // Пропускает через себя все действия к калькулятору и его вписываем в мейн, сначала мы будем делать логирование, затем будет выполняться работа калькулятора
    private Calculable calculable; // сам калькулятор
    private Logger logger; // интерфейс который может прописывать лог

    public LogCalculator(Calculable calculable, Logger logger) {
        this.calculable = calculable;
        this.logger = logger;
        logger.writeLog("Calculable primary arg : " + calculable.getResult());
    }

    @Override
    public Calculable sum(int arg) {
        logger.writeLog("Sum with args: " + arg);
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.writeLog("Multi with args: " + arg);
        return calculable.multi(arg);
    }

    @Override
    public int getResult() {
        int result = calculable.getResult();
        logger.writeLog("Result : " + result);
        return result;
    }
}
