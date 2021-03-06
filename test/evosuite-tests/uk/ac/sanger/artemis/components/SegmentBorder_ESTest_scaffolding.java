/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 12 13:07:59 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SegmentBorder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.SegmentBorder"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/London"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SegmentBorder_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.batik.dom.util.SAXIOException",
      "org.apache.batik.dom.AbstractChildNode",
      "org.apache.batik.dom.AbstractParentNode$ChildNodes",
      "org.apache.batik.dom.ExtendedNode",
      "org.apache.batik.i18n.Localizable",
      "org.apache.batik.i18n.LocalizableSupport",
      "org.apache.batik.svggen.DefaultImageHandler",
      "org.apache.batik.dom.util.HashTable",
      "org.apache.batik.dom.util.DocumentFactory",
      "org.apache.batik.svggen.SVGRectangle",
      "org.apache.batik.dom.AbstractText",
      "org.apache.batik.dom.AbstractAttrNS",
      "org.apache.batik.svggen.SVGColor",
      "org.apache.batik.dom.AbstractParentChildNode",
      "org.apache.batik.util.SVGConstants",
      "org.apache.batik.svggen.SVGCustomBufferedImageOp",
      "org.apache.batik.svggen.SVGRenderingHints",
      "org.apache.batik.svggen.SVGAttribute",
      "org.apache.batik.svggen.SVGTexturePaint",
      "org.apache.batik.dom.AbstractElement$NamedNodeHashMap",
      "org.apache.batik.dom.events.DocumentEventSupport$KeyboardEventFactory",
      "org.apache.batik.dom.GenericDOMImplementation",
      "org.apache.batik.dom.xbl.XBLManagerData",
      "org.apache.batik.dom.util.SAXDocumentFactory",
      "org.apache.batik.svggen.AbstractSVGConverter",
      "org.apache.batik.dom.AbstractDocument$IdSoftRef",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.batik.svggen.DefaultExtensionHandler",
      "org.apache.batik.dom.AbstractEntity",
      "org.apache.batik.dom.GenericDocumentType",
      "org.apache.batik.util.CleanerThread$ReferenceCleared",
      "org.apache.batik.svggen.SVGCustomPaint",
      "org.apache.batik.dom.GenericAttr",
      "org.apache.batik.svggen.SVGAttributeMap",
      "org.apache.batik.svggen.SVGGeneratorContext$GraphicContextDefaults",
      "org.emboss.jemboss.JembossParams",
      "org.apache.batik.svggen.CachedImageHandler",
      "org.apache.batik.dom.AbstractNode$1",
      "org.apache.batik.util.CleanerThread",
      "org.apache.batik.dom.AbstractAttr",
      "org.apache.batik.svggen.SVGBasicStroke",
      "org.apache.batik.dom.AbstractCharacterData",
      "org.apache.batik.dom.AbstractElementNS",
      "org.apache.batik.xml.XMLUtilities",
      "org.apache.batik.ext.awt.g2d.TransformStackElement",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "org.apache.batik.dom.AbstractParentNode$ElementsByTagName",
      "org.apache.batik.svggen.DOMGroupManager",
      "org.apache.batik.dom.AbstractNode",
      "org.emboss.jemboss.gui.Browser$3",
      "org.apache.batik.svggen.SVGCompositeDescriptor",
      "org.emboss.jemboss.gui.Browser$4",
      "org.emboss.jemboss.gui.MemoryComboBox",
      "org.apache.batik.svggen.SVGConverter",
      "org.apache.batik.svggen.SVGIDGenerator",
      "org.emboss.jemboss.gui.Browser$6",
      "org.apache.batik.svggen.SVGHintsDescriptor",
      "org.apache.batik.svggen.SimpleImageHandler",
      "org.apache.batik.svggen.ErrorHandler",
      "org.apache.batik.svggen.SVGLine",
      "org.emboss.jemboss.gui.Browser",
      "org.apache.batik.dom.AbstractComment",
      "org.apache.batik.i18n.LocaleGroup",
      "org.apache.batik.dom.events.DocumentEventSupport$CustomEventFactory",
      "org.emboss.jemboss.gui.Browser$JIconButton",
      "org.apache.batik.xml.XMLCharacters",
      "org.apache.batik.dom.events.DocumentEventSupport$EventFactory",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "org.apache.batik.svggen.ErrorConstants",
      "org.apache.batik.svggen.SVGConvolveOp",
      "org.apache.batik.dom.events.EventSupport",
      "org.apache.batik.svggen.SVGPath",
      "org.apache.batik.dom.xbl.NodeXBL",
      "org.apache.batik.dom.AbstractDocument",
      "org.apache.batik.ext.awt.g2d.GraphicContext",
      "org.apache.batik.svggen.SVGFontDescriptor",
      "org.apache.batik.svggen.SVGAlphaComposite",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$5",
      "org.apache.batik.svggen.SVGTransform$1",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$3",
      "org.apache.batik.dom.events.NodeEventTarget",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$4",
      "org.apache.batik.svggen.DefaultStyleHandler",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$1",
      "org.apache.batik.dom.AbstractParentNode",
      "org.apache.batik.dom.xbl.GenericXBLManager",
      "org.apache.batik.ext.awt.g2d.TransformStackElement$2",
      "org.apache.batik.util.CSSConstants",
      "org.apache.batik.svggen.SVGPaint",
      "org.apache.batik.svggen.GenericImageHandler",
      "org.apache.batik.svggen.SVGEllipse",
      "org.apache.batik.svggen.SVGCustomComposite",
      "org.apache.batik.svggen.SVGGraphicContext",
      "org.apache.batik.dom.AbstractDOMImplementation",
      "org.apache.batik.util.SoftDoublyIndexedTable",
      "org.apache.batik.dom.events.EventListenerList",
      "org.apache.batik.dom.AbstractElement",
      "org.apache.batik.svggen.ExtensionHandler",
      "org.apache.batik.dom.traversal.DOMNodeIterator",
      "org.apache.batik.dom.events.DocumentEventSupport$MutationNameEventFactory",
      "org.apache.batik.svggen.SVGLookupOp",
      "org.apache.batik.svggen.SVGClip",
      "org.apache.batik.svggen.SVGFont",
      "org.apache.batik.util.CleanerThread$SoftReferenceCleared",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "org.apache.batik.svggen.SVGBufferedImageOp",
      "org.apache.batik.dom.events.DocumentEventSupport$SimpleEventFactory",
      "org.apache.batik.dom.GenericElementNS",
      "org.apache.batik.dom.util.IntTable$Entry",
      "org.apache.batik.svggen.SVGGraphicObjectConverter",
      "org.apache.batik.svggen.SVGFilterConverter",
      "org.apache.batik.dom.GenericEntity",
      "org.apache.batik.util.Base64EncoderStream",
      "org.apache.batik.ext.awt.g2d.TransformType",
      "org.apache.batik.svggen.SVGGraphics2DIOException",
      "org.apache.batik.svggen.SVGDescriptor",
      "org.apache.batik.dom.events.DocumentEventSupport$TextEventFactory",
      "org.apache.batik.dom.xbl.XBLManager",
      "org.apache.batik.svggen.SVGGraphicContextConverter",
      "org.apache.batik.dom.GenericComment",
      "org.apache.batik.util.SoftDoublyIndexedTable$Entry",
      "org.apache.batik.svggen.SVGPaintDescriptor",
      "org.apache.batik.dom.events.DocumentEventSupport$KeyEventFactory",
      "org.apache.batik.dom.AbstractElement$ElementTypeInfo",
      "org.apache.batik.svggen.ImageCacher",
      "org.apache.batik.dom.events.DocumentEventSupport",
      "org.apache.batik.svggen.SVGRescaleOp",
      "org.apache.batik.svggen.DefaultCachedImageHandler",
      "org.apache.batik.svggen.SVGStrokeDescriptor",
      "org.apache.batik.svggen.StyleHandler",
      "org.apache.batik.svggen.SVGArc",
      "org.apache.batik.svggen.ImageHandler",
      "org.apache.batik.svggen.SVGComposite",
      "org.apache.batik.svggen.SVGLinearGradient",
      "uk.ac.sanger.artemis.components.SegmentBorder",
      "org.apache.batik.dom.util.IntTable",
      "org.apache.batik.dom.AbstractParentNode$ElementsByTagNameNS",
      "org.apache.batik.svggen.SVGPolygon",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "org.apache.batik.dom.util.HashTable$Entry",
      "org.apache.batik.dom.events.DocumentEventSupport$MutationEventFactory",
      "org.apache.batik.util.XMLConstants",
      "org.apache.batik.dom.events.DocumentEventSupport$UIEventFactory",
      "org.apache.batik.svggen.SVGGraphics2D",
      "org.apache.batik.dom.util.DOMUtilities",
      "org.apache.batik.svggen.DefaultErrorHandler",
      "org.apache.batik.dom.AbstractElement$Entry",
      "org.apache.batik.dom.GenericElement",
      "org.apache.batik.svggen.ImageHandlerBase64Encoder",
      "org.apache.batik.dom.GenericText",
      "org.apache.batik.svggen.SVGFilterDescriptor",
      "org.apache.batik.svggen.SVGClipDescriptor",
      "org.apache.batik.svggen.SVGShape",
      "org.apache.batik.svggen.AbstractSVGFilterConverter",
      "org.apache.batik.svggen.DOMTreeManager",
      "org.apache.batik.svggen.SVGSyntax",
      "org.apache.batik.dom.events.DocumentEventSupport$MouseEventFactory",
      "org.apache.batik.svggen.SVGTransform",
      "org.apache.batik.dom.GenericDocument"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SegmentBorder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.SegmentBorder",
      "org.apache.batik.dom.AbstractNode",
      "org.apache.batik.dom.AbstractChildNode",
      "org.apache.batik.dom.GenericDocumentType",
      "org.apache.batik.dom.AbstractDOMImplementation",
      "org.apache.batik.dom.util.HashTable",
      "org.apache.batik.dom.util.HashTable$Entry",
      "org.apache.batik.dom.GenericDOMImplementation",
      "org.apache.batik.dom.AbstractParentNode",
      "org.apache.batik.dom.AbstractDocument",
      "org.apache.batik.dom.GenericDocument",
      "org.apache.batik.i18n.LocalizableSupport",
      "org.apache.batik.i18n.LocaleGroup",
      "org.apache.batik.dom.AbstractParentNode$ChildNodes",
      "org.apache.batik.svggen.SVGGraphics2D",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.batik.svggen.SimpleImageHandler",
      "org.apache.batik.svggen.DefaultStyleHandler",
      "org.apache.batik.dom.AbstractParentChildNode",
      "org.apache.batik.dom.AbstractElement",
      "org.apache.batik.dom.AbstractElementNS",
      "org.apache.batik.dom.GenericElementNS",
      "org.apache.batik.xml.XMLCharacters",
      "org.apache.batik.dom.util.DOMUtilities",
      "org.apache.batik.svggen.SVGLookupOp",
      "org.apache.batik.svggen.SVGCustomBufferedImageOp",
      "org.apache.batik.svggen.SVGGraphicContextConverter",
      "org.apache.batik.svggen.SVGTransform",
      "org.apache.batik.svggen.SVGColor",
      "org.apache.batik.dom.AbstractElement$NamedNodeHashMap",
      "org.apache.batik.dom.AbstractAttr",
      "org.apache.batik.dom.GenericAttr",
      "org.apache.batik.dom.AbstractCharacterData",
      "org.apache.batik.dom.AbstractText",
      "org.apache.batik.dom.GenericText",
      "org.apache.batik.dom.AbstractElement$Entry",
      "org.apache.batik.util.CleanerThread",
      "org.apache.batik.svggen.SVGClip",
      "org.apache.batik.svggen.SVGFont",
      "org.apache.batik.svggen.SVGGraphicContext",
      "org.apache.batik.svggen.DOMGroupManager",
      "org.apache.batik.svggen.SVGTransform$1",
      "org.apache.batik.svggen.SVGAttributeMap",
      "org.apache.batik.ext.awt.g2d.TransformType",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "org.emboss.jemboss.gui.Browser",
      "org.emboss.jemboss.JembossParams",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "org.apache.batik.svggen.DefaultCachedImageHandler",
      "org.apache.batik.dom.GenericElement",
      "org.apache.batik.dom.AbstractComment",
      "org.apache.batik.dom.GenericComment",
      "org.apache.batik.dom.util.IntTable",
      "org.apache.batik.dom.util.IntTable$Entry",
      "org.apache.batik.util.SoftDoublyIndexedTable",
      "org.apache.batik.dom.events.DocumentEventSupport",
      "org.apache.batik.dom.AbstractEntity",
      "org.apache.batik.dom.GenericEntity",
      "org.apache.batik.dom.traversal.DOMNodeIterator",
      "org.apache.batik.ext.awt.ColorSpaceHintKey"
    );
  }
}
