package br.com.altamira.bpm.purchase.request.test.nonarquillian;

import org.camunda.bpm.engine.impl.util.LogUtil;
import org.camunda.bpm.engine.test.ProcessEngineTestCase;
import org.camunda.bpm.engine.test.Deployment;

/**
 * Test case starting an in-memory database-backed Process Engine.
 */
public class InMemoryH2Test extends ProcessEngineTestCase {

  private static final String PROCESS_DEFINITION_KEY = "altamira.bpm.purchase.request";

  // enable more detailed logging
  static {
    LogUtil.readJavaUtilLoggingConfigFromClasspath();
  }

  /**
   * Just tests if the process definition is deployable.
   */
  @Deployment(resources = "process.bpmn")
  public void testParsingAndDeployment() {
    // nothing is done here, as we just want to check for exceptions during deployment
  }

}
