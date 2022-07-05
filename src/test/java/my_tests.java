import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

@Listeners({ScreenShooter.class})
public class my_tests {

    @Test(description = "This is my first test")
    public void MyFirst_Test() {
        open("https://tinkoff.ru");
        Assert.fail("Some error message");
    }
}
