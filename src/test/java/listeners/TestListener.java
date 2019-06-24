package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.logging.Logger;


public class TestListener implements ITestListener {

    private static final Logger LOGGER = Logger.getLogger("logger");

    @Override
    public void onTestStart(ITestResult result) {
        LOGGER.info(String.format("Execute test '%s'", result.getName()));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        LOGGER.info(String.format("Test '%s' passed", result.getName()));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        LOGGER.info(String.format("Test '%s' failed", result.getName()));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LOGGER.info(String.format("Test skipped '%s'", result.getName()));
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        LOGGER.info(String.format("Test failed '%s'", result.getName()));
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }

}
