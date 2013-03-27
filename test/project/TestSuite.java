package project;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
    project.SyntaxTreeTests.class,
    tree.NodeTests.class,
    tree.NodeToStringTest.class,
    type.TypeTest.class,
    operations.OperationLogicTests.class,
    operations.OperationNumbersTests.class,
    parser.ExpressionParserTest.class,
})
public class TestSuite {

}
