package com.khadri.dp.phone;

import com.khadri.dp.genaration.GenType;

public class AndriodPhone extends Phone {

	public AndriodPhone(GenType genType) {
		super(genType);
	}

	@Override
	public void dataSpeed() {
		super.genType.dataSpeed();
	}
}
