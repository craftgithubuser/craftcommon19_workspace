package com.exersicethree;

public class Printer {

	
	private int tonerlevel;
	private int pagesprinted;
	private boolean duplex;
	
	// Encapsulation
	
	public Printer(int tonerlevel, boolean duplex) {
		if(tonerlevel >-1 && tonerlevel<= 100 ) {
			this.tonerlevel = tonerlevel;
		}
		else {
			this.tonerlevel =-1;
		}
		this.duplex = duplex;
		this.pagesprinted =0;
		
	}
	
//	Add toner
	public int addtoner(int tonerAmout) {
		if (tonerAmout >0 && tonerAmout<= 100) {
			if(this.tonerlevel + tonerAmout >100) {
				return -1;
			}
			this.tonerlevel += tonerAmout;
			return this.tonerlevel;
		}
		else {
				return -1;
			}
			
		}
	
//	Assuming this controls the of pages going through printer
	public int printpages(int pages) {
		int pagesToprint =pages;
		if(this.duplex) {
			pagesToprint =(pages/2)+(pages % 2);
			System.out.println("printing in duplex mode");
		}
		
		this .pagesprinted +=pagesToprint;
		return pagesToprint;
	}
	public int getpagesprinted() {
		return pagesprinted;
	}
}
