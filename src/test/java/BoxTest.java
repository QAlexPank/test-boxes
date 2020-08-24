import gk.boxes.Apple;
import gk.boxes.Box;
import gk.boxes.Orange;
import org.junit.Test;

public class BoxTest {
    @Test
    public void check(){
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();

        System.out.println("Добавляем фрукт в коробку:");
        or.addFruit(new Orange(),10);
        or1.addFruit(new Orange(),12);
        ap.addFruit(new Apple(),8);
        ap1.addFruit(new Apple(),4);
        System.out.println("Коробка 1: "+or.getWeight());
        System.out.println("Коробка 2: "+or1.getWeight());
        System.out.println("Коробка 3: "+ap.getWeight());
        System.out.println("Коробка 4: "+ap1.getWeight());

        System.out.println("Коробка 1 ровна коробке 3: "+or.compare(ap));
        System.out.println("Коробка 2 ровна коробке 4: "+or1.compare(ap1));
        System.out.println("Пересыпаем фрукты из текущей коробки в другую: ");
        or.pourTo(or1);
        ap.pourTo(ap1);

        System.out.println("Высчитываем вес коробки: ");
        System.out.println("Коробка 1: "+or.getWeight());
        System.out.println("Коробка 2: "+or1.getWeight());
        System.out.println("Коробка 3: "+ap.getWeight());
        System.out.println("Коробка 4: "+ap1.getWeight());
    }
}