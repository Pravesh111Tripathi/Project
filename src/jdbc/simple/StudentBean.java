package jdbc.simple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentBean {

    private String rollNumber;
    private String branch;
    private int id;
    private String name;

}
