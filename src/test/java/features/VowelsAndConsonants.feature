Feature: Return the number os Vowel and Consonants in a Word

  Scenario Outline: Return the number of vowels and consonants for a given word
    Given I want to know the number of vowels and consonants in a given word
    When I enter the word <word>
    Then I must see <vowels> vowels and <consonants> consonants for this word
    Examples:
      | word      | vowels | consonants |
      | "Avocado" | 4      | 3          |
      | "Word"    | 1      | 3          |
      | "Cat"     | 1      | 2          |
      | "Coffee"  | 3      | 3          |
      | "Mug"     | 1      | 2          |

  Scenario Outline: Return the number of vowels and consonants for a given list of words
    Given I want to know the number of vowels and consonants in a given word
    When I enter a list of words <list>
    Then I must see <vowels> vowels and <consonants> consonants for this word
    Examples:
      |  |