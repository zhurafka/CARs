package com.company;

/**
 * Created by Muraffka on 12.03.2017.
 */
public class Car
{

    String model;
    String carcase;
    String color;
    int volume;

    Car(String model, String carcase, String color, int volume)
    {
        /*this.model = model;
        this.carcase = carcase;
        this.color = color;*/
    }

    //Конструктор
    Car()
    {
        model = "none";
        carcase = "none";
        color = "none";
        volume = 0;
    }


    void setCar(String setmodel, String setcarcase, String setcolor, int setvolume)
    {
        model = setmodel;
        carcase = setcarcase;
        color = setcolor;
        volume = setvolume;
       }

    public String getCar()
    {
        String info = " Марка машины: " + model + " Тип кузова:  " +carcase  +  " Цвет:  " + color + " Объем двигателя:  " + volume;
        return info;

    }
}





