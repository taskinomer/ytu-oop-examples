import org.junit.Test;
import tr.edu.yildiz.oop.example.phone.Application;
import tr.edu.yildiz.oop.example.phone.mobile.smart.AndroidSmartPhone;
import tr.edu.yildiz.oop.example.phone.mobile.smart.IPhoneSmartPhone;
import tr.edu.yildiz.oop.example.phone.mobile.smart.SmartPhone;

public class ApplicationManagerTest {

    @Test
    public void testInstallIphoneApplication() {
        SmartPhone smartPhone = new IPhoneSmartPhone();
        Application application = getSampleApplication();
        smartPhone.install(application);
    }

    @Test
    public void testInstallAndroidApplication() {
        SmartPhone smartPhone = new AndroidSmartPhone();
        Application application = getSampleApplication();
        smartPhone.install(application);
    }


    private Application getSampleApplication() {
        Application application = new Application();
        application.setApplicationName("GittiGidiyor");

        return application;
    }
}
