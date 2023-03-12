package net.dmytro.homework9;

public class FileMaxSizeReachedException extends RuntimeException{
    public FileMaxSizeReachedException(String message) {
        super(message);
    }
}
