package com.example.testeinterfacelaribueno;

import android.util.Log;

public class Produto implements iCRUD{
    private String fornecedor;
    private String nome;

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void incluir() {
        Log.i(Api.TAG, "incluir: Produto");
    }

    @Override
    public void alterar() {
        Log.i(Api.TAG, "Alterar: Produto");
    }

    @Override
    public void deletar() {
        Log.i(Api.TAG, "deletar: produto");
    }

    @Override
    public void listar() {
        Log.i(Api.TAG, "listar: produto");


    }

    @Override
    public void procurar() {
        Log.i(Api.TAG, "procurar: produto");
    }

    @Override
    public void apagar() {
        Log.i(Api.TAG, "apagar: produto");
    }
}


