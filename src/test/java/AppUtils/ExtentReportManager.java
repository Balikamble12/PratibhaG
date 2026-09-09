
package AppUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

//    private static ExtentReports extent;
//
//    private static ExtentSparkReporter sparkReporter;
//
//    private static Readconfig config = new Readconfig();
//
//
//    public static ExtentReports getExtentReport() {
//
//        if (extent == null) {
//            String reportPath =
//                    config.getReportPath()
//                    + "ExtentReport_"
//                    + System.currentTimeMillis()
//                    + ".html";
//
//
//            // Create Spark Reporter
//            sparkReporter =
//                    new ExtentSparkReporter(reportPath);
//
//
//            // Report configuration
//            sparkReporter.config()
//                    .setReportName(
//                            "Automation Test Execution Report");
//
//            sparkReporter.config()
//                    .setDocumentTitle(
//                            "Extent Report");
//
//
//            // Create Extent Report
//            extent = new ExtentReports();
//
//            extent.attachReporter(sparkReporter);
//
//
//            // System Information
//            extent.setSystemInfo(
//                    "Tester",
//                    "Bali Kamable");
//
//            extent.setSystemInfo(
//                    "Environment",
//                    "QA");
//
//
//            // Browser information
//            if (Hooks.browser != null) {
//
//                extent.setSystemInfo(
//                        "Browser",
//                        Hooks.browser);
//
//            } else {
//
//                extent.setSystemInfo(
//                        "Browser",
//                        "Not Available");
//            }
//        }
//
//        return extent;
//    }
}

