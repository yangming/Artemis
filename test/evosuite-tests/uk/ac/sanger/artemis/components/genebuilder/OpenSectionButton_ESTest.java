/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:34:14 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JComponent;
import javax.swing.JToolBar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.genebuilder.OpenSectionButton;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OpenSectionButton_ESTest extends OpenSectionButton_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OpenSectionButton openSectionButton0 = new OpenSectionButton("JPM2*}@t<3D\nrC]", (JComponent) null);
      // Undeclared exception!
      try { 
        openSectionButton0.setOpen(false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.OpenSectionButton", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JToolBar jToolBar0 = new JToolBar("", 0);
      OpenSectionButton openSectionButton0 = new OpenSectionButton("", jToolBar0);
      openSectionButton0.doClick();
      openSectionButton0.setOpen(true);
      assertTrue(openSectionButton0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JToolBar jToolBar0 = new JToolBar("", 0);
      OpenSectionButton openSectionButton0 = new OpenSectionButton("", jToolBar0);
      openSectionButton0.setOpen(true);
      openSectionButton0.setOpen(false);
      assertFalse(openSectionButton0.getIgnoreRepaint());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JToolBar jToolBar0 = new JToolBar("", 0);
      OpenSectionButton openSectionButton0 = new OpenSectionButton("", jToolBar0);
      openSectionButton0.doClick();
      openSectionButton0.setOpen(false);
      openSectionButton0.setOpen(false);
      assertFalse(openSectionButton0.isFocusTraversalPolicySet());
  }
}
