package Proxy;

public class FolderProxy implements IFolder {
		 Folder folder;
		 User user;
		 public FolderProxy(User user){
		 this.user=user;
		 }
		 @Override
		 public void performOperations() {
		 if (user.getUserName().equalsIgnoreCase("amu")
		 && user.getPassword().equalsIgnoreCase("amu")) {
		 folder = new Folder();
		 folder.performOperations();
		 } else {
		 System.out.println("You don't have access to thisfolder");
		 }
		 }
		 

}
