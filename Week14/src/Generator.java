import java.util.*;

public class Generator implements Generate {
    private ArrayList<Character> alphabet;
    private String language;
    private String parameters;
    private ArrayList param;
    private Random rand;

    public Generator(String language, String parameters) {
        this.language = language;
        this.parameters = parameters;
        param = new ArrayList();
        alphabet = new ArrayList<Character>();
        rand = new Random();
    }

    public void readParameters() {
        int i = 0;

        String [] par = parameters.split("-");
        for (String item: par) {
            try {
                param.add(Integer.parseInt(item));

            } catch (NumberFormatException e) {
            }
        }
    }

    public void parameterChecker() {
        if (param.size() > 5) {
            System.out.println("Too many values");
            System.exit(1);
        }
        else if (param.size() <= 5) {
            String[] w = parameters.split("w-");
            ArrayList<String> s = new ArrayList<>(Arrays.asList(parameters.split("s-|-w-")));
            s.remove(s.size() - 1);

            ArrayList<String> p = new ArrayList<>(Arrays.asList(parameters.split("p-|-s-")));

            p.remove(p.size() - 1);

            try {
                if (w[1].length() == 1) {
                    param.add(param.size() - 1, 1);
                }

                if(s.get(1).length() == 1) {
                    param.add(1, 1);
                }

                if(p.get(1).length() > 1 || p.get(1).length() < 1) {
                    System.out.println("You need to enter fixed size of paragraphs");
                    System.exit(0);
                }

            } catch (Exception e) {
                System.out.println("You need to enter at least one value on every parameter");
                System.exit(2);
            }

        }
    }

    public String lang () {
        String par;
        if (Objects.equals(language, "en")) {
            par = "a-z";
            return par;
        }
        else if (Objects.equals(language, "ge")) {
            par = "ა-ჰ";
            return par;
        }
        else if (Objects.equals(language, "ru")) {
            par = "а-я";
            return par;
        }
        else {
            System.out.println("Wrong Language configuration... Continuing with default preset en");
            par = "a-z";
            return par;
        }
    }

    @Override
    public void generateAlphabet() {
        String range = lang();
        char start = range.charAt(0);
        char end = range.charAt(2);

        for (char c = start; c <= end; c++) {
            alphabet.add(c);
        }
    }

    @Override
    public char generateRandomChar() {
        int randIndex = rand.nextInt(alphabet.size());
        char a = alphabet.get(randIndex);
        return a;
    }

    @Override
    public String generateRandomWord() {
        int a = (Integer) param.get(param.size() - 1);
        int b = (Integer) param.get(param.size() - 2);
        int count = rand.nextInt(a + 1 - b) + b;

        String word = "";

        for(int i = 0; i < count; i++) {
            word += generateRandomChar();
        }

        return word;
    }

    @Override
    public String generateSentence() {
        int a = (Integer) param.get(param.size() - 3);
        int b = (Integer) param.get(param.size() - 4);
        int count = rand.nextInt(a + 1 - b) + b;

        String sentence = "    ";

        for ( int i = 0; i < count; i++ ) {
            sentence += generateRandomWord() + " ";
        }

        return sentence;
    }

    @Override
    public String generateParagraph() {
        String paragraph = "";
        for (int i = 0; i < (Integer)param.get(0); i++) {
            paragraph += generateSentence() + "\n";
        }

        return paragraph;
    }

}