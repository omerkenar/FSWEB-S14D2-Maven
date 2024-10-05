package org.example.model;

import java.util.Arrays;

public class Room {

    private Wall[] walls;

    private Wall wal1;
    private Wall wal2;
    private Wall wal3;
    private Wall wal4;
    private Ceiling ceiling;
    private Carpet carpet;
    private Lamp lamp;

    public Room(Wall wal1, Wall wal2,
                Wall wal3, Wall wal4,
                Ceiling ceiling, Carpet carpet, Lamp lamp) {
        this.wal1 = wal1;
        this.wal2 = wal2;
        this.wal3 = wal3;
        this.wal4 = wal4;
        this.ceiling = ceiling;
        this.carpet = carpet;
        this.lamp = lamp;
    }

    public Room(Wall wal1, Wall wal2, Wall wal3,
                Wall wal4, Ceiling ceiling, Lamp lamp) {
        this.wal1 = wal1;
        this.wal2 = wal2;
        this.wal3 = wal3;
        this.wal4 = wal4;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    public Wall[] getWalls() {
        return walls;
    }

    public Wall getWal1() {
        return wal1;
    }

    public Wall getWal2() {
        return wal2;
    }

    public Wall getWal3() {
        return wal3;
    }

    public Wall getWal4() {
        return wal4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Lamp getLamp() {
        return lamp;
    }

    @Override
    public String toString() {
        return "Room{" +
                "walls=" + Arrays.toString(walls) +
                ", wal1=" + wal1 +
                ", wal2=" + wal2 +
                ", wal3=" + wal3 +
                ", wal4=" + wal4 +
                ", ceiling=" + ceiling +
                ", carpet=" + carpet +
                ", lamp=" + lamp +
                '}';
    }
}
