package com.cbs.phoenix.testcases;

import org.testng.annotations.Test;

import com.cbs.phoenix.pageobjects.AiringMoves_ReplacePage_27951;



	public class TC_AiringMoves_Replace_27951 extends BaseTest{
			private AiringMoves_ReplacePage_27951  MoveReplace_27951;	

			@Test
			public void TC_27951() {
				
				MoveReplace_27951 = new AiringMoves_ReplacePage_27951(getDriver());	
				
				MoveReplace_27951.replaceairing();
				
	}
	}	
	
