package com.whelanlabs.puzzle;

import java.util.ArrayList;
import java.util.Arrays;

import com.whelanlabs.puzzle.TileData.c;
import com.whelanlabs.puzzle.TileData.d;

public class Solver {

	static Integer count = 0;
	static boolean firstAnswer = true;
	static Integer sideLength = 4;

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		ArrayList<Tile> pool = new ArrayList<Tile>(Arrays.asList(new Tile(1), new Tile(2), new Tile(3), new Tile(4),
				new Tile(5), new Tile(6), new Tile(7), new Tile(8), new Tile(9), new Tile(10), new Tile(11),
				new Tile(12), new Tile(13), new Tile(14), new Tile(15), new Tile(16)));
		ArrayList<Tile> sequence = new ArrayList<Tile>();

		System.out.println("Solutions:");
		checkAndExpand(pool, sequence);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime); // divide by 1000000 to get milliseconds.
		System.out.println("\n\n" + "duration = " + duration / 1000000 + "ms");
	}

	@SuppressWarnings("unchecked")
	public static void checkAndExpand(ArrayList<Tile> pool, ArrayList<Tile> sequence) {
		// check to see if the existing sequence is valid
		if (sequence.size() > 1) {
			if (!isValid(sequence)) {
				return;
			} else if (0 == pool.size()) {
				if (!firstAnswer) {
					System.out.println(",");
				} else {
					firstAnswer = false;
				}
				System.out.print(sequence);
				return;
			}
		}

		// expand
		if (pool.size() > 0) {
			for (Tile i : pool) {
				ArrayList<Tile> subpool = new ArrayList<Tile>();
				subpool = (ArrayList<Tile>) pool.clone();
				subpool.remove(i);

				// for each rotation
				for (int j = 0; j < 4; j++) {
					ArrayList<Tile> subsequence = (ArrayList<Tile>) sequence.clone();
					subsequence.add(new Tile(i.getId(), j));
					checkAndExpand(subpool, subsequence);
				}
			}
		}
	}

	private static boolean isValid(ArrayList<Tile> sequence) {
		int size = sequence.size();
		int position = size - 1;
		if (size > sideLength) {
			if (!colorMatch(sequence.get(position - sideLength).getBottomColor(),
					sequence.get(position).getTopColor())) {
				return false;
			}
			if (!directionMatch(sequence.get(position - sideLength).getBottomDirection(),
					sequence.get(position).getTopDirection())) {
				return false;
			}
		}
		if ((size - 1) % sideLength != 0) {
			if (!colorMatch(sequence.get(size - 2).getRightColor(), sequence.get(size - 1).getLeftColor())) {
				return false;
			}
			if (!directionMatch(sequence.get(size - 2).getRightDirection(),
					sequence.get(size - 1).getLeftDirection())) {
				return false;
			}
		}
		return true;
	}

	private static boolean directionMatch(d d1, d d2) {
		if (d1 == TileData.d.i && d2 == TileData.d.o) {
			return true;
		}
		if (d1 == TileData.d.l && d2 == TileData.d.r) {
			return true;
		}
		if (d1 == TileData.d.o && d2 == TileData.d.i) {
			return true;
		}
		if (d1 == TileData.d.r && d2 == TileData.d.l) {
			return true;
		}
		return false;
	}

	private static boolean colorMatch(c c1, c c2) {
		return c1 == c2;
	}

}