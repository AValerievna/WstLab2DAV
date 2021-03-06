package wst.lab1.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menagerie {
    private Long id;
    private String animal;
    private String name;
    private String breed;
    private String health;
    private Date arrival;
}
