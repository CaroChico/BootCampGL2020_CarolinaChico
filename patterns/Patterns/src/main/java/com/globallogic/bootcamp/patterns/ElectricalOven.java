package com.globallogic.bootcamp.patterns;

public class ElectricalOven extends ElectricalAppliances {

	LedAppliance l1;

	public void TurnLed() {

		power = power - 100;

	}

	@Override

	public void TurnOn() {

		power = power - 75;

	}

}
