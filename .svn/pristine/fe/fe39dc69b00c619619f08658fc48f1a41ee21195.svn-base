/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubionics.anda.web.util;

import com.hubionics.anda.web.api.Respuesta;
/**
 *
 * @author hubio
 */
public class Util {
        public static Respuesta getError(String error) {
        return new Respuesta.Builder()
                .status(Respuesta.ERROR)
                .errorCode(error)
                .build();
    }
}
