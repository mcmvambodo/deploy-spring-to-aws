package doitwell.group.springaws.rabbit.hello;

import doitwell.group.springaws.rabbit.hello.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderStatus {
    private Book book;
    private String status;
    private String message;
}
