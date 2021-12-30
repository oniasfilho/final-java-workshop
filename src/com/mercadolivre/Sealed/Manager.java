package com.mercadolivre.Sealed;

public non-sealed class Manager extends Staff {
    public int supervisorId;

    @Override
    public String toString() {
        return "Manager{" +
                "supervisorId=" + supervisorId +
                ", nome='" + nome + '\'' +
                '}';
    }
}
