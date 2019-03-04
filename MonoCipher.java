
public class MonoCipher {
	/**
	 * Programming AE2
	 * Contains monoalphabetic cipher and methods to encode and decode a character.
	 */
		/** The size of the alphabet. */
		private final int SIZE = 26;

		/** The alphabet. */
		private char [] alphabet;
		
		/** The cipher array. */
		private char [] cipher;

		/**
		 * Instantiates a new mono cipher.
		 * @param keyword the cipher keyword
		 */
		public MonoCipher(String keyword)
		{
			//create alphabet
			alphabet = new char [SIZE];
			for (int i = 0; i < SIZE; i++)
				alphabet[i] = (char)('A' + i);
			
			//create cipher alphabet 
			cipher = new char [SIZE]; 
			for (int i = 0; i < keyword.length(); i++)
				cipher[i] = keyword.charAt(i);
			
			
			//remaining alphabet backwards
			int count = 0; 
			for(int i = keyword.length(); i < SIZE + count; i++)
			{ 	if(keyword.indexOf('Z'- i) == -1); 
			cipher[i]= (char)('Z'- i);	
				if(('Z'-1) != keyword.charAt(i))
					{ count++; 
					}
				else{
					cipher[i] = ' ';
	                //count++
				}
				
	                
				}
				
			}
		
		public static void main(String [] args) {
			MonoCipher m = new MonoCipher("MONDAY");  
		}
}
				// if Z-i is not in the keyword
				// print z-i-count
				// else
				// count++
				
				


