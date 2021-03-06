/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:12:48 GMT 2018
 */

package uk.ac.sanger.artemis.components.filetree;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sshtools.j2ssh.io.ByteArrayReader;
import com.sshtools.j2ssh.io.UnsignedInteger32;
import com.sshtools.j2ssh.sftp.FileAttributes;
import java.awt.HeadlessException;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.util.Date;
import javax.swing.JProgressBar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.filetree.FileList;
import uk.ac.sanger.artemis.components.filetree.RemoteFileNode;
import uk.ac.sanger.artemis.j2ssh.FTProgress;
import uk.ac.sanger.artemis.j2ssh.SshFileManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RemoteFileNode_ESTest extends RemoteFileNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("/", "/", (FileList) null, "/", true);
      RemoteFileNode remoteFileNode1 = new RemoteFileNode(true);
      remoteFileNode0.setParentNode(remoteFileNode1);
      assertEquals("///", remoteFileNode0.getFullName());
      assertFalse(remoteFileNode1.isLeaf());
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode1.isExplored());
      assertEquals("//", remoteFileNode0.getPathName());
      assertFalse(remoteFileNode0.isLeaf());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileAttributes fileAttributes0 = new FileAttributes();
      UnsignedInteger32 unsignedInteger32_0 = new UnsignedInteger32(40960);
      fileAttributes0.setTimes(unsignedInteger32_0, unsignedInteger32_0);
      RemoteFileNode remoteFileNode0 = new RemoteFileNode((String) null, (String) null, (FileList) null, (String) null, fileAttributes0);
      assertFalse(remoteFileNode0.isDirectory());
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      remoteFileNode0.length();
      assertFalse(remoteFileNode0.isExplored());
      assertTrue(remoteFileNode0.isLeaf());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayReader byteArrayReader0 = new ByteArrayReader(byteArray0);
      FileAttributes fileAttributes0 = new FileAttributes(byteArrayReader0);
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("s3ivo<3Pm0ZUh!8|", "8sf>u59OE", (FileList) null, "8sf>u59OE", fileAttributes0);
      boolean boolean0 = remoteFileNode0.isLeaf();
      assertFalse(remoteFileNode0.isExplored());
      assertEquals("s3ivo<3Pm0ZUh!8|/8sf>u59OE", remoteFileNode0.getPathName());
      assertEquals("8sf>u59OE/8sf>u59OE", remoteFileNode0.getFullName());
      assertEquals("s3ivo<3Pm0ZUh!8|", remoteFileNode0.getRootDir());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      boolean boolean0 = remoteFileNode0.isDirectory();
      assertFalse(remoteFileNode0.isExplored());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("\u0003@uZW9", "l$k,^mTDm8K/n/<r", (FileList) null, "resources/jemboss.properties", true);
      String string0 = remoteFileNode0.getRootDir();
      assertFalse(remoteFileNode0.isExplored());
      assertEquals("\u0003@uZW9", string0);
      assertEquals("resources/jemboss.properties/l$k,^mTDm8K/n/<r", remoteFileNode0.getFullName());
      assertEquals("\u0003@uZW9/resources/jemboss.properties", remoteFileNode0.getPathName());
      assertTrue(remoteFileNode0.getAllowsChildren());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      remoteFileNode0.getPathName();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      remoteFileNode0.getModifiedTime();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("/", "/", (FileList) null, "/", true);
      String string0 = remoteFileNode0.getFullName();
      assertEquals("///", string0);
      assertFalse(remoteFileNode0.isLeaf());
      assertFalse(remoteFileNode0.isExplored());
      assertEquals("//", remoteFileNode0.getPathName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      remoteFileNode0.getFile();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.isLeaf());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      boolean boolean0 = remoteFileNode0.getAllowsChildren();
      assertTrue(boolean0);
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      // Undeclared exception!
      try { 
        remoteFileNode0.stat();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      MockFile mockFile0 = new MockFile("htsjdk.samtools.SAMSequenceRecord", "htsjdk.samtools.SAMSequenceRecord");
      JProgressBar jProgressBar0 = new JProgressBar(43, 43);
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, "/");
      // Undeclared exception!
      try { 
        remoteFileNode0.put("/", (File) mockFile0, fTProgress0, true);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      // Undeclared exception!
      try { 
        remoteFileNode0.isDataFlavorSupported((DataFlavor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.RemoteFileNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      // Undeclared exception!
      try { 
        remoteFileNode0.getTransferData((DataFlavor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.RemoteFileNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileAttributes fileAttributes0 = new FileAttributes();
      RemoteFileNode remoteFileNode0 = new RemoteFileNode((String) null, (String) null, (FileList) null, (String) null, fileAttributes0);
      // Undeclared exception!
      try { 
        remoteFileNode0.getServerName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileList fileList0 = new FileList((SshFileManager) null);
      RemoteFileNode remoteFileNode0 = null;
      try {
        remoteFileNode0 = new RemoteFileNode("", "", fileList0, "g4Yd", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      boolean boolean0 = remoteFileNode0.isDirectory();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      DataFlavor dataFlavor0 = new DataFlavor();
      try { 
        remoteFileNode0.getTransferData(dataFlavor0);
        fail("Expecting exception: UnsupportedFlavorException");
      
      } catch(UnsupportedFlavorException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.RemoteFileNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      RemoteFileNode remoteFileNode1 = (RemoteFileNode)remoteFileNode0.getTransferData(remoteFileNode0.REMOTEFILENODE);
      assertFalse(remoteFileNode1.isExplored());
      assertTrue(remoteFileNode1.isLeaf());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      boolean boolean0 = remoteFileNode0.isDataFlavorSupported(remoteFileNode0.REMOTEFILENODE);
      assertFalse(remoteFileNode0.isExplored());
      assertTrue(boolean0);
      assertFalse(remoteFileNode0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      JProgressBar jProgressBar0 = new JProgressBar();
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, (String) null);
      // Undeclared exception!
      try { 
        remoteFileNode0.put((File) null, fTProgress0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      Object[] objectArray0 = remoteFileNode0.getChildren();
      assertNotNull(objectArray0);
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileAttributes fileAttributes0 = new FileAttributes();
      RemoteFileNode remoteFileNode0 = new RemoteFileNode((String) null, (String) null, (FileList) null, (String) null, fileAttributes0);
      Object[] objectArray0 = remoteFileNode0.getChildren();
      assertFalse(remoteFileNode0.isExplored());
      assertNull(objectArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("/", "/", (FileList) null, "/", true);
      // Undeclared exception!
      try { 
        remoteFileNode0.getChildren();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("ac/KN6A[", "ac/KN6A[", (FileList) null, "ac/KN6A[", true);
      String string0 = remoteFileNode0.getServerName();
      assertFalse(remoteFileNode0.isExplored());
      assertEquals("ac/KN6A[/ac/KN6A[/ac/KN6A[", string0);
      assertTrue(remoteFileNode0.getAllowsChildren());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("/", "/", (FileList) null, "/", true);
      DataFlavor dataFlavor0 = DataFlavor.stringFlavor;
      Object object0 = remoteFileNode0.getTransferData(dataFlavor0);
      assertEquals("///", remoteFileNode0.getFullName());
      assertEquals("///", object0);
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.isLeaf());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      boolean boolean0 = remoteFileNode0.isLeaf();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileList fileList0 = new FileList((SshFileManager) null);
      FileAttributes fileAttributes0 = new FileAttributes();
      RemoteFileNode remoteFileNode0 = null;
      try {
        remoteFileNode0 = new RemoteFileNode("session", "", fileList0, "HHRo~%({1", fileAttributes0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("g4Yd/./.", "g4Yd/./.", (FileList) null, "Mfl/.", false);
      assertEquals("g4Yd/././Mfl/", remoteFileNode0.getPathName());
      assertEquals("g4Yd/./.", remoteFileNode0.getRootDir());
      assertFalse(remoteFileNode0.isDirectory());
      assertEquals("Mfl//g4Yd/./.", remoteFileNode0.getFullName());
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileAttributes fileAttributes0 = new FileAttributes();
      RemoteFileNode remoteFileNode0 = new RemoteFileNode((String) null, (String) null, (FileList) null, (String) null, fileAttributes0);
      boolean boolean0 = remoteFileNode0.isExplored();
      assertFalse(boolean0);
      assertTrue(remoteFileNode0.isLeaf());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      JProgressBar jProgressBar0 = new JProgressBar(1);
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, (String) null);
      // Undeclared exception!
      try { 
        remoteFileNode0.put((File) null, fTProgress0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileAttributes fileAttributes0 = new FileAttributes();
      RemoteFileNode remoteFileNode0 = new RemoteFileNode((String) null, (String) null, (FileList) null, (String) null, fileAttributes0);
      remoteFileNode0.getRootDir();
      assertFalse(remoteFileNode0.isDirectory());
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      JProgressBar jProgressBar0 = new JProgressBar();
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, "The channel is closed [");
      // Undeclared exception!
      try { 
        remoteFileNode0.getFileContents(fTProgress0, "The channel is closed [");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("xK7h?+~A<f", "xK7h?+~A<f", (FileList) null, "", true);
      // Undeclared exception!
      try { 
        remoteFileNode0.delete();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      // Undeclared exception!
      try { 
        remoteFileNode0.mkdir("htsjdk.variant.vcf.VCFHeader$HEADER_FIELDS");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      remoteFileNode0.getFullName();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      boolean boolean0 = remoteFileNode0.getAllowsChildren();
      assertFalse(boolean0);
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      remoteFileNode0.getTransferDataFlavors();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.getAllowsChildren());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      remoteFileNode0.reset();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.getAllowsChildren());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("session/", "session/", (FileList) null, "session/", true);
      String string0 = remoteFileNode0.getPathName();
      assertEquals("session//session/", remoteFileNode0.getFullName());
      assertFalse(remoteFileNode0.isLeaf());
      assertEquals("session/session/", string0);
      assertFalse(remoteFileNode0.isExplored());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileAttributes fileAttributes0 = new FileAttributes();
      RemoteFileNode remoteFileNode0 = new RemoteFileNode((String) null, (String) null, (FileList) null, (String) null, fileAttributes0);
      remoteFileNode0.length();
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      JProgressBar jProgressBar0 = new JProgressBar();
      FTProgress fTProgress0 = new FTProgress(jProgressBar0, "S.~.}");
      // Undeclared exception!
      try { 
        remoteFileNode0.getFileContents(fTProgress0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(true);
      remoteFileNode0.getParentNode();
      assertFalse(remoteFileNode0.isExplored());
      assertTrue(remoteFileNode0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode(false);
      // Undeclared exception!
      try { 
        remoteFileNode0.rename((String) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileAttributes fileAttributes0 = new FileAttributes();
      RemoteFileNode remoteFileNode0 = new RemoteFileNode((String) null, (String) null, (FileList) null, (String) null, fileAttributes0);
      Date date0 = remoteFileNode0.getModifiedTime();
      assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
      assertFalse(remoteFileNode0.isExplored());
      assertFalse(remoteFileNode0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RemoteFileNode remoteFileNode0 = new RemoteFileNode("xK7h?+~A<f", "xK7h?+~A<f", (FileList) null, "", true);
      remoteFileNode0.getFile();
      assertEquals("xK7h?+~A<f", remoteFileNode0.getRootDir());
      assertEquals("xK7h?+~A<f/", remoteFileNode0.getPathName());
      assertFalse(remoteFileNode0.isExplored());
      assertEquals("/xK7h?+~A<f", remoteFileNode0.getFullName());
      assertTrue(remoteFileNode0.isDirectory());
  }
}
