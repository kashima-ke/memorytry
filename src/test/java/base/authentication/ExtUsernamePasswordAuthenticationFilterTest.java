//package base.authentication;
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//
//import java.lang.reflect.InvocationTargetException;
//
//import org.junit.Test;
//
//public class ExtUsernamePasswordAuthenticationFilterTest {
//
//	@Test
//	public void test() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException,
//			NoSuchMethodException, SecurityException {
//		ExtUsernamePasswordAuthenticationFilter filter = new ExtUsernamePasswordAuthenticationFilter(null);
//		boolean result = filter.isQuestionFailure(1, 1);
//		assertFalse(result);
//
//		result = filter.isQuestionFailure(1, 2);
//		assertTrue(result);
//	}
//}
