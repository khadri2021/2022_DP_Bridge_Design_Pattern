package com.khadri.dp.phone;

import com.khadri.dp.genaration.GenType;

public abstract class Phone {

	GenType genType;

	Phone(GenType genType) {
		this.genType = genType;
	}
	
	public abstract void dataSpeed();
}
