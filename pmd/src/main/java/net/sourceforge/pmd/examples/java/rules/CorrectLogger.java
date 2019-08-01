package net.sourceforge.pmd.examples.java.rules;

import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTClassOrInterfaceDeclaration;
import net.sourceforge.pmd.lang.java.ast.ASTFieldDeclaration;
import net.sourceforge.pmd.lang.java.rule.AbstractJavaRule;
import org.jaxen.JaxenException;

import java.util.List;

public class CorrectLogger extends AbstractJavaRule {


    @Override
    public Object visit(ASTFieldDeclaration node, Object data) {

        try {
            List<Node> primaryPrefixNames = node.findChildNodesWithXPath(".//VariableInitializer/Expression/PrimaryExpression/PrimaryPrefix/Name");

            if(primaryPrefixNames.size() == 0 || !(primaryPrefixNames.get(0).getImage().toLowerCase().endsWith(".getlogger")))
                return data;

            List<Node> referenceTypes = node.findChildNodesWithXPath(".//VariableInitializer/Expression/PrimaryExpression/PrimarySuffix/Arguments/ArgumentList/Expression/PrimaryExpression/PrimaryPrefix/ResultType/Type/ReferenceType/ClassOrInterfaceType");

            if(referenceTypes.size() != 1)
                return data;

            String loggerClassName = referenceTypes.get(0).getImage();

            String parentClassName = node.getFirstParentOfType(ASTClassOrInterfaceDeclaration.class).getImage();

            if(!loggerClassName.equals(parentClassName))
                addViolation(data, node, new String[]{parentClassName, loggerClassName});

        } catch (JaxenException e) {
            throw new RuntimeException(e);
        }


        return data;
    }

}
