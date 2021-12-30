package com.mercadolivre.Sealed;

public abstract sealed class Staff permits Employee, Manager {
    public String nome;

    @Override
    public String toString() {
        return "Staff{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
