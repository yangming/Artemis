/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:59:38 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.plot.CodonUsageWeight;
import uk.ac.sanger.artemis.sequence.Strand;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodonWeight_ESTest extends CodonWeight_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      CodonUsageWeight codonUsageWeight0 = null;
      try {
        codonUsageWeight0 = new CodonUsageWeight(mockFile0, (Strand) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.CodonUsageWeight", e);
      }
  }
}
