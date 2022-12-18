# Bugs found

1. Program doesn't count vowels with accent or in UpperCase;
- In UTF-8 we use some chars with accent, some of these accents are in vowels, they still a vowel even with accent; EX.: á, à, ã, â, etc
- We could use a ReGex like "[aeiouAEIOUáàâãéèêíïóôõöúÁÀÂÃÉÈÍÏÓÔÕÖÚ]" or implement '.toLowerCase()' and use a smaller ReGex like "[aeiouáàâãéèêíïóôõöú]"
2. AC "I should be able to add up to 4 strings at once" not fulfilled(Program returns null and a message);
- When inserting 4 args, program return null
3. AC "I should see the number of vowels and consonant for each string in the order they are keyed in" not fulfilled(Program only return vowels but not consonants); *Before I implemented*
4. 