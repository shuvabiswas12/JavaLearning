package com.shuvabiswas.program3;

import com.shuvabiswas.program3.InterfacesGroups.area;
import com.shuvabiswas.program3.InterfacesGroups.draw;

public class InterfacesGroups {

	public interface draw {}
	
	protected interface area {}
	
	private interface calculator {}

}

class OurClass implements draw, area {
	
}