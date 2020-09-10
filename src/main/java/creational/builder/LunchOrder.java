package creational.builder;

public class LunchOrder {

    /**
     * Создаем внутри класса вложенный статический(можно создавать его экземпляр, не создавая экземпляр внешнего класса) класс Builder.
     * Далее в классе Builder создаем те же поля, что и во внешнем классе. Далее создаем набор методов, в которых присваиваем соответствующему
     * полю нужное значение и возвращаем инстанс класса Builder с заполненным полем.
     * Далее создаем метод build(), возвращающий инстанс внешнего класса, и наконец, создаем во внешнем классе конструктор, принимающий в качестве параметра
     * экземпляр Builder, и копирующий значения его полей в поля создаваемого объекта требуемого класса.
     */
    public static class Builder {

        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public LunchOrder build(){
            return new LunchOrder(this);
        }

        public Builder(){}

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }
    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder) {

        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
