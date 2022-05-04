package com.company;

import ge.itvet.convertor.*;
import ge.itvet.convertor.currancey.Currency;
import ge.itvet.convertor.currancey.CurrencyConverter;
import ge.itvet.convertor.currancey.CurrencyType;
import ge.itvet.convertor.media.Media;
import ge.itvet.convertor.media.MediaConverter;
import ge.itvet.convertor.media.MediaConverterImpl;
import ge.itvet.convertor.media.MediaType;


public class Main {

    public static void main(String[] args) {
        Media suramela = new Media(MediaType.MP3);
        MediaConverter converter = new MediaConverterImpl(MediaType.MP4, suramela);
        System.out.println(converter.info());
        saba(converter);
        System.out.println(converter.info());
        System.out.println("-------------------------CURRENCY-----------------");
        Currency currency = new Currency(10, CurrencyType.GBP);
        CurrencyConverter currencyConverter = new CurrencyConverter(currency,CurrencyType.GEL);
        System.out.println(currency);
        saba(currencyConverter);
        System.out.println(currency);

    }

    public static void saba(Convertable x) {
        x.convert();
    }


}