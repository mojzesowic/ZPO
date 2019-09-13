package Lab4;

import java.util.Comparator;

public class compareSalary implements Comparator<Worker> {
        @Override
        public int compare(Worker s1, Worker s2)
        {
            return s2.salary - s1.salary;
        }
}
