package net.sourceforge.pmd.examples.java.rules;

import net.sourceforge.pmd.lang.java.ast.ASTVariableDeclaratorId;
import net.sourceforge.pmd.lang.java.rule.AbstractJavaRule;
import net.sourceforge.pmd.properties.PropertyDescriptor;
import net.sourceforge.pmd.properties.PropertyFactory;
import net.sourceforge.pmd.properties.StringProperty;

public class MyRule extends AbstractJavaRule {

    private static final PropertyDescriptor<String> BAD_NAME = PropertyFactory.stringProperty("badName")
            .defaultValue("foo")
            .desc("The variable name that should not be used.")
            .build();

    public MyRule() {
        definePropertyDescriptor(BAD_NAME);
    }

    @Override
    public Object visit(ASTVariableDeclaratorId node, Object data) {

        String badName = getProperty(BAD_NAME);

        if (node.hasImageEqualTo(badName)) {
            addViolation(data, node, node.getImage());
        }

        return data;
    }
}
