package br.com.alura.screenmatch.service;

public class ApiKey {
    public static String getKey() {
        return System.getenv("apiKey");
    }
}
