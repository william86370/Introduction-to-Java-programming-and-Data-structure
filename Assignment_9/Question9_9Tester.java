//Created By Emma Seehousz on 4/16
public class Question9_9Tester {

	public static void main(String[] args) {
		Question9_9Class poly1 = new Question9_9Class();
		Question9_9Class poly2 = new Question9_9Class(6, 4);
		Question9_9Class poly3 = new Question9_9Class(10, 4, 5.6, 7.8);
        
        System.out.format("Perimeter:[%s]  Area:[%.2f]\n", poly1.getPerimeter(), poly1.getArea());
        System.out.format("Perimeter:[%s]  Area:[%.2f]\n", poly2.getPerimeter(), poly2.getArea());
        System.out.format("Perimeter:[%s]  Area:[%.2f]\n", poly3.getPerimeter(), poly3.getArea());
	}

}
