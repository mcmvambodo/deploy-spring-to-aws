package doitwell.group.springaws.rabbit.hello;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Book {
    private String id;
    private String title;
    private String description;
    private String author;
    private double price;
}
