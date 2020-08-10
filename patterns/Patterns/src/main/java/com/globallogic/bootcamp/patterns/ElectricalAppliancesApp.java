package com.globallogic.bootcamp.patterns;

public class ElectricalAppliancesApp {

	public static void main(String[] args) {

		ElectricalOven e1 = new ElectricalOven();
		System.out.println(e1.power);

		e1.TurnOn();
		System.out.println(e1.power);

		e1.TurnLed();
		System.out.println(e1.power);

	}

}
