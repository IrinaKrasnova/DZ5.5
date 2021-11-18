package dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
@ToString
@Setter
@Getter
@Data
public class Category {
    Integer id;
    String title;
    ArrayList<Product> products;
}
