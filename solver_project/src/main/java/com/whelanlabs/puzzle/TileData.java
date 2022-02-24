package com.whelanlabs.puzzle;

public class TileData {

	public enum c { // color
		r, y, b, g; // red, yellow, blue, green
	}

	public enum d { // direction
		i, o, l, r; // in, out, left, right
	}

	public static c[][] tileColor = { { c.b, c.y, c.g, c.r }, { c.r, c.b, c.y, c.g }, { c.b, c.g, c.r, c.y },
			{ c.g, c.y, c.r, c.b }, { c.y, c.r, c.b, c.g }, { c.y, c.b, c.g, c.r }, { c.r, c.b, c.g, c.y },
			{ c.y, c.g, c.b, c.r }, { c.y, c.b, c.r, c.g }, { c.y, c.r, c.g, c.b }, { c.b, c.y, c.r, c.g },
			{ c.g, c.b, c.g, c.r }, { c.r, c.g, c.y, c.b }, { c.b, c.y, c.g, c.r }, { c.r, c.b, c.y, c.g },
			{ c.g, c.r, c.y, c.b } };

	public static d[][] tileDirection = { { d.o, d.o, d.r, d.r }, { d.i, d.r, d.l, d.l }, { d.l, d.i, d.l, d.i },
			{ d.o, d.o, d.o, d.o }, { d.i, d.i, d.l, d.o }, { d.r, d.r, d.l, d.o }, { d.i, d.l, d.l, d.o },
			{ d.i, d.l, d.i, d.i }, { d.l, d.o, d.l, d.i }, { d.r, d.r, d.i, d.i }, { d.r, d.o, d.r, d.o },
			{ d.l, d.o, d.i, d.l }, { d.l, d.r, d.i, d.i }, { d.r, d.i, d.r, d.l }, { d.l, d.r, d.o, d.r },
			{ d.l, d.o, d.r, d.l } };

}