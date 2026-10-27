    public class Lasagna {
        int expectedminutes=40;
        int actualminutes;
        int layers;
        int totalminutes= expectedminutes+actualminutes;
        
          public int expectedMinutesInOven(){
              return expectedminutes;
          }
    
        public int remainingMinutesInOven(int actualminutes){
              return expectedMinutesInOven() - actualminutes;
          }
    
        public int preparationTimeInMinutes(int layers){
              return layers*2;
          }
    
        public int totalTimeInMinutes(int layers,int totalminutes){
              return preparationTimeInMinutes(layers)+totalminutes;
          }
    }
