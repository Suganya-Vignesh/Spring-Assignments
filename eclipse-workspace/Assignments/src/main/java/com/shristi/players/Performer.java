package com.shristi.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	
	@Autowired
	@Qualifier("violin")
	private IInstrument v;
	
	@Autowired
	private IInstrument guitar;
	
	private IInstrument k;
	
	public Performer(@Qualifier("keyboard")IInstrument k) {
		super();
		this.k = k;
	}

	void playSong(String type, String song) {
		switch(type) {
		case("v"):
			v.play(song);
			break;
		case("guitar"):
			guitar.play(song);
			break;
		case("k"):
			k.play(song);
			break;
		default:
			System.out.println("invalid choice");
			
		}
	}
	
}
