public class string{
    public static void main(String[] args) {
        String s="Java Programming";
        int vowels=0;
        int consonents=0;
        for(int i=0; i<s.length(); i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(Character.isLetter(ch)){
                if(ch=='a'||ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }else{
                consonents++;}
            }

        }
        System.out.print("Vowels are " + vowels);
        System.out.print("Consonents are "+ consonents);
    }
}