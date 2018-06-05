/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerplus.gestion;

import java.io.IOException;
import org.jsoup.Jsoup;

/**
 *
 * @author dani
 */
public class GestionTiempo{

    public static String pasarTiempo(){
        String tiempo="";
        String temperatura="";
        try{
            org.jsoup.nodes.Document doc=Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
            tiempo=doc.select(".today_nowcard-phrase").text();
            temperatura=doc.select(".today_nowcard-temp").text();
        }catch(IOException ex){
            System.out.println("Error:"+ex);
        }

        return tiempo+" "+temperatura;
    }

    public static String pasarNoticia(){
        String noticia="";
        try{
            org.jsoup.nodes.Document doc=Jsoup.connect("https://www.elespanol.com/ultimas/").get();
            noticia=doc.select(".last-articles-section .last-articles-section__list--image .item__title").text();
        }catch(IOException ex){
            System.out.println("Error:"+ex);
        }

        return noticia;
    }
}
