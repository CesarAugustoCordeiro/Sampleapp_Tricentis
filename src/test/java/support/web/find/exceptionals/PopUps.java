package support.web.find.exceptionals;

import intern.Instances;

import java.util.Set;

public class PopUps {
    public void accept(){
        Instances.getExecuteClassInstance().execute(()->{
            //Instances.getWebLastElements().get(0).click();
            Instances.getWebDriver().switchTo().alert().accept();
        });
        //Instances.getWebDriver().switchTo().alert().accept();
    }

    public void deny(){
        Instances.getExecuteClassInstance().execute(()->{
            //Instances.getWebLastElements().get(0).click();
            Instances.getWebDriver().switchTo().alert().dismiss();
        });
        //Instances.getWebDriver().switchTo().alert().dismiss();
    }

    public void send(String s){
        Instances.getExecuteClassInstance().execute(()->{
            //Instances.getWebLastElements().get(0).click();
            Instances.getWebDriver().switchTo().alert().sendKeys(s);
        });
        //Instances.getWebDriver().switchTo().alert().sendKeys(s);
    }

    public GetterPopUps get(){
        return Instances.getGetterPopUpsClassInstance();
    }
}
