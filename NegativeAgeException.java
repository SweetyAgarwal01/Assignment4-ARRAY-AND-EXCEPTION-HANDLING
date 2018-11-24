class AgeNegative extends Exception{
	AgeNegative(String s)
	{
		super(s);
	}
}


class NegativeAgeException
{
  static void validate(int age) throws AgeNegative
  {
  if(age < 0)
  {
   throw new AgeNegative("Age cant be Negative");
   
  }
   else 
   System.out.println("Age is fine");
   }
   
   public static void main(String[] args)
 
   {
   try
	{
    validate(56);
	validate(-90);
	validate(0);
	}
	catch (Exception a)
	{
	System.out.println("Age Invalid Eception Occured");
	}
	System.out.println("End......");
	}
	}
