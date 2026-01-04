package Assignments.Assignment1;

class StringOpsQ4 {
    public static void main(String[] args) {
        String s = "  Java Programming  ";

        System.out.println(s.length());
        System.out.println(s.isEmpty());
        System.out.println(s.charAt(2));
        System.out.println(s.toString());
        System.out.println(s.equals("Java"));
        System.out.println(s.compareTo("Java"));
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.startsWith("  Ja"));
        System.out.println(s.endsWith("ing  "));
        System.out.println(s.matches(".*Java.*"));
        System.out.println(s.substring(2, 6));
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.replace("Java", "Core"));
        String[] p = s.split(" ");
        System.out.println(String.join("-", p));
        System.out.println(String.valueOf(100));
    }
}

