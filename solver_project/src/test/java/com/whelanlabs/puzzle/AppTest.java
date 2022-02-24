package com.whelanlabs.puzzle;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	for(int i = 1; i <17; i++) {
    		Tile tile = new Tile(i, 2);
    		System.out.println(i + ".leftColor = " + tile.getLeftColor());
    		
    	}
        assertTrue( true );
    }
}
