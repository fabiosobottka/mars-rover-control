package gov.nasa.mars.rover.control.entities.builder;

import gov.nasa.mars.rover.control.entities.Coordinate;

public class CoordinateBuilder {

	private Long value;

	public static CoordinateBuilder create() {
		return new CoordinateBuilder();
	}

	public CoordinateBuilder setValue(final Long value) {
		this.value = value;
		return this;
	}

	public Coordinate build() {
		return new Coordinate(value);
	}

}
