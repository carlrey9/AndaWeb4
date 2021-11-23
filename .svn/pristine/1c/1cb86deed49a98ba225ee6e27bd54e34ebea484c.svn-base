/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.api;

import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author hubio
 */
public class Respuesta {

    public final static String SUCCESS = "success";
    public final static String ERROR = "error";

    /**
     * The values are: "success" or "error" depending on the outcome of the
     * request, the constants above are recommended to use with this.
     */
    private final String status;

    /**
     * This is the ClassName in the data field
     */
    private final String type;

    /**
     * data of the response. Has a Serialized Json Object.
     */
    private final String data;

    /**
     * If data is a Java Collection
     */
    private final boolean dataIsArray;

    /**
     * If request status is "error" this value must be used to indicate the
     * error cause
     */
    private final String errorCode;

    private Respuesta(Builder builder) {
        this.status = builder.status;
        this.type = builder.type;
        this.data = builder.data;
        this.dataIsArray = builder.dataIsArray;
        this.errorCode = builder.errorCode;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public String getData() {
        return data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public boolean idDataIsArray() {
        return dataIsArray;
    }

    /**
     * Builder Pattern to ApiResponse
     */
    public static class Builder {

        private String status;
        private String type;
        private String data;
        private boolean dataIsArray;
        private String errorCode;

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder data(Object data) {
            this.dataIsArray = data instanceof ArrayList;
            Gson gson = new Gson();
            this.data = gson.toJson(data);
            return this;
        }

        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Respuesta build() {
            return new Respuesta(this);
        }
    }

    @Override
    public String toString() {
        return "Data: " + this.data + "| Error Code: " + this.errorCode + "| Status: " + this.status + "| Type: " + this.type;
    }
}

