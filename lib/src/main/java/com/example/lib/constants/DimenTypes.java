package com.example.lib.constants;


public enum DimenTypes {

	 DP_sw__300(300),  // values-sw300
	 DP_sw__310(310),
	 DP_sw__320(320),
	 DP_sw__330(330),
	 DP_sw__340(340),
	 DP_sw__350(350),
	 DP_sw__360(360),
	 DP_sw__370(370),
	 DP_sw__380(380),
	 DP_sw__390(390),
	DP_sw__400(400),
	DP_sw__410(410),
	 DP_sw__420(420),
	 DP_sw__430(430),
	 DP_sw__440(440),
	 DP_sw__450(450),
	 DP_sw__460(460),
	 DP_sw__470(470),
	 DP_sw__480(480),
	 DP_sw__490(490),
	 DP_sw__566(566),
	 DP_sw__750(750),

	 DP_sw__960(960);




    private int swWidthDp;




    DimenTypes(int swWidthDp) {

        this.swWidthDp = swWidthDp;
    }

    public int getSwWidthDp() {
        return swWidthDp;
    }

    public void setSwWidthDp(int swWidthDp) {
        this.swWidthDp = swWidthDp;
    }

}
