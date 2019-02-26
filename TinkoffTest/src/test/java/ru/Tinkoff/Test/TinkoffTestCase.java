package ru.Tinkoff.Test;

import org.junit.Test;
import ru.Tinkoff.Pages.GeneralPage;
import ru.Tinkoff.Pages.TravelPage;


public class TinkoffTestCase extends FunctionalTest {



    //TODO рассчитываю тут на порядок, знаю что это неправильно, но пока в разработке!
    @Test //переход на вкладку платежи
    public void goTo01() {
        GeneralPage generalPage = new GeneralPage(driver);
        generalPage.changeField();
    }

    @Test
    public void goTo02() {
        TravelPage travelPage = new TravelPage(driver);
        travelPage.printTr();
    }








}


