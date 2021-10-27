package com.cmb.mode.adapter.objectAdapter;

public class Adapter implements DC5V{

    private AC220V ac220V;

    public Adapter(AC220V ac220V) {
        this.ac220V = ac220V;
    }

    @Override
    public int dc5v() {
        int output220v = ac220V.output220v();
        return (output220v / 44);
    }
}
