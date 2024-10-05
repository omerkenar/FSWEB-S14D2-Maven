package org.example;

import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;
import org.example.model.*;

public class Main {
    public static void main(String[] args) {
//        Bedroom bedroom = new Bedroom("oda",new Wall("1"), new Wall("2"), new Wall("3"), new Wall("4"), new Ceiling(2, PaintColor.RED), new Bed("ortapedik", 2, 1,1,1), new Lamp(LampType.NORMAL, false, 10), new Wardrobe(2,2,2.2), new Carpet(2,4, PaintColor.WHITE));
//
//        bedroom.getLamp().turnOn();


        Lamp lamp = new Lamp(LampType.NORMAL, true, 40);
        Ceiling ceiling = new Ceiling(3,PaintColor.WHITE);
        Bed bed = new Bed("ortopedik", 2,1,1,1);
        Carpet carpet = new Carpet(2,2, PaintColor.GREEN);
        Wardrobe wardrobe = new Wardrobe(2,3,3.5);

        Wall kuzey = new Wall("kuzey");
        Wall guney = new Wall("guney");
        Wall bati = new Wall("bati");
        Wall dogu = new Wall("dogu");

        Wall[] walls = new Wall[]{kuzey,guney,bati,dogu};

        Bedroom bedroom = new Bedroom(kuzey,guney,bati,dogu,ceiling,carpet,lamp,"yatak odasi", wardrobe, bed);

        bedroom.createBedroom();
    }
}