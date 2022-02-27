package com.whelanlabs.puzzle;

public class TileData {

	public enum color {
		red, yellow, blue, green;
	}

	public enum direction {
		in, out, left, right;
	}

	public static color[][] tileColor = { { color.blue, color.yellow, color.green, color.red }, { color.red, color.blue, color.yellow, color.green }, { color.blue, color.green, color.red, color.yellow },
			{ color.green, color.yellow, color.red, color.blue }, { color.yellow, color.red, color.blue, color.green }, { color.yellow, color.blue, color.green, color.red }, { color.red, color.blue, color.green, color.yellow },
			{ color.yellow, color.green, color.blue, color.red }, { color.yellow, color.blue, color.red, color.green }, { color.yellow, color.red, color.green, color.blue }, { color.blue, color.yellow, color.red, color.green },
			{ color.green, color.blue, color.green, color.red }, { color.red, color.green, color.yellow, color.blue }, { color.blue, color.yellow, color.green, color.red }, { color.red, color.blue, color.yellow, color.green },
			{ color.green, color.red, color.yellow, color.blue } };

	public static direction[][] tileDirection = { { direction.out, direction.out, direction.right, direction.right }, { direction.in, direction.right, direction.left, direction.left }, { direction.left, direction.in, direction.left, direction.in },
			{ direction.out, direction.out, direction.out, direction.out }, { direction.in, direction.in, direction.left, direction.out }, { direction.right, direction.right, direction.left, direction.out }, { direction.in, direction.left, direction.left, direction.out },
			{ direction.in, direction.left, direction.in, direction.in }, { direction.left, direction.out, direction.left, direction.in }, { direction.right, direction.right, direction.in, direction.in }, { direction.right, direction.out, direction.right, direction.out },
			{ direction.left, direction.out, direction.in, direction.left }, { direction.left, direction.right, direction.in, direction.in }, { direction.right, direction.in, direction.right, direction.left }, { direction.left, direction.right, direction.out, direction.right },
			{ direction.left, direction.out, direction.right, direction.left } };

}