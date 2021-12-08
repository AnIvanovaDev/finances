/**
 * @author Oleksandr Ivanov
 * @since 1.0.0
 */
module customer {
    opens com.global.customer to spring.core, spring.beans, spring.context;
    opens com.global.customer.controller to spring.core, spring.beans, spring.context;

    requires static lombok;
    requires spring.beans;
    requires spring.context;
    requires spring.core;
    requires spring.web;
    requires spring.boot;
    requires spring.boot.actuator;
    requires spring.boot.autoconfigure;
    requires com.fasterxml.jackson.databind;
}