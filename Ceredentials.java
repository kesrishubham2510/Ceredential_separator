import java.util.regex.*;

public class Ceredentials {

  String[] DateOfBirth = new String[3];//for the details of Date of Birth
  String firstName,lastName,Name;
  int ind=-1,strt_ind_Date=0,strt_ind_lastName=0,lastInd_lastName,cnt=0;
  
  Ceredentials(String inp)
  {
	 SeparateCeredentials(inp);
  }
  
  public void SeparateCeredentials(String inp)
  {
	  Pattern patr1= Pattern.compile("\\d+");//to get separate the dates 
	  Pattern patr2= Pattern.compile("[A-Z]");//to get the lastName
     
	  Matcher matr1=patr1.matcher(inp);
	  Matcher matr2=patr2.matcher(inp);
	  
	  while(matr1.find())
	  {
		  DateOfBirth[++ind]=matr1.group();
		  
		  if(ind==0)
			  lastInd_lastName=matr1.start();
			  
	  }
    
	  
	  while(matr2.find())
	  {
		  cnt=matr2.start();
	  }
	  
	  firstName=inp.substring(0,cnt);
	  lastName=inp.substring(cnt,lastInd_lastName);
	  
	 /* System.out.println(firstName+" "+lastName);
	  
	  for(int i=0;i<3;i++)
	  {
		  System.out.print(DateOfBirth[i]+" ");
	  }
  */
  }
	 

}
