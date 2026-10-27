public class Lasagna {
    int expectedminutes=40;
    int actualminutes;
    int layers;
    int totalminutes= expectedminutes+actualminutes;
    // TODO: define the 'expectedMinutesInOven()' method
      public int expectedMinutesInOven(){
          return expectedminutes;
      }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualminutes){
          return expectedMinutesInOven() - actualminutes;
      }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
          return layers*2;
      }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers,int totalminutes){
          return preparationTimeInMinutes(layers)+totalminutes;
      }
}
