package com.a13x.retrofit_proof.api;

/**
 * Created by Alejandro on 03/11/2016.
 */
public class Repository {
    private String id;
    private String name;

    @Override
    public String toString() {
        return id + "/" + name;
    }
}
