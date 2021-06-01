package com.cmb.mode.builder.simpleBuilder;

public class Click {

    public static void main(String[] args) {
        showBike(new ConcreteBuilder.OfoBuilder());
        showBike(new ConcreteBuilder.MobikeBuilder());
    }

    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        bike.getFrame().frame();
        bike.getSeat().seat();
        bike.getTire().tire();
    }
}
