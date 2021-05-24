package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public static void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		byte f;
		f=b;
		System.out.print(b&1);
		// Shift b seven bits to the right
		b=(byte)(b>>7);
		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1
		b=(byte)(b&1);
		// Print the result using System.out.print (NOT System.out.println)
		System.out.print(b);
		//Use this method to print the remaining 7 bits of b 
		f=(byte)((b&2)>>1);
		System.out.print(f);
		f=(byte)((b&4)>>2);
		System.out.print(f);
		f=(byte)((b&8)>>3);
		System.out.print(b);
		f=(byte)((b&16)>>4);
		System.out.print(b);
		f=(byte)((b&32)>>5);
		System.out.print(f);
		f=(byte)((b&64)>>6);
		System.out.print(f);
	}
	
	public static void printShortBinary(short s) {
		// Create 2 byte variables
		byte t;
		byte b;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		t = (byte)(s>>8);
		b = (byte)(s&0b00001111);
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(t);
		printByteBinary(b);
	}
	
	public static void printIntBinary(int i) {
		// Create 2 short variables
		 short e;
		 short f;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		e = (short)(i>>16);
		f = (short)(i&0b00000000000000001111111111111111);
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printShortBinary(e);
		printShortBinary(f);
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
	}
	
	public static void main(String[] args) {
		// Test your methods here
		 short s = 1;
		 byte c = 1;
		 int i = 1;
		 printIntBinary(i);
		 
	}
}
