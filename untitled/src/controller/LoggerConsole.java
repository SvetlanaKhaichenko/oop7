package controller;

public class LoggerConsole implements Loggable{
    @Override
    public void log(String message) {
        System.out.println(" ----> "+ message);
    }
}
