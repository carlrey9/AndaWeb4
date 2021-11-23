/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.util;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hubio
 */
public class SendNotification {

    public static void newRequirement() {
        URL url;
        try {
            url = new URL("https://fcm.googleapis.com/fcm/send");
            URLConnection con;
            try {
                con = url.openConnection();
                HttpURLConnection http = (HttpURLConnection) con;
                http.setRequestMethod("POST"); // PUT is another valid option
                http.setDoOutput(true);
                byte[] out = "{\"to\":\"/topics/andaUsuariosAdmin\",\"content_available\":true,\"notification\":{\"title\":\"Nuevo Mensaje\",\"body\":\"Hay un nuevo requerimiento pendiente de atencion\",\"click_action\":\"ADMIN_HUB_ACTIVITY\"}}".getBytes(StandardCharsets.UTF_8);
                int length = out.length;

                http.setFixedLengthStreamingMode(length);
                http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                http.setRequestProperty("Authorization", "key=AAAAMAfx7yY:APA91bE_Vick86cSd8QmTa4sfjp8KqY4g0gnIyQFQyqfuL2TN71h7N-oaFM2I5PqMr94rZ8hvEzDJGiZmFhPCCrztKRvq6vS6M34pEvblh7axVic4Lhvp8_-RSYsFCi7LploXcr1TYot");
                http.connect();
                try (OutputStream os = http.getOutputStream()) {
                    os.write(out);
                }
            } catch (IOException ex) {
                Logger.getLogger(SendNotification.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(SendNotification.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     public static void newUserRegistered() {
        URL url;
        try {
            url = new URL("https://fcm.googleapis.com/fcm/send");
            URLConnection con;
            try {
                con = url.openConnection();
                HttpURLConnection http = (HttpURLConnection) con;
                http.setRequestMethod("POST"); // PUT is another valid option
                http.setDoOutput(true);
                byte[] out = "{\"to\":\"/topics/andaUsuariosAdmin\",\"content_available\":true,\"notification\":{\"title\":\"Nuevo Usuario Registrado\",\"body\":\"Se acaba de registrar un usuario!\",\"click_action\":\"ADMIN_HUB_ACTIVITY\"}}".getBytes(StandardCharsets.UTF_8);
                int length = out.length;

                http.setFixedLengthStreamingMode(length);
                http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                http.setRequestProperty("Authorization", "key=AAAAMAfx7yY:APA91bE_Vick86cSd8QmTa4sfjp8KqY4g0gnIyQFQyqfuL2TN71h7N-oaFM2I5PqMr94rZ8hvEzDJGiZmFhPCCrztKRvq6vS6M34pEvblh7axVic4Lhvp8_-RSYsFCi7LploXcr1TYot");
                http.connect();
                try (OutputStream os = http.getOutputStream()) {
                    os.write(out);
                }
            } catch (IOException ex) {
                Logger.getLogger(SendNotification.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(SendNotification.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     public static void newPurchaseRegistered() {
        URL url;
        try {
            url = new URL("https://fcm.googleapis.com/fcm/send");
            URLConnection con;
            try {
                con = url.openConnection();
                HttpURLConnection http = (HttpURLConnection) con;
                http.setRequestMethod("POST"); // PUT is another valid option
                http.setDoOutput(true);
                byte[] out = "{\"to\":\"/topics/andaUsuariosAdmin\",\"content_available\":true,\"notification\":{\"title\":\"Nueva Compra Realizada\",\"body\":\"Se acaba de realizar una compra!\",\"click_action\":\"ADMIN_HUB_ACTIVITY\"}}".getBytes(StandardCharsets.UTF_8);
                int length = out.length;

                http.setFixedLengthStreamingMode(length);
                http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                http.setRequestProperty("Authorization", "key=AAAAMAfx7yY:APA91bE_Vick86cSd8QmTa4sfjp8KqY4g0gnIyQFQyqfuL2TN71h7N-oaFM2I5PqMr94rZ8hvEzDJGiZmFhPCCrztKRvq6vS6M34pEvblh7axVic4Lhvp8_-RSYsFCi7LploXcr1TYot");
                http.connect();
                try (OutputStream os = http.getOutputStream()) {
                    os.write(out);
                }
            } catch (IOException ex) {
                Logger.getLogger(SendNotification.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(SendNotification.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     public static void newPurchaseError(String purchaseID) {
        URL url;
        try {
            url = new URL("https://fcm.googleapis.com/fcm/send");
            URLConnection con;
            try {
                con = url.openConnection();
                HttpURLConnection http = (HttpURLConnection) con;
                http.setRequestMethod("POST"); // PUT is another valid option
                http.setDoOutput(true);
                String json ="{\"to\":\"/topics/andaUsuariosAdmin\",\"content_available\":true,\"notification\":{\"title\":\"Hubo un error procesando una compra\",\"body\":\"La compra con ID "+purchaseID+"\",\"click_action\":\"ADMIN_HUB_ACTIVITY\"}}";
                byte[] out = json.getBytes(StandardCharsets.UTF_8);
                int length = out.length;

                http.setFixedLengthStreamingMode(length);
                http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                http.setRequestProperty("Authorization", "key=AAAAMAfx7yY:APA91bE_Vick86cSd8QmTa4sfjp8KqY4g0gnIyQFQyqfuL2TN71h7N-oaFM2I5PqMr94rZ8hvEzDJGiZmFhPCCrztKRvq6vS6M34pEvblh7axVic4Lhvp8_-RSYsFCi7LploXcr1TYot");
                http.connect();
                try (OutputStream os = http.getOutputStream()) {
                    os.write(out);
                }
            } catch (IOException ex) {
                Logger.getLogger(SendNotification.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(SendNotification.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
