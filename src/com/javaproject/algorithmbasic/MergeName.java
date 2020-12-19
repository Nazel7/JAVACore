public class MergeName {
    public static String uniqueNames(String[] names1, String[] names2) {
// Remove duplicate from two strings join together using String.join method call

        StringBuilder sb = new StringBuilder();
        for(String i : names1){
            sb.append(" ");
            sb.append(i);
        }

        for (int i = 0; i < names1.length && i < names2.length; i++) {
            if(!sb.toString().contains(names2[i])){
                sb.append(" ");
                sb.append(names2[i]);
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeName.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }

}
