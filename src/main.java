public class main {
    public interface Sredctvo_peredvigenia {
        void go();//ехать

        void brake();//тормозить
    }

    public class Cat implements Sredctvo_peredvigenia{
      //  @Override
        public void go() {
            System.out.println("Нам всем нужно ехать и поворачивать");
        }
       // @Override
        public void brake() {
            System.out.println("Без тормозов жизнь интересна, но очень коротка!");
        }
    }

    public abstract class fuel_oil implements Sredctvo_peredvigenia  {
        //@Override
        void car_with_ICE() { //Машина с ДВС
            System.out.println("Я большая машинка с 4-мя колёсами");
        }

       // @Override
        void motorcycles() { //мотоцикл
            System.out.println("Я тут самый маленький и имею 2 колеса");
        }
       // @Override
        void snowmobile() { // снегоход
            System.out.println("Я имею гусиницу");
        }
       // @Override
        void quad_bike() { //квадроцикл
            System.out.println("Я маленький и имею 4 колеса");
        }

        public abstract void move();
    }
    public abstract class solid_fuel implements Sredctvo_peredvigenia  {
        //@Override
        public void locomotive() { //Паровоз
            System.out.println("Я первый паровоз");
        }

        // @Override
        public void stove() { //Печка Емели
            System.out.println("Я сказочный персонаж");
        }

        public abstract void move();
    }
    public abstract class electric_power implements Sredctvo_peredvigenia  {
        //@Override
        public void bicycle() { //Велосипед
            //System.out.println("Я старее тут всех - велосипед");
        }

        // @Override
        public void robot() { //робот
            System.out.println("Обо мне думали давно - робор");
        }
        // @Override
        public void quadcopter() { // квадрокоптер
            System.out.println("Я появился не давно - квадрокоптер");
        }

        public abstract void move();
    }
    public abstract class wind_traction implements Sredctvo_peredvigenia  {
        //@Override
        void wind_turbine_mechanism() { //На ветряной тяге
            System.out.println("За мной будущее");
        }

        public abstract void move();
    }

    public class wind_turbine_mechanism { //Внутренний класс ветки "Ветяряная тяга"
        private car_with_ICE
        car1 = new car_with_ICE("Red", "ВАЗ", "1,6"), car2 = new car_with_ICE("Blue", "Audi", "2.4");

        private class car_with_ICE {
            private String color, model, volume; //цвет, модель, объём
            private car_with_ICE(String color, String model, String volume) {
                this.color = color;
                this.model = model;
                this.volume = volume;
            }
        }
    }
    public class bicycle { //вложенный класс
        private String model, color, wheel_diameter;

        bicycle (String model, String wheel_diameter){
            this.model = model;
            this.wheel_diameter = wheel_diameter;
        }
    public class electric_power extends bicycle{
            public electric_power (String model, String wheel_diameter){
                super(model, wheel_diameter);
                super.color = "car_with_ICE";
            }
    }
    }

    public static void main (String[]args){

    }
}