package oop.inheritance.terminal;

import oop.library.ingenico.model.Transaction;

public interface GPS {
    void open();

    void send(Transaction transaction);

    byte[] receive();

    void close();
}
