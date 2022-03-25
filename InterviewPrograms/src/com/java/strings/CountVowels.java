package com.java.strings;

/*
 * 	Count the Vowels
 * ------------------
 * 
 * A vowel is a syllabic speech sound pronounced 
 * without any stricture in the vocal tract. 
 * Vowels are one of the two principal classes of 
 * speech sounds, the other being the consonant. 
 * Vowels vary in quality, in loudness and also in quantity.
 * 
 * The letters a, A, e, E, i, I, o, O, u and U are called vowels. 
 * The other letters in the alphabet are called consonants.
 * 
 * 
 * say the string is "Hello"
 * the vowels are {e, o}
 * Count is 2
 * 
 * say the string is "Tamil"
 * the vowels are {a, i}
 * Count is 2
 * 
 * say the string is "why"
 * there are no Vowels in this word
 * Count is 0
 * 
 * Words without vowels are
 * sky, spy, try, fly, lynch, myth, dry, why, sync, shy, ply, 
 * by, cry, crypt, fry, gym, psych, spy
 */

public class CountVowels extends countVow {
	public static void main(String[] args) 
	{
//		String line = "Java Interview Programs";
		// String line = "Hello World!";
		String line = "Rhythm";
		System.out.println("Given String is :"+line);
		line = line.toLowerCase();
		countVow c = new CountVowels();
		c.count(line);	
	}
	@Override
	int count(String line) 
	{
		System.out.println("Number of Vowels are :"+count);	
		return 0;
	}
}

//extract class
abstract class countVow 
{
		static int count = 0;
		abstract  int count(String line);
}
class a extends countVow
{
	@Override
	public  int count(String line)
	{
		return count++;  // refactored with Replace conditional with polymorphism
	}
}
class e extends countVow
{
	@Override
	public  int  count(String line)
	{
		return count++;  // refactored with Replace conditional with polymorphism
	}
}
class i extends countVow
{
	@Override
	public  int count(String line)
	{
		return count++; // refactored with Replace conditional with polymorphism
	}
}
class o extends countVow
{
	@Override
	public  int count(String line)
	{
		return count++;  // refactored with Replace conditional with polymorphism
	}
}
class u extends countVow
{
	@Override
	public  int count(String line)
	{
		return count++;  // refactored with Replace conditional with polymorphism
	}
}
/*
	OUTPUT
	Given String is :Java Interview Programs
	Number of Vowels are :8
	
	Given String is :Hello World!
	Number of Vowels are :3

	Given String is :Rhythm
	Number of Vowels are :0
*/