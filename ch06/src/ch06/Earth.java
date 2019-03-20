package ch06;

public class Earth {
	static final double EARTH_RADIUS=6400;
	static final double EARTH_SPACE_AREA;
	
	static {
		EARTH_SPACE_AREA=4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
}
