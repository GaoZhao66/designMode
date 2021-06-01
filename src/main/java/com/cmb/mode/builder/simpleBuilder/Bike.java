package com.cmb.mode.builder.simpleBuilder;

import lombok.Data;

/**
 * 产品类
 */
@Data
public class Bike {
    private IFrame frame;
    private ISeat seat;
    private ITire tire;
}