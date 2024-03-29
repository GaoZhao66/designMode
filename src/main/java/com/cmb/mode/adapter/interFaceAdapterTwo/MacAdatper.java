package com.cmb.mode.adapter.interFaceAdapterTwo;

public class MacAdatper extends DefaultAdapter {

    private AC ac;

    public MacAdatper(AC ac) {
        this.ac = ac;
    }

    @Override
    public int output20V() {
        return ac.outputAC() / 11;
    }

    public static void main(String[] args) {
        MacAdatper adatper = new MacAdatper(new AC());
        System.out.println("mac电脑电压:" + adatper.output20V());
    }
}
