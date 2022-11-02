package Functions;

public class String {

	public static final String CASE_INSENSITIVE_ORDER = null;

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append("world");
        stringBuffer.append(true);
        stringBuffer.insert(1,"beginning");
        stringBuffer.insert(9," ");
        stringBuffer.insert(16,"/");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());
        stringBuffer.reverse();
        stringBuffer.reverse();
        
	}

}
