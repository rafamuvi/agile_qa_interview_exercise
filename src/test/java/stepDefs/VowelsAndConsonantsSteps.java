package stepDefs;

import com.exercise.ConsonantCounter;
import com.exercise.CountResultRecord;
import com.exercise.Counter;
import com.exercise.VowelCounter;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class VowelsAndConsonantsSteps {

    protected VowelCounter vowelCounter;
    protected ConsonantCounter consonantsCounter;
    protected Counter counter;
    protected List<CountResultRecord> result;
    protected Scenario scenario;

    @Given("I want to know the number of vowels and consonants in a given word")
    public void i_want_to_know_the_number_of_vowels_and_consonants_in_a_given_word() {
        List<CountResultRecord> expectedResult = List.of(
                new CountResultRecord(scenario.getId(), 1, 1));
        System.out.println(expectedResult);
    }

    @When("I enter the word {string}")
    public void i_enter_the_word(String string) {
        String[] words = new String[]{string};
        result = counter.countNumberOfConsonantsAndVowelsForEachWordInList(words);
    }

    @Then("I must see {int} vowels and {int} consonants for this word")
    public void i_must_see_vowels_and_consonants_for_this_word(Integer int1, Integer int2) {
        System.out.println(result);
    }
}
