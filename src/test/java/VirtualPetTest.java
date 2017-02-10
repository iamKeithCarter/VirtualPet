import org.junit.Assert;
import org.junit.Test;

public interface VirtualPetTest {

	
	
	@Test
	public void shouldGiveIncomeOf1MForThirdLetter() {
		VirtualPet underTest = new VirtualPet();// arrange
		String result = underTest.determineIncome("Michael", "Feathers", "xxauary");// act
		Assert.assertEquals("$1,000,000", result);
	}
	  
	
}
