import java.util.StringJoiner;

public class StringJoinerImpl {

	public static void main(String[] args) {

		StringJoiner stringJoiner1 = new StringJoiner(" ");

		stringJoiner1.add("Ajay").add("Samgir");

		StringJoiner stringJoiner2 = new StringJoiner(" ", "{", "}");

		stringJoiner2.merge(stringJoiner1);

		System.out.println("stringJoiner1 : " + stringJoiner1.toString());
		System.out.println("stringJoiner1 : " + stringJoiner2.toString());

		// join()

		String[] days = { "Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat" };

		String week = String.join(", ", days);
		System.out.println("Week : " + week);
	}
}
