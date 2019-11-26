/*
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public final class App {

    // SCANNER
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    // CONSTANTES NUMERICAS
    public static final String MSG_USR = "Introducir numero...: ";
    public static final String MSG_OUT = "Numero introducido...: ";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta";

    // LOGICA DE LA APLICACION
    public final void launchApp() {

        // CABECERA
        System.out.println("INTRODUCCIÓN ENTERO");
        System.out.println("===================");

        // INTRODUCIR DATO
        obtener(MSG_USR, MSG_ERR);
    }

    public static final double obtener(String msgUsr, String msgErr) {
        // NUMERO A DEVOLVER
        double numero = 0;

        // PROCESO DE ENTRADA
        boolean errorOK = true;
        do {
            try {
                // REALIZA LA PETICION
                System.out.print(msgUsr);
                numero = SCN.nextDouble();

                // ACTUALIZAR BUCLE
                errorOK = false;
            } catch (Exception e) {
                // MENSAJE DE ERROR
                System.out.println(MSG_ERR);
                // SEPARADOR
                System.out.println("---");

            } finally {
                SCN.nextLine();
            }
        }while (errorOK);
        // DEVUELVE EL NUMERO
        System.out.println("---");
        System.out.println(MSG_OUT + (int) numero);
        return numero;
    }
}

