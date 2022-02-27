package com.whelanlabs.puzzle;

public class Tile {

	private Integer _id;
	private Integer _rotation;

	public Tile(Integer id) {
		this(id, 0);
	}
	
	public Tile(Integer id, Integer rotation) {
		_id = id;
		_rotation = rotation;
	}
	
	public String toString() {
	      return _id.toString() + "[" + _rotation + "]";
	}
	
	public Integer getId() {
		return _id;
	}

	public TileData.color getRightColor() {
		Integer pos = (_rotation +1) % 4;
		return TileData.tileColor[_id-1][pos];
	}

	public TileData.color getLeftColor() {
		Integer pos = (_rotation +3) % 4;
		return TileData.tileColor[_id-1][pos];
	}

	public TileData.color getTopColor() {
		Integer pos = (_rotation +0) % 4;
		return TileData.tileColor[_id-1][pos];
	}

	public TileData.color getBottomColor() {
		Integer pos = (_rotation +2) % 4;
		return TileData.tileColor[_id-1][pos];
	}
	
	public TileData.direction getRightDirection() {
		Integer pos = (_rotation +1) % 4;
		return TileData.tileDirection[_id-1][pos];
	}

	public TileData.direction getLeftDirection() {
		Integer pos = (_rotation +3) % 4;
		return TileData.tileDirection[_id-1][pos];
	}

	public TileData.direction getTopDirection() {
		Integer pos = (_rotation +0) % 4;
		return TileData.tileDirection[_id-1][pos];
	}

	public TileData.direction getBottomDirection() {
		Integer pos = (_rotation +2) % 4;
		return TileData.tileDirection[_id-1][pos];
	}
	
}