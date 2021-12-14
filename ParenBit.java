public class ParenBit{

    public static String parenBit(String str) {
        if(!str.substring(0,1).equals("(")&&!str.substring(0,1).equals(")")){
            return parenBit(str.substring(1));
        }

        if (str.substring(0, 1).equals("(")) {
            return "("+str.substring(1,str.indexOf(")"))+")";
        }else{
            return "";/*this line have no meaning,
            it just to make sure that here is a return value*/
        }

    }
}
