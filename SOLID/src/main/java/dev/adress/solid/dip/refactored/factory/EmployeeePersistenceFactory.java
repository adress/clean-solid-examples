package dev.adress.solid.dip.refactored.factory;

import dip.refactored.persistence.EmployeePersistence;

public interface EmployeeePersistenceFactory {

    public EmployeePersistence getEmployeePersistance();
}
