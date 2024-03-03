package com.mycompany.app.Week2_Code2.Interfaces;

class StringMixerAdapter implements Hadd1 {
	public String name() { return "StringMixerAdapter"; }
	InterfacesEx11_backup stringMixer;
	public StringMixerAdapter(InterfacesEx11_backup stringMixer) {
		this.stringMixer = stringMixer;
	}
	public String process(Object input) {
		return stringMixer.process((String)input);
	}	
}

public class InterfacesEx11 {
	public static void main(String[] args) {
		String s = new String(args[0]);
		Apply.process(new StringMixerAdapter(new InterfacesEx11_backup()), s);
	}
}