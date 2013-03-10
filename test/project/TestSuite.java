package project;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
    project.SyntaxTreeTests.class,
    tree.NodeTests.class,
    operations.OperationLogicTests.class,
    operations.OperationNumbersTests.class,
})
public class TestSuite {

}
