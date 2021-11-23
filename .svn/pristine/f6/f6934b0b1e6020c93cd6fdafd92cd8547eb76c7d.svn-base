/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.util;

/**
 *
 * @author hubio
 */
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by hubio on 31/01/2018.
 */

public class HashEncryption {

    public static String getHashedTry2(String tohash){
        MessageDigest sha256= null;
        try {
            sha256 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
        }
        try {
            sha256.update(tohash.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
        }
        byte[] digest = sha256.digest();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<digest.length;i++){
            sb.append(String.format("%02x", digest[i]));
        }
        return sb.toString();
    }
}
