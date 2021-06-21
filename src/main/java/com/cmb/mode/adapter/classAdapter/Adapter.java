package com.cmb.mode.adapter.classAdapter;

public class Adapter extends AC220V implements DC5V{
    @Override
    public int dc5v() {
        int output220v = output220v();
        return (output220v / 44);
    }
}
