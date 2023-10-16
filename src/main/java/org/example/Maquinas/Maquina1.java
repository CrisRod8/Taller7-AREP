package org.example.Maquinas;

import org.example.URLReader;

import static spark.Spark.*;

public class Maquina1 {
    public static void main(String[] args) {
        port(getPort());
        secure(getKeStore(), getPasswordKeyStore(), null,null);
        get("/local", (req, res) -> "Hola, eres la maquina 1");
        get("/remote", (req, res) -> "Hola, eres la maquina 2");
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }

    static String getKeStore() {
        if (System.getenv("KEYSTORE") != null) {
            return System.getenv("KEYSTORE");
        }
        return "keystores/ecikeystore.p12";
    }

    static String getPasswordKeyStore() {
        if (System.getenv("123456") != null) {
            return System.getenv("123456");
        }
        return "123456";
    }
}