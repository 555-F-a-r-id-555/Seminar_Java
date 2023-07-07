package Lesson_09_test.lesson1.practic;

import lombok.AllArgsConstructor;
import lombok.Data;

/*@Getter
@Setter
@EqualsAndHashCode
@ToString
*/
@Data
@AllArgsConstructor
public abstract class Fruit {
    private Long id;
    protected int cost;
    protected String color;

    public void test() {
//        String name = foo();
//        System.out.println(name);
    }

//    protected abstract String foo();


}