package com.mercadolivre.Sealed;

public final class Employee extends Staff {
    public int employeeId;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", nome='" + nome + '\'' +
                '}';
    }
}
