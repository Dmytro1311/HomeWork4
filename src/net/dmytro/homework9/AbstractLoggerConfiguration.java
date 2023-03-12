package net.dmytro.homework9;

public abstract class AbstractLoggerConfiguration {
public LogginLevel level;

    public void setLevel(LogginLevel level) {
        this.level = level;
    }

    public AbstractLoggerConfiguration() {
    }
}
