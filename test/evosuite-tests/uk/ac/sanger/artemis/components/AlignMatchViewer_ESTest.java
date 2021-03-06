/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 11:11:16 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.AlignMatchVector;
import uk.ac.sanger.artemis.components.AlignMatchViewer;
import uk.ac.sanger.artemis.components.AlignmentViewer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AlignMatchViewer_ESTest extends AlignMatchViewer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AlignMatchVector alignMatchVector0 = new AlignMatchVector();
      AlignMatchViewer alignMatchViewer0 = null;
      try {
        alignMatchViewer0 = new AlignMatchViewer((AlignmentViewer) null, alignMatchVector0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
