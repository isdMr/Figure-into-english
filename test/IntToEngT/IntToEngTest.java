package IntToEngT;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

		@Test
		public void 入力値1のとき() {
			IntToEng sn=new IntToEng();
			String expected =" ";
			String actual=sn.capitalize(" ");
			assertThat(actual,is(expected));
		}
}
