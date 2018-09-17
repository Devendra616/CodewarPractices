import java.util.Stack;

public class DirReduction {

        /*public static final String NORTH_SOUTH = "NORTH SOUTH ";
        public static final String WEST_EAST = "WEST EAST ";
        public static final String SOUTH_NORTH = "SOUTH NORTH ";
        public static final String EAST_WEST = "EAST WEST ";
        public static String[] dirReduc(String[] arr) {
            String s = "";
            for (String string: arr) s += string + " ";
            for (int i = 0; i < arr.length; i++){
                s = s.contains(NORTH_SOUTH) ? s.replace(NORTH_SOUTH, "") : s;
                s = s.contains(WEST_EAST)   ? s.replace(WEST_EAST, "")   : s;
                s = s.contains(SOUTH_NORTH) ? s.replace(SOUTH_NORTH, "") : s;
                s = s.contains(EAST_WEST)   ? s.replace(EAST_WEST, "")   : s;
            }
            return s.isEmpty() ? new String[] {} : s.split(" ");
        }*/

    public static String[] dirReduc(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        String[] directions = { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
        String res[]= dirReduc(directions);
        for(String s:res){
            System.out.print(s+" ");
        }
    }


}
