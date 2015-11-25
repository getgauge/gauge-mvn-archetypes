import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

public class StepImplementation {
    @Step("Say <greeting> to <product name>")
    public void helloWorld(String greeting, String name) {
        System.out.println(greeting + ", " + name);
    }

    @Step("Step that takes a table <table>")
    public void stepWithTable(Table table) {
        for (String columns : table.getColumnNames()) {
            System.out.println(columns);
        }

        for (TableRow row : table.getTableRows()) {
            System.out.println(row);
        }
    }

    @Step("A context step which gets executed before every scenario")
    public void contextStep() {
        Gauge.writeMessage("In a context step");
    }
}

