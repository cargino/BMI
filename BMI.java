public class BMI
{
    private double weight;
    private double height;
    private double weightConversionFactor=0.45;
    private double heightConversionFactor=0.025;

   public BMI(double weight, double height)
   {
      this.height=height;
      this.weight=weight;
   }

   public void setWeight(double newWeight)
   {
      this.weight=newWeight;
   }

   public void setHeight(double height)
   {
      this.height = height;
   }

   public double getHeight()
   {
      return height;
   }

   public double getWeight()
   {
      return weight;
   }

   public String toString()
   {
      return "Weight: "+weight+" Height: "+height;
   }

   public boolean equals(BMI other)
   {
      return (this.height==other.height && this.weight==other.weight);
   }

   public double getBMI()
   {
       double calculatingWeight=(weight*weightConversionFactor);
       double calculatingHeight=(height*heightConversionFactor);
       return (calculatingWeight/(calculatingHeight*calculatingHeight));
   }

   public String getStatus()
   {
       String messageForUser="";
       if(getBMI() < 18.5)
           messageForUser="It seems like you are Underweight. Please see the dietician to balance your diet.";
       else if(getBMI()>=18.5 && getBMI()<=24.9)
           messageForUser="You are in the Normal Weight range. Please keep a consistent diet to stay in this range.";
       else if(getBMI()>=25.0 && getBMI()<=29.9)
           messageForUser="You are overweight. Please see the dietician for options on your diet and exercise";
       else if(getBMI()>30.0)
           messageForUser="According to the measurements you are in the Obese range. Please see the dietician to balance your diet and exercise";
       return messageForUser;
   }

}
