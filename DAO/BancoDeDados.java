<<<<<<< HEAD:DAO/BancoDeDados.java
package DAO;

import java.util.ArrayList;

// Criação da classe simulando um banco de dados para passar e adicionar as informações

public class BancoDeDados<T> {
    private ArrayList<T> banco = new ArrayList<>();

    public void insertValue(T valor) {
        this.banco.add(valor);
    }

    public T getValor(int index) throws Exception {
        if (index < 0) {
            throw new Exception("Valor não pode ser inferior a 0");
        }
        return this.banco.get(index);
    }

    public ArrayList<T> getList() {
        return this.banco;
    }
=======
package models;

import java.util.ArrayList;

// Criação da classe simulando um banco de dados para passar e adicionar as informações

public class BancoDeDados<T> {
    private ArrayList<T> banco = new ArrayList<>();

    public void insertValue(T valor) {
        this.banco.add(valor);
    }

    public T getValor(int index) throws Exception {
        if (index < 0) {
            throw new Exception("Valor não pode ser inferior a 0");
        }
        return this.banco.get(index);
    }

    public ArrayList<T> getList() {
        return this.banco;
    }
>>>>>>> ccca2510f216503bc359f4ff19dc6f1d9a0933e5:BancoDeDados.java
}