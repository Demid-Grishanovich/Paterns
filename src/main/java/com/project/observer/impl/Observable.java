package com.project.observer.impl;

public interface Observable {
    void attach();

    void detach();

    void notifyObservers();
}