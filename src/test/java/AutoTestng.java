import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutoTestng {
@BeforeClass
private void beforeClass() {
System.out.println("beforeClass");
}
@AfterClass
private void afterClass() {
System.out.println("afterclass");
}
@AfterMethod
private void afterMethod() {
System.out.println("aftermethod");
}
@Test
private void test1() {
System.out.println("test1");
}
}
