package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Checks if only [ and ] bracket in a string returns true
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //Checks if left/right brackets with text between return true
    @Test
    public void bracketsWithTextBetweenReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //Checks if left bracket between text with right bracket after returns true
    @Test
    public void bracketsBetweenTextButMatchReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    //Checks if match before text returns true
    @Test
    public void leftRightBracketBeforeTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    //Checks if an empty string returns true
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //Checks if only [ in a string returns false
    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    //Checks if only ] in a string returns false
    @Test
    public void onlyRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    //Checks if ] and [ in a string returns false
    @Test
    public void insideOutBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //Checks if a match plus additional bracket returns false
    @Test
    public void matchedPlusOneReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void matchedPlusTwoReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

    //Checks if mixed characters with left bracket only returns false
    @Test
    public void mixedCharactersLeftBracketOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    //Checks if mixed characters with right bracket only returns false
    @Test
    public void mixedCharactersRightBracketOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code"));
    }

    //Checks if curly bracket paired with square returns false
    @Test
    public void curlyBracketMismatchReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("{]"));
    }

}
