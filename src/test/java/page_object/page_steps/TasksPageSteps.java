package page_object.page_steps;

import static com.codeborne.selenide.Condition.visible;
import static page_object.page_elements.JiraHeaderPageElem.*;
import static page_object.page_elements.TasksPageElem.*;
import static page_object.page_elements.TestSelenium_bugPageElem.*;

public class TasksPageSteps {
    public static int getTasksNumber() {
        String number = tasksNumber.text();
        return Integer.parseInt(number.substring(number.lastIndexOf(" ")).trim());
    }

    public static String getChangeStatus(){
        tasksButton.shouldBe(visible).click();
        openTasksButton.shouldBe(visible).click();
        return status.shouldBe(visible).text();
    }

    public static void changeStatus() {
        tasksButton.shouldBe(visible).click();
        reportedByMeTasks.shouldBe(visible).click();
        needToDoStatus.shouldBe(visible).click();
        inWorkStatus.shouldBe(visible).click();
        closedStatusDropdown.shouldBe(visible).click();
        closedStatus.shouldBe(visible).click();
    }
}
