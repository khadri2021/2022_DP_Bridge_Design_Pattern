package com.khadri.dp.main;

import com.khadri.dp.genaration.SixthGen;
import com.khadri.dp.phone.AndriodPhone;
import com.khadri.dp.phone.Phone;

public class TestBridgePattern {

	public static void main(String[] args) {

		Phone phone = new AndriodPhone(new SixthGen());

		phone.dataSpeed();
	}
}
