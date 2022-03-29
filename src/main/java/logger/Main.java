package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;

public class Main {
    //Добавляем логгер для класса
    public static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        /*По умолчанию потоки пишут unchecked исключения в консоль. В данном анонимном классе
         мы меняем эту логику, и логируем unchecked исключения в наш лог файл*/
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                LOGGER.error("UNCHECKED EXCEPTION!: ", e);
            }
        });

        LOGGER.info("\n СТАРТ ПРОГРАММЫ \n");
        //Логируем checked
        LOGGER.info("Тестируем логирование checked исключения");
        try {
            throwCheckedEx();
        } catch (FileNotFoundException e) {
            LOGGER.error("CHECKED EXCEPTION!: ", e);
        }
        LOGGER.info("Checked исключение брошено и залогировано");

        //Логируем unchecked
        LOGGER.info("Тестируем логирование unchecked исключения");
        throwUnchekedEx();
        //Данная строка никогда не выполнится, т.к мы не обработали исключение
        LOGGER.info("Unchecked исключение брошено и залогировано");

    }

    public static void throwCheckedEx() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public static void throwUnchekedEx() {
        throw new ArithmeticException();
    }
}
