package gradle;

/**
 * StringUtil.java 
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
public class StringUtil {
     
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isEmpty(String s){
		return s == null || s.trim().isEmpty();
	}
}
