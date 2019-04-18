import java.util.Scanner;
class ThirdProgram{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter a alphabet");
       char x=in.next().charAt(0);
       switch(x){
       	case 'a':
       	System.out.println("vovel");
       	break;
        case 'e':
       	System.out.println("vovel");
       	break;
	     	case 'i':
       	System.out.println("vovel");
       	break;
	     	case 'o':
       	System.out.println("vovel");
       	break;
    		case 'u':
       	System.out.println("vovel");
       	break;
          case 'A':
        System.out.println("vovel");
        break;
        case 'E':
        System.out.println("vovel");
        break;
        case 'I':
        System.out.println("vovel");
        break;
        case 'O':
        System.out.println("vovel");
        break;
         case 'U':
        System.out.println("vovel");
        break;
    	default:
       	System.out.println("consunant");
	
       }
	}
}