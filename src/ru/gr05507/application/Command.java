package ru.gr05507.application;

public interface Command {
    void execute();
    void undo();
}
