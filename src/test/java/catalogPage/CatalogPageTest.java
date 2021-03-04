package catalogPage;

import base.ScriptBase;
import controller.CatalogPage;
import org.testng.annotations.Test;

public class CatalogPageTest extends ScriptBase {
    CatalogPage catalogPage;

    @Test
    public void verifyCatalogRentTab(){
        catalogPage = new CatalogPage(driver);
        catalogPage.catalogDisplay(driver,"navContentRent");
    }

    @Test
    public void verifyCatalogBuyTab(){
        catalogPage = new CatalogPage(driver);
        catalogPage.catalogDisplay(driver,"navContentBuy");
    }

    @Test
    public void verifyCatalogShareTab(){
        catalogPage = new CatalogPage(driver);
        catalogPage.catalogDisplay(driver,"navContentShare");
    }

    @Test
    public void verifyCatalogLearnTab(){
        catalogPage = new CatalogPage(driver);
        catalogPage.catalogDisplay(driver,"navContentLearn");
    }

    @Test
    public void verifyCatalogLocationsTab(){
        catalogPage = new CatalogPage(driver);
        catalogPage.catalogDisplay(driver,"navContentLocations");
    }

    @Test
    public void verifyCatalogForBusinessTab(){
        catalogPage = new CatalogPage(driver);
        catalogPage.catalogDisplay(driver,"navContentFor Business");
    }
}
