package com.test.Batch2Maven;

import org.testng.annotations.Test;

public class RunFrames extends Frames {
	@Test
	public void Run() {
		Frames frames=new Frames();
		frames.frames(driver);
		
	}
	

}
