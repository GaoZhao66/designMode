package com.cmb.mode.builder.simpleBuilder;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode.builder
 * @FileName: Computer.java
 * @ClassName: Computer
 * @Description: 具体 builder 类
 * @Author: 94068
 * @CreateDate: 2021/5/31 21:57
 * @UpdateUser: 94068
 * @UpdateDate: 2021/5/31 21:57
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public class ConcreteBuilder {

    public static class MobikeBuilder extends Builder {
        private Bike mBike = new Bike();

        @Override
        void buildFrame() {
            mBike.setFrame(new AlloyFrame());
        }

        @Override
        void buildSeat() {
            mBike.setSeat(new DermisSeat());
        }

        @Override
        void buildTire() {
            mBike.setTire(new SolidTire());
        }

        @Override
        Bike createBike() {
            return mBike;
        }
    }

    public static class OfoBuilder extends Builder {
        private Bike mBike = new Bike();

        @Override
        void buildFrame() {
            mBike.setFrame(new CarbonFrame());
        }

        @Override
        void buildSeat() {
            mBike.setSeat(new RubberSeat());
        }

        @Override
        void buildTire() {
            mBike.setTire(new InflateTire());
        }

        @Override
        Bike createBike() {
            return mBike;
        }
    }
}