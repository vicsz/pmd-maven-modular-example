package net.sourceforge.pmd.examples.java.rules;

import net.sourceforge.pmd.testframework.SimpleAggregatorTst;

public class CorrectLoggerTest extends SimpleAggregatorTst {

    @Override
    protected void setUp() {
        addRule("net/sourceforge/pmd/examples/java/rules/CorrectLogger.xml", "CorrectLogger");
    }
}
