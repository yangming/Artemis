/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:09:22 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.LocationLexer;
import uk.ac.sanger.artemis.io.LocationParseException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LocationParseException_ESTest extends LocationParseException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocationParseException locationParseException0 = null;
      try {
        locationParseException0 = new LocationParseException(" T%X*PD", (LocationLexer.TokenEnumeration) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.LocationParseException", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocationParseException locationParseException0 = new LocationParseException("java.lang.Character@0000000003java.lang.Integer@0000000004java.lang.String@0000000005java.lang.String@0000000006java.lang.String@0000000007java.lang.Integer@0000000008java.lang.String@0000000009", "java.lang.Character@0000000003java.lang.Integer@0000000004java.lang.String@0000000005java.lang.String@0000000006java.lang.String@0000000007java.lang.Integer@0000000008java.lang.String@0000000009");
      assertEquals(0, locationParseException0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocationLexer locationLexer0 = new LocationLexer("1O");
      LocationLexer.TokenEnumeration locationLexer_TokenEnumeration0 = locationLexer0.new TokenEnumeration(",5[zhNsu8!8pMgn");
      LocationParseException locationParseException0 = new LocationParseException(",5[zhNsu8!8pMgn", locationLexer_TokenEnumeration0);
      assertEquals(0, locationParseException0.getLineNumber());
  }
}
