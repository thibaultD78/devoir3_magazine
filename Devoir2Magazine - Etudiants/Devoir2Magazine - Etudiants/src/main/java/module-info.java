open module sio.devoir2magazine {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.beans;
    requires spring.data.jpa;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires spring.data.commons;
    exports sio.devoir2magazine;
    exports sio.devoir2magazine.controllers;
}