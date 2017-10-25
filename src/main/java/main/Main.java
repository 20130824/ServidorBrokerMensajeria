package main;


import org.apache.activemq.broker.BrokerService;

import javax.jms.JMSException;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Ejemplo para probar el uso de JMS, utilizando servidor de mensajeria ActiveMQ, ver en
 * http://activemq.apache.org/
 * Created by vacax on 03/10/15.
 */
public class Main {

    public static void main(String[] args) throws IOException, JMSException  {
        System.out.println("Prueba de Mensajeria Asincrona");

            System.out.println("Inicializando Servidor JMS");
            try {
                //Subiendo la versión embedded de ActiveMQ.
                //http://activemq.apache.org/how-do-i-embed-a-broker-inside-a-connection.html
                BrokerService broker = new BrokerService();
                //configurando el broker.
                broker.addConnector("tcp://localhost:61616");
                //Inicializando
                broker.start();
            }catch (Exception ex){
                ex.printStackTrace();
            }



    }

    /**
     *
     */
    private static void mensajesParametros(){
        System.out.println("Deben enviar los parametros: aplicacion [mensaje]");
        System.out.println("Si aplicacion == 1, debe enviar segundo parametro para el mesanje");
        System.out.println("Si aplicacion == 2, sube en modo consumidor");
        System.out.println("Si aplicacion == 3, Inicializa el modo Embedded");
    }
}