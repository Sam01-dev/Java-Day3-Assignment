package com.VowelAndConsonant;

public class VowelAndConsonant {
	
	
	
	void fun1(int c) {
		
		
			if(c=='a'|| c=='e'|| c=='i' || c=='o' || c=='u' || c=='A' || c=='E'|| c=='I' || c=='O' || c=='U' )
			{
				System.out.println("Vowel");
			}
			else if((c>=65 && c<=90) || (c>=97 && c<=122)) {
				System.out.println("Consonant");
			}
			else {
				System.out.println("Invalid Character");
			}
		
	}
	public static void main(String[] args) {
		
		VowelAndConsonant V = new VowelAndConsonant();
		
		V.fun1('.');

	}

}
