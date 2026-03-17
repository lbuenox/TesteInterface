package com.example.testeinterfacelaribueno;

import android.util.Log;

    public class Fornecedor implements iCRUD {
        private String nome;
        private String email;

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setNome(String nome) {
            this.nome = nome;

        }

        @Override
        public void incluir() {
            Log.i(Api.TAG, "incluir: Fornecedor");
        }

        @Override
        public void alterar() {
            Log.i(Api.TAG, "alterar: Fornecedor");
        }

        @Override
        public void deletar() {
            Log.i(Api.TAG, "deletar: Fornecedor ");
        }

        @Override
        public void listar() {
            Log.i(Api.TAG, "listar: Fornecedor");
        }

        @Override
        public void procurar() {
            Log.i(Api.TAG, "procurar: Fornecedor");
        }

        @Override
                    public void apagar() {
                Log.i(Api.TAG, "apagar: Fornecedor");
            }


    }


