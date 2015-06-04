package gradle;

import org.junit.Assert;
import org.junit.Test;

/**
 * StringUtilTest.java 
 * 
 * Universidade Federal do Rio Grande do Norte
 * Superintendencia de Informatica
 * 
 * <p></p>
 * 
 * @author Jadson Santos - jadson@info.ufrn.br
 * @version 1.0
 * @since 01/06/2015
 * 
 * <p><i>This program is distributed without any warranty and it
 * can be freely redistributed for research, classes or private studies, 
 * since the copyright notices are not removed.</i></p>
 */
public class StringUtilTest {

	/**
	 * Test method for {@link gradle.lps.StringUtil#isEmpty(java.lang.String)}.
	 */
	@Test
	public void testIsEmpty() {
		Assert.assertTrue(StringUtil.isEmpty(" "));
	}

}
