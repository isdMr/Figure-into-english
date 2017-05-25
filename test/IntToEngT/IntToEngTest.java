package IntToEngT;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

@Test
public void 入力値3のとき() {
IntToEng sn=new IntToEng();
String expected ="three";
String actual=sn.translateEng(3);
assertThat(actual,is(expected));
}
@Test
public void 入力値21のとき() {
IntToEng sn=new IntToEng();
String expected ="twenty one";
String actual=sn.translateEng(21);
assertThat(actual,is(expected));
}
@Test
public void 入力値11のとき() {
IntToEng sn=new IntToEng();
String expected ="eleven";
String actual=sn.translateEng(11);
assertThat(actual,is(expected));
}
@Test
public void 入力値16のとき() {
IntToEng sn=new IntToEng();
String expected ="sixteen";
String actual=sn.translateEng(16);
assertThat(actual,is(expected));
}

@Test
public void 入力値100のとき() {
IntToEng sn=new IntToEng();
String expected ="one hundred ";
String actual=sn.translateEng(100);
assertThat(actual,is(expected));
}

@Test
public void 入力値235のとき() {
IntToEng sn=new IntToEng();
String expected ="two hundred thirty five"
;
String actual=sn.translateEng(235);
assertThat(actual,is(expected));
}
}

