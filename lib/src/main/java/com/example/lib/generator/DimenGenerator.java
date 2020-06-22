package com.example.lib.generator;

import com.example.lib.constants.DimenTypes;
import com.example.lib.utils.MakeUtils;

import java.io.File;


public class DimenGenerator {

    /**
     */
    private static final int DESIGN_WIDTH = 1280;

    /**
     * 这里会以750为最小宽度来计算标准（默认）分辨率，也就是说该机型下，1px = 1dp ，其他机型会按照分辨率适配
     * 比如此次新建的566  （1290*1200 ppi= 320）以及750（1280 *1200 ppi = 240） ,则自动生成的文件，默认值是566的1.5倍（对比两文件看或者计算得出结论），
     */
    private static final int DESIGN_HEIGHT = 750;

    public static void main(String[] args) {
        int smallest = DESIGN_WIDTH>DESIGN_HEIGHT? DESIGN_HEIGHT:DESIGN_WIDTH;  //
        DimenTypes[] values = DimenTypes.values();
        for (DimenTypes value : values) {
            File file = new File("");
            MakeUtils.makeAll(smallest, value, file.getAbsolutePath());
        }

    }

}
