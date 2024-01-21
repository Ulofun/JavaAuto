public class Main {
  public static void main(String[] args) {

    HotDrinkExtends hotDrinkExtends = new HotDrinkExtends();
    hotDrinkExtends.temperature = 60;
    hotDrinkExtends.name = 5;
    hotDrinkExtends.volume = 250;
    HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
    vendingMachine.productList.add(hotDrinkExtends);

    HotDrinkMilk hotDrinkMilk = new HotDrinkMilk();
    hotDrinkMilk.name = 6;
    hotDrinkMilk.temperature = 70;
    hotDrinkMilk.volume = 220;
    HotDrinkVendingMachine vendingMachine1 = new HotDrinkVendingMachine();
    vendingMachine.productList.add(hotDrinkMilk);

    HotDrinkCoffee hotDrinkCoffee = new HotDrinkCoffee();
    hotDrinkCoffee.name = 8;
    hotDrinkCoffee.temperature = 44;
    hotDrinkCoffee.volume = 300;
    HotDrinkVendingMachine vendingMachine2 = new HotDrinkVendingMachine();
    vendingMachine.productList.add(hotDrinkCoffee);

    HotDrinkTea hotDrinkTea = new HotDrinkTea();
    hotDrinkTea.name = 12;
    hotDrinkTea.temperature = 88;
    hotDrinkTea.volume = 450;
    HotDrinkVendingMachine vendingMachine3 = new HotDrinkVendingMachine();
    vendingMachine.productList.add(hotDrinkTea);



    String test = "";



  }

}

// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
// метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему
// и температуре
//В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную
// в программе
