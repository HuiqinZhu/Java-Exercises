
public enum language {    //public enum name{}
Hakka("mother language", 1),
Mandarin("official mother language", 2),
English("universal official language and it's so fashionable and easily interesting ", 3),	
Japanese("major in universsity and the grammar system is different", 4),
French("very interesting, novel and useful language", 5),
Spanish("one of the universal language and it seems to be very different", 6),
Arabian("better to know basic things about it and it is with very different culture", 7);   // , , , ;
	
private final String disc;    //private/public final String/int/boolean name;
private final int sequence;   //didn't initiate final attribute so that we need to initiate it in constructor


	language(String disc, int sequence){    //constructor is a must for obejct in enum, and why?
		this.disc = disc;
		this.sequence = sequence;
	}
	
	
	public String getDisc() {
		return disc;
	}
	
	public int getSequence() {
		return sequence;
	}
	
}
