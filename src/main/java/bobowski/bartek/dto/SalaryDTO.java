package bobowski.bartek.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

@Data
@AllArgsConstructor
public class SalaryDTO {

    private BigInteger salary;

    @Override
    public String toString() {
        return
                " Suma wynagrodzeń = " + salary +
                        " ";
    }
}
