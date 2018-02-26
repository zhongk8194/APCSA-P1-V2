//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		roman = str;
	}

	public RomanNumeral(Integer orig)
	{
		number = orig;
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;

	}

	public Integer getNumber()
	{
		number = 0;
		while (roman != "")
		{
			for (int i = 0; i < LETTERS.length; i++)
			{
				if (roman.indexOf(LETTERS[i]) == 0)
				{
					number += NUMBERS[i];
					if (LETTERS[i].length() == 1)
					{
						if (roman.length() == 1)
						{
							roman = "";
						}
						else						
							roman = roman.substring(1);
					}
					else if (LETTERS[i].length() == 2)
					{
						if (roman.length() == 2)
						{
							roman = "";
						}
						else						
							roman = roman.substring(2);
					}
					
				}
				
			}
		}
		return number;
	}

	public String toString()
	{
		roman = "";
		
		while (number != 0)
		{
			int count = 0;
			for (int i = 0; NUMBERS[i] > number; i++)
			{
				count ++;
			}
			
			roman += LETTERS[count];
			number -= NUMBERS[count];
			
		}
		return roman + "\n";
	}
}