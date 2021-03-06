package support.web.find;

import intern.Instances;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SendsWeb {
    public SendsWeb slow(){
        Instances.setSlow(true);
        return this;
    }

    public void enter(){
        if (!Instances.getEach()) {
            //Instances.getWebLastElements().get(0).sendKeys(Keys.ENTER);
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.ENTER);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "ENTER") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                //element.sendKeys(Keys.ENTER);
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.ENTER);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "ENTER") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public void tab(){
        if (!Instances.getEach()) {
            //Instances.getWebLastElements().get(0).sendKeys(Keys.ENTER);
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.TAB);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "TAB") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                //element.sendKeys(Keys.ENTER);
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.TAB);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "TAB") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public void delete(){
        if (!Instances.getEach()) {
            //Instances.getWebLastElements().get(0).sendKeys(Keys.ENTER);
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.DELETE);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "DELETE") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                //element.sendKeys(Keys.ENTER);
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.DELETE);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "DELETE") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public void end(){
        if (!Instances.getEach()) {
            //Instances.getWebLastElements().get(0).sendKeys(Keys.ENTER);
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.END);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "END") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                //element.sendKeys(Keys.ENTER);
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.END);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "END") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public void home(){
        if (!Instances.getEach()) {
            //Instances.getWebLastElements().get(0).sendKeys(Keys.ENTER);
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.HOME);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "HOME") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                //element.sendKeys(Keys.ENTER);
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.HOME);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "HOME") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public void backspace(){
        if (!Instances.getEach()) {
            //Instances.getWebLastElements().get(0).sendKeys(Keys.ENTER);
            Instances.getExecuteClassInstance().execute(()->{
                Instances.getWebLastElements().get(0).sendKeys(Keys.BACK_SPACE);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", "BACK_SPACE") + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                //element.sendKeys(Keys.ENTER);
                Instances.getExecuteClassInstance().execute(()->{element.sendKeys(Keys.BACK_SPACE);});
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", "BACK_SPACE") + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public void text(String text){
        System.out.println("text");
        if(!Instances.getSlow()) {
            System.out.println("send !slow");
            if (!Instances.getEach()) {
                //Instances.getWebLastElements().get(0).sendKeys(text);
                //System.out.println("size "+Instances.getWebLastElements().size());
                Instances.getExecuteClassInstance().execute(()->{
                    Instances.getWebLastElements().get(0).sendKeys(text);});
                Instances.getScreenshotClassInstance().print();
                Instances.getReportClassInstance().stepPass(Instances.getMessageSend().replace("arg0", text) + Instances.getWebLastXpathLog());
            } else {
                for (WebElement element : Instances.getWebLastElements()) {
                    //element.sendKeys(text);
                    Instances.getExecuteClassInstance().execute(()->{element.sendKeys(text);});
                    Instances.getScreenshotClassInstance().print();
                    Instances.getReportClassInstance().stepPass(Instances.getMessageSendEach().replace("arg0", text) + Instances.getWebLastXpathLog());
                }
                Instances.setEach(false);
            }
        }else {
            if (!Instances.getEach()) {
                for (char c : text.toCharArray()) {
                    //Instances.getWebLastElements().get(0).sendKeys(String.valueOf(c));
                    Instances.getExecuteClassInstance().execute(()->{
                        Instances.getWebLastElements().get(0).sendKeys(String.valueOf(c));});
                    Instances.getSleepWebClassInstance().until(50);
                }
                Instances.getScreenshotClassInstance().print();
                Instances.getReportClassInstance().stepPass(Instances.getMessageSendSlow().replace("arg0", text) + Instances.getWebLastXpathLog());
            }else {
                for (WebElement element : Instances.getWebLastElements()) {
                    for (char c : text.toCharArray()) {
                        //element.sendKeys(String.valueOf(c));
                        Instances.getExecuteClassInstance().execute(()->{element.sendKeys(String.valueOf(c));});
                        Instances.getSleepWebClassInstance().until(50);
                    }
                    Instances.getScreenshotClassInstance().print();
                    Instances.getReportClassInstance().stepPass(Instances.getMessageSendSlowEach().replace("arg0", text) + Instances.getWebLastXpathLog());
                }
                Instances.setEach(false);
            }
        }
        Instances.setSlow(false);
    }


}
