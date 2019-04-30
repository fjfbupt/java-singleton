package com.sunlife.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Singleton pattern ensures that the class can have only one existing instance per Java classloader
 * instance and provides global access to it.
 * One way to implement thread safe lazily initialized Singleton can be found in
 * {@link InitializingOnDemandHolderIdiom}. However, this implementation requires at least Java 8
 * API level to work.
 */
public class App {

  private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    // initialize on demand holder idiom
    InitializingOnDemandHolderIdiom demandHolderIdiom =
        InitializingOnDemandHolderIdiom.getInstance();
    LOGGER.info(demandHolderIdiom.toString());
    InitializingOnDemandHolderIdiom demandHolderIdiom2 =
        InitializingOnDemandHolderIdiom.getInstance();
    LOGGER.info(demandHolderIdiom2.toString());
  }
}
