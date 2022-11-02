package Interface;


interface Language {
		  void getName(String name);
		}
        class ProgrammingLanguage implements Language 
        {
        public void getName(String name) 
        {
		    System.out.println("Programming Language: " + name);
		  }
		}

class InterfaceEx
{
		  
public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgrammingLanguage language = new ProgrammingLanguage();
	    language.getName("Java");

	}

}
