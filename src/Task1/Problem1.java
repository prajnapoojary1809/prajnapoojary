package Task1;

public class Problem1 {
    public static void main(String[] args) {
        String name = "Jeevan";
        String S1 = "Mr.";
        String S2 = " Jain";
        int age= 70;
        float height=5.9f;
        double weight =50.443;
        boolean isEmployed = true;
        String[] skills = {"java","javascript","SQL"};

        String fullName = S1+name+S2;
        System.out.println("Name: " +name);
        System.out.println("Fullname: " +fullName);

        System.out.println("no. of skills: " +skills.length);

        System.out.println("Weight: "+Math.round(weight));

        long ageInSeconds = age*(365L*24*60*60);
        System.out.println("Age in Seconds:" +ageInSeconds);

    }
}

