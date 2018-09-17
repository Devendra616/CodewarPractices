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

/*
    a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too. Going to one direction and coming back the opposite direction is a needless effort. Since this is the wild west, with dreadfull weather and not much water, it's important to save yourself some energy, otherwise you might die of thirst!

How I crossed the desert the smart way.
The directions given to the man are, for example, the following:
{ "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
You can immediatly see that going "NORTH" and then "SOUTH" is not reasonable, better stay to the same place! So the task is to give to the man a simplified version of the plan. A better plan in this case is simply:
{ "WEST" }
Not all paths can be made simpler. The path ["NORTH", "WEST", "SOUTH", "EAST"] is not reducible.
"NORTH" and "WEST", "WEST" and "SOUTH", "SOUTH" and "EAST" are not directly opposite of each other and can't become such.
Hence the result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].
 */
