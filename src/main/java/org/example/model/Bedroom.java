package org.example.model;

public class Bedroom extends Room {
    private String name;
    private Wardrobe wardrobe;
    private Bed bed;

    public Bedroom(Wall wal1, Wall wal2, Wall wal3, Wall wal4,
                   Ceiling ceiling, Carpet carpet, Lamp lamp,
                   String name, Wardrobe wardrobe, Bed bed) {
        super(wal1, wal2, wal3, wal4, ceiling, carpet, lamp);
        this.name = name;
        this.wardrobe = wardrobe;
        this.bed = bed;
    }

    public void createBedroom(){
        getWal1().create();
        getWal2().create();
        getWal3().create();
        getWal4().create();
        getCeiling().create();
        getCarpet().lying();
        getLamp().turnOn();
        bed.make();
        wardrobe.add();
    }

    public String getName() {
        return name;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Bed getBed() {
        return bed;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "name='" + name + '\'' +
                ", wardrobe=" + wardrobe +
                ", bed=" + bed +
                ", room= "+ super.toString()+
                '}';
    }
}
